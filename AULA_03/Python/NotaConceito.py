# -*- coding: cp1252 -*-
'''
NotaConceito.py
 * Dada uma nota x, escrever o conceito correspondente
 * Entrada: faltas, MaxFaltas (inteiros) e nota, limiar (double)
 * Sa�da:  "A", "R" ou "O"
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
'''

limiar = float(raw_input("limiar = "))
MaFaltas = int(raw_input("MaxFaltas = "))
alunos  = int(raw_input("alunos = "))

for i in range(1,alunos+1):
    faltas = int(raw_input("faltas = "))
    nota  = float(raw_input("nota = "))

    if faltas > MaxFaltas:
        print "Aluno ",i,": O"
    else:
        if nota >= limiar:
            print "Aluno ",i,": A"
        else:
            print "Aluno ",i,": R"
