package hinhhocabstract;
public class Hinhhocabstract {
    public static void main(String[] args) {
        hinhtron ht = new hinhtron();
        ht.nhapThongTin();
        ht.tinhChuvi();
        ht.tinhDientich();
        ht.xuatTen();
        System.out.println("Chu vi: " + ht.chuvi);
        System.out.println("Diện tích: " + ht.dientich);
        hinhtru htr = new hinhtru();
        htr.nhapThongTin();
        htr.tinhThetich();
        htr.xuatTen();
        System.out.println("Thể tích: " + htr.thetich);
        hinhchunhat hcn = new hinhchunhat();
        hcn.nhapThongTin();
        hcn.tinhChuvi();
        hcn.tinhDientich();
        hcn.xuatTen();
        System.out.println("Chu vi: " + hcn.chuvi);
        System.out.println("Diện tích: " + hcn.dientich);
        hinhvuong hv = new hinhvuong();
        hv.nhapThongTin();
        hv.tinhChuvi();
        hv.tinhDientich();
        hv.xuatTen();
        System.out.println("Chu vi: " + hv.chuvi);
        System.out.println("Diện tích: " + hv.dientich);
    }
}



