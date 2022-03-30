package taller3.televisores;

public class Control {
    private TV tv;

    public void turnOn() {
        this.tv.turnOn();
    }

    public void turnOff() {
        this.tv.turnOff();
    }

    public void canalUp() {
        int canalNuevo = this.tv.getCanal() + 1;
        this.tv.setCanal(canalNuevo);
    }

    public void canalDown() {
        int canalNuevo = this.tv.getCanal() - 1;
        this.tv.setCanal(canalNuevo);
    }

    public void volumenUp() {
        int volumenNuevo = this.tv.getVolumen() + 1;
        this.tv.setVolumen(volumenNuevo);
    }

    public void volumenDown() {
        int volumenNuevo = this.tv.getVolumen() - 1;
        this.tv.setVolumen(volumenNuevo);
    }

    public void setCanal(int canal) {
        this.tv.setCanal(canal);
    }

    public void enlazar(TV tv) {
        this.tv = tv;
        this.tv.setControl(this);
    }

    public TV getTv() {
        return this.tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }
}