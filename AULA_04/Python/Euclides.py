# -*- coding: cp1252 -*-
'''
Euclides.py
 * Calcular o MDC entre m e n 
 * utilizando o algoritmo de Euclides
 * Entrada: n,m (int) 
 * Sa�da: mdc 
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
'''

n = int(raw_input("n = "))
m = int(raw_input("m = "))
r = m%n

while r!=0:
    m = n
    n = r
    r = m%n
print "MDC = ", n
