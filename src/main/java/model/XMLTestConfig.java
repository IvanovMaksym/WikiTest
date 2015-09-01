package model;

import com.google.common.base.Strings;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class XMLTestConfig {

    private final String title;
    private TreeMap<String, String> params = new TreeMap<String, String>();

    public XMLTestConfig(Test test, String testTitle) {
        title = testTitle;

        if (test.getParameters() != null) {
            params = getParamsMap(test.getParameters().getParameter());
        }
    }

    private TreeMap<String, String> getParamsMap(List<Parameter> params) {
        TreeMap<String, String> retMap = new TreeMap<String, String>();

        for (Parameter parameter : params) {
            retMap.put(parameter.getName(), parameter.getValue());
        }

        return retMap;
    }

    public String get(String paramName) {
        return params.get(paramName);
    }

    public List<Integer> getIntList(String paramName) {
        List<Integer> nums = new ArrayList<Integer>();
        for (String num : params.get(paramName).split(",")) {
            nums.add(Integer.parseInt(num));
        }
        return nums;
    }

    public Set<String> getKeys() {
        return params.keySet();
    }

    public List<String> getList(String paramPrefix) {
        List<String> output = new LinkedList<String>();

        for (String key : params.keySet()) {
            if (key.startsWith(paramPrefix)) {
                output.add(params.get(key));
            }
        }

        return output;
    }

    public String getTitle() {
        return Strings.nullToEmpty(title);
    }


    public String toString() {
        return getTitle();
    }
}