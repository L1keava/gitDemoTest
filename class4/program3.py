def islun(year):
    if int(year) % 400 == 0 or (int(year) % 4 == 0 and int(year) % 100 != 0):
        return True
    else:
        return False


def daysInMonth(year, month):
    if month in (4, 6, 9, 11):
        return 30
    elif month == 2:
        if islun(year):
            return 29
        else:
            return 28
    else:
        return 31


year = 2024
month = 9
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
