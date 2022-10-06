# Object Oriented Programming

## Encapsulation
* Provides the securtity to the important components i.e prevention of direct access. 
* Provides controlled access.
```java

public class Books {
    private int pageNo;
    private String name;

    public Books(int pageNo, String name) {
        this.name = name;
        this.pageNo = pageNo;
    }

    public Books() {
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNo() {
        return pageNo;
    }

    public String getName() {
        return name;
    }
}


public class EncapsulationSample {
    public static void main(String[] args) {
        Books books = new Books(100, "MyBook");
/*to get the data in books object. we have to the getter methods and if not given any values in object creation using the parameterized constructor, Then the values should be set using the setter. 
example:
Books books=new Books();
books.setPageNo(100);
books.setName("MyBooks");
*/
        System.out.println(books.getPageNo());
        System.out.println(books.getName());

    }
}
```


# PolyMorphism
* Poly means many and morphs means forms. 
* Methods with the same name but different method signatures can be created(Method Overloading).
* Methods can be extended from one class and can be modified in the another class (Method Overriding).

```java
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


```
