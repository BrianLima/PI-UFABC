# -*- coding: cp1252 -*-
'''
SomaDigitos.py
 * Somar os d�gitos de um n�mero n 
 * Entrada: n (int) 
 * Sa�da: soma (int) 
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
'''

n = int(raw_input("n = "))

soma = 0

while n!=0:
    soma += n%10
    n /= 10
print soma
