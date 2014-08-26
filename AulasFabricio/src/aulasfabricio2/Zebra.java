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
        int nacionalidade = adivinhaNacionalidade(num, cor, bebida, comida, animal);
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
            if (buscaLista(Animal, "GATOS") != animal + 1 || buscaLista(Animal, "GATOS") != animal - 1) {
                //O vizinho tem um gato
                return false;
            }
        } else if (buscaLista(Comida, "Frutas") == comida) {
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
        System.out.println("O dono da casa número " + Casa[num] + " de cor " + Cor[cor] + " tem o animal " + Animal[animal] + " e come " + Comida[comida] + " e bebe " + Bebida[bebida] + ".");
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

        for (int i = 0; i < remover.size(); i++) {
            lista.remove(i);
        }

        for (int[] x : lista) {
            Imprime(x[0], x[1], x[2], x[3], x[4]);
        }
    }

    static int adivinhaNacionalidade(int num, int cor, int bebida, int comida, int animal) {
        int nacionalidade = 6;
        if (cor == buscaLista(Cor, "VERMELHO")) {
            nacionalidade = buscaLista(Nacionalidade, "BRASILEIRO");
        } else if (bebida == buscaLista(Bebida, "CHA")) {
            nacionalidade = buscaLista(Nacionalidade, "CHILENO");
        } else if (animal == buscaLista(Animal, "CACHORRO")) {
            nacionalidade = buscaLista(Nacionalidade, "ARGENTINO");
        } else if (num == buscaLista(Casa, "UM") && cor - 1 == buscaLista(Cor, "AZUL")) {
            nacionalidade = buscaLista(Nacionalidade, "PERUANO");
        } else if (comida == buscaLista(Comida, "DOCES")) {
            nacionalidade = buscaLista(Nacionalidade, "CUBANO");
        }

        return nacionalidade;
    }
}
