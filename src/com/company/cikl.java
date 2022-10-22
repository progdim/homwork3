
public class cikl {
    public static void main(String[] args) {
//            int salary =29000;
//            int total = 0;
//            for (int i =0; i <12; i++){
//
//                total = total +salary;
//                System.out.println("Месяц" + i + "сумма накоплений равна " + total +  " рублей");
//            }


//        int result = 0;
//        int salary = 20000;
//        int i = 0;
//        int pais = 0;
//        while (result <= 2459000){
//            pais = result / 100;
//            result = result + salary + pais;
//            i++;
//            System.out.println("месяц " + i + " сумма накоплений равна " + result + "рублей");
//        }

//        int i = 1;
//        while (i <= 10) {
//            System.out.println(i);
//            i++;
//        }
//        for (int j = 10; j > 0; j--) {
//            System.out.println(j);
//        }

        int y = 12000000;
        int born = y / 1000 * 17;
        int died = y / 1000 * 8;
        for (int i = 0; i <= 10; i++) {
            y += born - died;
            System.out.println("Год " +  i + " численность населения составляет " + y);
        }
    }
}












