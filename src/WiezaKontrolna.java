public class WiezaKontrolna implements MediatorWiezy {
    private Lot lot;
    private PasStartowy pasStartowy;
    private boolean land;


    @Override
    public void ustawStatusLadowania(boolean status) {
        this.land = status;
    }

    @Override
    public void rejestrujLot(Lot lot) {
        this.lot = lot;
    }

    @Override
    public void rejestrujPasStartowy(PasStartowy pasStartowy) {
        this.pasStartowy = pasStartowy;
    }

    @Override
    public boolean czyMoznaLadowa() {
        return land;
    }
}
