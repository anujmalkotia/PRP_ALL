filename=input("Enter filename:::")
def file_type2(filename):
    if lexists(filename):
        if exists(filename):
            mode = stat(filename).st_mode
            lmode = lstat(filename).st_mode # os.lstat doesn't follow symlinks
            if S_ISREG(mode) and S_ISREG(lmode):
                return FileTypes.FILE
            elif S_ISREG(mode) and S_ISLNK(lmode):
                return FileTypes.LINK_TO_FILE
            elif S_ISDIR(mode) and S_ISDIR(lmode):
                return FileTypes.DIR
            elif S_ISDIR(mode) and S_ISLNK(lmode):
                return FileTypes.LINK_TO_DIR
            else:
                return FileTypes.UNDEFINED
        else:
            return FileTypes.BROKEN_LINK
    else:
        return FileTypes.NO_SUCH
file_type2(filename)
