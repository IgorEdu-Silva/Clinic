package TypeOfService;

import Exams.Xbody;
import Exams.Xbuccal;
import ReportOfPatient.MedicalReport;

import java.util.Scanner;

public class RaioX {
    public void RaioX() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        MedicalReport Medical = new MedicalReport();

        System.out.println("1 - Corporal.");
        System.out.println("2 - Bucal.");
        int choice = sc.nextInt();

        switch (choice){
            case 1 -> {
                Xbody Body = new Xbody();
                Body.choiceSide();

                Medical.raioXBody();
            }
            case 2 -> {
                Xbuccal Bucal = new Xbuccal();
                Bucal.choiceSide();

                Medical.raioXBuccal();
            }
        }
    }
}
