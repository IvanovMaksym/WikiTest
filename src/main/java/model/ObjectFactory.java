package model;


import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory(){
    }

    public Tests createTests(){
        return new Tests();
    }

    public Parameter createParameter(){
        return new Parameter();
    }

    public Parameters createParameters(){
        return new Parameters();
    }

    public Test createTest(){
        return new Test();
    }

    public TestCase createTestCase(){
        return new TestCase();
    }
}
