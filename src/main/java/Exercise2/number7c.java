package Exercise2;

import org.testng.annotations.Test;

public class number7c {

    @Test
    public void usability1(){
        System.out.println("This is usability testing");
    }
    @Test(dependsOnMethods = {"functional1"})
    public void performance1(){
        System.out.println("This is performance testing");
    }
    @Test(dependsOnMethods = {"functional1"})
    public void security1(){
        System.out.println("This is security testing");
    }
    @Test
    public void functional1(){
        System.out.println("This is functional testing");
    }
}
