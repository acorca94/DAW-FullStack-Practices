#CLASE PERSONA
from Logic import Addresses, Departments, Subjects
from Logic.People import People
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
    def __getstart_date(self):
        return self.__start_date

    def __getsalary(self):
        return self.__salary

    def __getaddress(self):
        return self.__address

    def __getsubject(self):
        return self.__subject

    def __getdepartment(self):
        return self.__department

    #SETTERS
    def __setstart_date(self, start_date):
        self.__start_date = start_date

    def __setsalary(self, salary):
        self.__salary = salary

    def __setaddress(self, address):
        self.__address = address

    def __setsubject(self, subject):
        self.__subject = subject

    def __setdepartment(self, department):
        self.__department = department
