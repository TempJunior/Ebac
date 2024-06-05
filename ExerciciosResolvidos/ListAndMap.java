package ebacCursoJava.ExerciciosResolvidos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public interface ListAndMap {

    public static void impressaoListas(){
        Scanner sc = new Scanner(System.in);

        List<ConstrutorListaHomensMulheres> mulheres = new ArrayList<ConstrutorListaHomensMulheres>();
        List<ConstrutorListaHomensMulheres> homens = new ArrayList<ConstrutorListaHomensMulheres>();

        System.out.println("Digite seu genero e Nome: ");
        while (true){
            String entradaDeDados = sc.nextLine();
            if (entradaDeDados.equalsIgnoreCase("exit")){
                break;
            }

            String[] partes = entradaDeDados.split(" ");
            String genero = partes [0];
            String nome = partes [1];

            ConstrutorListaHomensMulheres pessoas = new ConstrutorListaHomensMulheres(genero, nome);

            if(genero.equalsIgnoreCase("M")){
                homens.add(pessoas);
            }else if (genero.equalsIgnoreCase("F")){
                mulheres.add(pessoas);
            }else {
                System.out.println("Genero invalido " + genero);
            }
        }

        for(ConstrutorListaHomensMulheres dados : homens){
            System.out.println("Lista homens: "+ dados.getNome());
        }
        for(ConstrutorListaHomensMulheres dadosNome : mulheres){
            System.out.println("Lista Mulheres: "+ dadosNome.getNome());


        }

    }




}
