try:
    list3_ADID = [10, 20, 30, 40, 50]
    list3_ADID[7]
except IndexError:
    print('IndexError')
finally:
    print('program executed')
