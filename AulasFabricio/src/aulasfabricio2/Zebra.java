package aulasfabricio2;

/* EX. 03: Zebra.java
 * Implementar o jogo Bois e Vacas
 * (Cows and Bulls) tamb�m conhecido
 * como Mastermind.
 * Entrada: n (int) n�mero de 4 d�gitos 
 * Sa�da: nBois, nVacas (int)
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
 */
import java.util.*;

class Zebra {

    public static String[] Casa = {"UM", "DOIS", "TRES", "QUATRO", "CINCO"};
    public static String[] Cor = {"VERMELHO", "VERDE", "BRANCO", "AZUL", "AMARELO"};
    public static String[] Nacionalidade = {"BRASILEIRO", "ARGENTINO", "CHILENO", "PERUANO", "CUBANO"};
    public static String[] Bebida = {"CHA", "CAFE", "LEITE", "CERVEJA", "AGUA"};
    public static String[] Comida = {"PIZZA", "FRUTA", "CARNE", "LEGUMES", "DOCES"};
    public static String[] Animal = {"CACHORRO", "GATO", "PASSARO", "CAVALO", "ZEBRA"};

    // vamos buscar o �ndice que encontramos a string x na lista
    public static int buscaLista(String[] Lista, String x) {
        for (int i = 0; i < Lista.length; i++) {
            if (Lista[i].equals(x)) {
                return i;
            }
        }
        return 0;
    }

    // modela todas as dicas que temos em forma de condi��es/restri��es
    public static boolean Possivel(int num, int cor, int bebida, int comida, int animal) {

        if (buscaLista(Cor, "VERDE") == cor && buscaLista(Bebida, "CAFE") != bebida) {
            //Somente o morador da casa verde toma café
            return false;
        } else if (buscaLista(Comida, "PIZZA") == comida && buscaLista(Animal, "PASSARO") != animal) {
            //Somente o comedor de pizza tem um pássaro
            return false;
        } else if (buscaLista(Cor, "AMARELA") == cor && buscaLista(Comida, "FRUTAS") != comida) {
            //Somente o dono da casa amarela come frutas
            return false;
        } else if (buscaLista(Comida, "LEGUMES") == comida && buscaLista(Bebida, "CERVEJA") != bebida) {
            //Somente quem come legumes bebe cerveja
            return false;
        } else if (buscaLista(Cor, "VERDE") == cor && buscaLista(Cor, "BRANCA") != (cor -= 1)) {
            //A casa verde fica a esquerda da casa branca
            return false;
        } else if (buscaLista(Casa, "TRES") == num && buscaLista(Bebida, "LEITE") != bebida) {
            //Na casa do meio se bebe leite
            return false;
        } else if (buscaLista(Comida, "CARNE") == comida) {
            //Se come carne
            if (buscaLista(Animal, "GATOS") != animal+ 1 || buscaLista(Animal, "GATOS") != animal- 1) {
                //O vizinho tem um gato
                return false;
            }
        } else if(buscaLista(Comida, "Frutas") == comida){
            //Se come frutas
            if (buscaLista(Animal, "CAVALO") != animal - 1 || buscaLista(Animal, "CAVALO") != animal + 1) {
                //O vizinho tem um cavalo
                return false;
            }
        } else if (buscaLista(Bebida, "AGUA") == bebida) {
            //Se bebe agua
            if (buscaLista(Comida, "CARNE") != comida - 1 || buscaLista(Comida, "CARNE") != comida - 1) {
                //O vizinho come carne
                return false;
            }
        }

        //Todos os outros são possíveis
        return true;
//        if (buscaLista(Nacionalidade, "PERUANO") != buscaLista(Casa, "UM")) // se a Nacionalidade eh Peruana e a casa nao eh a primeira, entao quebrou a premissa
//        {
//            return false;
//        } else if (buscaLista(Nacionalidade, "PERUANO") == buscaLista(Casa, "UM")) {
//            return true;
//        }
//        if (buscaLista(Nacionalidade, "BRASILEIRO") != buscaLista(Cor, "VERMELHO")) {
//            return false;
//        } else if (buscaLista(Nacionalidade, "BRASILEIRO") == buscaLista(Cor, "VERMELHO")) {
//            return true;
//        }
//        if (buscaLista(Nacionalidade, "ARGENTINO") != buscaLista(Animal, "CACHORRO")) {
//            return false;
//        } else if (buscaLista(Nacionalidade, "ARGENTINO") == buscaLista(Animal, "CACHORRO")) {
//            return true;
//        }
//        if (buscaLista(Nacionalidade, "CHILENO") != buscaLista(Bebida, "CHA")) {
//            return false;
//        } else if (buscaLista(Nacionalidade, "CHILENO") == buscaLista(Bebida, "CHA")) {
//            return true;
//        }
//        if (buscaLista(Cor, "VERDE") != buscaLista(Bebida, "CAFE")) {
//            return false;
//        } else if (buscaLista(Cor, "VERDE") == buscaLista(Bebida, "CAFE")) {
//            return true;
//        }
//        if (buscaLista(Comida, "PIZZA") != buscaLista(Animal, "PASSARO")) {
//            return false;
//        } else if (buscaLista(Comida, "PIZZA") == buscaLista(Animal, "PASSARO")) {
//            return true;
//        }
//        if (buscaLista(Cor, "BRANCA") - buscaLista(Cor, "VERDE") == 1) {
//            return true;
//        } else if (buscaLista(Cor, "BRANCA") - buscaLista(Cor, "VERDE") != 1) {
//            return false;
//        }
//
//        if (buscaLista(Comida, "FRUTA") != buscaLista(Cor, "AMARELO")) {
//            return false;
//        } else if (buscaLista(Comida, "FRUTA") == buscaLista(Cor, "AMARELO")) {
//            return true;
//        }
//
//        if (Math.abs(buscaLista(Comida, "CARNE") - buscaLista(Animal, "GATO")) == 1) {
//            return true;
//        } else if (Math.abs(buscaLista(Comida, "CARNE") - buscaLista(Animal, "GATO")) != 1) {
//            return false;
//        }
//
//        if (Math.abs(buscaLista(Animal, "CAVALO") - buscaLista(Comida, "FRUTA")) == 1) {
//            return true;
//        } else if (Math.abs(buscaLista(Animal, "CAVALO") - buscaLista(Comida, "FRUTA")) != 1) {
//            return false;
//        }
//
//        if (buscaLista(Comida, "LEGUMES") != buscaLista(Bebida, "CERVEJA")) {
//            return false;
//        } else if (buscaLista(Comida, "LEGUMES") == buscaLista(Bebida, "CERVEJA")) {
//            return true;
//        }
//
//        if (buscaLista(Nacionalidade, "CUBANO") != buscaLista(Comida, "DOCES")) {
//            return false;
//        } else if (buscaLista(Nacionalidade, "CUBANO") == buscaLista(Comida, "DOCES")) {
//            return true;
//        }
//
//        if (Math.abs(buscaLista(Nacionalidade, "PERUANO") - buscaLista(Cor, "AZUL")) == 1) {
//            return true;
//        } else if (Math.abs(buscaLista(Nacionalidade, "PERUANO") - buscaLista(Cor, "AZUL")) != 1) {
//            return false;
//        }
//        return true;
    }

    // gera todas as permuta��es
    public static ArrayList<int[]> Permutacoes(int[] x, int n, int idx, ArrayList<int[]> lista) {
        if (idx == x.length) {
            int[] y = new int[5];
            for (int i = 0; i < 5; i++) {
                y[i] = x[i];
            }
            lista.add(y);
            return lista;
        }
        for (int i = idx; i < n; i++) {
            int tmp = x[i];
            x[i] = x[idx];
            x[idx] = tmp;
            lista = Permutacoes(x, n, idx + 1, lista); // recursividade, n�o � para voc�s ainda!
            tmp = x[i];
            x[i] = x[idx];
            x[idx] = tmp;

        }

        return lista;
    }

    // imprime a tabela
    public static void Imprime(int num, int cor, int bebida, int comida, int animal) {
    }

    public static void main(String[] args) {

        int[][] permutacoes = new int[120][5];
        for (int i = 0; i < 5; i++) {
            permutacoes[0][i] = i;
        }
        ArrayList< int[]> lista = new ArrayList<int[]>();
        lista = Permutacoes(permutacoes[0], 5, 0, lista);
        for (int i = 0; i < lista.size(); i++) {
            permutacoes[i] = lista.get(i);
        }
        //A grande questão era iterar pela lista de lista de forma a remover
        //Todas as colocações que contradiziam as verdades absolutas do texto dado
        //Assim no final, teriamos apenas as que são verdade e achariamos quem tem a zebra
        int index = 0;
        ArrayList<Integer> remover = new ArrayList<Integer>();
        for (int[] x : lista) {
            if (!Possivel(x[0], x[1], x[2], x[3], x[4])) {
                remover.add(index);
            }
            index++;
        }

        String a = Casa[1];
        
        for (int i = 0; i < remover.size(); i++) {
            lista.remove(i);
        }

        for (int[] x: lista) {
            Imprime(x[0], x[1], x[2], x[3], x[4]);
        }
    }
}
