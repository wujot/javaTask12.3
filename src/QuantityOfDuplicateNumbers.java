import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class QuantityOfDuplicateNumbers {

    public static void main(String[] args) {

        Methods methods = new Methods();

        // create ArrayList of numbers from a text file
        List<Integer> arrayListOfNumbers = null;
        String filename = "numbers.txt";
        arrayListOfNumbers = methods.readNumbers(filename);

        // sort map of counted duplicate numbers
        Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>(methods.countDuplicates(arrayListOfNumbers));

        // print map of sorted duplicate numbers
        methods.printMap(treeMap);
    }
}
