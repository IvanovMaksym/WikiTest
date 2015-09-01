package model;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parameter", propOrder = {

        "value"
})
public class Parameter {

    @XmlValue
    protected String value;
    @XmlAttribute
    protected String name;

    public String getValue(){
        return value;
    }

    public void setValue(String value){
        this.value = value;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}
