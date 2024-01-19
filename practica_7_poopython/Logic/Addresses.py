
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
    def __getpostal_code(self):
        return self.__postal_code

    def __getprovince(self):
        return self.__province

    def __getlocation(self):
        return self.__location

    def __getstreet(self):
        return self.__street

    def __getnumber(self):
        return self.__number


    #SETTERS
    def __setpostal_code(self, postal_code):
        self.__postal_code = postal_code

    def __setprovince(self, province):
        self.__province = province

    def __setlocation(self, location):
        self.__location = location

    def __setstreet(self, street):
        self.__street = street

    def __setnumber(self, number):
        self.__number = number