#s1 = input("请输入英文：")
s1 = "hello c sharp".split(' ')
for i in range(len(s1)):
    print(s1[(i-len(s1))*-1-1],end=" ")