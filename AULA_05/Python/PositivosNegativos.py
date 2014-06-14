# -*- coding: cp1252 -*-
'''
PositivosNegativos.py
 * Leitura de uma lista de valores 
 * separar positivos de negativos. 
 * Entrada: double [] x
 * Sa�da: double [] pos, neg 
 * Autor: Fabr�cio Olivetti de Fran�a
'''

f = open("lista.csv")
n = int(f.readline())
x = map(float, f.readline().split(';'))
f.close()

positivo = []
negativo = []
for i in x:
    if i > 0:
        positivo.append(i)
    elif i < 0:
        negativo.append(i)
print positivo, negativo
