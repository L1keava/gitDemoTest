import datetime

def islun(year):
    if int(year) % 4 == 0 and int(year) % 100 != 0 or int(year) % 400 == 0:
        return True
    else:
        return False

def daysInMonth(year, month):
    if month in (1, 3, 5, 7, 8, 10, 12):
        return 31
    elif month == 2:
        if islun(year):
            return 29
        else:
            return 28
    elif month in (2, 4, 6, 9, 11):
        return 30



year = int(input("请输入年份："))
month = int(input("请输入月份："))
yearDay = 0
for i in range(1900, year):
    if islun(i):
        yearDay += 366
    else:
        yearDay += 365

monthDay = 0
for i in range(1, month):
    monthDay += daysInMonth(year, month)

print(yearDay)
print(monthDay)
week = (yearDay + monthDay + 1) % 7 + 1

print("一  二  三  四  五  六  日")
week = datetime.date(year,month,26).weekday() + 1
count = 0
for i in range(1, week):
    print("   ",end="  ")
    count +=1
for thisday in range(1,daysInMonth(year,month)):
    if (count % 7 == 0):
        print()
    print(thisday,end="  ")
    count+=1
