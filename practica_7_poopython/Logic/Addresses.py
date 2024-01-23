
#CLASE ADMINISTRATIVE HEREDANDO DE PEOPLE
class Addresses:

    # CONSTRUCTOR
    def __init__(self, street: str, number: int, postal_code: int, location: str, province: str):
        self.__street = street
        self.__number = number
        self.__postal_code = postal_code
        self.__location = location
        self.__province = province


    # GETTERS
    def __getstreet(self) -> str:
        return self.__street

    def __getnumber(self) -> int:
        return self.__number

    def __getpostal_code(self) -> int:
        return self.__postal_code

    def __getlocation(self) -> str:
        return self.__location

    def __getprovince(self) -> str:
        return self.__province



    #SETTERS
    def __setstreet(self, street):
        self.__street = street

    def __setnumber(self, number):
        self.__number = number

    def __setpostal_code(self, postal_code):
        self.__postal_code = postal_code

    def __setlocation(self, location):
        self.__location = location

    def __setprovince(self, province):
        self.__province = province

