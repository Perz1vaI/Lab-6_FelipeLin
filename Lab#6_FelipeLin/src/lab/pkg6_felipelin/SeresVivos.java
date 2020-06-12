package lab.pkg6_felipelin;

public class SeresVivos {

    private String nombre;
    private int poder;
    private String years;
    private String planeta;
    private String raza;

    public SeresVivos() {
    }

    public SeresVivos(String nombre, int poder, String years, String planeta, String raza) {
        this.nombre = nombre;
        this.poder = poder;
        this.years = years;
        this.planeta = planeta;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "SeresVivos{" + "nombre=" + nombre + ", poder=" + poder + ", years=" + years + ", planeta=" + planeta + ", raza=" + raza + '}';
    }

}
