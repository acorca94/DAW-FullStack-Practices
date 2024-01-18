#CLASE PERSONA
import Addresses
import Departments
import Subjects
from People import People
from datetime import datetime

#CLASE TEACHERS HEREDANDO DE PEOPLE
class Teachers(People):

    #CONSTRUCTOR
    def __init__(self, name: str, dni: str, age: int, gender: str, start_date: datetime, salary: float, address: Addresses, subject: Subjects, department: Departments):
        super().__init__(name, dni, age, gender)
        self.__start_date = start_date
        self.__salary = salary
        self.__address = address
        self.__subject = subject
        self.__department = department

    #GETTERS
    def __getname(self):
        return self.__name

    def __getdni(self):
        return self.__dni

    def __getage(self):
        return self.__age

    def __getgender(self):
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
