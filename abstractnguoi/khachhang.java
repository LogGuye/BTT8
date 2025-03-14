package abstractnguoi;
class khachhang extends nguoi {
    private int sodu;
    public khachhang(String ten, String diachi, int sodu) {
        super(ten, diachi);
        this.sodu = sodu;
    }
    @Override
    public void hienthi() {
        System.out.println("Khách hàng: " + layten() + ", Địa chỉ: " + laydiachi() + ", Số dư: " + sodu);
    }
}

