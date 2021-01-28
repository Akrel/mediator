public abstract class Lot implements Polecenie {
    protected MediatorWiezy mediatorWiezy;
    protected String nazwa;

    public Lot(MediatorWiezy mediatorWiezy, String nazwa) {
        this.mediatorWiezy = mediatorWiezy;
        this.nazwa = nazwa;
    }

    public void zglosGotowosc() {
        System.out.println("Jestem gotowy do ladowania" + nazwa);
    }

}
