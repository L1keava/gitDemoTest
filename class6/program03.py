listC = [2,3,1,-5,10,7]
print("对listC进行排序升序")
listC.sort()
print(listC)
print("给listC排序产生listD,输出listD和listC")
listC = [2,3,1,-5,10,7]
listD =sorted(listC)
print(listD)
print(listC)
print("先对C进行升序排列，然后逆序输出C")
listC.sort()
listC.reverse()
print(listC)