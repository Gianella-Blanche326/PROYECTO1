import random

def guess_the_number():
    """
    Función principal para el juego de adivinar un número.
    Controla la lógica de intentos y pistas.
    """
    # El sistema elige un número aleatorio entre 1 y 10
    target_number = random.randint(1, 10)
    attempts_limit = 5
    
    print(f"He elegido un número entre 1 y 10. Tienes {attempts_limit} intentos para adivinarlo.")

    for current_attempt in range(1, attempts_limit + 1):
        try:
            # Entrada del usuario
            user_guess = int(input(f"Intento {current_attempt}: "))
            
            if user_guess == target_number:
                print("¡Felicidades! Has acertado el número.")
                return
            elif user_guess < target_number:
                print("El número es mayor.")
            else:
                print("El número es menor.")
                
        except ValueError:
            # Manejo de error si el usuario no ingresa un número entero
            print("Por favor, introduce un número válido.")

    # Si se agotan los intentos sin acertar
    print(f"Lo siento, has agotado tus intentos. El número era {target_number}.")

if __name__ == "__main__":
    guess_the_number()