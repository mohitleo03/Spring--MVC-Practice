package com.company;
import java.util.ResourceBundle;
public class factory {
    private static ResourceBundle rb = ResourceBundle.getBundle("config");
    private factory(){}
    static Iproducer getobject(){
        Object object=null;
        String className =rb.getString("classname");
        try{
            object = Class.forName(className).getDeclaredConstructor().newInstance();
        }catch (Exception e){}
        return (Iproducer) object;
    }
}