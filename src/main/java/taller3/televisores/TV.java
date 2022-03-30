package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    private static int numTV = 0;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        TV.numTV += 1;
    }

    public Marca getMarca() {
        return this.marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Control getControl() {
        return this.control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVolumen() {
        return this.volumen;
    }

    public void setVolumen(int volumen) {
        if (!this.estado) {return;}
        if (volumen < 0 || volumen > 7) {
            return;
        }
        this.volumen = volumen;
    }

    public int getCanal() {
        return this.canal;
    }

    public void setCanal(int canal) {
        if (!this.estado) {return;}
        if (canal < 1 || canal > 120) {
            return;
        }
        this.canal = canal;
    }
    
    public static int getNumTV() {
        return TV.numTV;
    }

    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }
    public void turnOn() {
        this.estado = true;
    }

    public void turnOff() {
        this.estado = false;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void canalUp() {
        int canalNuevo = this.canal + 1;
        this.setCanal(canalNuevo);
    }

    public void canalDown() {
        int canalNuevo = this.canal - 1;
        this.setCanal(canalNuevo);
    }

    public void volumenUp() {
        int volumenNuevo = this.volumen + 1;
        if (volumenNuevo > 7 || !this.estado){
            return;
        }
        this.setVolumen(volumenNuevo);
    }

    public void volumenDown() {
        int volumenNuevo = this.volumen - 1;
        this.setVolumen(volumenNuevo);
    }
}
