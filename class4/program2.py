def special(year):
    if int(year) % 4 == 0 and int(year) % 100 != 0:
        return True
    else:
        return False
print("一  二  三  四  五  六  日")
year = int(input("请输入年份："))
month = int(input("请输入月份："))
