package dto.Cleancode;

public class SimpleTesting {

    String[] arr;
    String[] arr2 = null;

    public static void main(String[] args) {
        SimpleTesting obj = new SimpleTesting();
        if(obj.arr == null) {
            System.out.println("The array is null");
        }
        if(obj.arr2 == null) {
            System.out.println("The array2 is null");
        }
    }
}
