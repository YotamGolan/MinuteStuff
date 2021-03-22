import java.util.HashSet;
import java.util.Set;

public class randomNumRunner {
    private static randNumbs test;

    //A Simple runner to test out the randNumbs.java class. I struggled getting Heroku to function properly, this is a poor substitute using multiple threads.
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
        for(int i = 0; i < 5010; i++)
            test.get_next_number();
    }

    public static void testPrinting(){
        test = new randNumbs(100000);
        System.out.print(test);
    }

    
}
