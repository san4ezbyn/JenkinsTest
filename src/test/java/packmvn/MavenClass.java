package packmvn;
import org.testng.TestNG;

import org.testng.Assert;
import org.testng.xml.dom.Tag;

import static junit.framework.TestCase.assertTrue;

public class MavenClass {

    @org.testng.annotations.Test
    public void simpleTest(){
        int a = 1;
        int b = 2;
        int c =3;
        System.out.println("Hello");
        Assert.assertTrue (a+b == c);

    }

    @org.testng.annotations.Test
    public void simpleTestOK(){
        int a = 1;
        int b = 3;
        int d =4;
        System.out.println("World");
        Assert.assertTrue (a+b == d);
    }

   @org.testng.annotations.Test
    public void simpleTestFail(){
        int a = 1;
        int b = 9;

        System.out.println("Hang on there!");
        Assert.assertTrue (a+b == 10);
    }

   @org.testng.annotations.Test
    public void simpleTestSup(){
        int a = 1;
        int b = 9;

        System.out.println("It's gonna be OK! SURE!!!");
        Assert.assertTrue (a<b );
    }

}
