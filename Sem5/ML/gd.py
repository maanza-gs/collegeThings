import numpy as np 
import matplotlib.pyplot as plt

X=[4,4.5,5,5.5,6,6.5,7]
Y=[33,42,45,51,53,61,62]

eta=0.0088
Bold=[0,0]
Bnew=[0,0]

while(True):
   grad=[0,0]
   for i in range(len(X)):
        grad[0]+=(Y[i]-(Bold[0]+Bold[1]*X[i]))
        grad[1]+=((Y[i]-(Bold[0]+Bold[1]*X[i]))*X[i])
 
   Bnew[0]= Bold[0]+eta*grad[0]
   Bnew[1]= Bold[1]+eta*grad[1]
   
   if(Bold[0]==Bnew[0] and Bold[1]==Bnew[1]):
       break
   Bold[0]=Bnew[0]
   Bold[1]=Bnew[1]
          
        
print(Bold)
plt.scatter(X,Y)

     
       