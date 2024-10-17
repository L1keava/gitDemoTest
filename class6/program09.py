# str = input("请输入六个整数：").rstrip()
str1 = '65 85 91 32 86 55'
list1 = sorted(str1.split(" "))
list1.pop(0)
list1.pop(len(list1)-1)
sum1 =0
t = 0
for i in range(0,len(list1)):
    sum1 +=int(list1[i])
    t +=1

print("平均数为：%d"%(sum1/t))