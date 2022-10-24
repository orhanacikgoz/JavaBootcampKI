public class Main {

    public static void main(String[] args) {

        char grade='Z';

        switch (grade){
            case 'A':
                System.out.println("Muthis: gectiniz");
                break;
            case 'B':
                System.out.println("Guzel: gectiniz");
                break;
            case 'C':
                System.out.println("Iyi: gectiniz");
                break;
            case 'D':
                System.out.println("Sartlida olsa: gectiniz");
                break;
            case 'F':
                System.out.println("Malesef: BYE");
                break;
            default:
                System.out.println("Gecersizz");

        }
    }
}
