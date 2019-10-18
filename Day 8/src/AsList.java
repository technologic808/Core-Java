import java.util.Arrays;
import java.util.List;

public class AsList {
 public static void main(String[] args) {
	 Integer [] ints = {4,5,12,45,67,890};
	   List<Integer> intsList = Arrays.asList(ints);
	   System.out.println(intsList);
	   intsList.set(2, 24);// no error As we just replacing value at index 2
//	   intsList.remove(2); cannot change size of list here --> unsupported operation exception
//	   intsList.add(15);
	   System.out.println(intsList.getClass().getName());
	   
 }}
