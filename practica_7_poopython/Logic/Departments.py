
#CLASE ADMINISTRATIVE HEREDANDO DE PEOPLE
class Departments:

    # CONSTRUCTOR
    def __init__(self, name: str, identification: int):
        self.__name = name
        self.__identification = identification

    # GETTERS
    def __getname(self) -> str:
        return self.__name

    def __getidentification(self) -> int:
        return self.__identification

    #SETTERS
    def __setname(self, name):
        self.__name = name

    def __setidentification(self, identification):
        self.__identification = identification