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


# FECHA DE INICIO DE CONTRATO DE PROFESORES Y ADMINISTRATIVOS
date_teacher1 = datetime(2020, 1, 1)
date_teacher2 = datetime(2021, 1, 1)
date_administrative1 = datetime(2021, 10, 5)
date_administrative2 = datetime(2020, 8, 5)


# SALARIO DE PROFESORES Y ADMINISTRATIVOS
salary_teacher1 = 2000
salary_teacher2 = 1600
salary_administrative1 = 1300
salary_administrative2 = 1300


# CREACIÓN DE DIRECCIONES
address_student1 = Addresses("Montes", 2, 41009, "Brenes", "Sevilla")
address_student2 = Addresses("Manigua", 3, 41010, "Lebrija", "Sevilla")
address_teacher1 = Addresses("Republica Argentina", 3, 41010, "Sevilla", "Sevilla")
address_teacher2 = Addresses("Rafael Alberti", 5, 41018, "Tomares", "Sevilla")
address_administrative1 = Addresses("Mar Caspio", 5, 41009, "Sevilla", "Sevilla")
address_administrative2 = Addresses("Cigalas", 19, 41011, "Sevilla", "Sevilla")
address_institute1y2 = Addresses("Astronomía", 3, 41009, "Dos Hermanas", "Sevilla")


# CREACIÓN DE DEPARTAMENTOS
department1 = Departments("Informática", 10)
department2 = Departments("Logística", 12)


# CREACIÓN DE CURSOS
course1 = Courses(20, "Sistemas informáticos", "Grado Superior", "primero")
course2 = Courses(23, "Programación", "Grado Superior", "segundo")


# CREACIÓN DE INSTITUTO
institute1 = Institutes("I.E.S Hermanos Machado", "B23344556", address_institute1y2, course1)
institute2 = Institutes("I.E.S. Hermanos Machado", "B23344556", address_institute1y2, course2)


# CREACIÓN DE PROFESORES
teacher1 = Teachers("Jose Angel", "47340009P", 38, "Masculino", date_teacher1, salary_teacher1, address_teacher1,
                    department1)
teacher2 = Teachers("Maria", "340009Y", 26, "Femenino", date_teacher2, salary_teacher2, address_teacher2,
                    department2)


# CREACIÓN DE ASIGNATURAS
subject1 = Subjects(teacher1, 13, "S.I.", 50, "Sistemas informáticos")
subject2 = Subjects(teacher2, 15, "Pro.", 30, "Programación")
subject3 = Subjects(teacher1, 10, "L.M.", 20, "Lenguaje de Marcas")
subject4 = Subjects(teacher2, 9, "FOL", 35, "Formación y Orientación Laboral")


# CREACIÓN DE ESTUDIANTES
student1 = Students("Marta", "34003400Y", 23, "Femenino", "marta0087@gmail.con", 23, address_student1,
                    course1)
student1.add_subject(subject1)
student1.add_subject(subject2)
student1.add_subject(subject3)

student2 = Students("Carlos", "47340010L", 25, "Masculino", "carlos0087@gmail.con", 15, address_student2,
                    course2)
student2.add_subject(subject1)
student2.add_subject(subject2)
student2.add_subject(subject4)

new_address = Addresses(" ", 0, 0, " ", " ")
new_course = Courses(0, " ", " ", " ")
create_student = Students(" ", " ", 0, " ", " ", 0, new_address, new_course)


# CREACIÓN DE NOTAS
mark1 = Marks(student1, subject1, 8)
mark2 = Marks(student2, subject2, 7)
mark3 = Marks(student1, subject3, 5)
mark4 = Marks(student2, subject4, 9)
student1.add_mark(mark1)
student1.add_mark(mark3)
student2.add_mark(mark2)
student2.add_mark(mark4)


# CREACIÓN DE MATRÍCULAS
registration1 = Registrations(student1, course1, subject1)
registration2 = Registrations(student2, course2, subject2)


# CREACIÓN DE ADMINISTRATIVOS
administrative1 = Administrative("Julian", "34098212Y", 26, "Masculino", "Nóminas", salary_administrative1,
                                 address_administrative1,
                                 date_administrative1, )
administrative2 = Administrative("Carla", "34000823G", 30, "Femenino", "Papeles en general", salary_administrative2,
                                 address_administrative2, date_administrative2)
