from User import User

if __name__ == '__main__':
    user_1 = User("Antonio", "Cordero ", "41749 ", "Calle Montes, 2 ", "acc0087@alu.medac.es", "acc0087")
    user_2 = User("Marta", "Hinojosa ", "41740 ", "Calle Barbadillo, 3 ", "mhg0085@alu.medac.es", "mhg0085")
    new_User = User(" ", " ", " ", " ", " ", " ")

    print("Hola! Si quieres inicar sesión como usuario 1, pulsa 1, si lo quieres hacer como usuario 2, pulsa 2. Si por el contrario deseas registrarte, pulsa 2.")
    respuesta = str(input(""))
    if respuesta == "1":
        usuario_1 = str(input("Usuario 1: "))
        password_1 = str(input("Contraseña 1: "))
        chk_user_1 = user_1.checkUsuario(usuario_1, password_1)
        if chk_user_1:
            res_mod = input("¿Quieres modificar los datos del usuario? ")
            user_1.modifyData(res_mod)
    elif respuesta == "2":
        usuario_2 = str(input("Usuario 2: "))
        password_2 = str(input("Contraseña 2: "))
        chk_user_2 = user_2.checkUsuario(usuario_2, password_2)
        if chk_user_2:
            res_mod = input("¿Quieres modificar los datos del usuario? ")
            user_2.modifyData(res_mod)
    elif respuesta == "registro":
        print("Introduce tus datos de registro: ")
        new_User.newUsuario()
        print("¡Perfecto! Ya eres uno más de nosotros")
    else:
        pass