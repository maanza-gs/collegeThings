# -*- coding: utf-8 -*-
"""
Created on Wed Sep 14 09:48:13 2022

@author: 20pw19
"""

#pip install pymongo
#pip install dnspython

import pymongo
import csv
from pymongo.server_api import ServerApi
client = pymongo.MongoClient('mongodb+srv://mac:<mac>@cluster0.8rnpn2l.mongodb.net/?retryWrites=true&w=majority', server_api=ServerApi('1'))

db=client['mydb']
data=db['airlines']

f = open(r"us_data.csv")
rows=csv.DictReader(f)
cols=['Year','Month','OriginAirportID','OriginAirportName','ArrDelay']

for row in rows:
    element={}
    for val in cols:
        if row[val].isdigit():
            element[val]=int(row[val])
        else:
            element[val]=row[val]
    data.insert_one(element)
    
pipeline=[{"$match":{"year":2020,"month":1}},{"$group":{"_id":{"airport":"$OriginAirportID"},"arr_diverted":{"$sum":"$ArrDelay"}}}]
result = data.aggregate(pipeline)
for i in result:
    print(i,end='')
