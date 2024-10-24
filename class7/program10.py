names=['Bob','JOHN','alice','bob','ALICE','J','Bob']
names = [name.capitalize() for name in names if len(name) > 2]
new=dict()
for i in names:
    count = 0
    for j in range(names.index(i) ,len(names)):
        if i.lower() == names[j].lower():
            count+=1
    new[i]=count
print(new)
