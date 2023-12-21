# -*- coding: utf-8 -*-
"""
Created on Tue Dec 19 10:48:58 2023

@author: 20PW19
"""

import requests 
from bs4 import BeautifulSoup 
import lxml

URL = "https://www.goodreads.com/shelf/show/2023-release"
r = requests.get(URL) 

soup = BeautifulSoup(r.text, 'html.parser') # If this line causes an error, run 'pip install html5lib' or install html5lib 
# print(soup.prettify()) 

bookTitles=[] 
authorNames=[]
avgRatings=[]
bookLink=[] 
   
bookNameScraping = soup.findAll('a', attrs={'class': 'bookTitle'})
# for i in bookNameScraping:
#     print('B: ', i.text)
    
authorNameScraping = soup.findAll('a', attrs={'class': 'authorName'})
# for i in authorNameScraping:
#     print('A: ', i.text)

bookLinkScraping = soup.findAll('a',href=True, )
for i in bookNameScraping:
    print('L: ', i,type(i))
    