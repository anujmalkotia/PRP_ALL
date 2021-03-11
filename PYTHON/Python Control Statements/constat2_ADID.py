import os, os.path
f1=input("Enter Filename:::")
print(find_owner(f1))
print(file_stats)
DIR = '/tmp'
print (len([name for name in os.listdir(DIR) if os.path.isfile(os.path.join(DIR, name))]))
