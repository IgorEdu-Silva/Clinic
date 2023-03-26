package Exams;

import DiceClient.ResultOfExam;

import java.util.Scanner;

public class Blood {

    public void examBlood() throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Antes de começarmos os testes");
        System.out.println("Vou fazer algumas perguntas e peço que responda com sinceridade\n");
        System.out.println("Como o senhor anda se alimentando ultimamente?");
        System.out.println("Bem ou mal?\n");

        while(!sc.hasNext("bem") && !sc.hasNext("mal")){
            System.out.println("Responda conforme a pergunta");
            sc.next();
        }

        String examBlood = sc.next();
        examBlood = examBlood.substring(0,1).toUpperCase() + examBlood.substring(1);

        if (examBlood.equals("Mal")) {
            BloodFood Food = new BloodFood();

            String foodFat = "";
            String foodProcessed = "";
            String foodSugar = "";
            String meat = "";

            System.out.println("Responda apenas com sim ou não\n");

            while (!foodProcessed.equals("Sim") && !foodProcessed.equals("Não")
                    && !foodSugar.equals("Sim") && !foodSugar.equals("Não")
                    && !foodFat.equals("Sim") && !foodFat.equals("Não")
                    &&  !meat.equals("Sim") && !meat.equals("Não")){

            System.out.println("Come muita comida gordurosa?");
            foodFat = sc.next();
            foodFat = foodFat.substring(0, 1).toUpperCase() + foodFat.substring(1);
            ResultOfExam.foodFat = foodFat;
            Food.foodFatB();

            System.out.println("Come muita comida processada?");
            foodProcessed = sc.next();
            foodProcessed = foodProcessed.substring(0, 1).toUpperCase() + foodProcessed.substring(1);
            ResultOfExam.foodProcessed = foodProcessed;
            Food.foodProcessedB();

            System.out.println("Come muito açúcar?");
            foodSugar = sc.next();
            foodSugar = foodSugar.substring(0, 1).toUpperCase() + foodSugar.substring(1);
            ResultOfExam.foodSugar = foodSugar;
            Food.foodSugarB();

            System.out.println("Come muita carne vermelha?");
            meat = sc.next();
            meat = meat.substring(0, 1).toUpperCase() + meat.substring(1);
            ResultOfExam.meat = meat;
            Food.meat();
            }
        } else if (examBlood.equals("Bem")){
            BloodFood Food = new BloodFood();

            String vegetable = "";
            String fruit = "";
            String legume = "";
            String meat = "";

            System.out.println("Responda apenas com sim ou não\n");

            while(!vegetable.equals("Sim") && !vegetable.equals("Não")
                    && !fruit.equals("Sim") && !fruit.equals("Não")
                    && !legume.equals("Sim") && !legume.equals("Não")
                    &&  !meat.equals("Sim") && !meat.equals("Não")){

            System.out.println("Come muita verdura?");
            vegetable = sc.next();
            vegetable = vegetable.substring(0, 1).toUpperCase() + vegetable.substring(1);
            ResultOfExam.vegetable = vegetable;
            Food.vegetableG();

            System.out.println("Come muita fruta?");
            fruit = sc.next();
            fruit = fruit.substring(0, 1).toUpperCase() + fruit.substring(1);
            ResultOfExam.fruit = fruit;
            Food.fruitG();

            System.out.println("Come muita legume?");
            legume = sc.next();
            legume = legume.substring(0, 1).toUpperCase() + legume.substring(1);
            ResultOfExam.legume = legume;
            Food.legumeG();

            System.out.println("Come muita carne vermelha?");
            meat = sc.next();
            meat = meat.substring(0, 1).toUpperCase() + meat.substring(1);
            ResultOfExam.meat = meat;
            Food.meat();
            }
        }

        System.out.println("Por favor, sente-se naquela cadeira e estenda o braço de preferência para a retirada do sangue\n");
        Thread.sleep(2000);

        if (examBlood.equals("Mal")){
            ResultOfExam.examBlood = ("O paciente não possue uma alimentação equilibrada, caso continue desta forma pode acarretar a graves doenças");
        } else if (examBlood.equals("Bem")){
            ResultOfExam.examBlood = ("O paciente possui uma alimentação adequada, seus exames não apontaram possíveis doenças");
        }
    }
}
