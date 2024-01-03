# -*- coding: utf-8 -*-
"""
Created on Tue Jan  2 10:57:17 2024

@author: 20pw19
"""

inputData = ['2023 was not nice','2023 was fun','Unexpected things happened in 2023','Was 2023 nice?']

document = {
    'Life':'Unexpected things happened in 2023.',
    'Life Lessons': 'You may not get everything you wanted.',
    'Life Lessons': 'You will eventually get what you worked for.',
    '2023 Life': 'UNEXPECTED THINGS HAPPENED IN 2023.'}

from nltk.stem import PorterStemmer
from nltk.tokenize import word_tokenize
from functools import reduce
 
ps = PorterStemmer()

words = word_tokenize(document)
 
# using reduce to apply stemmer to each word and join them back into a string
stemmed_sentence = reduce(lambda x, y: x + " " + ps.stem(y), words, "")
 
print(stemmed_sentence)



# from collections import Counter
# from tqdm import tqdm
# from scipy.sparse import csr_matrix
# import math
# import operator
# from sklearn.preprocessing import normalize
# import numpy

# def IDF(document, unique_words):
#     idf_vals = {}    
#     total_docs = len(document) 
#     for word in unique_words: 
#         cnt = 0
#         for row in document:
#             if word in row.split(" "): 
#                 cnt+=1 
#         idf_vals[word] = 1 + math.log((1+total_docs)/(1+cnt)) 
#     return idf_vals

# def fit(dataset):    
#     unique_words = set() 
#     if isinstance(dataset, (list,)):
#         print("Unique Words: ",unique_words)
#         for row in dataset:
#             for word in row.split(" "):
#                 if len(word) < 2:
#                     continue
#                 unique_words.add(word)
#         unique_words = sorted(list(unique_words))
#         print("Unique Words: ",unique_words)
#         vocab = {j:i for i,j in enumerate(unique_words)}
#     # idfs_ = IDF(dataset, unique_words)
#     # return vocab, idfs_

# # features, idfs_ = fit(document)
# fit(document)

# def transform(dataset):
#     sparse_matrix = csr_matrix((len(dataset), len(features)), dtype=float)
#     for row in range(0, len(dataset)):
#         word_count = Counter(dataset[row].split(' '))
#         for word in dataset[row].split(' '):
#             if word in list(features.keys()):
#                 tf = word_count[word] / len(dataset[row].split(' '))
#                 tfidf = tf * idfs_[word]
#                 sparse_matrix[row, features[word]] = tfidf
#     output = normalize(sparse_matrix, norm='l2', axis = 1, copy=True, return_norm=False)
#     return output

# tfidf_corpus = transform(document)

# idf_list = list(idfs_.values())
# print("Our idfs: ", idf_list) #This will give us idf vals calc by our custom implementation
# print(tfidf_corpus[0].toarray())  #This will give us tfidf vals for the first document calc by our custom implementation