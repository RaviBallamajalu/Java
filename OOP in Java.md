# Object Oriented Programming

## Encapsulation
* Provides the securtity to the important components i.e prevention of direct access. 
* Provides controlled access.
```java

class Books{
private int pageNo;
private String name;

public Books(int pageNo,String name){
this.name=name;
this.pageNo=pageNo;
}

public Books(){
}

public void setPageNo(int pageNo){
this.pageNo=pageNo;
}
public void setName(String name){
this.name=name;
}
public int getPageNo(){
return pageNo;
}
public String name(){
retun name;
}
}

class EncapsulationSample{
public static void main(String[] args){
Books books=new Books(100,"MyBook");
/*to get the data in books object. we have to the getter methods and if not given any values in object creation using the parameterized constructor, Then the values should be set using the setter. 
example:
books.setPageNo(100);
books.setName("MyBooks");
*/

System.out.println(books.getPageNo());
System.out.println(books.getName());

}
}
```


# Abstraction
*
