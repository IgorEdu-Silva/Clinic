import GetTicket.TakeTicket;

public class OpenTheDoor {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Bem vindo");
        System.out.println("Puxe um ticket de acordo com a sua preferência de atendimento\n");

        TakeTicket TakeTicket = new TakeTicket();
        TakeTicket.take();
    }
}