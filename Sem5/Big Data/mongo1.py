#pip install pymongo
#pip install dnspython

import pymongo
from pymongo.server_api import ServerApi
import pandas as pd
client = pymongo.MongoClient('mongodb+srv://mac:<mac>@cluster0.8rnpn2l.mongodb.net/?retryWrites=true&w=majority', server_api=ServerApi('1'))
db = client.test

data = pd.read_csv("Z:/collegeThings/Sem5/Big Data/us_data.csv")

mydb = client['airports']
mycl = mydb["USA"]

dbcolumns = data.columns

record = {{'airport': {'name:': 'Kenzy', 'airline_name': 'British Airways'}, 'diverted': 10, 'year': 2022, 'month': 'June'}}

rec = mydb.mycl.insert_many(record)

