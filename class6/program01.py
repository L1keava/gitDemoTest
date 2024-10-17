listA = ['h','e','l','l','o','w','o','r','l','d']
print("第3个元素为："+listA[2])
print("切片输出2-末尾元素：")
print(listA[1:])
print("切片输出0-5元素：")
print(listA[0:6])
print("循环输出所有元素：")
for i in range(0, len(listA)):
    print(listA[i],end="  ")
