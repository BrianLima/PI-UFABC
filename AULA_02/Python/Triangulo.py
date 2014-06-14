# -*- coding: cp1252 -*-
'''
Triangulo.py
 * Dada as tr�s dimens�es de um tri�ngulo
 * determinar se � realmente um tri�ngulo e qual tipo ele �
 * Entrada: x,y,z (double)
 * Sa�da:  se � tri�ngulo e qual tipo

Autor: Fabr�cio Olivetti de Fran�a
Disciplina Processamento da Informa��o
Universidade Federal do ABC
'''


x = int( raw_input("x = ") )
y = int( raw_input("x = ") )
z = int( raw_input("x = ") )

if x+y > z and x+z > y and y+z > x:
    if x==y and y==z:
        print "Equilatero"
    elif x==y or y==z or x==z:
        print "Is�celes"
    else:
        print "Escaleno"
else:
    print "N�o � um tri�ngulo"
