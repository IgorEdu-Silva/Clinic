package TypeOfService;

import DiceClient.Client;
import Exams.Blood;
import Exams.Cardio;
import Exams.Urine;
import ReportOfPatient.MedicalReport;

import java.util.Scanner;

public class CheckUp {
    public void CheckUp() throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        while (true){

            System.out.println("\nAntes de começarmos");
            System.out.println(Client.name + " ficou de jejum durante 10h?");
            String jejum = sc.next();
            jejum = jejum.substring(0,1).toUpperCase() + jejum.substring(1);

            if (jejum.equals("Não")) {
                System.out.println("Para que os exames não dêem alterados.");
                System.out.println("Volte outro dia. Antes de sair, lembre-se de remarcar o dia na recepção");
                System.exit(0);
            } else if(jejum.equals("Sim")){
                Blood Blood = new Blood();
                Blood.examBlood();

                break;
            } else{
                System.out.println("Fornceça dados correspondentes");
            }
        }

        Urine Urine = new Urine();
        Urine.examUrine();

        while(true){
            System.out.println("Gostaria de fazer um teste cardíaco?");
            String yesOrNot = sc.next();
            yesOrNot = yesOrNot.substring(0,1).toUpperCase() + yesOrNot.substring(1);

            if (yesOrNot.equals("Sim")){
                Cardio Cardio = new Cardio();
                Cardio.examCardio();

                break;
            } else if(yesOrNot.equals("Não")){
                MedicalReport Medical = new MedicalReport();
                Medical.checkUp();
            } else {
                System.out.println("Forneça dados correspondentes");
            }
        }
    }
}
