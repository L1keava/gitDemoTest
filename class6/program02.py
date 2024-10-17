listA = ['h','e','l','l','o','w','o','r','l','d']
print("末尾添加'python'")
listA.append("python")
print(listA)
listB = ['j','a','v','a']
print("listA末尾添加listB")
for i in range (0, len(listB)):
    listA.append(listB[i])
print(listA)
print("往listA中第4个位置添加单词‘c#’")
listA.insert(3,"C#")
print(listA)