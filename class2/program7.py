import random
lives = int(input("请输入猜数字次数："))
rand = int(random.random()*20+1)
while lives >0:
    me = int(input("请输入数字："))
    if me > rand:
        lives -=1
        print("猜大了")
    elif me < rand:
        lives -= 1
        print("猜小了")
    elif me == rand:
        print("猜对了！答案是:%d"%rand)
        break
if lives == 0:
    print("可惜次数用尽，没有猜中")