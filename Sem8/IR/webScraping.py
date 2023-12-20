# -*- coding: utf-8 -*-
"""
Created on Tue Dec 19 10:48:58 2023

@author: 20PW19
"""

import requests 
from bs4 import BeautifulSoup 
import webbrowser

URL = "https://en.wikipedia.org/wiki/List_of_South_Korean_boy_bands#Generation_4"
r = requests.get(URL) 

soup = BeautifulSoup(r.content, 'html5lib') # If this line causes an error, run 'pip install html5lib' or install html5lib 
# print(soup.prettify()) 

groups=[]  # a list to store quotes 
   
results = soup.find(id="wikitable")
print(results) 