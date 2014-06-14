# -*- coding: cp1252 -*-
'''
Primo.py
 * Verificar se um n�mero n � primo 
 * Entrada: n (int) 
 * Sa�da: � primo ou n�o 
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
'''

n = int(raw_input("n = "))
i = n-1
primo = True

while i>1:
    if n%i == 0:
        primo = False
        break
    i -= 1
if primo:
    print "� primo"
else:
    print "N�o e primo"
