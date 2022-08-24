import pandas as pd
import numpy as np

data = pd.read_csv("Z:/collegeThings/Sem5/ML/data.csv")


def vifCheck(X,Y):
    n = len(data[X])
    sumX = np.sum(data[X])
    sumX2 = np.sum(data[X]*data[X])
     
    xtx = [[n, sumX],[sumX, sumX2]]
    xtxinv = np.linalg.inv(xtx)

    sumY = np.sum(data[Y])
    sumXY = np.sum(data[X]*data[Y])
    xty = [sumY, sumXY]
    b = np.matmul(xtxinv,xty)
    
    #SSE
    ynew = []
    for i in data[X]:
        yval = b[0] + b[1]*i
        ynew.append(yval)     
    sse = 0
    k = 0
    for i in data[Y]:
        erval = i-ynew[k]
        sse+=erval*erval
        k+=1
        
    #SST
    mean = np.mean(data[Y])
    sst = 0
    for i in data[Y]:
        erval = i-mean
        sst+=erval*erval
        
    ssr = sst - sse        
    r2 = ssr/sst  
    vif = 1/(1-r2)
    print(r2)
    print(vif)
    
    
def corrCheck(X,Y):
    n = len(data[X])
    xbar = np.mean(data[X])
    ybar = np.mean(data[Y])   
    
    sums = 0
    for i in range(0,n):
        sums+= ((data[X][i]-xbar)*(data[Y][i]-ybar))   
    cov = sums/(n-1)
    

    corrxy = cov/(np.std(data[X])*np.std(data[Y]))
    print(corrxy)
        
    
X = 'bathrooms'
Y = 'yr_renovated'
corrCheck(X,Y)


    
        
