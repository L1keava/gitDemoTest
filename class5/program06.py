s = 'AbcDeFGhIJ'
count = 0
for i in range(0,len(s)):
    if 97 <= ord(s[i]) <= 123:
        count +=1

print("\"%s\" 中小写字母有%d个"%(s,count))