import org.mindrot.jbcrypt.BCrypt;

public class TestSystem {
    public static void main(String[] args) {
        String password = "123456789";

        String encodePassword = BCrypt.hashpw(password,BCrypt.gensalt(12));

        System.out.println(encodePassword);
    }
}
