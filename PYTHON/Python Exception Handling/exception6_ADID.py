try:
    num1_ADID=input('Enter 1st number::')
    num2_ADID=input('Enter 2nd number::')
    sub1_ADID=num1_ADID - num2_ADID
    print(sub1_ADID)
except TypeError:
    print('TypeError')
finally:
    print('program executed')


