def rever(str):
    i = len(str) - 1
    new = ''
    while i >= 0:
        new = new + str[i]
        i -= 1
    return new


def back(num):
    if len(num) % 2 == 0:
        num1 = num[0:len(num) // 2]
        num2 = rever(num[len(num) // 2:])
        if num1 == num2:
            return True
    else:
        num1 = num[0:len(num) // 2 + 1]
        num2 = rever(num[len(num) // 2:])
        if num1 == num2:
            return True


num = input("请输入数字：")
if back(num):
    print(num + " 是回文数")
else:
    print(num + " 不是回文数")
