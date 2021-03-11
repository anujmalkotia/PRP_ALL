try:
    num1_ADID=eval(input('Enter a number:::'))
    sum1_ADID=int(num1_ADID + num2_ADID)
    print(sum1_ADID)
except NameError:
    print("NameError")
finally:
    print("program executed")
