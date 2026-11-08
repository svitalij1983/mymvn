import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MilesTest {
    @Test
    public static void main(String[] args) {
        int ticketPrise = 17_589;
        int miles = ticketPrise / 20;
        System.out.println("Miles" + miles);
        Assertions.assertArrayEquals(args, args);
    }
}
