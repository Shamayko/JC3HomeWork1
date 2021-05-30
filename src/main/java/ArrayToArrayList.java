import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
String[] array;

    public ArrayToArrayList(String[] array) {
        this.array = array;
    }

    public static void main(String[] args) {
        String[] arrayOfStrings = {"Love", "Death", "Robots"};
        ArrayToArrayList array = new ArrayToArrayList(arrayOfStrings);
        array.convert(arrayOfStrings);
    }

    public void convert (String[] arrayOfStrings) {
        List<String> listOfStrings = new ArrayList<String>();
        listOfStrings = Arrays.asList(arrayOfStrings);
        System.out.println(listOfStrings);
    }
}
