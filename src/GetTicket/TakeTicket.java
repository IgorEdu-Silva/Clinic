package GetTicket;

import Guiche.Normal;
import Guiche.Preferential;

import java.util.Scanner;

    public class TakeTicket {
        public void take() throws InterruptedException {
            Scanner sc = new Scanner(System.in);

            System.out.println("1 - Atendimento normal.");
            System.out.println("2 - Atendimento preferêncial.");

            while(!sc.hasNextInt()){
                System.out.println("Por favor, informe um valor númerico");
                sc.next();
            }
            int number = sc.nextInt();

            switch (number) {
                case 1 -> {
                    Normal Call = new Normal();
                    Call.callN();
                }
                case 2 -> {
                    Preferential Call = new Preferential();
                    Call.callP();
                }
            }
        }
    }
