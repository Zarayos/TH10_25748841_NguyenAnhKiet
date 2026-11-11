
package nguyenanhkiet25748841;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {

        QuanLySanPham ql = new QuanLySanPham();

        // Tao 5 doi tuong

        try {
            HangHoa sp1 = new SanPhamDT(
                    "DT01", "Laptop Dell",
                    LocalDate.of(2026, 1, 10),
                    15000000, 10, 24
            );
            ql.themSanPham(sp1);
            System.out.println("Tao DT01 thanh cong");
        } catch (Exception e) {
            System.out.println("Loi DT01: " + e.getMessage());
        }

        try {
            HangHoa sp2 = new SanPhamDT(
                    "DT02", "Dien thoai Samsung",
                    LocalDate.of(2026, 2, 15),
                    10000000, 15, 12
            );
            ql.themSanPham(sp2);
            System.out.println("Tao DT02 thanh cong");
        } catch (Exception e) {
            System.out.println("Loi DT02: " + e.getMessage());
        }

        try {
            HangHoa sp3 = new SanPhamThucPham(
                    "TP01", "Sua tuoi",
                    LocalDate.of(2026, 10, 1),
                    10000, 100,
                    LocalDate.of(2026, 12, 1)
            );
            ql.themSanPham(sp3);
            System.out.println("Tao TP01 thanh cong");
        } catch (Exception e) {
            System.out.println("Loi TP01: " + e.getMessage());
        }

        try {
            HangHoa sp4 = new SanPhamThucPham(
                    "TP02", "Banh quy",
                    LocalDate.of(2026, 9, 1),
                    20000, 50,
                    LocalDate.of(2026, 11, 20)
            );
            ql.themSanPham(sp4);
            System.out.println("Tao TP02 thanh cong");
        } catch (Exception e) {
            System.out.println("Loi TP02: " + e.getMessage());
        }

        try {
            HangHoa sp5 = new SanPhamThucPham(
                    "TP03", "Nuoc trai cay",
                    LocalDate.of(2026, 8, 1),
                    15000, 30,
                    LocalDate.of(2026, 10, 1)
            );
            ql.themSanPham(sp5);
            System.out.println("Tao TP03 thanh cong");
        } catch (Exception e) {
            System.out.println("Loi TP03: " + e.getMessage());
        }

        // Xuat san pham theo loai

        System.out.println("\n===== SAN PHAM DIEN TU =====");
        ql.xuatSanPhamTheoLoai("Dien Tu");

        System.out.println("\n===== SAN PHAM THUC PHAM =====");
        ql.xuatSanPhamTheoLoai("Thuc pham");

        // Sua so luong ton

        System.out.println("\n===== SUA SO LUONG TON =====");
        System.out.println(ql.suaSoLuongTon("DT01", 20));

        // Tim san pham co gia ban cao nhat

        System.out.println("\n===== GIA BAN CAO NHAT =====");
        ql.xuatSanPhamGiaBanCaoNhat();

        // Xoa san pham

        System.out.println("\n===== XOA SAN PHAM =====");
        System.out.println(ql.xoaSanPham("TP02"));

        // Kiem tra danh sach sau khi xoa

        System.out.println("\n===== DANH SACH SAU KHI XOA =====");
        ql.xuatSanPhamTheoLoai("Thuc pham");
    }
}
