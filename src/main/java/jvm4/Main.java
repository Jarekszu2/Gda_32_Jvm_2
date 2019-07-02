package jvm4;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        int doilu = 10000;
        try {
            System.out.println(silnia(doilu));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private static int silnia(int doilu) throws InterruptedException {
        if (doilu <= 1) {
            return 1;
        }
        Thread.sleep(100);
        return silnia(doilu - 1) * doilu;
    }
}
