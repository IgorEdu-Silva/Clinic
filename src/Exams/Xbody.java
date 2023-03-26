package Exams;

import DiceClient.Body;
import DiceClient.ResultOfExam;

import java.util.Scanner;

public class Xbody {
    public void choiceSide() throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Gostaria de tirar um raio X do tronco?");
            String trunk = sc.next();
            trunk = trunk.substring(0,1).toUpperCase() + trunk.substring(1);

            if (trunk.equals("Sim")) {
                ResultOfExam.trunk = "Tronco";
                break;
            } else if (trunk.equals("Não")) {
                break;
            } else {
                System.out.println("Responda com sim ou não");
            }
        }

        while (true) {
            System.out.println("Braço esquerdo ou direito?");
            String arm = sc.next();
            arm = arm.substring(0,1).toUpperCase() + arm.substring(1);

            if (arm.equals(Body.ARMLEFT.toString()) || arm.equals(Body.ARMRIGHT.toString())) {
                if (arm.equals(Body.ARMLEFT.toString())) {
                    ResultOfExam.armLeft = "Esquerdo";
                } else {
                    ResultOfExam.armRight = "Direito";
                }
                break;
            } else {
                System.out.println("Por favor, forneça dados correspondentes");
            }
        }

        while (true) {
            System.out.println("Perna esquerda ou direita?");
            String leg = sc.next();
            leg = leg.substring(0,1).toUpperCase() + leg.substring(1);

            if (leg.equals(Body.LEGLEFT.toString()) || leg.equals(Body.LEGRIGHT.toString())) {
                if (leg.equals(Body.LEGLEFT.toString())) {
                    ResultOfExam.legLeft = "Esquerda";
                } else {
                    ResultOfExam.legRight = "Direita";
                }
                break;
            } else {
                System.out.println("Por favor, forneça dados correspondentes");
            }
        }

        bodyExam();
    }

    public void bodyExam() throws InterruptedException {
        System.out.println("\nAgora deite-se, por favor");
        System.out.println("Para darmos prosseguimento, preciso que o senhor tire todos os metais do corpo");

        Thread.sleep(2000);

        System.out.println("Com tudo pronto, vamos começar");
        System.out.println("Vou posicionar o equipamento, permaneça imóvel até terminar\n");

        Thread.sleep(5000);
        System.out.println("Agora aguarde na recepção para receber laudo");
    }
}
