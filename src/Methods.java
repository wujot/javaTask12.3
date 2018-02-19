import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Methods {

    // read numbers for a .txt file and assigne them into ArrayList
    public List readNumbers(String fileName) {

        List<Integer> listOfNumbers = new ArrayList<>();

        FileReader fileReader = null;
        BufferedReader br = null;
        String line = null;

        try {
            fileReader = new FileReader(fileName);
            br = new BufferedReader(fileReader);

            while ((line = br.readLine()) != null) {
                listOfNumbers.add(Integer.parseInt(line));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfNumbers;
    }

    // count all duplicate elements in array list
    public Map countDuplicates(List arrayList) {
        Map<Object, Integer> map = new HashMap<>();
        for (Object temp : arrayList) {
            Integer count = map.get(temp);
            map.put(temp, (count == null) ? 1 : count + 1);
        }
        return map;
    }

    // print frequency of duplicate numbers
    public void printMap(Map<Integer, Integer> map){

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - liczba wystapien: "
                    + entry.getValue());
        }

    }
}
