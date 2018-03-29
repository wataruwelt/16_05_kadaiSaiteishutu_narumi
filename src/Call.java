import java.util.Scanner;

public class Call {
    public static void main(String[] args) {
        CoinCase coincase = new CoinCase();
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<6;i++){
            System.out.println("硬貨の種類を入力してください。");
            String shurui = scanner.nextLine();
            System.out.println("硬貨の枚数を入力してください。");
            String maisu = scanner.nextLine();
            coincase.AddCoins(Integer.parseInt(shurui), Integer.parseInt(maisu));
                    }
        System.out.println("500円は" + coincase.GetCoins(500) + "枚 100円は" + coincase.GetCoins(100) +
                                           "枚 50円は" + coincase.GetCoins(50) + "枚 10円は" + coincase.GetCoins(10) + "枚 5円は" +
                                           coincase.GetCoins(5) + "枚 1円は" + coincase.GetCoins(1) + "枚");
                System.out.println("総額は" + coincase.GetAmount() + "円です。");
            }
        }

