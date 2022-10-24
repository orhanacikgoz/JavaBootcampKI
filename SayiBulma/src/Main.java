public class Main {
    public static void main(String[] args) {

        int[] numbers=new int[]{1,2,65,34,49};
        int searchNumber=65;
        boolean osayinusayimi=true;

        for (int sayi:numbers){
            if (searchNumber==sayi){
                osayinusayimi=false;
                break;
            }
        }
        if (osayinusayimi==false){
            System.out.println("O sayi bu sayi");
        }else {
            System.out.println("Degil");
        }







        }


    }
