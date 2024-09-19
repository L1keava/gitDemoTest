num = int(input("请输入数字："))
if num>0:
    print("%d是正数"%num)
elif num<0:
    print("%d是负数"%num)
elif num == 0:
    print("%d是自然数"%num)
else:
    print("输入有误")