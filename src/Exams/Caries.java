package Exams;

import DiceClient.ResultOfExam;
import ReportOfPatient.MedicalReport;

import java.util.Scanner;

public class Caries {

    public void whichTooth() throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Responda somente com sim ou não");
        String answer = "";

        while(!answer.equals("Sim") && !answer.equals("Não")){
                System.out.println("\nVocê tem muitas cáries?");
                answer = sc.next();
                answer = answer.substring(0, 1).toUpperCase() + answer.substring(1);
        }

        if (answer.equals("Sim")){
                ResultOfExam.cariesToWithdraw = "O paciente possuía muitas cáries";
                System.out.println(ResultOfExam.cariesToWithdraw);
        } else {
            ResultOfExam.cariesToWithdraw = "O paciente possuía poucas cáries";
            System.out.println(ResultOfExam.cariesToWithdraw);
        }

        System.out.println("\nVou fazer uma pequena checagem para localizar todas as cáries da sua boca");
        System.out.println("Permaneça imóvel enquanto isso");
        Thread.sleep(4000);

        removeCarie();
    }

    public void removeCarie() throws InterruptedException {
        System.out.println("\nIrei começar o tratamento");

        Thread.sleep(20000);

        System.out.println("\nTerminado");
        System.out.println("Agora aguarde na recepção para receber laudo");

        MedicalReport Medical = new MedicalReport();
        Medical.dentalCaries();
    }
}
