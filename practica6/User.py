#Aquí definimos que usuario es la clase.
class User:
    #Atributos de la clase User
    name = " "
    surname = " "
    postal_code = 0
    address = " "
    email = " "
    password = " "

    #Aquí estamos creando el constructor y el self vale lo mismo que this en java.
    def __int__(self, name, surname, postal_code, address, email, password):

        self._name = name
        self._surname = surname
        self._postal_code = postal_code
        self._address = address
        self._email = email
        self._password = password

    def mostrarUsuario(self):
        return print("Nombre: ", self._name, "Apellidos: ", self._surname, "C.P.: ", self.postal_code, "Dirección: ", self.address, "Correo: ", self.email, "Contraseña: ", self.password)








