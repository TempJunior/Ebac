package ebacCursoJava.ExerciciosResolvidos;

import java.util.Comparator;

public abstract class ComparatorPorGenero implements Comparator <ConstrutorListaHomensMulheres>{

    @Override
    public int compare(ConstrutorListaHomensMulheres p1, ConstrutorListaHomensMulheres p2) {
        return p1.getGenero().compareTo(p2.getGenero());
    }
}
