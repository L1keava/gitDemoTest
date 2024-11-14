file1 = open('file.txt', encoding='utf-8')
instr = file1.read()
new = []
for i in instr:
    new.append(i)
    new.append(' ')
file1.close()
file2 = open('fileout.txt', mode='w', encoding='utf-8')
file2.writelines(new)
file2.close()
file3 = open('fileout.txt', encoding='utf-8')
print(file3.read())
