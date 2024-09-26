import random as rnd
rounds = 3
score = 0
print("********************猜拳游戏*********************")
chara = ["曹操", "刘备", "孙权"]
print("你选择的人物是" + chara[int(input("请选择游戏的人物（1、曹操2、刘备3、孙权）：")) - 1])
while rounds > 0:
    choice = ["石头", "剪刀", "布"]
    player = int(input("请出拳（1、石头2、剪刀3、布）："))
    print("你选择出：" + choice[player - 1])
    computer = rnd.randint(1, 3)
    print("电脑出的是：" + choice[computer - 1])
    if player == computer:
        print("平局,积分不变")
    elif (computer - player == 1) | (player - computer == 2):
        print("你赢了，积分+1")
        score += 1
    else:
        print("你输了，积分-1")
        score -= 1
    if rounds <= 0:
        print("游戏结束，你的积分是%d分" % score)
    else:
        end = input("是否继续？（Y/N）：")
        if str.lower(end) == "y":
            rounds -= 1
            print("游戏继续")
        elif str.lower(end) == "n":
            rounds = 0
            print("游戏结束，你的积分是%d分" % score)