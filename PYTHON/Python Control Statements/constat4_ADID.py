import os
path=os.getcwd()
print("Current Working Directory:", path)
hd=os.path.expanduser('~')
print("Home Directory:", hd)
if(path==os):
    print("Both directories are same")
else:
    print("Both directories are different")
