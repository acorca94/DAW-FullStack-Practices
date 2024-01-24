#from Logic.Students import Students
#from Logic.Addresses import Addresses
#from Logic.Subjects import Subjects
#from Logic.Administrative import Administrative
#from Logic.Courses import Courses
from Logic.Departments import Departments
from Logic.Institutes import Institutes
from Logic.Marks import Marks
from Logic.Registrations import Registrations
from Logic.Teachers import Teachers
from datetime import datetime
import Data

#MENÚ DEL PROYECTO
print("¡Hola! Bienvenido al menú. Estas son las opciones:")
print("1. Ver boletín de notas")
print("2. Añadir alumno")
print("3. Añadir profesor")
print("4. Registro de matrícula")
print("5. Modificar datos de matrícula.")
print("6. Asignaturas disponibles")
print("7. Personal administrativo")
print("8. Ver salario neto de profesor o administrativo")

select = int(input("Introduce el número de la función a la que quieres acceder: "))

if select == 1:
    print("1. Aquí tienes tu boletín de notas: ")

elif select == 2:
    print("Añade tus datos de alumno:")

elif select == 3:
    print("Añade tus datos de profesor:")

elif select == 4:
    print("Registro de matrícula:")

elif select == 5:
    print("Modifica tus datos de matriculación:")

elif select == 6:
    print("Lista de asignaturas:")

elif select == 7:
    print("Personal administrativo:")

elif select == 8:
    print("Selecciona el sueldo neto que quieres ver: ")
    print("Profesor 1")
    print("Profesor 2")
    print("Administrativo 1")
    print("Administrativo 2")

    select_8 = str(input("Escribe aquí de quien quieres ver el sueldo: "))

    if select_8 == "Profesor 1":
        print("Aquí tienes tu sueldo neto: ", Data.teacher1.netsalary())
    elif select_8 == "Profesor 2":
        print("Aquí tienes tu sueldo neto: ", Data.teacher2.netsalary())
    elif select_8 == "Administrativo 1":
        print("Aquí tienes tu sueldo neto: ", Data.administrative1.netsalary())
    elif select_8 == "Administrativo 2":
        print("Aquí tienes tu sueldo neto: ", Data.administrative2.netsalary())