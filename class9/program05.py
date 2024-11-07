# seek
file1 = open('python10.txt',encoding='utf-8')
print(file1.tell())
loc = file1.seek(6,0)
print(loc)
file1.close()
# 二进制模式
file1 = open('python10.txt',mode='rb')
print(file1.tell())
loc = file1.seek(8,0)
print(loc)
print(file1.read())
file1.close()