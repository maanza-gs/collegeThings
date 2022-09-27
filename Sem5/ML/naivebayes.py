import pandas as pd
import numpy as np
from sklearn.model_selection import train_test_split

data = pd.read_csv("Z:/collegeThings/Sem5/ML/ogbcancer.csv")

train, test = train_test_split(data, test_size=0.2)

n = len(data)

#Finding Prior Probabilty
m=b=0
for i in data['class']:
    if i == 2:
        m+=1
    else:
        b+=1
        
pm = m/n
pb = b/n

features = list(data.columns)
features.remove('class')

print(features)
for i in features:
    freqtable = pd.crosstab(index=train['class'], columns=train[i], margins=True)
    print(freqtable)
    
cpt = [[0 for i in range(0,10)]for j in range(0,2)]

for i in range(0,10):
    for j in range(0,2):
        cpt[i][j] = freqtable.iloc[i,j]/freqtable[]


print(round(freqtable.iloc[1, 0]/ freqtable.iloc[2, 0],3))

print(cpt)
