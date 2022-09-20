# Parametric, Discriminative Model

import numpy as np
import matplotlib.pyplot as plt
import pandas as pd

data = pd.read_csv("Z:/collegeThings/Sem5/ML/linearRegression.csv")
# plt.scatter(data['X'],data['Y'])

n = len(data['X'])
sumX = np.sum(data['X'])
sumX2 = np.sum(data['X']*data['X'])
 
xtx = [[n, sumX],[sumX, sumX2]]
xtxinv = np.linalg.inv(xtx)

sumY = np.sum(data['Y'])
sumXY = np.sum(data['X']*data['Y'])
xty = [sumY, sumXY]
b = np.matmul(xtxinv,xty)

print(b)

x = np.linspace(4,7)
y = b[0] + b[1]*x;
# plt.plot(x,y,'-r')
# plt.show()

# print(b[0] + b[1]*4.25)

#SSE
ynew = []
for i in data['X']:
    yval = b[0] + b[1]*i
    ynew.append(yval)

e = []
k = 0
for i in data['Y']:
    erval = i-ynew[k]
    e.append(erval*erval)
    k+=1
    
# print(sum(e))

#SST
mean = np.mean(data['Y'])

s = 0
for i in data['Y']:
    s += i-mean

# print(s)

#SSR
e = []
k = 0
for i in data['Y']:
    erval = ynew[k]-mean
    e.append(erval*erval)
    k+=1
    
# print(sum(e))


# skewness can be inferred from the difference b/w mean and median
# if the occurence of outliers is large, then kurtosis is high...
# mean = 0 and std = 1 means normalised data
# train and test is split randomly everytime, but certain features are always common



    