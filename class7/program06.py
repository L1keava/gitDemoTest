li_one = [1,2,1,2,3,5,4,3,5,7,4,7,8]
index = []
for i in range(len(li_one)):
    for j in range(i + 1,len(li_one)):
        if li_one[i] == li_one[j]:
            index.append(j)

index.sort(reverse=True)
for i in index:
    li_one.pop(i)

print(li_one)