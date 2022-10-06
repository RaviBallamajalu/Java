# Java

* In Java program we need to have a class name which must match the filename,and all program must have the main() method.

Simple Program
```java
public class com.ravi.FirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello, Welcome to Java");
    }
}
```
output:
Hello, Welcome to Java

## Class & Object 
* Class is a Blue Print of Object. It defines the Object.
* Object is actual instance of a class which is present in the world / real time.

## Data Types And Variables

* Variable holds the value.

* Data Type is type of data that is stored in the variable.
  * ### Data Types:
  
  * Below are data types and corresponding data in particular data types.
    * Integer
      * Integer num=10;
    * String
      * String s='abc';
    * Long
      * Long l=123456L;
    * Boolean
      * Boolean b=true;
    * Short
      * Short s=1000;
    * Double
      * Double d=12.34;
    * Float
      * Float f=12.3f;
    * Character
      * Character c='a';
      
### Declaration:

Integer number1=10;//Here Interger is datatype and number1 is variable which holds the value 10.

## Loops in Java
* if-else
  * Checks the condition mentioned in 'if'- If the condition is true then the if block is executed and if false else block is executed.

```java
public class com.ravi.IfElse {
    public static void main(String[] args) {
        Integer number1=10;

        if(number1>5){
            System.out.println("number1 is greater");
        }
        else{
            System.out.println("number1 is lesser");
        }
    }
}
```
output:
number1 is greater

* for
  * Used when the ceratin line is required to be executed for fixed number of times.
```java
public class com.ravi.For {
    public static void main(String[] args) {
        Integer number=0;
        for(int i=0;i<5;i++)
        {
            System.out.println(i);
        }
    }
}
```
output:
0
1
2
3
4

* while
  * Used when the ceratain Line is to excetued until the the condition mentioned in while becomes false.
  
 ```java
 public class com.ravi.WhileLoop {
    public static void main(String[] args) {
        int i=1;
        while(i<=5){
            System.out.println(i);
            i++;
        }
    }
}
```
output:
0
1
2
3
4
5

* do While
  * Used when iteration is not fixed and it is required to execute the loop at least once.
  
  ```Java
  public class com.ravi.DoWhileLoop {
    public static void main(String[] args) {
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=5);
    }
}
```
output:
1
2
3
4
5


