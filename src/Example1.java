import java.util.Random;

public class Example1 {

    public static void main(String[] args) {
        Random random = new Random(1);

        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(11));
        }

    }


}
