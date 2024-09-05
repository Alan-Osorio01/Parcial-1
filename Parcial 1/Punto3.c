#include <stdio.h>
#include <string.h>

int contar_coincidencias(FILE *file, const char *clave) {
    char palabra[100];
    int count = 0;
    while (fscanf(file, "%s", palabra) != EOF) {
        if (strcmp(palabra, clave) == 0) {
            count++;
        }
    }
    return count;
}

int main(int argc, char *argv[]) {
    if (argc != 3) {
        printf("Uso: %s <archivo> <clave>\n", argv[0]);
        return 1;
    }

    FILE *file = fopen(argv[1], "r");
    if (!file) {
        printf("Error al abrir el archivo\n");
        return 1;
    }

    int count = contar_coincidencias(file, argv[2]);
    fclose(file);

    printf("%s se repite %d veces en el archivo.\n", argv[2], count);
    return 0;
}
