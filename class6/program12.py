t1 = (1,2,3,4,5,6)
t2 = (5,7,11,4,19)
t2_new = [num for num in t2 if num not in t1]
t3 = t1 + tuple(t2_new)
print(t3)