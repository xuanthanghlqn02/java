//Viết chương trình quản lý sản phẩm của một của hàng gồm các thông tin sau:
//        Mã sản phẩm, tên sản phẩm, loại sản phẩm (Đồ gia dụng, thực phẩm, thời trang), số lượng, giá bán
//        Thực hiện các công việc sau:
//
//        Hiển thị danh sách tất cả sản phẩm ra màn hình
//        Tìm sản phẩm theo tên
//        Lấy ra các sản phẩm có số lượng nhỏ hơn 5
//        Tìm sản phẩm theo mã sản phẩm
//        Xóa sản phẩm vừa tìm được
//        Cập nhật số lượng sản phẩm
//        Cập nhật giá bán của sản phẩm
//        Thêm sản phẩm mới
//        Xem sản phẩm theo các mức giá:
//        Dưới 50.000
//        Từ 50.000 đến dưới 100.000
//        Từ 100.000 đến dưới 250.000
//        Trên 250.000
//        Lọc sản phẩm theo loại sản phẩm

package com.company.manage.product;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ProductController.menu();
    }
}
