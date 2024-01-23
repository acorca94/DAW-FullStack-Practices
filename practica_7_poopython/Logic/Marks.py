from Logic.Students import Students
from Logic.Subjects import Subjects


class Marks:

    # CONSTRUCTOR
    def __init__(self, student: Students, subject: Subjects, calification: float):
        self.__student = student
        self.__subject = subject
        self.__calification = calification

    # GETTERS
    def __getstudent(self) -> Students:
        return self.__student

    def __getsubject(self) -> Subjects:
        return self.__subject

    def __getcalification(self) -> float:
        return self.__calification

    #SETTERS
    def __setstudent(self, student):
        self.__student = student

    def __setsubject(self, subject):
        self.__subject = subject

    def __setcalification(self, calification):
        self.__calification = calification