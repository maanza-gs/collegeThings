import pandas as pd
import seaborn as sbn

data = pd.read_csv('Z:\collegeThings\Sem5\ML\iris.csv')
boxplot = data.boxplot(figsize=(6,6))
# sbn.boxplot(data['sepal.length'])
# sbn.boxplot(data['petal.length'])
