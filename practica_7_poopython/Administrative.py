import Addresses
import datetime
from People import People


#CLASE ADMINISTRATIVE HEREDANDO DE PEOPLE
class Administrative(People):

    # CONSTRUCTOR
    def __init__(self, name: str, dni: str, age: int, gender: str, functions: str, salary: float,
                 address: Addresses, start_date: datetime):
        super().__init__(name, dni, age, gender)
        self.__functions = functions
        self.__salary = salary
        self.__address = address
        self.__start_date = start_date

    # GETTERS
    def __getfunctions(self):
        return self.__functions

    def __getsalary(self):
        return self.__salary

    def __getaddress(self):
        return self.__address

    def __getstart_date(self):
        return self.__start_date


    #SETTERS
    def __setfunctions(self, functions):
        self.__functions = functions

    def __setsalary(self, salary):
        self.__salary = salary

    def __setaddress(self, address):
        self.__address = address

    def __setstart_date(self, start_date):
        self.__start_date = start_date