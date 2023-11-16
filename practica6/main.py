from User import User

if __name__ == '__main__':
    user_1 = User("Antonio", "Cordero ", "41749 ", "Calle Montes, 2 ", "acc0087@alu.medac.es", "acc0087")
    user_2 = User("Marta", "Hinojosa ", "41740 ", "Calle Barbadillo, 3 ", "mhg0085@alu.medac.es", "mhg0085")

    #Con esto estamos mostrando la info del usuario 1 y 2. Pero para ello debo crear una función en la clase User. Que se llama mostrarUsuario()

    usuario_1 = str(input("Usuario 1: "))
    password_1 = str(input("Contraseña 1: "))
    user_1.checkUsuario(usuario_1, password_1)

    print("¿Quieres comprobar el usuario 2?")
    respuesta = str(input())

    if respuesta == "si":
        usuario_2 = str(input("Usuario 2: "))
        password_2 = str(input("Contraseña 2: "))
        user_2.checkUsuario(usuario_2, password_2)
    else:
        print("Ok.")
