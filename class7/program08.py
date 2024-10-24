friend = {'name': ['王何', 'John', 'Linda', 'Tom', 'Alan'], 'age': [19, 13, 15, 16, 18]}
for i in range(len(friend['name'])):
    print("姓名：" + friend['name'][i] + "\t年龄：" + str(friend['age'][i]))
for i in range(len(friend['name'])):
    friend['age'][i] +=1
print('将年龄+1：')
for i in range(len(friend['name'])):
    print("姓名：" + friend['name'][i] + "\t年龄：" + str(friend['age'][i]))
