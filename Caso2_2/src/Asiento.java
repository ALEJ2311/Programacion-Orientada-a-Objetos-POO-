public class Asiento {
    private boolean reservado;

    public Asiento() {
        this.reservado = false;
    }
    public boolean isReservado() {
        return reservado;
    }
    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public void reservar() {
        if (!reservado) {
            reservado = true;
            System.out.println("Asiento reservado con exito.");
        } else {
            System.out.println("El asiento ya está  por alguien más.");
        }
    }
}
