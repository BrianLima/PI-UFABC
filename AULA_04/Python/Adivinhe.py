# -*- coding: cp1252 -*-
'''
Adivinhe.py
 * Sorteie um n�mero de 1 at� 100 
 * e pe�a para o usu�rio adivinhar
 * dando dicas se � > ou <
 * Entrada: n (int) 
 * Sa�da: nada 
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
'''

from random import randint

x = randint(1,100)
while True:
    n = int(raw_input("n = "))
    if n>x:
        print "O n�mero � menor!"
    elif n < x:
        print "O n�mero e maior!"
    else:
        print "Acertou"
        break
