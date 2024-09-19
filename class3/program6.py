def in7(str1):
    if int(str1) % 7 == 0:
        return True
    else:
        str_len = len(str1)
        for n in range(0, str_len):
            if str1[n] == "7":
                return True

for i in range(1, 100):
    if in7(str(i)):
        print("过")
    else:
        print(i,end=" ")