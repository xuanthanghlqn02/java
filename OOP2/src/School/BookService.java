package School;

public class BookService extends SchoolBook {
    public BookService(int maSach, String tenSach, String nhaXuatBan, int namXuatBan, int soLuong, int soTrang, String tinhTrang, int soLuongMuon) {
        super(maSach, tenSach, nhaXuatBan, namXuatBan, soLuong, soTrang, tinhTrang, soLuongMuon);
    }

    public static SchoolBook getAll(){
        SchoolBook Obj1 = new SchoolBook(1,"CNTT","Kim Dong",
                2022,50,200,"Con hang",30);
        SchoolBook Obj2 = new SchoolBook(2,"Lap trinh Java","Thanh Nien",
                2022,50,200,"Con hang",30);
        SchoolBook Obj3 = new SchoolBook(3,"Lap trinh Python","Tien Phong",
                2022,50,200,"Con hang",30);

        return Obj1;
    }
}
