package DiceClient;

import Guiche.Service;

import java.util.Objects;
import java.util.Scanner;

public class RegistrerClient extends Client{
    public void register() throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        while(!Objects.equals(sex, var instanceof String)
                && !Objects.equals(name, var instanceof String)
                && !Objects.equals(age, var instanceof Integer)
                && !Objects.equals(sex, Sex.MASCULINE.toString())
                && !Objects.equals(sex, Sex.FEMININE.toString())){

        System.out.println("Por favor, informe seu nome, idade e sexo:");
        System.out.println("Nome: ");
        name = sc.next();

        System.out.println("Idade: ");
        while(!sc.hasNextInt()){
            System.out.println("Por favor, informe um valor númerico");
            sc.next();
        }
        age = sc.nextInt();
        
        System.out.println("Sexo: ");
        sex = sc.next();
        sex = sex.substring(0, 1).toUpperCase() + sex.substring(1);

        }

        Service Guiche = new Service();
        Guiche.guiche();
    }
}
