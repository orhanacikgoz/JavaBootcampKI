public class Main {
    public static void main(String[] args) {
        String mesaj="Bugun hava cok guzel";
        String yeniMesaj= sehirver();
        System.out.println(yeniMesaj);
        int sayi=topla(5,9);
        System.out.println(sayi);
        int toplam=toplam2(2,3,6,9,7,8);
        System.out.println(toplam);


    }
    public static void ekle(){
        System.out.println("eklendi");

    }
    public static void sil(){
        System.out.println("silindi");

    }
    public static void guncelle(){
        System.out.println("guncellendi");

    }
    public static int topla(int sayi1,int  sayi2){
        return (sayi1+sayi2);
    }
    public static String sehirver(){
        return "Ankara";
    }
    public static int toplam2(int...sayilar){
        int toplam=0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }


}