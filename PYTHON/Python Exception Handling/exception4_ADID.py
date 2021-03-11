try:
    dict3_ADID = {'k1' : 10,  'k2' : 20,  'k3' : 30}
    print(dict3_ADID['k5'])
except KeyError:
    print('KeyError')
finally:
    print ('program executed')
