public class PasStartowy implements Polecenie {
    private MediatorWiezy mediatorWiezy;

    public PasStartowy(MediatorWiezy mediatorWiezy) {
        this.mediatorWiezy = mediatorWiezy;

    }

    @Override
    public void landing() {
        System.out.println("UDZIELONO PRAWA NA LĄDOWANIE");
        mediatorWiezy.ustawStatusLadowania(true);

    }
}
