# -*- coding: cp1252 -*-
'''
Palindrome.py
 * verificar se uma String �
 * uma palindrome.
 * Entrada: String s 
 * Sa�da: sim ou n�o 
 * Autor: Fabr�cio Olivetti de Fran�a
'''

s = raw_input("Digite a palavra: ").lower()

palindrome = True
for i in range(len(s)/2):
    if s[i] != s[len(s)-i-1]:
        palindrome = False
        break
print "� pal�ndrome? ", palindrome
