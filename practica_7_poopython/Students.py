import Addresses
import Subjects
import Marks
import Courses
from People import People


# CLASE STUDENTS HEREDANDO DE PEOPLE
class Students(People):

    # CONSTRUCTOR
    def __init__(self, name: str, dni: str, age: int, gender: str, email: str, identification: int,
                 address: Addresses, subject: Subjects, mark: Marks, course: Courses):
        super().__init__(name, dni, age, gender)
        self.__email = email
        self.__identification = identification
        self.__address = address
        self.__subject = subject
        self.__mark = mark
        self.__course = course

    # GETTERS
    def __getemail(self):
        return self.__email

    def __getidentification(self):
        return self.__identification

    def __getaddress(self):
        return self.__address

    def __getsubject(self):
        return self.__subject

    def __getmark(self):
        return self.__mark

    def __getcourse(self):
        return self.__course

    # SETTERS
    def __setemail(self, email):
        self.__email = email

    def __setidentification(self, identification):
        self.__identification = identification

    def __setaddress(self, address):
        self.__address = address

    def __setsubject(self, subject):
        self.__subject = subject

    def __setmark(self, mark):
        self.__mark = mark

    def __setcourse(self, course):
        self.__course = course
