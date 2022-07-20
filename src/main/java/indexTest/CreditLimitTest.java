package indexTest;

import java.util.Arrays;

public class CreditLimitTest {
    private static final int[][] TABLE_FOR_HIGHCL_WIDGET_THICK = {
            {98, 96, 94, 92, 90},
            {88, 86, 84, 82, 80},
            {78, 76, 74, 72, 70},
            {68, 66, 64, 62, 60}
    };

    private static final float[] eenadu_HIGHCL_WIDGET_L0_THICK_SCORE_BANDS = {300, 587, 716, 784, 858};

    private static final float[] CIBIL_HIGHCL_WIDGET_SCORE_BANDS = {700, 741, 761, 781};

    static Float  eenaduL0Score = 500f;
    static float cibilScore = 741f;


    public static void main(String[] args) {
        int approvedAmount = getApprovedAmountFromTable(eenaduL0Score, cibilScore,
                eenadu_HIGHCL_WIDGET_L0_THICK_SCORE_BANDS, CIBIL_HIGHCL_WIDGET_SCORE_BANDS, TABLE_FOR_HIGHCL_WIDGET_THICK);
        System.out.println(approvedAmount);
    }
    private static int getApprovedAmountFromTable(Float eenaduL0Score, Float cibilScore,
                                                  float[] eenaduL0ScoreBands, float[] cibilScoreBands, int[][] clTableForMerchant) {
        int eenaduL0ScoreIndex = 0;
        int cibilScoreIndex = 0;
        if (null != eenaduL0ScoreBands)
            eenaduL0ScoreIndex =getIndexFromBands(eenaduL0ScoreBands, eenaduL0Score);
        if (null != cibilScoreBands)
            cibilScoreIndex = getIndexFromBands(cibilScoreBands, cibilScore);
        if (-1 == eenaduL0ScoreIndex || -1 == cibilScoreIndex) return 0;
        return clTableForMerchant[cibilScoreIndex][eenaduL0ScoreIndex];
    }
    public static int getIndexFromBands(float[] bands, float value) {
        int index = Arrays.binarySearch(bands, value);
        if (-1 == index) {
            return index;
        } else {
            if (index < 0) {
                index = -index - 2;
            }
            return index;
        }
    }


}
