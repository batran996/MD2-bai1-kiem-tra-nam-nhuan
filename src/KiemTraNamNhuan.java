import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hãy nhập năm cần kiểm tra");
        int inYear = scanner.nextInt();
        boolean namNhuan = false;
        if (inYear % 4 == 0) {
            if (inYear %100 !=0){
                System.out.printf("nam nhuan");
            }else {
                System.out.printf("nam khong nhuan");
            }
        }else {
            if (inYear %100 ==0 && inYear %400 ==0){
                System.out.printf("nam nhuan");
            }else {
                System.out.printf("nam khong nhuan");
            }
        }

    }
}
