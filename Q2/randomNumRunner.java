public class randomNumRunner {
    private static randNumbs test;

    public static void main(String[] args){
        test = new randNumbs(100000);

        new Thread(() -> tester()).start();
        new Thread(() -> tester()).start();
        new Thread(() -> tester()).start();
        new Thread(() -> tester()).start();
        new Thread(() -> tester()).start();
        new Thread(() -> tester()).start();
        new Thread(() -> tester()).start();
        new Thread(() -> tester()).start();
        new Thread(() -> tester()).start();
        new Thread(() -> tester()).start();
        new Thread(() -> tester()).start();
        new Thread(() -> tester()).start();
        new Thread(() -> tester()).start();
        new Thread(() -> tester()).start();
        new Thread(() -> tester()).start();
        new Thread(() -> tester()).start();
        new Thread(() -> tester()).start();
        new Thread(() -> tester()).start();
        new Thread(() -> tester()).start();
        new Thread(() -> tester()).start();

    }

    public static void tester()
    {
        for(int i = 0; i < 10000; i++)
            System.out.println(test.get_next_number());
    }
}
