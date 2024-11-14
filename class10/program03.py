file_origin = open('data.csv')
file_bak = open('data.csv.bak','w+',encoding='utf-8')
data = file_origin
file_bak.writelines(data)
file_bak.close()
print("备份成功")