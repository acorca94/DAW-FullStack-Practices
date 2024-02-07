class OperadorTuplas:

    def __init__(self):
        self._tuplas = (1, 'uno', 2, 'dos', 3, 'tres')


    def travelling_tuple(self):
        print("Aquí tienes los elementos de tu lista: ")
        for travel in self._tuplas:
            print("--> ", travel, "\n")


    def generate_Subtuples(self):
        subtuples = tuple(self._tuplas[i:i + 2] for i in range(0, len(self._tuplas), 2))
        return subtuples
