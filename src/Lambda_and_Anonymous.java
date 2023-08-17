import java.util.*;
@FunctionalInterface
interface demo{
    void meth1(int a);
//    void meth2();
}

//class anon implements demo{
//
//    @Override
//    public void meth1() {
//        System.out.println("Method 1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("Method 2");
//    }
//}

public class Lambda_and_Anonymous {
    public static void main(String [] abg) {
//        demo obj = new anon();
//        obj.meth1();
//        ----------------------- Anonymous class----------------------
//        demo obj=new demo() {
//            @Override
//            public void meth1() {
//                System.out.println("Method 1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("Method 2");
//            }
//        };
//        obj.meth1();

//        ------------------- Lambda Expression--------------------
        demo obj=(a)->{
            System.out.println("Method 1-"+a);
        };
        obj.meth1(6);




    }

}
