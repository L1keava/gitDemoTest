orig_csv = open('data.csv',)
lines = []
for line in orig_csv:
    line = line.replace('\n','')
    lines.append(line)
title = lines[0] + ",总分"
newList = str(lines).replace(str(lines[0]),title)
newList = newList.replace('[','')
newList = newList.replace(']','')
newList = newList.replace('\'','')
sumLine = newList.split(', ')
finalLine = []
for i in  range(1,len(sumLine)-1):
    current = sumLine[i]
    score = current.split(',')
    sum = 0
    for i in score:
        if i.isnumeric():
            sum += int(i)
    currentNew = current + ',' + str(sum)
    finalLine.append(currentNew)
filew = open('output.csv','w+',encoding='utf-8')
data = title + '\n'
for list in finalLine:
    data +=list + '\n'
print(data)
filew.writelines(data)
filew.close()