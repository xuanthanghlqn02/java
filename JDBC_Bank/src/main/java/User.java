import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class User {
    private String id;
    private String mobile;
    private String password;
    private String account;
    private long balance;

    @Override
    public String toString() {
        return "Users{" +
                "id='" + id + '\'' +
                ", mobile='" + mobile + '\'' +
                ", password='" + password + '\'' +
                ", account='" + account + '\'' +
                ", money=" + balance +
                '}';
    }
}