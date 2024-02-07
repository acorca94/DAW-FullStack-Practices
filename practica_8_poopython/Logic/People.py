#CLASE PERSONA
class People:

    #CONSTRUCTOR
    def __init__(self, name: str, dni: str, age: int, gender: str):
        self.__name = name
        self.__dni = dni
        self.__age = age
        self.__gender = gender

    #GETTERS
    def getname(self) -> str:
        return self.__name

    def getdni(self) -> str:
        return self.__dni

    def getage(self) -> int:
        return self.__age

    def getgender(self) -> str:
        return self.__gender

    #SETTERS
    def setname(self, name):
        self.__name = name

    def setdni(self, dni):
        self.__dni = dni

    def setage(self, age):
        self.__age = age

    def setgender(self, gender):
        self.__gender = gender

