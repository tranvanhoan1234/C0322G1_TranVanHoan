package luyen_thuat_toan;

public class InDaySo1 {
    //    In dãy số 2, -4, 6, 8, -10, 12, 14, 16, -18, ....., n (**)
    public static void main(String[] args) {
//        int count = 0;
//        System.out.println("nhap");
//        Scanner scanner = new Scanner(System.in);
        int n = 28;
//        for (int i = 2; i < n; i++) {
//            if (i % 2 == 0) {
//                if (count < 2) {
//                    System.out.println(i);
//                    count++;
//                } else {
//                    System.out.println("-" + i);
//                    count = 0;
//                }
//            }
//        }
//    In dãy số 2, -4, 6, 8, -10, 12, 14, 16, -18, ....., n (**)
        int viTriCuaSoAm = 2;
        int khoangCachGiua2SoAm = 3;
        int soCanHienThi = 2;
        for (int index = 1; index < n; index++) {
            if (index == viTriCuaSoAm) {
                soCanHienThi = soCanHienThi * (-1);
                viTriCuaSoAm = viTriCuaSoAm + khoangCachGiua2SoAm;
                khoangCachGiua2SoAm++;
            }
            System.out.println("Vi tri " + index + ": " + soCanHienThi);
            if (soCanHienThi < 0) {
                soCanHienThi = soCanHienThi * (-1);
            }
            soCanHienThi += 2;
        }
    }
}
