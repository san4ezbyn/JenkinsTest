package packmvn;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class MavenClass {

    @Test
    public void simpleTest(){
        int a = 1;
        int b = 2;
        int c =3;
        System.out.println("Hello");
        assertTrue (a+b == c);

    }

    @Test
    public void simpleTestOK(){
        int a = 1;
        int b = 3;
        int d =4;
        System.out.println("World");
        assertTrue (a+b == d);
    }

    @Test
    public void simpleTestFail(){
        int a = 1;
        int b = 9;

        System.out.println("Hang on there!");
        assertTrue (a+b == 100);
    }

    @Test
    public void simpleTestSup(){
        int a = 1;
        int b = 9;

        System.out.println("It's gonna be OK!");
        assertTrue (a<b );
    }

}
