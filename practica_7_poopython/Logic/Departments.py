
#CLASE ADMINISTRATIVE HEREDANDO DE PEOPLE
class Departments:

    # CONSTRUCTOR
    def __init__(self, name: str, identification: int):
        self.__name = name
        self.__identification = identification

    # GETTERS
    def getname(self) -> str:
        return self.__name

    def getidentification(self) -> int:
        return self.__identification

    #SETTERS
    def setname(self, name):
        self.__name = name

    def setidentification(self, identification):
        self.__identification = identification