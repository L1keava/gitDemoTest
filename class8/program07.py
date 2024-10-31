import sys


def ask():
    ans = input("是否退出？（0：是，1：否”）")
    if ans == '0':
        sys.exit()


def quit():
    sys.exit()


def add():
    name = input("请输入要添加的名字：")
    data.append(name)
    if name in data:
        print("添加完毕")
        ask()

def delete():
    query()
    index = int(input("请输入要删除的名字序号："))
    temp = data[index]
    data.pop(index)
    if temp not in data:
        print("删除完毕")
        ask()

def alter():
    query()
    index = int(input("请输入要修改的名字序号："))
    temp = data[index]
    data[index] = input("请输入新的名字：")
    if temp not in data:
        print("修改完毕")
        ask()

def query():
    lists = len(data)
    for i in range(lists):
        print("%d\t%s" % (i, data[i]))

def stu():
    choice = input("请输入你的选择：[0-4]")
    if int(choice) not in (0, 1, 2, 3, 4):
        print("输入有误，请重新输入：")
    else:
        if choice == '0':
            quit()
        elif choice == '1':
            add()
        elif choice == '2':
            delete()
        elif choice == '3':
            alter()
        elif choice == '4':
            query()


data = ['wh','whh','whhh']

if __name__ == '__main__':
    print("=======================")
    print("学生管理系统 V10.0")
    print("1.添加学生信息")
    print("2.删除学生信息")
    print("3.修改学生信息")
    print("4.查询所有学生信息")
    print("0.退出系统")
    print("========================")
    while True:
        stu()
