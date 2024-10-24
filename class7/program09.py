names = ['Bob','JOHN','alice','bob','ALICE','J','Bob']
names = [name.lower() for name in names if len(name) > 2 ]
new = []
for i in names:
    if i not in new:
        new.append(i)
new = [ name.capitalize() for name in new]
print(new)