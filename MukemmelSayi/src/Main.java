public class Main {
    public static void main(String[] args) {

        // Mükemmel sayı: 6 : tam bölenlerin toplamının 2 katıysa müthiş sayı

        int Number=7;
        int NumberYarim= Number/2;
        int toplam=0;

        for (int i=1; i<=NumberYarim; i++){
            if (Number%i==0){
                toplam+=i;

            }
        }
        if (toplam==Number){
            System.out.println("Mukemmel bi sayisin sen");
        }else {
            System.out.println("Cop Sayi");
        }








    }
}