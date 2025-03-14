package abstractnguoi;
abstract class nguoi {
    private String ten;
    private String diachi;
    public nguoi(String ten, String diachi) {
        this.ten = ten;
        this.diachi = diachi;
    }
    public void datten(String ten) {
        this.ten = ten;
    }
    public String layten() {
        return ten;
    }
    public void datdiachi(String diachi) {
        this.diachi = diachi;
    }
    public String laydiachi() {
        return diachi;
    }
    public abstract void hienthi();
}
