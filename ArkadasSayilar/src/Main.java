public class Main {
    public static void main(String[] args) {

        //220 bölenleri: 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284
        // 284 bölenleri: 284 : 1 + 2 + 4 + 71 + 142 = 220
        //iki farklı sayının bölenleri birbirine eşitse bu sayılar arkadaş sayıymış

        int number1=20;
        int number2=30;
        int toplam1=0;
        int toplam2=0;


        for (int i=1; i<number1; i++){
            if (number1%i==0){
                toplam1+=i;
            }
        }
        for (int i=1; i<number2; i++){
            if (number2%i==0){
                toplam2+=i;
            }
        }

        if (toplam1==number2 && toplam2==number1){
            System.out.println(number1 + " ve " + number2 + " Arkadas sayilar bra");
        }else {
            System.out.println(number1 + " ve " + number2 + " Arkadas degiller");
        }



        }
    }



