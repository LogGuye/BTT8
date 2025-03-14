package abstractnguoi;
public class AbstractNguoi {
    public static void main(String[] args) {
        nhanvien nv = new nhanvien("Long", "Kiên Giang", 10000);
        khachhang kh = new khachhang("Khánh", "Sài Gòn", 50000000000);
        nv.hienthi();
        kh.hienthi();
    }
}

