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


def weekOfDate(year, month, day):
    yearday = 0
    for i in range(1900, year):
        if islun(i):
            yearday += 366
        else:
            yearday += 365
    monthday = 0
    for i in range(1, month):
        monthday += daysInMonth(year, i)
    return (yearday + monthday + day) % 7


year = int(input("请输入年份："))
month = int(input("请输入月份："))
print("一\t二\t三\t四\t五\t六\t日")
week = weekOfDate(year, month, 0) + 1
for i in range(1, week):
    print("\t", end="")
for thisday in range(1, daysInMonth(year, month) + 1):
    week = weekOfDate(year, month, thisday)
    print(thisday, end="\t")
    if week == 0:
        print("")
