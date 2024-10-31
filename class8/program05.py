def sj(num1,num2,num3):
    if num1+num2 > num3:
        return True

s1 = float(input("请输入三角形的第一条边："))
s2 = float(input("请输入三角形的第二条边："))
s3 = float(input("请输入三角形的第三条边："))
if sj(s1,s2,s3):
    print("%.1f,%.1f,%.1f三条边可以构成三角形"%(s1,s2,s3))
else:
    print("%.1f,%.1f,%.1f三条边不能构成三角形"%(s1,s2,s3))