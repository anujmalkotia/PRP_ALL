import os
path=os.getcwd()
print (path)
directory=input("Enter Directory name::")
path1=os.path.join(path, directory)
os.mkdir(path1)
print("Directory '%s' created" % directory)
