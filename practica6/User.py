#Aquí definimos que usuario es la clase.
class User:

    #Aquí estamos creando el constructor y el self vale lo mismo que this en java.
    def __init__(self, name, surname, postal_code, address, email, password):
        self._name = name
        self._surname = surname
        self._postal_code = postal_code
        self._address = address
        self._email = email
        self._password = password

    def mostrarUsuario(self):
        print(f"Nombre: {self._name} | Apellidos: {self._surname} | "
              f"C.P.: {self._postal_code} | Dirección: {self._address} | Correo: {self._email}")

    def checkUsuario(self, usuario, password):
        if self._name == usuario and self._password == password:
            print("CORRECTO")
            self.mostrarUsuario()
        else:
            print("INCORRECTO")

