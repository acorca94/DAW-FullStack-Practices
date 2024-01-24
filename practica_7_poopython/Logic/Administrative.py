from datetime import datetime
from Logic.Addresses import Addresses
from Logic.People import People


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
    def getfunctions(self) -> str:
        return self.__functions

    def getsalary(self) -> float:
        return self.__salary

    def getaddress(self) -> Addresses:
        return self.__address

    def getstart_date(self) -> datetime:
        return self.__start_date


    #SETTERS
    def setfunctions(self, functions):
        self.__functions = functions

    def setsalary(self, salary):
        self.__salary = salary

    def setaddress(self, address):
        self.__address = address

    def setstart_date(self, start_date):
        self.__start_date = start_date


    # SUELDO NETO DEL ADMINISTRATIVO
    def netsalary(self):
        net_salary = self.__salary - (self.__salary*0.15)
        return net_salary

    #ANTIGÜEDAD DE TRABAJO DEL ADMINISTRATIVO
    def year_old(self):
        today = datetime.today().year
        old = today - self.__start_date.year
        return old