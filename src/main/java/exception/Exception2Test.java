package exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class Exception2Test {
    public static void main(String[] args) {
        Score score = new Score("",Version.V1);
        Data data = new Data(score);
        Float finboxScore = null;
        if (score != null) {

                finboxScore = score.getId()!= null?
                        NumberUtils.getFloatFromString(score.getId()): null;
                System.out.println(finboxScore);
                         }
                System.out.println("catch block");



            System.out.println("after the condition of score method");

    }
}

@Setter
@Getter

class Data {
    Score score;

    public Data(Score score) {
        this.score = score;
    }
}

@Setter
@Getter
@AllArgsConstructor
class Score {
    String id;
    Version version;

}

enum Version {
    V1;
}