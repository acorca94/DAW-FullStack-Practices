class OperadorConjuntos:
    def __init__(self):
        self._set = set('Hola')

    # GETTERS
    def getSet(self) -> set:
        return self._set


    # AGREGAR NÚMEROS A UNA LISTA:
    def addSet(self):
        self._set.add('b')
        return self._set


    # ACTUALIZAR NUMERO DE MI LISTA
    def updateSet(self):
        # SIRVE PARA ACTUALIZAR/CAMBIAR EL VALOR DE UNA LISTA DE CONJUNTOS
        print("Aquí tenemos la lista sin modificar: ")
        self.getSet()

        number1 = input("Escribe el elemento de la lista que deseas actualizar: ")
        for number in self._set:
            if number == number1:
                self._set.remove(number1)
                self._set.add(input("Escribe aquí el elemento de la lista que deseas añadir: "))
                print("Aquí tienes la lista actualizada: ", self._set)


    # MOSTRAR ELEMENTOS DE MI LISTA
    def showSet(self):
        print("Aquí tienes tu lista: ", "\n", self._set)


    # ELIMINAR NUMERO DE MI LISTA
    def removeSet(self):
        # SIRVE PARA ELIMINAR DE MI LISTA EL VALOR QUE DESEE, PERO ESCRIBIENDO LA POSICIÓN Y CON EL LIST.REMOVE ELIMINO EL VALOR DIRECTAMENTE
        self._set.remove('a')
        print("Aquí tienes tu lista actualizada: ", self._set)


    # UNIR DOS ELEMENTOS DE UNA LISTA
    def unionSet(self):
        """PARA UNIR TANTO CLAVE COMO VALOR"""
        listA = self._set
        listB = set('Adios')
        print("Aquí tienes la unión de lista A y B: ", listA | listB)


