package Exams;

import DiceClient.ResultOfExam;
import ReportOfPatient.MedicalReport;

import java.util.Objects;
import java.util.Scanner;

public class Ciso {

    public void whichCiso() throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nSeja bem vindo");
        System.out.println("Antes de darmos continuídade ao processo");

        while (!Objects.equals(ResultOfExam.cisoX, DiceClient.Ciso.LEFT.toString())
                && !Objects.equals(ResultOfExam.cisoX, DiceClient.Ciso.RIGHT.toString())
                && !Objects.equals(ResultOfExam.cisoY, DiceClient.Ciso.HIGHER.toString())
                && !Objects.equals(ResultOfExam.cisoY, DiceClient.Ciso.LOWER.toString())){

            System.out.println("\nQual seria o Ciso a ser removido?");
            System.out.println("Direito ou Esquerdo");
            ResultOfExam.cisoX = sc.next();
            ResultOfExam.cisoX = ResultOfExam.cisoX.substring(0, 1).toUpperCase() + ResultOfExam.cisoX.substring(1);

            System.out.println("Superior ou Inferior");
            ResultOfExam.cisoY = sc.next();
            ResultOfExam.cisoY = ResultOfExam.cisoY.substring(0, 1).toUpperCase() + ResultOfExam.cisoY.substring(1);
        }

        removeCiso();
    }

    public void removeCiso() throws InterruptedException {
        System.out.println("\nPara que eu possa fazer a remoção do Ciso sem dificuldades");
        System.out.println("Fique imóvel durante o processo");
        System.out.println("Antes de começarmos, vou aplicar a anestesia\n");

        Thread.sleep(2000);

        System.out.println("Anestesia aplicada");
        System.out.println("Preparando para retirar o Ciso\n");

        Thread.sleep(10000);

        System.out.println("Ciso retirado");
        System.out.println("Vou fechar a gengiva, permaneça imóvel\n");

        Thread.sleep(4000);

        System.out.println("Agora aguarde na recepção para receber laudo");

        MedicalReport Medical = new MedicalReport();
        Medical.dentalCiso();
    }
}
