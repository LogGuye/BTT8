package hinhhocabstract;
import java.util.Scanner;
class hinhchunhat extends hinhhoc {
    protected float dai, rong;
    public hinhchunhat() {
        ten = "hình chữ nhật";
    }
    public void nhapDai() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        dai = sc.nextFloat();
    }
    public void nhapRong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều rộng: ");
        rong = sc.nextFloat();
    }
    @Override
    public void nhapThongTin() {
        nhapDai();
        nhapRong();
    }
    @Override
    public void tinhChuvi() {
        chuvi = 2 * (dai + rong);
    }
    @Override
    public void tinhDientich() {
        dientich = dai * rong;
    }
    @Override
    public void tinhThetich() {
        thetich = 0;
    }
}

