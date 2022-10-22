
public class cikl {
    public static void main(String[] args) {
//            int salary =29000;
//            int total = 0;
//            for (int i =0; i <12; i++){
//
//                total = total +salary;
//                System.out.println("Месяц" + i + "сумма накоплений равна " + total +  " рублей");
//            }


        int salary =29000;
        int total = 0;
        for (int i =0; i <12; i++){
            total = total/12;
            total = total +salary;

        }
        System.out.println("Месяц"  + "сумма накоплений равна " + total +  " рублей");
    }
}
