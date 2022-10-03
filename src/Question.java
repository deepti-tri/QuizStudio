public abstract class Question {
    String ask;


    public Question(String ask) {
        this.ask = ask;

    }


    public abstract int buildAns(String correctChoice);
}
