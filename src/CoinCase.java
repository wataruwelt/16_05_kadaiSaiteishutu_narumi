public class CoinCase {
    private int coin_500;
    private int coin_100;
    private int coin_50;
    private int coin_10;
    private int coin_5;
    private int coin_1;

    public void AddCoins(int shurui,int maisu){
        if (shurui==500){
            this.coin_500 =this.coin_500+maisu;
        }else if (shurui==100){
            this.coin_100 =this.coin_100+maisu;
        }else if (shurui==50){
            this.coin_50 =this.coin_50+maisu;
        }else if (shurui==10){
            this.coin_10 =this.coin_10+maisu;
        }else if(shurui==5){
            this.coin_5 =this.coin_5+maisu;
        }else{
            this.coin_1 =this.coin_1+maisu;
        }
    }

    public int GetCoins(int shurui){
        if (shurui == 500){
            return this.coin_500;
        }else if (shurui == 100){
            return this.coin_100;
        }else if (shurui == 50){
            return this.coin_50;
        }else if (shurui == 10){
            return this.coin_10;
        }else if (shurui == 5){
            return this.coin_5;
        }else {
            return this.coin_1;
        }
    }

    public int GetAmount(){
        return this.coin_500*500+this.coin_100*100+this.coin_50*50+this.coin_10*10+this.coin_5*5+this.coin_1;

    }

}
