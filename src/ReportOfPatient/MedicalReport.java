package ReportOfPatient;

import DiceClient.ResultOfExam;
import DiceClient.Sides;

import java.util.Objects;

public class MedicalReport {
    public void checkUp(){
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("Resultado do CheckUp\n");

        System.out.println(DiceClient.Client.name + ".");
        System.out.println(DiceClient.Client.age + ".");
        System.out.println(DiceClient.Client.sex + ".");

        System.out.println("\nExame de sangue: \n");

        System.out.println(ResultOfExam.examBlood + ".");

        System.out.println("\nExame alimentício: \n");

        System.out.println(ResultOfExam.foodFat + ".");
        System.out.println(ResultOfExam.foodProcessed + ".");
        System.out.println(ResultOfExam.foodSugar + ".");
        System.out.println(ResultOfExam.vegetable + ".");
        System.out.println(ResultOfExam.legume + ".");
        System.out.println(ResultOfExam.fruit + ".");
        System.out.println(ResultOfExam.meat + ".");

        System.out.println("\nExame Urinário: \n");

        System.out.println(ResultOfExam.examUrine + ".");
        System.out.println(ResultOfExam.examUrineStone + ".");

        System.exit(0);
    }

    public void checkUpWithCardio(){
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("Resultado do CheckUp\n");

        System.out.println(DiceClient.Client.name + ".");
        System.out.println(DiceClient.Client.age + ".");
        System.out.println(DiceClient.Client.sex + ".");

        System.out.println("\nExame de sangue: \n");

        System.out.println(ResultOfExam.examBlood + ".");

        System.out.println("\nExame alimentício: \n");

        System.out.println(ResultOfExam.foodFat + ".");
        System.out.println(ResultOfExam.foodProcessed + ".");
        System.out.println(ResultOfExam.foodSugar + ".");
        System.out.println(ResultOfExam.vegetable + ".");
        System.out.println(ResultOfExam.legume + ".");
        System.out.println(ResultOfExam.fruit + ".");
        System.out.println(ResultOfExam.meat + ".");

        System.out.println("\nExame Urinário: \n");

        System.out.println(ResultOfExam.examUrine + ".");
        System.out.println(ResultOfExam.examUrineStone + ".");

        System.out.println("\nExame Cardíaco:\n");

        System.out.println(ResultOfExam.examCardio + ".");
        System.out.println(ResultOfExam.examCardioSup + ".");

        System.exit(0);
    }

    public void dentalCiso(){
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("Resultado do Exame Dental\n");

        System.out.println(DiceClient.Client.name + ".");
        System.out.println(DiceClient.Client.age + ".");
        System.out.println(DiceClient.Client.sex + ".");

        System.out.println("\nCisos removidos: \n");
        System.out.println(ResultOfExam.cisoX + ".");
        System.out.println(ResultOfExam.cisoY + ".");

        System.exit(0);
    }

    public void dentalCaries(){
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("Resultado do Exame Dental\n");

        System.out.println(DiceClient.Client.name + ".");
        System.out.println(DiceClient.Client.age + ".");
        System.out.println(DiceClient.Client.sex + ".");

        System.out.println(ResultOfExam.cariesToWithdraw + ".");
        System.out.println("\nTodas foram tratadas.");

        System.exit(0);
    }

    public void dentalInspect(){
        ResultOfExam ResultOfExam = new ResultOfExam();

        System.out.println();
        System.out.println("------------------------------");
        System.out.println("\nResultado do Exame Dental\n");

        System.out.println(DiceClient.Client.name + ".");
        System.out.println(DiceClient.Client.age + ".");
        System.out.println(DiceClient.Client.sex + ".");

        if (DiceClient.ResultOfExam.cariesConfirm == 0){
            System.out.println(ResultOfExam.perDay = "O paciente não escova o dente nenhuma vez por dia," +
                    " seus dentes além de terem cáries estão apodrecendo.");
            System.out.println(ResultOfExam.caries = "Muitas cáries e perda de dentes\n");
            System.out.println("Teve perda dos incisivos frontais e laterais superiores e inferiores.");
            System.out.println("Há a opção de fazer uma prótese ou canais.");

        } else if (DiceClient.ResultOfExam.cariesConfirm == 1){
            System.out.println(ResultOfExam.perDay = "O paciente não escova mais de uma vez por dia.");
            System.out.println(ResultOfExam.caries = "Muitas cáries, mas ainda tem chance de melhorar.");
            System.out.println("Por sorte não perdeu nenhum dente." +
                    "Uma limpeza, removendo as cáries a maioria dos problemas foi sanado.\n");
            System.out.println("Precisa cuidar melhor para que não piore a situação.");

        } else if (DiceClient.ResultOfExam.cariesConfirm == 2){
            System.out.println(ResultOfExam.perDay = "O paciente escova duas vezes ao dia.");
            System.out.println(ResultOfExam.caries = "Nenhuma cárie, exceto manchas.\n");
            System.out.println("Não há necessidade de nenhum tratamento contato que cuide.");
            System.out.println("Salvo que o paciente pode fazer clareamento para melhorar esteticamente o sorriso.");

        } else if (DiceClient.ResultOfExam.cariesConfirm == 3){
            System.out.println(ResultOfExam.perDay = "O paciente escova mais de três vezes ao dia.");
            System.out.println(ResultOfExam.caries = "Nenhuma cárie.\n");
            System.out.println("Não há necessidade de nenhum tratamento, " +
                    "apenas continuar cuidando para que não tenho problemas.");
        }

        System.exit(0);
    }

    public void raioXBuccal(){
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("Resultado dos Exames de Raio X\n");

        System.out.println(DiceClient.Client.name + ".");
        System.out.println(DiceClient.Client.age + ".");
        System.out.println(DiceClient.Client.sex + ".");

        if (Objects.equals(ResultOfExam.examRaioXBuccal, Sides.LEFT.toString())
            || Objects.equals(ResultOfExam.examRaioXBuccal, Sides.RIGHT.toString())){
            System.out.println("Exame realizado na parte " + ResultOfExam.examRaioXBuccal +
                    " da arcada dentária do paciente.");
        } else
            System.out.println("Exame realizado em " + ResultOfExam.examRaioXBuccal +
                    " os lados da arcada dentária do paciente.");

        System.exit(0);
    }

    public void raioXBody(){
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("Resultado dos Exames de Raio X\n");

        System.out.println(DiceClient.Client.name + ".");
        System.out.println(DiceClient.Client.age + ".");
        System.out.println(DiceClient.Client.sex + ".");

        System.out.println("\nFeito no braço: ");

        if (ResultOfExam.armLeft == null){
            System.out.println(ResultOfExam.armRight + ".");
        } else
            System.out.println(ResultOfExam.armLeft + ".");

        System.out.println("\nFeito na perna: ");

        if (ResultOfExam.legLeft == null){
            System.out.println(ResultOfExam.legRight + ".");
        } else
            System.out.println(ResultOfExam.legLeft + ".");

        if(ResultOfExam.trunk != null){
            System.out.println("Raio X adicional");
            System.out.println(ResultOfExam.trunk + ".");
        }

        System.exit(0);
    }
}
