#CLASE PERSONA
class People:

    #CONSTRUCTOR
    def __init__(self, name: str, dni: str, age: int, gender: str):
        self.__name = name
        self.__dni = dni
        self.__age = age
        self.__gender = gender

    #GETTERS
    def __getname(self) -> str:
        return self.__name

    def __getdni(self) -> str:
        return self.__dni

    def __getage(self) -> int:
        return self.__age

    def __getgender(self) -> str:
        return self.__gender

    #SETTERS
    def __setname(self, name):
        self.__name = name

    def __setdni(self, dni):
        self.__dni = dni

    def __setage(self, age):
        self.__age = age

    def __setgender(self, gender):
        self.__gender = gender

