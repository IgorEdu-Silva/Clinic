package Guiche;

import Recepcion.RoomExam;
import TypeOfService.CheckUp;
import TypeOfService.Dental;
import TypeOfService.RaioX;

import java.util.Scanner;

public class Service {
    public void guiche() throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEm que posso ajudá-lo?");
        System.out.println("1 - Desejo fazer um CheckUp.");
        System.out.println("2 - Preciso de um Raio X.");
        System.out.println("3 - Gostaria de me consultar com o Dentista.");

        while(!sc.hasNextInt()){
            System.out.println("Por favor, informe um valor númerico");
            sc.next();
        }
        int typeExam = sc.nextInt();

        RoomExam Room = new RoomExam();
        Room.roomExams();

        switch (typeExam) {
            case 1 -> {
                CheckUp CheckUp = new CheckUp();
                CheckUp.CheckUp();
            }
            case 2 -> {
                RaioX RaioX = new RaioX();
                RaioX.RaioX();
            }
            case 3 -> {
                Dental Dental = new Dental();
                Dental.Dental();
            }
        }
    }
}
