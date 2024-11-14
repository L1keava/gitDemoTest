file_input = open('words.txt',encoding='utf-8')
data = file_input.readlines()
temp = str(data).replace('[','').replace(']','').replace('\'','').split(' ')
result = []
for word in temp:
    if word not in str(result):
        count = 0
        for target in temp:
            if target == word:
                count += 1
        result.append(word + "出现的次数为:" + str(count))
for res in result:
    print(res)