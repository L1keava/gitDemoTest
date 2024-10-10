times = 0
s = "Hello,welcome to my world."
c = input("请输入要统计的字符：")
for i in range(0,len(s)):
    if s[i] == c:
        times +=1

print("字母%s出现了%d次"%(c,times))