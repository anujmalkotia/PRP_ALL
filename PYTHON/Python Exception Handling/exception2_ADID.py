try:
    num1_ADID=eval(input("Enter 1st number::"))
    num2_ADID=eval(input("Enter 2nd number::"))
    div1_ADID=int(num1_ADID/num2_ADID)
    print(div1_ADID)
except ZeroDivisionError:
    print("ZeroDivisionError")
finally:
    print("program executed")
