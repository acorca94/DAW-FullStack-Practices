# Aquí definimos que usuario es la clase.
class User:

    # Aquí estamos creando el constructor y el self vale lo mismo que this en java.
    def __init__(self, name, surname, postal_code, address, email, password):
        self._name = name
        self._surname = surname
        self._postal_code = postal_code
        self._address = address
        self._email = email
        self._password = password

    def showUsuario(self):
        print(f"Nombre: {self._name} | Apellidos: {self._surname} | "
              f"C.P.: {self._postal_code} | Dirección: {self._address} | Correo: {self._email}")

    def checkUsuario(self, usuario, password):

        if self._name == usuario and self._password == password:
            print("CORRECTO")
            self.showUsuario()
            return True
        elif self._name != usuario or self._password != password:
            print("INCORRECTO")
            return False

    def modifyData(self, respuesta):
        if respuesta == "si":
            self._name = input("Nombre: ")
            self._surname = input("Apellido(s): ")
            self._postal_code = input("C.P.: ")
            self._address = input("Dirección: ")
            self._email = input("Correo: ")
            self._password = input("Contraseña: ")
        elif respuesta == "no":
            print("Ok.")
        else:
            print("Error.")

    def newUsuario(self):
        self._name = input("Nombre: ")
        self._surname = input("Apellido(s): ")
        self._postal_code = input("C.P.: ")
        self._address = input("Dirección: ")
        self._email = input("Correo: ")
        self._password = input("Contraseña: ")
        print(self._name, self._surname, self._postal_code, self._address, self._email, self._password)


