class GestorMixto:
    def __init__(self):
        self._mixto1 = [1, 3]
        self._mixto2 = {2: 'dos', 4: 'cuatro', 6: 'seis', 8: 'ocho'}


    def getMixto1(self) -> list:
        return self._mixto1


    def getMixto2(self) -> dict:
        return self._mixto2


    def addMixto1(self, number):
        self._mixto1.append(number)
        return self._mixto1

    def addMixto2(self):
        self._mixto2[2] = 'segundo'
        return self._mixto2


    def newListDicc(self):
        print("Aqui tienes tu lista de valores: \n")
        for travel in self._mixto2.values():
            print(travel)
