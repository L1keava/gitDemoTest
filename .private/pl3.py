import random


def generate_pailie3_number():
    # 从0-9中随机选择3个不重复的数字
    numbers = list(range(10))  # 生成0到9的列表
    random.shuffle(numbers)  # 打乱列表
    # 选择前三个数字作为排列三号码（因为已经打乱，所以随机）
    pailie3_number = numbers[:3]
    # 将数字转换为字符串并连接起来
    result = ''.join(map(str, pailie3_number))
    return result


# 生成并打印一个排列三号码
print(generate_pailie3_number())