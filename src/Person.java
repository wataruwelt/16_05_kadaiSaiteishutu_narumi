public class Person {
    private  String name;
    private String shussin;

    public Person(String name, String shussin) {
                this.name = name;
                this.shussin = shussin;
           }

    public  void getIntroduction(){
        System.out.println("私の名前は"+this.name + "です。"+this.shussin +"出身");
    }

}
