package Exams;

import DiceClient.Client;
import DiceClient.ResultOfExam;
import ReportOfPatient.MedicalReport;

import java.util.Scanner;

public class Cardio {
    public void examCardio() throws InterruptedException {

        while(true){
            Scanner sc = new Scanner(System.in);

            System.out.println(Client.name);
            System.out.println("Gostaria de fazer na esteira ou bicicleta?");

            String test;
            test = sc.next();
            test = test.substring(0, 1).toUpperCase() + test.substring(1);

            if (test.equals("Esteira")){
                treadmill();
                break;
            } else if (test.equals("Bicicleta")){
                bicycle();
                break;
            } else {
                System.out.println("Forneça dados correspondentes");
            }
        }
    }


    public void bicycle() throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nFique parado enquanto ponho os monitores cardíacos");
        Thread.sleep(4000);
        System.out.println("Comece pedalando devagar, ao decorrer do tempo aumentarei a velocidade");
        System.out.println("Ao final de cada nível você pode optar por parar ou continuar\n");

        String test = "";

        while (!test.equalsIgnoreCase("parar")){
            for (int i = 1; i < 10 ; i++) {
                System.out.println("Aumentando velocidade para o nível  " + i);
                Thread.sleep(2000);
                ResultOfExam.examCardio = "O paciente completou o nível " + i + " da bicicleta";

                if (i < 4){
                    ResultOfExam.examCardioSup = "O paciente possui a resistência pulmonar baixa";
                } else if(i > 4 && i < 7){
                    ResultOfExam.examCardioSup = "O paciente possui a resistência pulmonar mediana";
                } else if(i > 7){
                    ResultOfExam.examCardioSup = "O paciente possui a resistência pulmonar alta";
                }

                System.out.println("\nVocê quer continuar ou parar?");
                test = sc.next().toLowerCase();
                System.out.println();

                if (test.equalsIgnoreCase("parar")) {
                    System.out.println("Vou diminuir a velocidade gradativamente para você parar e descer");
                    System.out.println("Tem um pano descartável para se secar o soar a sua direita");
                    System.out.println("Use-o caso ache necessário.");
                    System.out.println("Agora aguarde na recepção para receber os resultados.");

                    MedicalReport medicalReport = new MedicalReport();
                    medicalReport.checkUpWithCardio();
                    return;
                }
            }
        }

        MedicalReport medicalReport = new MedicalReport();
        medicalReport.checkUpWithCardio();
    }

    public void treadmill() throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nFique parado enquanto ponho os monitores cardíacos");
        Thread.sleep(4000);
        System.out.println("Comece andaando devagar, ao decorrer do tempo aumentarei a velocidade");
        System.out.println("Ao final de cada nível você pode optar por parar ou continuar\n");

        String test = "";

        while (!test.equalsIgnoreCase("parar")){
            for (int i = 1; i < 10 ; i++) {
                System.out.println("Aumentando para velocidade " + i);
                Thread.sleep(2000);
                ResultOfExam.examCardio = "O paciente fez o nível " + i + " da esteira";

                if (i < 4){
                    ResultOfExam.examCardioSup = "O paciente possui a resistência pulmonar baixa";
                } else if(i > 4 && i < 7){
                    ResultOfExam.examCardioSup = "O paciente possui a resistência pulmonar mediana";
                } else if(i > 7){
                    ResultOfExam.examCardioSup = "O paciente possui a resistência pulmonar alta";
                }

                System.out.println("\nContinuar ou parar?");
                test = sc.next().toLowerCase();
                System.out.println();

                if (test.equalsIgnoreCase("parar")) {
                    System.out.println("Vou diminuir a velocidade gradativamente para você parar e descer");
                    System.out.println("Tem um pano descartável para se secar o soar a sua direita");
                    System.out.println("Use-o caso ache necessário.");
                    System.out.println("Agora aguarde na recepção para receber os resultados.");

                    MedicalReport Medical = new MedicalReport();
                    Medical.checkUpWithCardio();
                    return;
                }
            }

            MedicalReport Medical = new MedicalReport();
            Medical.checkUpWithCardio();
        }
    }
}