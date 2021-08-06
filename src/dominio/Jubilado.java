
package dominio;


public class Jubilado {
    private String cedula;
    private String nombres;
    private int anio;
    private double salario;

    public Jubilado(double salario, int anio, String cedula, String nombre) {
        this.cedula=cedula;
        this.anio=anio;
        this.nombres=nombres;
        this.salario=salario;
    }
    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
