f1=open('in1_ADID.txt','rb')
f1.seek(-11,2)
print(f1.read(11))
f1.seek(-13,0)
print(f1.readline())
f1.seek(5,0)
print(f1.readline())
print(f1.tell())
f1.close()
