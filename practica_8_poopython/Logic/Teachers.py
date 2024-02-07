from datetime import datetime
from Logic.Addresses import Addresses
from Logic.Departments import Departments
from Logic.People import People



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
    def getstart_date(self) -> datetime:
        return self.__start_date

    def getsalary(self) -> float:
        return self.__salary

    def getaddress(self) -> Addresses:
        return self.__address

    def getdepartment(self) -> Departments:
        return self.__department


    # SETTERS
    def setstart_date(self, start_date):
        self.__start_date = start_date

    def setsalary(self, salary):
        self.__salary = salary

    def setaddress(self, address):
        self.__address = address

    def setdepartment(self, department):
        self.__department = department


    # SUELDO NETO DEL PROFESOR
    def netsalary(self):
        net_salary = self.__salary - (self.__salary*0.20)
        return net_salary

    #ANTIGÜEDAD DE TRABAJO DEL PROFESOR
    def year_old(self):
        today = datetime.today().year
        old = today - self.__start_date.year
        return old

    # CREAR UN NUEVO PROFESOR
    def new_teacher(self):
        self.setname(str(input("Nombre: ")))
        self.setdni(str(input("DNI: ")))
        self.setage(int(input("Edad: ")))
        self.setgender(str(input("Sexo: ")))
        self.setstart_date(str(input("Fecha de inicio de contrato: ")))
        self.setsalary(float(input("Salario: ")))
        self.setaddress(str(input("Dirección: ")))
        self.setdepartment(str(input("Departamento: ")))

        print("Aquí tienes tus datos de registro: \n", "Nombre --> ", self.getname(), "\n", "DNI --> ", self.getdni(),
              "\n", "EDAD --> ", self.getage(), "\n", "SEXO --> ", self.getgender(), "\n", "FECHA DE INICIO DE CONTRATO --> ",
              self.getstart_date(), "\n", "SALARIO --> ", self.getsalary(), "\n", "DIRECCIÓN --> ",
              self.getaddress(), "\n", "DEPARTAMENTO --> ", self.getdepartment(), "\n")

