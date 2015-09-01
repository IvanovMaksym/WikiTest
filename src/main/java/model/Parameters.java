package model;

import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parameters", propOrder = {

        "parameter"
})

public class Parameters {

    @XmlElement(required = true)
    protected List<Parameter> parameter;

    public List<Parameter> getParameter(){
        if (parameter ==null){
            parameter = new ArrayList<Parameter>();
        }
        return this.parameter;
    }

}
