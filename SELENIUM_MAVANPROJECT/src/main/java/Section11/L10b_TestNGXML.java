package Section11;

import org.testng.annotations.Test;

public class L10b_TestNGXML {


    @Test (groups = {"smoke","regression"})
    public void method3(){
        System.out.println("Hello World from method3");
    }

    @Test (groups = {"regression"})
    public void method4(){
        System.out.println("Hello World from method4");
    }

    @Test (groups = {"regression"})
    public void method5(){
        System.out.println("Hello World from method5");
    }
}
