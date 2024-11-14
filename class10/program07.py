file_open = open('output.csv',encoding='utf-8')
data = file_open.readlines()
lineIndex = len(data)-1
while lineIndex >=0:
    print(data[lineIndex],end='')
    lineIndex -= 1