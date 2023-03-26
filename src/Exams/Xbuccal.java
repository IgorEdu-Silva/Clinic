package Exams;

import DiceClient.ResultOfExam;
import DiceClient.Sides;
import ReportOfPatient.MedicalReport;

import java.util.Scanner;

public class Xbuccal {
    public void choiceSide() throws InterruptedException {
        Scanner sc = new Scanner(System.in);

       while(true){
           System.out.println("Em qual lado seria o Raio X bucal:");
           System.out.println("Direita, esqueda ou ambos ?");
           String bucal = sc.next();
           bucal = bucal.substring(0,1).toUpperCase() + bucal.substring(1);

           if (bucal.equals(Sides.RIGHT.toString()) || bucal.equals(Sides.LEFT.toString()) || bucal.equals(Sides.BETWEEN.toString())){
               if (bucal.equals(Sides.RIGHT.toString())){
                   ResultOfExam.examRaioXBuccal = "direita";
               } else if (bucal.equals(Sides.LEFT.toString())){
                   ResultOfExam.examRaioXBuccal = "esquerda";
               } else {
                   ResultOfExam.examRaioXBuccal = "ambos";
               }
               break;
           } else {
               System.out.println("Por favor, forneça dados correspondentes");
           }
       }

        buccalExam();
    }

    public void buccalExam() throws InterruptedException {
        System.out.println("\nPor favor, sente-se");
        System.out.println("Fique quieto até que o processo termine");

        Thread.sleep(5000);
        System.out.println("Agora aguarde na recepção para receber laudo");

        MedicalReport Medical = new MedicalReport();
        Medical.raioXBuccal();
    }
}
