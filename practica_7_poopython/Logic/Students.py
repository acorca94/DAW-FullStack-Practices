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
        self.__subject = []
        self.__mark = []


    # GETTERS
    def getemail(self) -> str:
        return self.__email

    def getidentification(self) -> int:
        return self.__identification

    def getaddress(self) -> Addresses:
        return self.__address

    def getcourse(self) -> Courses:
        return self.__course

    def getsubject(self):
        return self.__subject

    def getmark(self):
        return self.__mark


    # AÑADIR ASIGNATURAS AL ALUMNO
    def add_subject(self, subject):
        self.__subject.append(subject)


    # AÑADIR NOTAS AL ALUMNO
    def add_mark(self, mark):
        self.__mark.append(mark)


    # SETTERS
    def setemail(self, email):
        self.__email = email

    def setidentification(self, identification):
        self.__identification = identification

    def setaddress(self, address):
        self.__address = address

    def setcourse(self, course):
        self.__course = course

    def setsubject(self, subject):
        self.__subject = subject

    def setmark(self, mark):
        self.__mark = mark
