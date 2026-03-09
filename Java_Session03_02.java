package BaiTapSession03;


import java.util.Scanner;

public class Java_Session03_02 {
    private static String check_status(double n) {
        if (n < 5.0) return "Yếu";
        if (n < 7.0) return "Trung Bình";
        if (n < 8.0) return "Khá";
        if (n < 9.0) return "Giỏi";
        return "Xuất sắc";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        double sum_score = 0.0;
        double max_score = -1.0;
        double min_score = 11.0;
        while(true){
            System.out.println("*************** MENU NHẬP ĐIỂM ***************");
            System.out.println("1.   Nhập điểm học viên");
            System.out.println("2.   Hiển thị thống kê");
            System.out.println("3.   Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int T =  sc.nextInt();
            switch (T) {
                case 1:
                    System.out.println("--- Nhập điểm học viên (nhập -1 để dừng) ---");
                    while (true) {
                        System.out.print("Nhập điểm: ");
                        double score = sc.nextDouble();
                        if (score >= 0 && score <= 10) {
                            if (score > max_score) {
                                max_score = score;
                            }
                            if (score < min_score) {
                                min_score = score;
                            }
                            cnt++;
                            sum_score += score;
                            System.out.println(check_status(score));
                        } else if (score == -1) {
                            break;
                        } else {
                            System.out.println("Điểm không hợp lệ. Nhập lại.");
                        }
                    }
                    break;
                case 2:
                    System.out.println("--- KẾT QUẢ ---");
                    if (cnt == 0) {
                        System.out.println("Chưa có dữ liệu");
                    }
                    else {
                        System.out.println("Số học viên đã nhập: " + cnt);
                        System.out.printf("Điểm trung bình: %.2f\n", ((sum_score) / cnt));
                        System.out.println("Điểm cao nhất: " + max_score);
                        System.out.println("Điểm thấp nhất: " + min_score);
                    }
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không đúng.");
            }
        }
    }
}
