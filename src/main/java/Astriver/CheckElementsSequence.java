package Astriver;

public class CheckElementsSequence {
    public static void main(String[] args) {
        int input[] = {2, 3, 4, 5, 6, 7};
        System.out.println(isInSequence(input,0));
    }

    public static boolean isInSequence(int[] input, int index) {
        return index==input.length-1
                ||(input[index]==input[index+1]-1
                && isInSequence(input,index+1));

    }
}
