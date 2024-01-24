from Logic.Students import Students
from Logic.Addresses import Addresses
from Logic.Subjects import Subjects
from Logic.Administrative import Administrative
from Logic.Courses import Courses
from Logic.Departments import Departments
from Logic.Institutes import Institutes
from Logic.Marks import Marks
from Logic.Registrations import Registrations
from Logic.Teachers import Teachers
from datetime import datetime
import Data

#MENÚ DEL PROYECTO
print("¡Hola! Bienvenido al menú. Estas son las opciones:")
print("1. Ver salario neto de profesores y/o administrativos")
print("2. Ver antigüedad de profesores y/o administrativos")
print("3. Listado de asignaturas matriculadas del alumno")
print("4. Ver boletín de notas")
print("5. Crear información nueva")

select = int(input("Introduce el número de la función a la que quieres acceder: "))

if select == 1:
    print("Selecciona de quien quieres ver el sueldo neto: ")
    print("Profesor 1")
    print("Profesor 2")
    print("Administrativo 1")
    print("Administrativo 2")

    select_8 = str(input("Escribe aquí de quien quieres ver el sueldo: "))

    if select_8 == "Profesor 1":
        print("Aquí tienes tu sueldo neto: ", Data.teacher1.netsalary(), "€")
    elif select_8 == "Profesor 2":
        print("Aquí tienes tu sueldo neto: ", Data.teacher2.netsalary(), "€")
    elif select_8 == "Administrativo 1":
        print("Aquí tienes tu sueldo neto: ", Data.administrative1.netsalary(), "€")
    elif select_8 == "Administrativo 2":
        print("Aquí tienes tu sueldo neto: ", Data.administrative2.netsalary(), "€")

elif select == 2:
    print("Selecciona de quien quieres la antigüedad: ")
    print("Profesor 1")
    print("Profesor 2")
    print("Administrativo 1")
    print("Administrativo 2")
    select_teacher = str(input("Escribe aquí el profesor: "))
    if select_teacher == "Profesor 1":
        print("La antigüedad en años del profesor es: ", Data.teacher1.year_old(), "año(s)")

    elif select_teacher == "Profesor 2":
        print("La antigüedad en años del profesor es: ", Data.teacher2.year_old(), "año(s)")

    elif select_teacher == "Administrativo 1":
        print("La antigüedad en años del administrativo 1 es: ", Data.administrative1.year_old(), "año(s)")

    elif select_teacher == "Administrativo 2":
        print("La antigüedad en años del administrativo 2 es: ", Data.administrative2.year_old(), "año(s)")

elif select == 3:
    print("Aquí tienes la(s) asignatura(s) en la(s) que estas matriculado: ", )

elif select == 4:
    print("Aquí tienes tu boletín de notas: ", )

elif select == 5:
    print("1. Crear alumno(s) nuevo(s): ")
    print("2. Crear profesor(s) nuevo(s): ")
    print("3. Crear administrativo(s) nuevo(s): ")

    select_new = int(input("Escribe aquí el número al que quieres acceder: "))

    if select_new == 1:
        print("Creación de alumno: ")

    elif select_new == 2:
        print("")
