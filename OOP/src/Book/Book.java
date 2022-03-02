package Book;

public class Book {
    int maSach;
    String tenSach;
    String tacGia;
    String theLoai;
    String nhaXuatBan;
    int namXuatBan;

    public Book(int maSach, String tenSach, String tacGia, String theLoai, String nhaXuatBan, int namXuatBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.theLoai = theLoai;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatBan = namXuatBan;
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    @Override
    public String toString() {
        return "Ma Sach: " + maSach + " - " +
                "Ten Sach: " + tenSach + " - " +
                "Tac Gia: " + tacGia + " - " +
                "The Loai: " + theLoai + " - " +
                "Nha Xuat Ban: " + nhaXuatBan + " - " +
                "Nam Xuat Ban: " + namXuatBan;
    }
}

