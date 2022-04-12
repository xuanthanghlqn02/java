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
    private String id;
    private String id_user;
    private String content;
    private Date date;
    private String beneficiaryAccount;
    private long money;

    @Override
    public String toString() {
        return "Ma chuyen tien: " + id + " - " +
                "ID nguoi chuyen: " + id_user + " - " +
                "Noi dung chuyen tien: " + content + " - " +
                "Ngay: " + date + " - " +
                "Tai khoan thu huong: " + beneficiaryAccount + " - " +
                "So tien chuyen: " + money;
    }
}
