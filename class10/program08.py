file1 = open('data.csv')
data1 = file1.readlines()
file2 = open('output.csv',encoding='utf-8')
data2 = file2.readlines()
data_output = data1 + data2
for i in data_output:
    print(i,end='')