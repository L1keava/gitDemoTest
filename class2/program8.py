num = input("请输入数字：")
i = 0
result = 0
while i < len(num):
    result += int(num[i])
    i+=1
print("结果为：%d"%result)