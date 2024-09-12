score = float(input("请输入分数："))
if score > 100 or score <0:
    print("输入数字有误")
elif score >= 90:
    print("A")
elif score >= 80:
    print("B")
elif score >= 70:
    print("C")
elif score >= 60:
    print("D")
elif score < 60:
    print("不及格")
else:
    print("输入有误")