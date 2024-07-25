import javax.management.relation.RelationNotification;
import java.util.Random;


public class Homework {
    public static void main(String[] args) {
        int[] numbers = {25, 12, 63, 14, 74, 90, 19, 33, 63};
        ex1(numbers);
        ex2(numbers);
        ex3(numbers);
        ex4();
        ex5(15);
        ex6();
    }

    public static int ex1(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);
        return sum;
    }

    public static int ex2(int[] numbers) {
        int odss = 0;
        int[] impare = numbers;
        for (int i = 0; i < numbers.length; i++) {
            if (impare[i] % 2 != 0) {
                System.out.println(impare[i]);
            }
        }
        return odss;
    }

    public static void ex3(int[] numbers) {
        int x = 40;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > x) {
                System.out.print(numbers[i] + " ");
            }
        }
    }

    public static void ex4() {
        int target = 300;
        int sumaAdunata = 0;
        Random r = new Random();

        while (sumaAdunata <= target) {
            int donatie = r.nextInt(50) + 1;
            sumaAdunata += donatie;
            System.out.println("Sa donat suma de " + donatie + " Suma totala este " + sumaAdunata);

        }
        System.out.println("Suma a fost colectata");

    }

    public static void ex5(int nrMaxDonatii) {
        int target = 600;
        int numarDonatii = 0;
        int sumaAdunata = 0;
        Random r = new Random();

        while (sumaAdunata <= target && numarDonatii <= nrMaxDonatii) {
            int donatie = r.nextInt(70) + 1;
            sumaAdunata += donatie;
            numarDonatii += 1;

            System.out.println("Sa donat suma de " + donatie + " Suma totala este " + sumaAdunata);

        }

        if (sumaAdunata >= target) {
            System.out.println("Suma a fost acoperita iar campania se va incheia ");
        } else if (sumaAdunata < target) {
            System.out.println("Suma totala nu a fost acoperita campania va continua");
        }

    }

    public static  void ex6(){
        String s = "Ana are mere. Anrei are portocale. Marcel are 3 masini.";

       for(String propozitie : ){


       }



    }

}
