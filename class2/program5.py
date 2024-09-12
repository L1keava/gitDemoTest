lives = 3
target = 80
while lives > 0:
    me = int(input("请输入数字："))
    if me == target:
        print("猜对了，答案是%d"%target)
        break
    elif me > target:
        lives -=1
        print("猜大了，还剩%d次机会"%lives)
    elif me < target:
        lives -= 1
        print("猜小了，还剩%d次机会"%lives)
