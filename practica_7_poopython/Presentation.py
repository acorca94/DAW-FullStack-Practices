import Data


class Presentation:
    @staticmethod
    def start_program():

        # Creo un while para que se me repita lo mismo hasta el punto 6 que yo le digo break para que pare en ese punto y no vuelva a mostrar el menú de nuevo
        while True:
            # MENÚ DEL PROYECTO
            print("¡Hola! Bienvenido(s) al menú. Seleccione el número de la opción a la que quieres acceder: \n")
            print("1. Ver salario neto de profesores y/o administrativos")
            print("2. Ver antigüedad de profesores y/o administrativos")
            print("3. Listado de asignaturas matriculadas del alumno")
            print("4. Ver boletín de notas")
            print("5. Crear información nueva")
            print("6. Salir \n")

            select = int(input("Introduce el número de la función a la que quieres acceder: \n"))

            if select == 1:
                print("Selecciona de quien quieres ver el sueldo neto: \n")
                print("Profesor 1")
                print("Profesor 2")
                print("Administrativo 1")
                print("Administrativo 2 \n")

                select_8 = str(input("Escribe aquí de quien quieres ver el sueldo: \n"))

                if select_8 == "Profesor 1":
                    print("Aquí tienes tu sueldo neto: ", Data.teacher1.getname(), " --> ", Data.teacher1.netsalary(),
                          "€")
                elif select_8 == "Profesor 2":
                    print("Aquí tienes tu sueldo neto: ", Data.teacher2.getname(), " --> ", Data.teacher2.netsalary(),
                          "€")
                elif select_8 == "Administrativo 1":
                    print("Aquí tienes tu sueldo neto: ", Data.administrative1.getname(), " --> ",
                          Data.administrative1.netsalary(), "€")
                elif select_8 == "Administrativo 2":
                    print("Aquí tienes tu sueldo neto: ", Data.administrative2.getname(), " --> ",
                          (), "€")
                else:
                    print("Selección incorrecta")

            elif select == 2:
                print("Selecciona de quien quieres la antigüedad: ")
                print("Profesor 1")
                print("Profesor 2")
                print("Administrativo 1")
                print("Administrativo 2")
                select_teacher = str(input("Escribe aquí el profesor: "))
                if select_teacher == "Profesor 1":
                    print("Aquí tienes tu antigüedad en años: ", Data.teacher1.getname(), " --> ",
                          Data.teacher1.year_old(), "año(s)")

                elif select_teacher == "Profesor 2":
                    print("Aquí tienes tu antigüedad en años: ", Data.teacher2.getname(), " --> ",
                          Data.teacher2.year_old(), "año(s)")

                elif select_teacher == "Administrativo 1":
                    print("Aquí tienes tu antigüedad en años: ", Data.administrative1.getname(), " --> ",
                          Data.administrative1.year_old(), "año(s)")

                elif select_teacher == "Administrativo 2":
                    print("Aquí tienes tu antigüedad en años: ", Data.administrative2.getname(), " --> ",
                          Data.administrative2.year_old(), "año(s)")
                else:
                    print("Selección incorrecta")

            elif select == 3:
                print("1. Estudiante 1")
                print("2. Estudiante 2")
                subject_select = int(input("Selecciona el estudiante: "))
                if subject_select == 1:
                    print("Aquí tienes la(s) asignatura(s) del/la estudiante: ", Data.student1.getname(), "con DNI: ",
                          Data.student1.getdni())
                    # Para cada asignatura en la lista de asignaturas del estudiante1 (getsubject) q
                    for subject in Data.student1.getsubject():
                        # Imprime el nombre de cada asignatura que tengo dentro esa lista
                        print(subject.getname())
                elif subject_select == 2:
                    print("Aquí tienes la(s) asignatura(s) del/la estudiante: ", Data.student2.getname(), " con DNI: ",
                          Data.student2.getdni())
                    # Para cada asignatura en la lista de asignaturas del estudiante1 (getsubject) q
                    for subject in Data.student2.getsubject():
                        # Imprime el nombre de cada asignatura que tengo dentro esa lista
                        print(subject.getname())
                else:
                    print("Selección incorrecta")

            elif select == 4:
                print("1. Estudiante 1")
                print("2. Estudiante 2")
                mark_select = int(input("Selecciona el estudiante: "))
                if mark_select == 1:
                    print("Aquí tienes tu boletín de notas: ", Data.student1.getname(), " con DNI --> ",
                          Data.student1.getdni())
                    for mark in Data.student1.getmark():
                        print(mark.getsubject().getname(), " --> ", mark.getcalification())
                elif mark_select == 2:
                    print("Aquí tienes tu boletín de notas: ", Data.student2.getname(), " con DNI --> ",
                          Data.student2.getdni())
                    for mark in Data.student2.getmark():
                        print(mark.getsubject().getname(), " --> ", mark.getcalification())
                else:
                    print("Selección incorrecta")


            elif select == 5:
                print("1. Crear alumno(s) nuevo(s): ")
                print("2. Crear profesor(s) nuevo(s): ")
                print("3. Crear administrativo(s) nuevo(s): ")

                select_new = int(input("Escribe aquí el número al que quieres acceder: "))

                if select_new == 1:
                    print("Creación de alumno nuevo: ")
                    Data.create_student.new_student()

                elif select_new == 2:
                    print("Creación de profesor nuevo: ")
                    Data.create_teacher.new_teacher()

                elif select_new == 3:
                    print("Creación de administrativo nuevo: ")
                    Data.create_administrative.new_administrative()

                else:
                    print("Selección incorrecta")

            elif select == 6:
                print("Has salido con éxito. Gracias.")
                break

            else:
                print("Los datos a los que quieres acceder, no están disponibles. Inténtalo de nuevo.")
