# -*- coding: cp1252 -*-
'''
Fatorial.py
 * Calcular o fatorial de um n�mero N
 * Entrada: N (int) 
 * Sa�da: N! 
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
'''

N = int(raw_input("N = "))
fatorial = 1
for i in range(1,N+1):
    fatorial = fatorial*i
print fatorial
