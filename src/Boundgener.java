/**
 * Created by narahara on 7/8/2017.
 */
class A{

}
class B extends A{
    B(){
        System.out.println("In subclass constructor");
    }
}
class C{

}
class genr<T extends A>{
    T t;
    genr(T t){
        System.out.println("in generic class");
    }
    void prin(){
        System.out.println("successfull");
    }
}
public class Boundgener {
    public static void main(String args[]){
        A a=new A();
        B b=new B();
        System.out.println("In main before generics");
        genr<B>g=new genr<>(b);
        g.prin();
    }
}
