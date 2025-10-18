package hexlet.code;
import java.util.Random;
public class Rand {
    public Random random = new Random();
    public void use() {
        int rand = this.random.nextInt();
    }
}
