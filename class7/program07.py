wh = dict()
li=[11,22,33,44,55,66,77,88,99,90]
big=[]
little=[]
for n in li:
    if n >= 66:
        big.append(n)
    else:
        little.append(n)

wh.update(k1=big,k2=little)
print(wh)