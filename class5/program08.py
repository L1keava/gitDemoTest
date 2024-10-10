s1 = input("请输入第一个字符串：").lower()
s2 = input("请输入要查找的字符：").lower()
s3 = s2
for i in range(0, len(s2)):
    if s1.find(s2[i]) != -1:
        s3 = s3.replace(s2[i], "")

if s3 == "" and len(s2) !=0:
    print("T")
else:
    print("%s不在第一个字符串中"%s3)
