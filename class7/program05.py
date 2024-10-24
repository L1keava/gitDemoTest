stri = 'skdaskerkjsalkj'
list_chr = []
for c in stri:
    if c not in list_chr:
        list_chr.append(c)
        n = 0
        for i in range(len(stri)):
            if stri[i] == c:
                n += 1
        list_chr.append(n)
i = 0
while i in range(len(list_chr)):
    print("字母 " + str(list_chr[i]) + " 出现的次数为：", end="")
    i += 1
    print(str(list_chr[i]))
    i += 1