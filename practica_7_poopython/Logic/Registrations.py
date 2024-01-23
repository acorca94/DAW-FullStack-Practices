import Students
from Logic import Students, Courses, Subjects


#CLASE ADMINISTRATIVE HEREDANDO DE PEOPLE
class Registrations:

    # CONSTRUCTOR
    def __init__(self, student: Students, course: Courses, subject: Subjects):
        self.__student = student
        self.__course = course
        self.__subject = subject

    # GETTERS
    def __getstudent(self) -> Students:
        return self.__student

    def __getcourse(self) -> Courses:
        return self.__course

    def __getsubject(self) -> Subjects:
        return self.__subject


    #SETTERS
    def __setstudent(self, student):
        self.__student = student

    def __setcourse(self, course):
        self.__course = course

    def __setsubject(self, subject):
        self.__subject = subject
