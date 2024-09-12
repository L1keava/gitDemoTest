year = int(input("请输入年份："))
month = int(input("请输入月份："))
lun = False
if year % 4 == 0:
    lun = True

if month in(1,3,5,7,8,10,12):
    print("31天")
elif month == 2:
    if lun:
        print("29天")
    else:
        print("28天")
elif month in (2,4,6,9,11):
    print("30天")
else:
    print("输入有误")