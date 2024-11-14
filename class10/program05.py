file1 = open('caps.txt',encoding='utf-8')
data = file1.readlines()
print("输入内容:" + str(data))
output_data = ''
for char in data:
    if 'A' <= char.capitalize() <= 'Z':
        if char != char.lower():
            output_data +=char.lower()
    else:
        output_data += char
print("输出内容" + output_data)
file_output = open('lower.txt','w+',encoding='utf-8')
file_output.writelines(output_data)