import pandas as pd
import numpy as np
from sklearn.model_selection import train_test_split

data = pd.read_csv("Z:/collegeThings/Sem5/ML/bcancer.csv")
eta = 0.5

features = list(data.columns)
Y = 'diagnosis'
features.remove('diagnosis')


#Removing multicollinearity  
#print(len(features))  #30 features
final_features = [x for x in features]
p = data[features].corr().values.tolist()
for i in range(len(p)):
    for j in range(i+1, len(p)):
        if abs(p[i][j]) > 0.7 and features[i] in final_features:
            final_features.remove(features[i])
#print("\n\nFeatures after removing multicollinearity:\n", final_features)
#print(len(final_features)) #11 features

n = len(final_features)
print(n)
w = [[0 for x in range(1)] for y in range(len(final_features)+1)]
wt = np.transpose(w)


train, test = train_test_split(data, test_size=0.2)

x = [[1 for i in range(len(final_features)+1)]for j in range(len(train[Y]))]
for j in range(len(final_features)):
    for i in range(len(train[final_features[j]])):
        x[j+1][i] = train[j][i]        
    

y = [[0 for x in range(1)] for j in range(len(train[Y]))]
for i in range(len(train[Y])):
    if train[Y][i]=='M':
        y[i] = 1

wtx = wt.dot(x)
yhat = []
sig = []
for i in range(len(train[Y])):
    sig.append(1/(1+np.exp(-wtx[i])))
    if sig[i]>0.5:
        yhat.append(1)
    else:
        yhat.append(0)
        
    if yhat[i]==y[i]:
        continue
    
    for i in range(len(wtx)):
        wtx[i] = wtx[i] + eta*sig[i]*(1 - sig[i])*(y[i]-sig[i])
        
        
print(w)