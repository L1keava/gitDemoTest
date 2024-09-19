def su(num):
    i = 2
    while i < num:
        if num % i == 0:
            break
        i += 1
    if i == num:
        return True

for n in range(1, 101):
    if su(n):
        print("%d是质数" % n)