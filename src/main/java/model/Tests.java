package model;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tests", propOrder = {
        "test"
})


public class Tests {


    protected List<Test> test;

    public List<Test> getTest(){
        if (test==null){
            test = new ArrayList<Test>();
        }
        return this.test;
    }

}
