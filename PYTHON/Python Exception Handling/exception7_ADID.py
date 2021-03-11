try:
    num1_ADID=sys.argv[1]
    num2_ADID=sys.argv[1] 
    print(num1_ADID)
    print(num2_ADID)
except NameError:
    print('NameError')
finally:
    print('program executed')
