import Addresses
import Courses
class Institutes:

    # CONSTRUCTOR
    def __init__(self, name: str, cif: int, address: Addresses, course: Courses):
        self.__name = name
        self.__cif = cif
        self.__address = address
        self.__course = course

    # GETTERS
    def __getname(self):
        return self.__name

    def __getcif(self):
        return self.__cif

    def __getaddress(self):
        return self.__address

    def __getcourse(self):
        return self.__course


    #SETTERS
    def __setname(self, name):
        self.__name = name

    def __setcif(self, cif):
        self.__cif = cif

    def __setaddress(self, address):
        self.__address = address

    def __setcourse(self, course):
        self.__course = course