listOld = [23, 16, 18, 19, 76, 121, 33, 57, 80]
listNew = []
for i in range(0, len(listOld)):
    if listOld[i] % 2 == 0:
        listNew.append(listOld[i])
print("新列表为：")
print(listNew)
