# -*- coding: cp1252 -*-
'''
Fibonacci.py
 * Calcular o n�mero de Fibonacci N 
 * Entrada: N (int) 
 * Sa�da: FN 
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
'''

N = int(raw_input("N = "))
fib = 1
fibAnt = 0

if N==0:
    print 0
else:
    for i in range(2,N+1):
        tmp = fib+fibAnt
        fibAnt, fib = fib, tmp
    print fib
