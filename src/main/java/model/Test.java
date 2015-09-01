package model;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "test", propOrder = {

        "name",
        "parameters"
})


public class Test {

    protected String name;
    protected Parameters parameters;

    public String getName(){
        return name;
    }

    public void setName(String value){
        this.name = value;
    }

    public Parameters getParameters(){
        return parameters;
    }

    public void setParameters(Parameters value){
        this.parameters = value;
    }
}
