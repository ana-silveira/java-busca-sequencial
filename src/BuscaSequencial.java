/*
Uma busca sequencial se caracteriza por percorrermos todos os elementos de uma estrutura em busca do elemento “X” desejado.
Neste desafio, dada uma estrutura de vetor A [a1, a2...an], percorra todo o vetor fazendo as comparações de A[N] = X.
Caso a condição seja verdadeira, “X” existe na estrutura e a busca será concluída com sucesso.

Considere um array de 10 elementos do tipo inteiro:
Os elementos são {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}.
● Carregue esses elementos em um array.
● Implementação da busca sequencial:
● Crie um método  que realiza uma busca sequencial.
● Se o valor constar no array, retorne um texto contendo o valor e sua respectiva posição no array. Caso contrario retorne um texto dizendo que o número não foi encontrado, conforme exemplos abaixo.

Entrada: Um valor de busca e/ou array

Saída: A posição do elemento no array.
Caso o valor não se encontre na Array, retorne a frase " Numero __ nao encontrado!"
 */

import java.util.*;

public class BuscaSequencial {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        int valor = leitor.nextInt();
        boolean elementoEncontrado = false;

        for (int i = 0; i < elementos.length; i++) {
                if (valor == elementos[i]) {
                    elementoEncontrado = true;
                    System.out.print("Achei " + valor + " na posicao " + i);
                }
        }
        if (!elementoEncontrado) System.out.println(" Numero " + valor + " nao encontrado!");
    }
}