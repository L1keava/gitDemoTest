def add(num1, num2):
    result = num1 + num2
    return result

def reduce(num1,num2):
    result = num1 - num2
    return result

def times(num1,num2):
    result = num1 * num2
    return result

def divide(num1,num2):
    result = num1 / num2
    return result

num1 = float(input("请输入第一个数："))
num2 = float(input("请输入第二个数："))
print("%.2f + %.2f = %.2f"%(num1,num2,add(num1,num2)))
print("%.2f - %.2f = %.2f"%(num1,num2,reduce(num1,num2)))
print("%.2f * %.2f = %.2f"%(num1,num2,times(num1,num2)))
print("%.2f / %.2f = %.2f"%(num1,num2,divide(num1,num2)))
