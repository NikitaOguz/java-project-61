package hexlet.code;
import java.security.SecureRandom;
public class Rand {
    public SecureRandom random = new SecureRandom();
    public void use() {
        int rand = this.random.nextInt();
    }
}
