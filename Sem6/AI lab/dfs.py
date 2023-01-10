# -*- coding: utf-8 -*-
"""
Created on Tue Jan 10 09:00:18 2023

@author: 20pw19
"""

import networkx as nx

import matplotlib.pyplot as plt
def dfs(graph, initialState, goalState):
    if((initialState not in graph) or initialState is None):
        return "The initial state is invalid!"
   
    path = []
   
    stack = [initialState]
    while(len(stack)!=0):
         s = stack.pop()
         if(s!=goalState):
             if s not in path:
                 path.append(s)
             if s not in graph:
                 #leaf node
                 continue
             for neighbor in graph[s]:
                 stack.append(neighbor)
         else:
             path.append(s)
             break        
    return " ".join(path)

graph = {"A":["D","C","B"],"B":["E"],"C":["G","F"],"D":["H"],"E":["I"],"F":["J"]}

G = nx.Graph()

G.add_nodes_from(["A","B","C","D","E","F","G","H","I","J"])

G.add_edge("A","D")
G.add_edge("A","C")
G.add_edge("A","B")
G.add_edge("B","E")
G.add_edge("C","G")
G.add_edge("C","F")
G.add_edge("D","H")
G.add_edge("E","I")
G.add_edge("F","J")

nx.draw(G, with_labels=True, font_weight='bold')
plt.show()

initial = input("Enter the initial state : ")
final = input("Enter the goal state : ")

returnPath = dfs(graph,initial,final)
print(returnPath)