package oOps;

public class EncapsulationSample {
    public static void main(String[] args) {
   Books books=new Books();
        books.setName("MyBook");
        books.setPageNo(100);
        System.out.println(books.getPageNo());
        System.out.println(books.getName());

        Books books1=new Books(101,"MyBook1");
        System.out.println(books1.getPageNo());
        System.out.println(books1.getName());
    }
}
class Books {
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

