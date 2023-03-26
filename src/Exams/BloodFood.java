package Exams;

import DiceClient.ResultOfExam;

public class BloodFood {
    public void foodFatB(){
        if (ResultOfExam.foodFat.equals("Sim")){
            ResultOfExam.foodFat = "O paciente come muita comida gordurosa";
            ResultOfExam.vegetable = "O paciente não come vegetal";
        } else if (ResultOfExam.foodFat.equals("Não")){
            ResultOfExam.foodFat = "O paciente come pouca comida gordurosa";
            ResultOfExam.vegetable = "O paciente come vegetal";
        }
    }

    public void foodProcessedB(){
        if (ResultOfExam.foodProcessed.equals("Sim")){
            ResultOfExam.foodProcessed = "O paciente come muita comida processada";
            ResultOfExam.legume = "O paciente não come legume";
        } else if (ResultOfExam.foodProcessed.equals("Não")){
            ResultOfExam.foodProcessed = "O paciente come pouca comida processada";
            ResultOfExam.legume = "O paciente come legume";
        }
    }

    public void foodSugarB(){
        if (ResultOfExam.foodSugar.equals("Sim")){
            ResultOfExam.foodSugar = "O paciente come muito doce";
            ResultOfExam.fruit = "O paciente não come fruta";
        } else if (ResultOfExam.foodSugar.equals("Não")){
            ResultOfExam.foodSugar = "O paciente come pouco doce";
            ResultOfExam.fruit = "O paciente come fruta";
        }
    }

    public void meat(){
        if (ResultOfExam.meat.equals("Sim")){
            ResultOfExam.meat = "O paciente come muita carne vermelha";
        } else if (ResultOfExam.meat.equals("Não")){
            ResultOfExam.meat = "O paciente come pouca carne vermelha";
        }
    }

    public void vegetableG() {
        if (ResultOfExam.vegetable.equals("Sim")){
            ResultOfExam.vegetable = "O paciente come muito vegetal";
            ResultOfExam.foodFat = "O paciente não come comida gordurosa";
        } else if(ResultOfExam.vegetable.equals("Não")){
            ResultOfExam.vegetable = "O paciente come pouco vegetal";
            ResultOfExam.foodFat = "O paciente come comida gordurosa";
        }
    }
    public void legumeG(){
        if (ResultOfExam.legume.equals("Sim")){
            ResultOfExam.legume = "O paciente come muito legume";
            ResultOfExam.foodProcessed = "O paciente não come comida processada";
        } else if (ResultOfExam.legume.equals("Não")){
            ResultOfExam.legume = "O paciente come pouco legume";
            ResultOfExam.foodProcessed = "O paciente come comida processada";
        }
    }

    public void fruitG(){
        if (ResultOfExam.fruit.equals("Sim")) {
            ResultOfExam.fruit = "O paciente come muita fruta";
            ResultOfExam.foodSugar = "O paciente não come doce";
        } else if (ResultOfExam.fruit.equals("Não")) {
            ResultOfExam.fruit = "O paciente come pouca fruta";
            ResultOfExam.foodSugar = "O paciente come doce";
        }
    }
}
