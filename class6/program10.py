t1 = ('周杰伦',11,['football','music'])
print("年龄所在下标位置：" + str(t1.index(11)))
print("学生姓名：" + t1[0])
print("删除football爱好：")
new = [like    for like in t1[2]      if like !='football']
t2=(t1[0],t1[1],new)
print(t2)
print("增加coding爱好：")
new.append("coding")
t3 = (t2[0],t2[2],new)
print(t2)