user1_ADID=input("ENTER LINUX USERNAME::")
user2_ADID=input("ENTER LINUX USERNAME::")
user3_ADID=input("ENTER LINUX USERNAME::")
user4_ADID=input("ENTER LINUX USERNAME::")
user5_ADID=input("ENTER LINUX USERNAME::")
userlist_ADID = [user1_ADID,user2_ADID,user3_ADID,user4_ADID,user5_ADID]
unix_ADID=input("ENTER CIS STREAM:::")
wintel_ADID=input("ENTER CIS STREAM:::")
networking_ADID=input("ENTER CIS STREAM:::")
helpdesk_ADID=input("ENTER CIS STREAM:::")
bsm_ADID=input("ENTER CIS STREAM:::")
stream_ADID=[unix_ADID, wintel_ADID, networking_ADID, helpdesk_ADID,bsm_ADID]
userdict_ADID={}
for key in userlist_ADID:
    for value in stream_ADID:
        userdict_ADID[key]=value
        stream_ADID.remove(value)
        break
print(userdict_ADID)