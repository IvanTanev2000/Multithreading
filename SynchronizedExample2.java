public class SynchronizedExample2 {

    public static void main(String[] args) {

        TwoStringssync2 ts = new TwoStringssync2();

        new PrintStringsThread("Hello ", "there.");
        new PrintStringsThread("How are ", "you?");
        new PrintStringsThread("Thank you ", "very much!");
    }

}