public class Main {
    public static void main(String[] args) {

        int sayi=4;
        int toplam=0;

        for (int i=1; i<=sayi; i++){
            if (sayi%i==0){
                toplam++;
            }
            }
        if (toplam==2){
            System.out.println("Sayi asal ");
        }else {
            System.out.println("Sayi asal degildir");
        }

        }











    }

