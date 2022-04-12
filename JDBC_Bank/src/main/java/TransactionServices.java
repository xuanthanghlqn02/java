import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class TransactionServices {

//    static Scanner sc = new Scanner(System.in);

    public ArrayList<TransactionHistory> getTransaction(User user) {
        ArrayList<TransactionHistory> list = new ArrayList<>();

        Connection conn = ConnectDatabase.getConnect();

        String query = "SELECT * FROM `transaction_history` WHERE id_user = ?";
        try {
            PreparedStatement pstm = conn.prepareStatement(query);

            pstm.setString(1, user.getId());

            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String id_user = rs.getString("id_user");
                String content = rs.getString("content");
                Date date = rs.getDate("date");
                String beneficiaryAccount = rs.getString("beneficiary_account");
                long money = rs.getLong("money");

                list.add(new TransactionHistory(id, id_user, content, date, beneficiaryAccount, money));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectDatabase.closeConnect(conn);
        }
        return list;
    }

    public TransactionHistory createTransaction(User user, String content, long money, String beneficiaryAccount) {
        TransactionHistory transaction = null;

        String id = Util.generateId(5);
        String id_user = user.getId();
        Date date = Date.valueOf(LocalDate.now());

        transaction = new TransactionHistory(id, id_user, content, date, beneficiaryAccount, money);
        return transaction;
    }

    public void insertTransaction(TransactionHistory createTransaction) {
        Connection conn = ConnectDatabase.getConnect();

        String query = "INSERT INTO `transaction_history`(`id`, `id_user`, `content`, `date`, `beneficiary_account`, `money`) VALUES (?,?,?,?,?,?)";

        try {
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, createTransaction.getId());
            pstm.setString(2, createTransaction.getId_user());
            pstm.setString(3, createTransaction.getContent());
            pstm.setDate(4, createTransaction.getDate());
            pstm.setString(5, createTransaction.getBeneficiaryAccount());
            pstm.setLong(6, createTransaction.getMoney());

            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
