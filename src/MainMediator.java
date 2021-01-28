import java.util.List;

public class MainMediator {
    public static void main(String[] args) {
        WiezaKontrolna wiezaKontrolna = new WiezaKontrolna();
        Awionetka awionetka = new Awionetka(wiezaKontrolna, "AWIONETKA001");
        Awionetka awionetka2 = new Awionetka(wiezaKontrolna, "AWIONETKA002");
        Awionetka awionetka3 = new Awionetka(wiezaKontrolna, "AWIONETKA003");
        Samolot samolot = new Samolot(wiezaKontrolna, "BOEING-001");
        Samolot samolot1 = new Samolot(wiezaKontrolna, "BOEING-002");
        PasStartowy pasStartowy = new PasStartowy(wiezaKontrolna);
        wiezaKontrolna.rejestrujLot(awionetka);
        List<Lot> lotList = List.of(awionetka, samolot, awionetka2, samolot1, awionetka3);

        for(Lot list : lotList)
        {
            list.landing();
            pasStartowy.landing();
            awionetka.landing();
        }



    }
}
