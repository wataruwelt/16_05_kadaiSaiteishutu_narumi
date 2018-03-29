import java.util.Scanner;

public class ColLesson02 {
    public static void main(String[] args) {
//        Wordkクラスのインスタンス配列
        Word[] words = new Word[10];

//        コマンドラインから入力
        System.out.println("分からない単語とその意味をスペースで区切って入力してください。");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int index=0;
        while(!input.equals("e")){
//            01との違い
            String[] tmp = input.split("　");
            Word word = new Word(tmp[0],tmp[1]);
            words[index] = word;
            index++;
            System.out.println("次の単語と意味を入力してください。\"e\"で終了します。");
            input = sc.nextLine();
        }
        for (int i=0;i<index; i++){
//            01との違い
            System.out.println(words[i]);
        }
        System.out.println(index+"件、登録しました。");
    }
}