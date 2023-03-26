package Exams;

import ReportOfPatient.MedicalReport;

import java.util.Scanner;

public class Inspect {
    public void inspectTeeth(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEntre e deite-se na maca");
        System.out.println("Escova o dente quantas vezes por dia?\n");

        while(!sc.hasNextInt()){
            System.out.println("Por favor, informe um valor númerico");
            sc.next();
        }

        int day = sc.nextInt();

        if (day == 0){
            System.out.println("O senhor precisa escovar no mínimo duas vezes ao dia");
            DiceClient.ResultOfExam.cariesConfirm = 0;
        } else if (day == 1){
            System.out.println("O senhor precisa escovar no mínimo duas vezes ao dia");
            DiceClient.ResultOfExam.cariesConfirm = 1;
        } else if (day == 2){
            System.out.println("Continue desse modo e não terá problemas");
            DiceClient.ResultOfExam.cariesConfirm = 2;
        } else if (day >= 3){
            System.out.println("Tome cuidado quando escovar mais de três vezes para que não machuque a gengiva");
            DiceClient.ResultOfExam.cariesConfirm = 3;
        }

        MedicalReport Medical = new MedicalReport();
        Medical.dentalInspect();
    }
}
