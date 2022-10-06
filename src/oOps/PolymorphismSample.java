package oOps;
class MySample{
    void eat(){
        System.out.println("Eating");
    }
}

class MySample1 extends MySample{
    @Override
    void eat() {
        super.eat();
    }
}

class MySample2 extends MySample{
    /*Method Overriding is done here with method name eat() and method body changed to MySample2 requirement*/

    void eat() {
        System.out.println("MySample2 is eating");
    }

    /*Method Overloading is done here with method name eat() and eat(String eat)*/
    void eat(String eat){
        System.out.println("MySample2 is eating with String as method parameter");
    }
}
public class PolymorphismSample {
    public static void main(String[] args) {

        MySample mySample=new MySample();
        mySample.eat();
        MySample1 mySample1=new MySample1();
        mySample1.eat();
        MySample2 mySample2=new MySample2();
        mySample2.eat();
        mySample2.eat("eat");
    }
}
