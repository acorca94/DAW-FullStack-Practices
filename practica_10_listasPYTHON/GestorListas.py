class GestorListas:

    #CONSTRUCTOR
    def __init__(self):
        self.__listsNumber = [1, 3, 5, 7, 9]


    def getlistsNumber(self) -> list:
        return self.__listsNumber


    #AGREGAR NÚMEROS A UNA LISTA:
    def add_number(self, number):
        self.__listsNumber.append(number)


    #ACTUALIZAR NUMERO DE MI LISTA
    def update_number(self):
        #SIRVE PARA PONER UN ELEMENTO EN LA POSICIÓN QUE TU QUIERAS DE LA LISTA. PERO NO LO CAMBIA, SIMPLEMENTE LO AÑADE
        print("Lista actual: ", self.__listsNumber)
        index = int(input("Escribe aqui la posición: "))
        object = int(input("Escribe aqui tu número: "))
        self.__listsNumber.insert(index, object)
        print("Aquí tienes tu lista actualizada: ", "\n", self.__listsNumber)

        #SIRVE PARA MODIFICAR EL ELEMENTO DE LA LISTA, DE LA POSICIÓN QUE DESEAS.
        position = int(input("Escribe aqui la posicion que quieres cambiar: "))
        number = int(input("Escribe aqui el nuevo número: "))
        self.__listsNumber[position] = number
        print("Aquí tienes tu lista actualizada: ", "\n", self.__listsNumber)
        return self.__listsNumber


    #ELIMINAR NUMERO DE MI LISTA
    def remove_number(self):
        #SIRVE PARA ELIMINAR DE MI LISTA EL VALOR QUE DESEE, PERO ESCRIBIENDO LA POSICIÓN Y CON EL LIST.REMOVE ELIMINO EL VALOR DIRECTAMENTE
        #self.__listsNumber.pop()
        self.__listsNumber.remove(24)
        print("Aquí tienes tu lista actualizada: ", self.__listsNumber)
        return self.__listsNumber


    #MOSTRAR NUMERO DE MI LISTA
    def show_number(self):
        print("Aquí tienes tu lista: ", "\n", self.__listsNumber)
        return self.__listsNumber


    #RECORRER LA LISTA
    def travelling_list(self):
        for travel in self.__listsNumber:
            print("--> ", travel)
        return self.__listsNumber


    #CREAR LISTA NUEVA CON LOS ELEMENTOS ELEVADOS AL CUADRADO
    def create_newList(self):
        print("Aqui tienes tu lista actual: ", self.__listsNumber)
        print("Aqui tienes tu lista elevada al cuadrado: ")
        return [number ** 2 for number in self.__listsNumber]
