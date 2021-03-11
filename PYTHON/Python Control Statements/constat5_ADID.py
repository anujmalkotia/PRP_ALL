A_ADID=eval(input("ENTER NUMBER 1:"))
B_ADID=eval(input("ENTER NUMBER 2:"))
con1=input("Enter Condition:")
if(con1=="add"):
    print(A_ADID + B_ADID)
elif(con1=="sub"):
    print(A_ADID - B_ADID)
elif(con1=="mul"):
    print(A_ADID * B_ADID)
elif(con1=="div"):
    print(A_ADID / B_ADID)
else:
    print("Enter proper condition")
