# -*- coding: utf-8 -*-
"""
Created on Fri Mar 17 14:41:55 2023

@author: 20pw19
"""
x = 0

class factorial(object):
   
    def __init__(self,number):
        self.number = number
    def factorial(self):
        global x
        x = x + 1
        if self.number == 1:
            return 1
        elif x<=1000:
            result = self.number * factorial(self.number-1).factorial()
            return result
        else:
            print("Limit Reached")

print("Enter number")
n = int(input())
fac = factorial(n)
print(fac.factorial())

