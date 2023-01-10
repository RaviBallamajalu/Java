package interviewPreparation;

public class LinearSearch {
    public static void main(String[] args) {
        int []a=new int[]{1,2,3,4,5,6,7,8};
        int key=3;
        boolean b=false;
// Method 1
        for (int i=0;i<a.length;i++){
            if(a[i]==key){
               b=true ;
                System.out.println("element found at index :"+ i);
            }
        }
        if(b==false)
            System.out.println("element  not found");
        int ind=linearSearch(a,key);

        if(ind!=-1){
            System.out.println("Element is found at index : "+ind);
        }
        else{
            System.out.println("Element not found");
        }


    }

    //Method 2


    public static int linearSearch(int[] a,int key){

        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                return i;
            }
        }
        return -1;

    }
}
