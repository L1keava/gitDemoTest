str1 = input("输入一个包含若干整数的列表：").rstrip()
strList = str1.split(" ")
numList = []
for i in range(0, len(strList)):
    numList.append(int(strList[i]))
numList.sort(reverse=True)
print("降序排序后结果为：")
print(numList)