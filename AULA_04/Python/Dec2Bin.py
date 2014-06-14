# -*- coding: cp1252 -*-
'''
Dec2Bin.py
 * Converter um n�mero decimal 
 * para seu equivalente em bin�rio 
 * Entrada: n (int) 
 * Sa�da: bin 
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
'''

n = int(raw_input("n = "))
i = 1
bin = 0
while n!=0:
    bin += (n%2)*i
    i *= 10
    n /= 2
print bin
