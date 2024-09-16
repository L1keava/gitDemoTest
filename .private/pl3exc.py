import random


def is_invalid_combination(num_str):
    # 检查是否包含指定的无效组合
    invalid_combinations = ['389', '229', '036', '378', '017']
    return any(invalid_comb in num_str for invalid_comb in invalid_combinations)


def generate_pailie3_number():
    while True:
        # 生成一个随机的三位数（字符串形式），确保数字不重复
        numbers = random.sample(range(10), 3)  # 生成0-9中3个不重复的随机数
        num_str = ''.join(map(str, numbers))

        # 检查是否包含无效组合
        if not is_invalid_combination(num_str):
            return num_str

        # 生成并打印一个有效的排列三号码

i=5
while i > 0:
 i-=1
 print(generate_pailie3_number())