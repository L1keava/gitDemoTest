i = 1
while i in range(1, 8):
    j = 1
    while j in range(1, i + 1):
        print("*", end="")
        j+=1
    print()
    i+=1