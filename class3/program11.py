def water(num1):
    res = 0
    for i in range(0,len(num1)):
        res += int(num1[i])*int(num1[i])*int(num1[i])
    if int(num1) == res:
        return True

for num in range(1,1000):
    if water(str(num)):
        print("%d是水仙花数"%num)