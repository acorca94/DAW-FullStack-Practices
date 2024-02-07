class GestorDiccionarios:

    def __init__(self):
        self._dicc = {1: 'uno', 2: 'dos', 3: 'tres'}


 # GETTERS
    def getDicc(self) -> dict:
        return self._dicc


    # AGREGAR NÚMEROS A UNA LISTA DICCIONARIO:
    def addDicc(self):
        self._dicc[4] = "cuatro"
        return self._dicc


    # ACTUALIZAR NUMERO DE MI LISTA
    def updateDicc(self):
        # SIRVE PARA ACTUALIZAR/CAMBIAR EL VALOR DE UNA LISTA
        self._dicc[1] = "primero"
        print("Aquí tienes la lista actualizada: ", self._dicc)
        # SIRVE PARA ACTUALIZAR/CAMBIAR LA CLAVE DE UNA LISTA


    # MOSTRAR ELEMENTOS DE MI LISTA
    def showDicc(self):
        print("Aquí tienes tu lista: ", "\n", self._dicc)


    # ELIMINAR NUMERO DE MI LISTA
    def removeDicc(self):
        # SIRVE PARA ELIMINAR DE MI LISTA EL VALOR QUE DESEE, PERO ESCRIBIENDO LA POSICIÓN Y CON EL LIST.REMOVE ELIMINO EL VALOR DIRECTAMENTE
        self._dicc.pop(2)
        print("Aquí tienes tu lista actualizada: ", self._dicc)


    # RECORRER ELEMENTOS DE MI LISTA
    def travellingDicc(self):
        """PARA RECORRER TANTO CLAVE COMO VALOR"""
        print("Aquí tienes tu lista con claves y valores: ")
        for travel in self._dicc.items():
            print("--> ", travel)

        """PARA RECORRER CLAVE DE LA LISTA DICC"""
        print("Aquí tienes tu lista con claves: ")
        for travel in self._dicc.keys():
            print("--> ", travel)

        """PARA RECORRER VALORES DE LA LISTA DICC"""
        print("Aquí tienes tu lista con valores: ")
        for travel in self._dicc.values():
            print("--> ", travel)
