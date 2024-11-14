import sys

def __main__():
    data = ''
    instr = input("请输入要写入内容:")
    file_output = open('write.txt', 'a+', encoding='utf-8')
    data += instr + '\n'
    file_output.writelines(data)
    file_output.close()
    if input("是否继续:(Y/N))") == 'Y':
        __main__()
    file_read = open('write.txt', 'r', encoding='utf-8')
    print("文件内容为:" + str(file_read.readlines()))
    sys.exit()


__main__()