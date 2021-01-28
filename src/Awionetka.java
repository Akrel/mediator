public class Awionetka extends Lot {


    public Awionetka(MediatorWiezy mediatorWiezy, String nazwa) {
        super(mediatorWiezy, nazwa);
    }

    @Override
    public void landing() {
        if (mediatorWiezy.czyMoznaLadowa())
        {
            System.out.println("UDALO SIE WYLADOWAC"  + nazwa);
            mediatorWiezy.ustawStatusLadowania(false);
        }
        else
            System.out.println("ROZUMIEM,CZEKAM NA POZWOLENIE");
    }
}
