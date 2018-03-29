import java.util.Scanner;

public class ColLesson01 {
    public static void main(String[] args) {
//        Wordkクラスのインスタンス配列
        Word[] words = new Word[10];

//        コマンドラインから入力
        System.out.println("分からない単語とその意味をスペースで区切って入力してください。");
        Scanner sc = new Scanner(System.in);
        String input  = sc.nextLine();

        int index=0;
        while(!input.equals("e")){
        String[] tmp = new String[2];
        tmp = input.split("　");
        Word word = new Word(tmp[0],tmp[1]);
        words[index] = word;
        index++;
        System.out.println("次の単語と意味を入力してください。\"e\"で終了します。");
        input = sc.nextLine();
    }
       for (int i=0;i<index; i++){
            System.out.println("単語："+words[i].getWord()+"日本語："+words[i].getMeaning());
       }
       System.out.println(index+"件、登録しました。");
    }
    }