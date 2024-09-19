for gongji in range(1,23):
    for muji in range (1,35):
        for xiaoji in range(1,100):
             if gongji+ muji + xiaoji == 100 and xiaoji/3 == 100-(gongji*5 + muji*3):
                print("公鸡%d只，母鸡%d只，小鸡%d只"%(gongji,muji,xiaoji))