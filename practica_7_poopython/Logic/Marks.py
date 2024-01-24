from Logic.Students import Students
from Logic.Subjects import Subjects


class Marks:

    # CONSTRUCTOR
    def __init__(self, student: Students, subject: Subjects, calification: float):
        self.__student = student
        self.__subject = subject
        self.__calification = calification

    # GETTERS
    def getstudent(self) -> Students:
        return self.__student

    def getsubject(self) -> Subjects:
        return self.__subject

    def getcalification(self) -> float:
        return self.__calification

    #SETTERS
    def setstudent(self, student):
        self.__student = student

    def setsubject(self, subject):
        self.__subject = subject

    def setcalification(self, calification):
        self.__calification = calification