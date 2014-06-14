# -*- coding: cp1252 -*-
'''
GeraPalindromo.py
 * Crie uma rotina que retorne o inverso de um n�mero
 * Use tal rotina para gerar um palindromo.
 *
 * Entrada: n (int) 
 * Sa�da: palindromo
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
'''

def Inverso( n ):
    inverso = 0
    while n!= 0:
        inverso = inverso*10 + n%10
        n /= 10
    return inverso

if __name__ == "__main__":

    n = int(raw_input("Digite um n�mero: "))
    maxTentativas = 100
    inv = 0
    for it in range(maxTentativas):
        inv = Inverso(n)
        if n==inv:
            break
        n += inv
    if inv==n:
        print "Obtive ",n," ap�s",it,"tentativas"
    else:
        print "Desisto"
