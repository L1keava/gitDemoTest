file1 = open('write.txt',mode='w',encoding='utf-8')
str1 = '我爱中国'
file1.write(str1+'\n')
file1.close()
file1 = open('write.txt',encoding='utf-8')
print(file1.read())
file1.close()