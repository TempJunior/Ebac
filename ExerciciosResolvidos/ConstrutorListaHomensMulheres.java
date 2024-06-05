package ebacCursoJava.ExerciciosResolvidos;

public class ConstrutorListaHomensMulheres {
    String genero;
    String nome;

    public ConstrutorListaHomensMulheres(String genero, String nome) {
        this.genero = genero;
        this.nome = nome;
    }
    public String getEntradaDeDados(){
        return getGenero();
    }
    public String pegarGenero(String genero){
        return this.getGenero();
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
