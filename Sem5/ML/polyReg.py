# Parametric, Discriminative Model

import numpy as np
import pandas as pd
import matplotlib.pyplot as plt


data = pd.read_csv("Z:/collegeThings/Sem5/ML/iris.csv")

n = len(data['sepal.length'])
def polyRegCalc(x,y, d):
    X = [[0 for i in range(d+1)] for j in range(n)]
    for i in range(0,n):
        for j in range(0,d+1):
            X[i][j] = round(np.power(data[x][i],j),6)
            
         
    xtx = [[0 for i in range(d+1)] for j in range(d+1)]
    
    for i in range(0,d+1):  #0 - 4
        for j in range(0,d+1):  #0 - 3
            if i==0 and j==0:
                xtx[i][j] = n
                
            else:
                xtx[i][j] = round(np.sum(np.power(data[x],i+j)),6)

    xty = [[0 for i in range(1)] for j in range(d+1)]
    
    for i in range(0,d+1):
        xty[i][0] = round(np.sum(np.power(data[x],i)*data[y]),6)
        
    
    xtxinv = np.linalg.inv(xtx)
    b = np.matmul(xtxinv,xty)
    
    
    print(b)
    
    Y = b[0] + b[1] * X + b[2] * X * X
    
    plt.plot(X,Y)
    
    SSE = 0
    for i in range(0,n):
        SSE = SSE + np.power((data[y][i]-Y[i]),2) 
        
    print(SSE)

polyRegCalc('sepal.length', 'sepal.width', 2)





    