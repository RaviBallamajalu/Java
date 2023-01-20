package oOps;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {

        Thread thread=new Thread(Manipulation::add);
    thread.start();

    Manipulation manipulation=new Manipulation();
    Say say=manipulation::sub;
    say.sayable();


    Thread thread1=new Thread(new Manipulation()::sub);
    thread1.setName("Hello");
    thread1.start();
        System.out.println(thread1.getName());
    }
}
