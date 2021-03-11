import psutil
username=input("Enter username:::")
f1=open("psswd.txt")
line=f1.readlines()
for i in lines:
    if(line==username):
        print ("Valid")
    else:
        print("Invalid")
pids=[process.pid for process in psutil.process_iter() if 
        process.username == 'root']
print (pids)
