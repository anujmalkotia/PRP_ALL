f2=open('newfile1_ADID.txt','w')
s1_ADID='This is the newline added at end'
f2.write(s1_ADID)
f2.close()
f1=open('newfile1_ADID.txt','r')
print(f1.read())
f1.close()
f3=open('newfile1_ADID.txt','w')
s1_ADID='This is the newline added at end'
f3.write(s1_ADID)
f3.close()
