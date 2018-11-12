package Controller.Director;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DirectorController {

    public static int rndSalary(){
        int min = 120;
        int max = 300;
        int random = ThreadLocalRandom.current().nextInt(min, max + 1);
        return random;
    }

    public static int inputSalary(){
        Scanner in = new Scanner(System.in);
        System.out.println("\nAlmost ready! We already generated salary for him!" +
                "\n\nDo you want to use random salary or to input it manually?" +
                "\n*inputing manual salary still has limits (salary<1000$)*" +
                "\nInput rnd for random and manual for manual input :");
        String salaryOption = in.nextLine();
        int salary=1;
        if (salaryOption.equals("rnd")){
            salary = DirectorController.rndSalary();
        }else if (salaryOption.equals("manual")) {
            System.out.println("Well, you have to input the salary for your future worker" +
                    "\nNotice that if the number would be <1000, the salary would be set to 1000!");
            int manualSalary = in.nextInt();
            if(manualSalary>1000){
                salary = 1000;
            }else
                salary = manualSalary;
        }
        return salary;
    }
}
