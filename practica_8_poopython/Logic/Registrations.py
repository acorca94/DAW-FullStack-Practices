from Logic.Students import Students
from Logic.Courses import Courses
from Logic.Subjects import Subjects


#CLASE ADMINISTRATIVE HEREDANDO DE PEOPLE
class Registrations:

    # CONSTRUCTOR
    def __init__(self, student: Students, course: Courses, subject: Subjects):
        self.__student = student
        self.__course = course
        self.__subject = subject

    # GETTERS
    def getstudent(self) -> Students:
        return self.__student

    def getcourse(self) -> Courses:
        return self.__course

    def getsubject(self) -> Subjects:
        return self.__subject


    #SETTERS
    def setstudent(self, student):
        self.__student = student

    def setcourse(self, course):
        self.__course = course

    def setsubject(self, subject):
        self.__subject = subject
