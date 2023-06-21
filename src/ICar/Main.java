package ICar;

public class Main {
    public static void main(String[] args) {

        Renault logan = new Renault("ICar.Renault", 2018, 40000, "Cinza", 4);

        System.out.println("------------------------------------------");
        System.out.println("Testando ICar.Renault Logan");
        System.out.println("------------------------------------------");
        logan.darPartida();
        logan.acelerar();
        logan.acelerar();
        logan.freiar();

        Fiat siena = new Fiat("ICar.Fiat", 2015, 30000, "Branco", 4);

        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("Testando ICar.Fiat Siena");
        System.out.println("------------------------------------------");
        siena.darPartida();
        siena.acelerar();
        siena.acelerar();
        siena.freiar();

        Hyundai hb20 = new Hyundai("ICar.Hyundai", 2017, 60000, "Preto", 4);

        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("Testando ICar.Hyundai HB20");
        System.out.println("------------------------------------------");
        hb20.darPartida();
        hb20.acelerar();
        hb20.acelerar();
        hb20.freiar();

    }
}