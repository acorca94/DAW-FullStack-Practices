from Logic.Addresses import Addresses
from Logic.People import People
from Logic.Courses import Courses


# CLASE STUDENTS HEREDANDO DE PEOPLE
class Students(People):

    # CONSTRUCTOR
    def __init__(self, name: str, dni: str, age: int, gender: str, email: str, identification: int,
                 address: Addresses, course: Courses):
        super().__init__(name, dni, age, gender)
        self.__email = email
        self.__identification = identification
        self.__address = address
        self.__course = course

    # GETTERS
    def __getemail(self) -> str:
        return self.__email

    def __getidentification(self) -> int:
        return self.__identification

    def __getaddress(self) -> Addresses:
        return self.__address

    def __getcourse(self) -> Courses:
        return self.__course


    # SETTERS
    def __setemail(self, email):
        self.__email = email

    def __setidentification(self, identification):
        self.__identification = identification

    def __setaddress(self, address):
        self.__address = address

    def __setcourse(self, course):
        self.__course = course
