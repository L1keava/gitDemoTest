listA=['h','e','l','l','o','w','o','r','l','d']
print("删除listA中第5个元素")
listA.remove(listA[4])
print(listA)
print("删除listA中第一次出现的字母o")
listA.remove('o')
print(listA)
print("删除listA的最后一个字母")
listA.remove(listA[len(listA)-1])
print(listA)
print("循环输出最终的listA")
for i in range(0, len(listA)):
    print(listA[i],end="  ")
