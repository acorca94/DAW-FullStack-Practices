class Courses:

    # CONSTRUCTOR
    def __init__(self, code: int, description: str, level: int, type: str):
        self.__code = code
        self.__description = description
        self.__level = level
        self.__type = type

    # GETTERS
    def __getcode(self):
        return self.__code

    def __getdescription(self):
        return self.__description

    def __getlevel(self):
        return self.__level

    def __gettype(self):
        return self.__type


    #SETTERS
    def __setcode(self, code):
        self.__code = code

    def __setdescription(self, description):
        self.__description = description

    def __setlevel(self, level):
        self.__level = level

    def __settype(self, type):
        self.__type = type