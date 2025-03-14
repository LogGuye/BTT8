package abstractnguoi;
class nhanvien extends nguoi {
    private int luong;
    public nhanvien(String ten, String diachi, int luong) {
        super(ten, diachi);
        this.luong = luong;
    }
    @Override
    public void hienthi() {
        System.out.println("Nhân viên: " + layten() + ", Địa chỉ: " + laydiachi() + ", Lương: " + luong);
    }
}

