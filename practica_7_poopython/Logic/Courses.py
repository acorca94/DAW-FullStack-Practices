class Courses:

    # CONSTRUCTOR
    def __init__(self, code: int, description: str, level: str, type: str):
        self.__code = code
        self.__description = description
        self.__level = level
        self.__type = type

    # GETTERS
    def getcode(self) -> int:
        return self.__code

    def getdescription(self) -> str:
        return self.__description

    def getlevel(self) -> str:
        return self.__level

    def gettype(self) -> str:
        return self.__type


    #SETTERS
    def setcode(self, code):
        self.__code = code

    def setdescription(self, description):
        self.__description = description

    def setlevel(self, level):
        self.__level = level

    def settype(self, type):
        self.__type = type