tuple1 = (1,2)
tuple2 = (8,9)
print("交换前：")
print("tuple1 = " + str(tuple1))
print("tuple2 = " + str(tuple2))
tuple3 = tuple1
tuple1 = tuple2
tuple2 = tuple3
print("交换后：")
print("tuple1 = " + str(tuple1))
print("tuple2 = " + str(tuple2))