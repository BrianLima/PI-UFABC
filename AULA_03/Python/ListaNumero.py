# -*- coding: cp1252 -*-
'''
ListaNumero.py
 * Listar os N primeiros n�meros naturais separados por v�rgula 
 * Entrada: N (int) 
 * Sa�da: lista separado por v�rgula 
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
'''

N = int(raw_input("N = "))
for i in range(N+1):
    print i,
    if i==N:
        break
    print ",",
