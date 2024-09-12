total = float(input("请输入重量总数："))
c = total - (3*4)
times = 0
while c > 0:
    times+=1
    c -= 2.5
print('还需要运送%d次'%times)