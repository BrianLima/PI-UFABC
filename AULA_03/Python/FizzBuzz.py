# -*- coding: cp1252 -*-
'''
FizzBuzz.py
 * Para a sequ�ncia de n�meros de 1 at� 100
 * imprimir os n�meros em ordem crescente substituindo
 * m�ltiplos de 3 por Fizz, m�ltiplos de 5 por Buzz
 * e m�ltiplos de 3 e 5 por FizzBuzz
 * Entrada: nenhuma 
 * Sa�da: FizzBuzz
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
'''

for i in range(1,101):
    if i%15 == 0:
        print "FizzBuzz"
    elif i%3 == 0:
        print "Fizz"
    elif i%5 == 0:
        print "Buzz"
    else:
        print i
