package Exams;

import DiceClient.Client;
import DiceClient.ResultOfExam;

import java.util.Scanner;

public class Urine {
    public void examUrine() throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        label:
        while(true){
            System.out.println(Client.name + " você bebe quantos litros de água por dia?");
            String water = sc.next();
            water = water.substring(0, 1).toUpperCase() + water.substring(1);

            switch (water) {
                case "Menos":
                    ResultOfExam.examUrine = "O paciente bebe menos de 1 litro d'água por dia";
                    ResultOfExam.examUrineStone = "O paciente possui pedras no rin";

                    break label;
                case "1":
                    ResultOfExam.examUrine = "O paciente bebe 1 litro d'água por dia";
                    ResultOfExam.examUrineStone = "Grande chance de ter pedra no rin";

                    break label;
                case "2":
                    ResultOfExam.examUrine = "O paciente bebe 2 litros d'água por dia";
                    ResultOfExam.examUrineStone = "Pouca chance de ter pedra no rin";

                    break label;
                case "Mais":
                    ResultOfExam.examUrine = "O paciente bebe mais de 2 litros d'água por dia";
                    ResultOfExam.examUrineStone = "Nenhuma chance de ter pedra no rin";

                    break label;
                default:
                    System.out.println("Forneça dados correspondentes");
                    break;
            }
        }

        System.out.println("Aguarde enquanto vou buscar o potinho para o exame de urina\n");
        Thread.sleep(3000);

        System.out.println("Aqui está. Há um banheiro no final do corredor\n");
        Thread.sleep(5000);
    }
}
