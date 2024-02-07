from GestorListas import GestorListas
from OperadorTuplas import OperadorTuplas
from GestorDiccionarios import GestorDiccionarios
from OperadorConjuntos import OperadorConjuntos
from GestorMixto import GestorMixto

print("Bienvenido al menú.")
print("1. Ejercicio 1: Manejo de listas (CRUD y recorrido")
print("2. Ejercicio 2: Manejo de Tuplas (Recorrido y Subtuplas)")
print("3. Ejercicio 3: Manejo de Diccionarios (CRUD y Recorrido)")
print("4. Ejercicio 4: Manejo de Conjuntos (CRUD y Operaciones)")
print("5. Ejercicio 5: Manejo de Listas y Diccionarios (Operaciones Mixtas)")
option = int(input("Escribe el número del ejercicio: "))

if option == 1:
    print("Escoge que quieres ver: ")
    print("1. Agregar elemento a una lista")
    print("2. Actualizar elementos de una lista")
    print("3. Mostar lista")
    print("4. Eliminar elementos de una lista")
    print("5. Recorrer lista")
    print("6. Crear lista nueva elevada al cuadrado")
    option = int(input("Escribe el número del ejercicio: \n"))
    if option == 1:
        #AGREGAR ELEMENTOS A UNA LISTA:
        lista_1 = GestorListas()
        lista_1.add_number(2)
        lista_1.add_number(4)
        lista_1.add_number(6)
        lista_1.add_number(8)
        lista_1.add_number(10)
        print("Aquí tienes tu lista actual: ", "\n", lista_1.getlistsNumber())
        add = int(input("Escribe aquí el número que quieres añadir a tu lista: "))
        lista_1.add_number(add)
        print("Aquí tienes tu lista actualizada: ", "\n", lista_1.getlistsNumber())


    elif option == 2:
        #ACTUALIZAR UNA LISTA:
        print(GestorListas().update_number())

    elif option == 3:
        #ELIMINAR UN ELEMENTO DE LA LISTA
        print(GestorListas().remove_number())

    elif option == 4:
        #MOSTRAR LISTA
        print(GestorListas().show_number())

    elif option == 5:
        #RECORRER UNA LISTA
        print(GestorListas().travelling_list())

    elif option == 6:
        #CREAR UNA LISTA ELEVADA AL CUADRADO
        print(GestorListas().create_newList())

    else:
        print("Error.")

elif option == 2:
    OperadorTuplas().travelling_tuple()

    print("Subtuplas de dos en dos: \n")
    print(OperadorTuplas().generate_Subtuples())

elif option == 3:
    print("Escoge que quieres ver: ")
    print("1. Agregar elemento a una lista")
    print("2. Actualizar elementos de una lista")
    print("3. Mostar lista")
    print("4. Eliminar elementos de una lista")
    print("5. Recorrer lista")
    option = int(input("Escribe el número del ejercicio: \n"))
    if option == 1:
        # AGREGAR ELEMENTOS A UNA LISTA:
        print("Aquí tienes tu lists: ", "\n", GestorDiccionarios().addDicc())


    elif option == 2:
        # ACTUALIZAR UNA LISTA:
        print(GestorDiccionarios().updateDicc())

    elif option == 3:
        # MOSTRAR LISTA
        print(GestorDiccionarios().showDicc())

    elif option == 4:
        # ELIMINAR UN ELEMENTO DE LA LISTA
        print(GestorDiccionarios().removeDicc())


    elif option == 5:
        # RECORRER UNA LISTA
        print(GestorDiccionarios().travellingDicc())

    else:
        print("Error.")


elif option == 4:
    print("Escoge que quieres ver: ")
    print("1. Agregar elemento a una lista")
    print("2. Actualizar elementos de una lista")
    print("3. Mostar lista")
    print("4. Eliminar elementos de una lista")
    print("5. Unión de dos conjuntos")
    option = int(input("Escribe el número del ejercicio: \n"))
    if option == 1:
        # AGREGAR ELEMENTOS A UN CONJUNTO (SET):
        print("Aquí tienes tu lista: ", "\n", OperadorConjuntos().addSet())


    elif option == 2:
        # ACTUALIZAR UNA LISTA DE CONJUNTO (SET):
        print(OperadorConjuntos().updateSet())

    elif option == 3:
        # MOSTRAR LISTA
        print(OperadorConjuntos().showSet())

    elif option == 4:
        # ELIMINAR UN ELEMENTO DE LA LISTA
        print(OperadorConjuntos().removeSet())


    elif option == 5:
        # UNION DE DOS CONJUNTOS
        print(OperadorConjuntos().unionSet())

    else:
        print("Error.")


elif option == 5:
    print("Escoge que quieres ver: ")
    print("1. Agregar elemento a una lista")
    print("2. Agregar elementos de una lista Dict")
    print("3. Mostar lista de valores")
    option = int(input("Escribe el número del ejercicio: \n"))
    if option == 1:
        # AGREGAR ELEMENTOS A UNA LISTA:
        lista_1 = GestorMixto()
        lista_1.addMixto1(2)
        lista_1.addMixto1(4)
        lista_1.addMixto1(6)
        lista_1.addMixto1(8)
        lista_1.addMixto1(10)
        print("Aquí tienes tu lista: ", "\n", lista_1.getMixto1())


    elif option == 2:
        # AGREGAR ELEMENTO UNA LISTA DICCIONARIO:
        print(GestorMixto().addMixto2())

    elif option == 3:
        # MOSTRAR LISTA
        print(GestorMixto().newListDicc())
    else:
        print("Error de selección.")

else:
    print("Error de selección.")
