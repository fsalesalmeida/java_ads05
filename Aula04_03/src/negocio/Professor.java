package negocio;

public class Professor extends Pessoa {

    private int registro;

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public Professor(String nome) {
        super(nome);
    }
}
