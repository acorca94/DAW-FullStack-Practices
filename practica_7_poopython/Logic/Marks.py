import Students
import Subjects
class Marks:

    # CONSTRUCTOR
    def __init__(self, student: Students, subject: Subjects, calification: float):
        self.__student = student
        self.__subject = subject
        self.__calification = calification

    # GETTERS
    def __getstudent(self):
        return self.__student

    def __getsubject(self):
        return self.__subject

    def __getcalification(self):
        return self.__calification

    #SETTERS
    def __setstudent(self, student):
        self.__student = student

    def __setsubject(self, subject):
        self.__subject = subject

    def __setcalification(self, calification):
        self.__calification = calification