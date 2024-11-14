data_input = open('read.txt',encoding='utf-8')
for line in data_input:
    if line[0] != '#':
        print(line,end='')