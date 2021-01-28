public interface MediatorWiezy {
    void ustawStatusLadowania(boolean status);

    void rejestrujLot(Lot lot);

    void rejestrujPasStartowy(PasStartowy pasStartowy);

    boolean czyMoznaLadowa();
}
