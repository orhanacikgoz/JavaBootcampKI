public class Main {
    public static void main(String[] args) {

        double [] myList={5.4, 6.8,7.8,3.4};
        double toplam=0;
        double maxsayi=myList[0];

        for (double sayigez:myList){
            if (maxsayi<sayigez) {
                maxsayi=sayigez;


            }
            System.out.println(sayigez);
            toplam+=sayigez;
        }
        System.out.println("Sayilarin Toplamlari: " + toplam);
        System.out.println("En buyuk sayi: " + maxsayi);










    }
}