# CLASE PERSONA
from Logic.Addresses import Addresses
from Logic.Departments import Departments
from Logic.People import People
from datetime import datetime


# CLASE TEACHERS HEREDANDO DE PEOPLE
class Teachers(People):

    # CONSTRUCTOR
    def __init__(self, name: str, dni: str, age: int, gender: str, start_date: datetime, salary: float,
                 address: Addresses, department: Departments):
        super().__init__(name, dni, age, gender)
        self.__start_date = start_date
        self.__salary = salary
        self.__address = address
        self.__department = department

    # GETTERS
    def __getstart_date(self) -> datetime:
        return self.__start_date

    def __getsalary(self) -> float:
        return self.__salary

    def __getaddress(self) -> Addresses:
        return self.__address

    def __getdepartment(self) -> Departments:
        return self.__department


    # SETTERS
    def __setstart_date(self, start_date):
        self.__start_date = start_date

    def __setsalary(self, salary):
        self.__salary = salary

    def __setaddress(self, address):
        self.__address = address

    def __setdepartment(self, department):
        self.__department = department


    # SUELDO NETO DEL PROFESOR
    def netsalary(self):
        net_salary = self.__salary - (self.__salary*0.20)
        return net_salary

