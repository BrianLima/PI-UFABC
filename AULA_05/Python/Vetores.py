# -*- coding: cp1252 -*-
'''
Vetores.py
 * Leitura de uma lista de valores
 * c�lculo da m�dia, vari�ncia,
 * desvio-padr�o e menor e maior
 * elementos.
 * Entrada: double [] x
 * Sa�da: media, var, desvpad, menor, maior
 * Autor: Fabr�cio Olivetti de Fran�a
'''

from math import sqrt

f = open("lista.csv")
n = int(f.readline())
x = map(float, f.readline().split(';'))
f.close()

var = 0.0
maior = menor = x[0]
maiorIdx = menorIdx = 0

media = sum(x)/float(n)
for xx in x:
    var += (xx-media)**2
# var = map( lambda x: (x-media)**2, x )/float(n)    
var /= float(n)
desvpad = sqrt(var)

print media, var, desvpad

for i, xx in enumerate(x):
    if xx > maior:
        maior = xx
        maiorIdx = i
    if xx < menor:
        menor = xx
        menorIdx = i
print "Maior: ", maior, maiorIdx
print "Menor: ", menor, menorIdx

val = float(raw_input("Digite um valor para buscar: "))
for i, xx in enumerate(x):
    if xx==val:
        break
if i<n:
    print "Elemento em ", i
else:
    print "Elemento n�o encontrado"
