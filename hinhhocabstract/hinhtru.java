package hinhhocabstract;
import java.util.Scanner;
public class hinhtru extends hinhtron {
    private float chieucao;
    public hinhtru() {
        ten = "hình trụ";
    }
    public void nhapChieucao() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều cao: ");
        chieucao = sc.nextFloat();
    }
    @Override
    public void nhapThongTin() {
        nhapBankinh();
        nhapChieucao();
    }
    @Override
    public void tinhThetich() {
        thetich = pi * bankinh * bankinh * chieucao;
    }
}

