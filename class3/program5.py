i = 1
while i <= 9:
    for j in range(1,i+1):
        print("%d*%d=%d"%(j,i,i*j),end=" ")
    print()
    i+=1