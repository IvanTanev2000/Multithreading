public class PrintStringsThreadsync1 implements Runnable {

    Thread thread;
    String str1, str2;

    PrintStringsThreadsync1(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
        thread = new Thread(this);
        thread.start();
    }

    public void run() {
        TwoStringssync1.print(str1, str2);
    }

}