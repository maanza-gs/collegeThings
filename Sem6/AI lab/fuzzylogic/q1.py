a = {1/2, 0.4/3, 0.6/1, 0.2/4}
b = {0/2,0.2/3,0.2/1,0.8/4}

print("Union: ", a|b)
print("Intersection: ", a&b)
print("Difference: ",a-b)

for i in a:
    i = 1-i
print("Complement of a: ",a)

for i in b:
    i = 1-i
print("Complement of b: ",b)

for i in b:
    i = 1-i
for i in a:
    i = 1-i