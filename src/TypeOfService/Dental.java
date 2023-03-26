package TypeOfService;


import Exams.Caries;
import Exams.Ciso;
import Exams.Inspect;

import java.util.Scanner;

public class Dental {

    public void Dental() throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("O que faremos hoje?");
        System.out.println("1 - Retirar Carie.");
        System.out.println("2 - Retirar Ciso.");
        System.out.println("3 - Inspecionar.");

        while(!sc.hasNextInt()){
            System.out.println("Por favor, informe um valor númerico");
            sc.next();
        }
        int choice = sc.nextInt();

        switch (choice){
            case 1 -> {
                Caries Caries = new Caries();
                Caries.whichTooth();
            }
            case 2 -> {
                Ciso Ciso = new Ciso();
                Ciso.whichCiso();
            }
            case 3 -> {
                Inspect Inspect = new Inspect();
                Inspect.inspectTeeth();
            }
        }
    }
}
