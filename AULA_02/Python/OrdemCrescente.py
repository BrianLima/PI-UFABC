# -*- coding: cp1252 -*-
'''
OrdemCrescente.py
 * Imprimir os 3 n�meros em ordem crescente
 * Entrada: x,y,z (int)
 * Sa�da: n�meros em ordem crescente

Autor: Fabr�cio Olivetti de Fran�a
Disciplina Processamento da Informa��o
Universidade Federal do ABC
'''


x = float(raw_input("x = "))
y = float(raw_input("y = "))
z = float(raw_input("z = "))

if x<y and x<z:
    if y<z:
        print x,y,z
    else:
        print x,z,y
elif y<z:
    if x<z:
        print y,x,z
    else:
        print y,z,x
else:
    if x<y:
        print z,x,y
    else:
        print z,y,x
