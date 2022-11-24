public class Main {
    public static void main(String[] args) {
        SayiBulmaca();
    }
    public static void SayiBulmaca (){
        int[] numbers=new int[]{1,2,65,34,49};
        int searchNumber=7;
        boolean osayinusayimi=true;

        for (int sayi:numbers){
            if (searchNumber==sayi){
                osayinusayimi=false;
                break;
            }
        }
            if (osayinusayimi==false){
            mesajver("O sayi bu sayi: " + searchNumber);
            }   else {
            mesajver("o sayi bu sayi degil: " + searchNumber);
            }

    }
    public static void mesajver(String mesaj){
        System.out.println(mesaj);
    }
}