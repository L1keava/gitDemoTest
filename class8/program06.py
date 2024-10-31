def male(num1, num2):
    n = 1
    for i in range(2, max(num1, num2)):
        if (num1 % i == 0) and (num2 % i == 0):
            n = i
            print("hello")
    return (num1 * num2) / n

num1 = int(input("请输入第一个数："))
num2 = int(input("请输入第二个数："))
print(male(num1, num2))
