public class Samolot extends Lot {
    public Samolot(MediatorWiezy mediatorWiezy, String nazwa) {
        super(mediatorWiezy, nazwa);
        this.mediatorWiezy = mediatorWiezy;
        this.nazwa = nazwa;
    }


    @Override
    public void landing() {
        if (mediatorWiezy.czyMoznaLadowa())
        {
            System.out.println("UDALO SIE WYLADOWAC" + nazwa);
            mediatorWiezy.ustawStatusLadowania(true);
        }
        else
            System.out.println("ROZUMIEM,CZEKAM NA POZWOLENIE");
    }
}
