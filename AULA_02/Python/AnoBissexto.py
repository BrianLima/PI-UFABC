# -*- coding: cp1252 -*-
'''
AnoBissexto.py
Verifica se um dado ano � bissexto
Entrada: ano
Sa�da: sim ou n�o

Autor: Fabr�cio Olivetti de Fran�a
Disciplina Processamento da Informa��o
Universidade Federal do ABC
'''

ano = float(raw_input("Qual ano? "))

if ano%400 == 0 or (ano%4==0 and ano%100==0):
    print "� bissexto
else:
    print "N�o � bissexto"
