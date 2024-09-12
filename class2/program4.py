num1 = float(input("请输入第一个运算数"))
ope = str(input('请输入运算符'))
num2 = float(input("请输入第二个运算数"))
if ope == "+":
    print("%.2f %s %.2f = %.2f"%(num1,ope,num2,num1+num2))
elif ope == "-":
    print("%.2f %s %.2f = %.2f"%(num1,ope,num2,num1-num2))
elif ope == "*":
    print("%.2f %s %.2f = %.2f"%(num1,ope,num2,num1*num2))
elif ope == "/":
    print("%.2f %s %.2f = %.2f"%(num1,ope,num2,num1/num2))
else:
    print("运算符输入有误")