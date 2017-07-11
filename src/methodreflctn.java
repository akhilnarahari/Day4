import jdk.nashorn.internal.objects.annotations.Constructor;

import java.lang.reflect.Method;

import static java.lang.Class.forName;

/**
 * Created by narahara on 7/8/2017.
 * */
class Exc{
    Exc(){
        System.out.println("in constructor");
    }
    void meth(){
        try{
            int i=0;
            int c=12/i;
            throw new ArithmeticException();
        }
        catch (Exception e)
        {
            System.out.println("in exception");
        }
    }
}
public class methodreflctn {
    public static void main(String args[]){
        try {
            Class c=Class.forName("Exc");
            Method mta[] = c.getMethods();
            System.out.println("Below are the methods in Abcd class");
            for(Method mt:mta)
            {
                System.out.println(mt.getName()+"  "+"has");
                System.out.println(mt.getExceptionTypes());
            }

        }
        catch(Exception e){
        System.out.println("class not found");
        }
    }
}
