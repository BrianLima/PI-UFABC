# -*- coding: cp1252 -*-
'''
MediaPonderada.py
Calcula a m�dia ponderada entre dois n�meros
Entrada: x,y
Sa�da: media

Autor: Fabr�cio Olivetti de Fran�a
Disciplina Processamento da Informa��o
Universidade Federal do ABC
'''

x = float(raw_input("Entre o primeiro valor: "))
y = float(raw_input("Entre o segundo valor: "))
w = float(raw_input("Entre com a pondera��o (0<=w<=1): "))
media = ( w*x + (1.0-w)*y )/2.0
print "A m�dia �: ", media
