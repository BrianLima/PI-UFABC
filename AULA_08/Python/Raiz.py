# -*- coding: cp1252 -*-
'''
Raiz.py
 * Encontrar a raiz n do n�mero x
 * utilizando o m�todo de Newton
 *
 * Entrada: y,n (double) 
 * Sa�da: raiz
 *
 * Autor: Fabr�cio Olivetti de Fran�a
 * Disciplina Processamento da Informa��o
 * Universidade Federal do ABC
'''

def f( x,y,n ):
    return x**n - y

def df( x,n ):
    return n*(x**(n-1))

if __name__ == "__main__":

    y = float(raw_input("y = "))
    n = float(raw_input("n = "))
    x = 1.0
    xAnt = 2.0
    while abs(x-xAnt) > 0.01:
        xAnt = x
        x -= f(x,y,n)/df(x,n)
    print "Ra�z",n,"de",y,"=",x
        
