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
# print(n)
w = [[0 for x in range(1)] for y in range(len(final_features)+1)]
wt = np.transpose(w)

#Outliers
# def outlier_treatment(df, feature):
#     q1, q3 = np.percentile(df[feature], [25, 75])
#     IQR = q3 - q1
#     lower_range = q1 - (3 * IQR)
#     upper_range = q3 + (3 * IQR)
#     to_drop = df[(df[feature]<lower_range)|(df[feature]>upper_range)]
#     df.drop(to_drop.index, inplace=True)

# outlier_treatment(data, 'diagnosis')


#Splitting dataset
# train, test = train_test_split(data, test_size=0.2)
x = data.iloc[:, [2, len(features)]].values
y = data.iloc[:, 1].values
X_train, X_test, y_train, y_test = train_test_split(x, y, test_size = 0.2, random_state = 0)


Xvector = np.c_[np.ones((len(x), 1)), x]
print(Xvector)

# tempx = train.values.tolist()

# for j in range(len(final_features)):
#     for i in range(len(train[Y])):
#         x[i+1][j] = tempx[i][j]        
    

# for i in range(len()):
#     for j in range(len(final_features)):
#         x[i+1][j] = tempx[i][j]

print(x)
# wtx = wt.dot(x)
# yhat = []
# sig = []
# for i in range(len(train[Y])):
#     sig.append(1/(1+np.exp(-wtx[i])))
#     if sig[i]>0.5:
#         yhat.append(1)
#     else:
#         yhat.append(0)
        
#     if yhat[i]==y[i]:
#         continue
    
#     for i in range(len(wtx)):
#         wtx[i] = wtx[i] + eta*sig[i]*(1 - sig[i])*(y[i]-sig[i])
        
        
# print(w)