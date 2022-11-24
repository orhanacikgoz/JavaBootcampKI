public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager=new CustomerManager();
        customerManager.Add();
        customerManager.Delete();
        customerManager.Update();

        int sayi1=15;
        int sayi2=20;
        sayi2=sayi1;
        sayi1=30;
        System.out.println(sayi2);



        int [] sayilar=new int[]{1,2,3,4,5};
        int [] sayilar2=new int[]{9,10,11,12,13};
        sayilar2[3]=sayilar[4];
        System.out.println(sayilar2[3]);

    }
}