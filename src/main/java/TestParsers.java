public class TestParsers {
    public static void main(String[] args) {

        Integer latestCibilScoreInteger = 0;
        String latestCibilV3Score = null;

        try {
            if (latestCibilV3Score != null) {
                latestCibilScoreInteger = Integer.parseInt(latestCibilV3Score);
            }
        } catch (Exception ex) {

            latestCibilScoreInteger =null;
        }
        String s = latestCibilScoreInteger == null ? "-1" : latestCibilV3Score;

        System.out.println(s);

    }
}
