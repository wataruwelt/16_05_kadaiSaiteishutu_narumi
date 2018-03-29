public class Word {
    private String word;
    private  String meaning;

    public  Word(String word,String meaning){
        this.word = word;
        this.meaning = meaning;
    }

    public String getWord(){
        return word;
    }

    public void setWord(String word){
        this.word = word;
    }

    public  String getMeaning(){
        return meaning;
    }

    public  void setMeaning(String meaning){
        this.meaning = meaning;
    }

    @Override
    public  String toString(){
        return "単語：" + this.word +"日本語：" + this.meaning;
    }
}
