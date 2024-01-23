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
    def __getteacher(self) -> Teachers:
        return self.__teacher

    def __getidentification(self) -> int:
        return self.__identification

    def __getname(self) -> str:
        return self.__name

    def __getcredit(self) -> int:
        return self.__credit

    def __getdescription(self) -> str:
        return self.__description

    # SETTERS
    def __setteacher(self, teachear):
        self.__teacher = teachear

    def __setidentification(self, identification):
        self.__identification = identification

    def __setname(self, name):
        self.__name = name

    def __setcredit(self, credit):
        self.__credit = credit

    def __setdescription(self, description):
        self.__description = description
