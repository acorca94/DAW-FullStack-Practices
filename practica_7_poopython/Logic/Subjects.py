from Logic.Teachers import Teachers


class Subjects:

    # CONSTRUCTOR
    def __init__(self, teacher: Teachers, identification: int, name: str, credit: int, description: str):
        self.__teacher = teacher
        self.__identification = identification
        self.__name = name
        self.__credit = credit
        self.__description = description

    # GETTERS
    def getteacher(self) -> Teachers:
        return self.__teacher

    def getidentification(self) -> int:
        return self.__identification

    def getname(self) -> str:
        return self.__name

    def getcredit(self) -> int:
        return self.__credit

    def getdescription(self) -> str:
        return self.__description

    # SETTERS
    def setteacher(self, teachear):
        self.__teacher = teachear

    def setidentification(self, identification):
        self.__identification = identification

    def setname(self, name):
        self.__name = name

    def setcredit(self, credit):
        self.__credit = credit

    def setdescription(self, description):
        self.__description = description
