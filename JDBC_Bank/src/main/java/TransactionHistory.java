import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class TransactionHistory {
    private int id;
    private int id_user;
    private String content;
    private Date date;
    private String beneficiaryAccount;
    private long money;

    @Override
    public String toString() {
        return "TransactionHistory{" +
                "id=" + id +
                ", id_user=" + id_user +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", beneficiaryAccount='" + beneficiaryAccount + '\'' +
                ", money=" + money +
                '}';
    }
}
