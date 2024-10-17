# para = input("请输入句子：")
para = "the scenery along the should be and the mood at the view"
words_list = para.split(" ")
maxWord = words_list[0]
maxLen =len(words_list[0])
for i in range (0, len(words_list)):
    if len(words_list[i]) > maxLen:
        maxLen = len(words_list[i])
        maxWord = words_list[i]
print("最长的单词为：" + maxWord + "\n长度为：" + str(maxLen))