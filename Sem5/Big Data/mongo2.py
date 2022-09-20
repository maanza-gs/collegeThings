# -*- coding: utf-8 -*-
"""
Created on Wed Sep 14 09:48:13 2022

@author: 20pw19
"""

import pymongo
import csv
from pymongo.server_api import ServerApi
client = pymongo.MongoClient('mongodb+srv://mac:<mac>@cluster0.8rnpn2l.mongodb.net/?retryWrites=true&w=majority', server_api=ServerApi('1'))


db=client['mydb']
data=db['titanic']


# #insertion
# f = open(r"titanic.csv")
# rows=csv.DictReader(f)
# cols=["PassengerId","Survived","Pclass","Name","Sex","Age","SibSpAboard","ParChAboard","Fare"]

# for row in rows:
#     element={}
#     for val in cols:
#         if row[val].isdigit():
#             element[val]=int(row[val])
#         else:
#             element[val]=row[val]
#     data.insert_one(element)


#aggregation    
pipeline =[{"$match":{"Survived":0}},{"$group":{"_id":"$Sex", "AverageAge":{"$avg":"$Age"}}}]
result = data.aggregate(pipeline)
for i in result:
    print(i,end='')