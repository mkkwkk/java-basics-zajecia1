package pl.edu.wszib;
import  pl.edu.wszib.mypackage.MyClass2;
public class MyClass extends MyClass2 {

    // modyfiatory dostępu:
    // private
    private String field1;

    String field2;

    protected String field3;

    public String field4;


    private void run1() {
        System.out.println("field1= "+ field1);
    }

    void run2() {
        System.out.println("field2= "+ field2);
    }

    private void run3() {
        System.out.println("field3= "+ field3);
    }

    private void run4() {
        System.out.println("field4= "+ field4);
    }




}
