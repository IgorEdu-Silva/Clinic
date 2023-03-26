package Recepcion;

import DiceClient.Client;

import java.util.Random;

public class RoomExam {
    public void roomExams() throws InterruptedException {
        Random rd = new Random();

        System.out.println("\nSente-se e espere ser chamado.");
        Thread.sleep(8000);

        int room = rd.nextInt(10);
        System.out.println("\n" + Client.name + " por favor se direcione a sala " +  room + " para ser atendido\n");
    }
}
