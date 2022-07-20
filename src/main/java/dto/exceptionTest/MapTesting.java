package dto.exceptionTest;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class MapTesting {
    public static void main(String[] args)
    {
        // Creating an empty Map


        Map<Integer, String> map = new HashMap<>();

        // Mapping string values to int keys
        map.put(10, "Geeks");
        map.put(15, "4");
        map.put(20, "45");
        map.put(25, "456546");
        map.put(30, "You");

        // Displaying the Map
        System.out.println("Initial Mappings are: " + map);

        // Getting the value of 25
        System.out.println("The Value is: " + map.get(25));

        // Getting the value of 10
        System.out.println("The Value is: " + map.get(10));
        String s = map.get(25);
        Map<String, Object> map1 = new HashMap<>();

        map1.put("admin", (s==null || s.isEmpty())? 0.0 : String.valueOf(BigDecimal.valueOf(Double.parseDouble(s))));

        System.out.println(map1);
      //  boltCheckParams.put("down_payment", (downPayment == null || downPayment.isEmpty() ) ?  String.valueOf(0.0) : downPayment);

      BigDecimal s3=  BigDecimal.valueOf(Double.parseDouble(s));
        System.out.println(s3);

               // Map<Integer, Object> map1 = new HashMap<>();
    }






}
