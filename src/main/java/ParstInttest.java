public class ParstInttest {
    public static void main(String[] args) {

        Integer latestCibilScoreInteger1= null;
        String latestCibilV3Score =null;
        if (latestCibilV3Score != null) {
            latestCibilScoreInteger1 = Integer.parseInt(latestCibilV3Score);
        } else {
            latestCibilScoreInteger1 = Integer.valueOf("-1");
            System.out.println(latestCibilScoreInteger1);
        }
    }
}
