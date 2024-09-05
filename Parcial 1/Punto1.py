import re
import sys

# Tokens
TOKENS = {
    r'^\+$': "SUMA",
    r'^\+\+$': "INCR",
    r'^-?[0-9]+$': "ENTERO",
    r'^-?[0-9]+\.[0-9]+$': "REAL"
}

def obtener_token(expr):
    for regex, token in TOKENS.items():
        if re.match(regex, expr):
            return token
    return "ERROR, EXPRESIÓN NO CONOCIDA"

# Función principal
def main():
    if len(sys.argv) != 2:
        print("Uso: python AFD.py <expresión>")
        sys.exit(1)
    
    expresion = sys.argv[1]
    token = obtener_token(expresion)
    print(token)

if __name__ == "__main__":
    main()
