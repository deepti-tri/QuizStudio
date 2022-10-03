public class MultiChoice extends Question {
    String correctChoice;
    int score;
    public MultiChoice(String ask, String correctChoice) {
        super(ask);
        this.correctChoice = correctChoice;

    }

    @Override
    public int buildAns(String correctChoice) {
        if (correctChoice.equals(correctChoice)) {
            score = 1;
        }
        return score;
    }
}