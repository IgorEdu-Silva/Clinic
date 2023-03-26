package Guiche;

import DiceClient.RegistrerClient;
import java.util.Random;

public class Preferential {
    public void callP() throws InterruptedException {
        Random rd = new Random();

        int pass;
        int i = 0;

        System.out.println("Aqui está sua senha, por favor aguarde sentado até que seja chamado.");
        System.out.println(pass = rd.nextInt(5));
        System.out.println("--------------------------");

        while(pass != i){
            i++;
            System.out.println("Senha " + i);
            System.out.println("Por favor, se dirija ao caixa\n");
        }

        RegistrerClient Patient = new RegistrerClient();
        Patient.register();
    }
}
