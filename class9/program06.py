file1 = open('stu.txt', encoding='utf-8')
list1 = file1.readlines()
newList = []
trash = []
minScore = int(str(list1[0]).replace('\n', '').split(',', )[2])
maxIndex = 0
minIndex = 0
for i in range(0, len(list1)):
    maxIndex = i
    maxScore = int(str(list1[i]).replace('\n', '').split(',', )[2])
    for j in range(1, len(list1)):
        thisScore = int(str(list1[j]).replace('\n', '').split(',', )[2])
        if thisScore > maxScore and thisScore not in trash:
            maxScore = thisScore
            maxIndex = j
        if thisScore < minScore:
            minScore = thisScore
            minIndex = j
    if maxScore not in trash:
        trash.append(maxScore)
        newList.append(list1[maxIndex])
trash.append(minScore)
newList.append(list1[minIndex])
file1.close()
file2 = open('px.txt', mode='w', encoding='utf-8')
file2.writelines(newList)
file2.close()
file3 = open('px.txt', encoding='utf-8')
print(file3.read())
file3.close()
print("成绩最大值为：" + str(trash[0]))
print("成绩最小值为：" + str(trash[len(trash) - 1]))
sum = 0
for i in range(len(trash)):
    sum += int(trash[i])
print("成绩平均值为：" + str(sum/len(trash)))