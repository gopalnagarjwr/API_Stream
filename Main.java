import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        Integer [] arr=new Integer[]{10,20,30,45,55};   // Integer array

        List<Integer> ll= Arrays.asList(arr);           // convert ro array to collection
        
       List<Integer> al= ll.stream().filter((n)->n%2==0).collect(Collectors.toList()); //to store in List
        System.out.println( "store  filter List : "+  al);

         ll.stream().filter((n)->n%2==0).forEach(System.out::println);  // Direct print filter data
    }
}