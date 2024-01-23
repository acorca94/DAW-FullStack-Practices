class Courses:

    # CONSTRUCTOR
    def __init__(self, code: int, description: str, level: str, type: str):
        self.__code = code
        self.__description = description
        self.__level = level
        self.__type = type

    # GETTERS
    def __getcode(self) -> int:
        return self.__code

    def __getdescription(self) -> str:
        return self.__description

    def __getlevel(self) -> str:
        return self.__level

    def __gettype(self) -> str:
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