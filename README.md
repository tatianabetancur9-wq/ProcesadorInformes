# Procesador de informes — patrón Abstract Factory

Actividad «Patrones de creación» de la asignatura Reutilización de Software (UNIR).
Autora: Tatiana Betancur Restrepo.

El sistema procesa informes cuyo nombre sigue el formato `CAT_TIPO_nombre.txt`
(por ejemplo, `ENT_FAC_001.txt`). Cada categoría (ENTRADA, SALIDA, MIXTA) es una
**fábrica concreta** que crea su propia familia de informes (FACTURA, COMPRA y,
en ENTRADA, PEDIDO). El cliente (`ProcesadorInformes`) solo conoce las interfaces
`FabricaInformes` e `Informe`.

## Estructura

| Carpeta | Contenido |
|---|---|
| `v1-base/` | Ejercicio 2: categorías ENTRADA y SALIDA, tipos FACTURA y COMPRA. |
| `v2-mixta/` | Ejercicio 3a: se añade la categoría MIXTA (`FabricaMixta`, `FacturaMixta`, `CompraMixta`). |
| `v3-pedido/` | Ejercicio 3b: se añade el tipo PEDIDO, solo en ENTRADA (`InformePedido`, `PedidoEntrada`). |
| `uml/` | Diagramas de clases de cada versión (`uml_v1.png`, `uml_v2.png`, `uml_v3.png`). |
| `ProcesadorInformes_Colab.ipynb` | Cuaderno para compilar y ejecutar las tres versiones en Google Colab. |

Cada versión es un proyecto completo e independiente, de modo que se pueden
comparar con un `diff` los cambios que exigió cada evolución.

## Requisitos

- JDK 8 o superior (`javac` y `java` en el PATH).

## Compilar y ejecutar

Desde la carpeta de la versión que se quiera probar (ejemplo con `v3-pedido`):

```bash
cd v3-pedido
javac -encoding UTF-8 -d out src/informes/*.java
java -cp out informes.Main
```

En Windows (PowerShell o CMD) los comandos son los mismos; si `src/informes/*.java`
no se expande, usar `javac -encoding UTF-8 -d out src\informes\*.java`.

### Otras formas de ejecutar `Main`

- Sin argumentos: usa la lista de ejemplo definida en `Main`.
- Con nombres de archivo: `java -cp out informes.Main ENT_FAC_001.txt MIX_COM_002.txt`
- Con una carpeta: `java -cp out informes.Main ruta/a/carpeta` procesa todos los `.txt` que contenga.

Los nombres que no siguen el formato, con una categoría o tipo desconocidos, o con
un tipo que la categoría no admite (por ejemplo `SAL_PED_001.txt`), se informan
como `[OMITIDO]` y no detienen el proceso.

## Ejecución en Google Colab

El cuaderno `ProcesadorInformes_Colab.ipynb` es autocontenido: incluye el código
de las tres versiones en celdas `%%writefile`, por lo que no hay que subir archivos.

1. Abrirlo en Colab (Archivo → Subir cuaderno, o Archivo → Abrir cuaderno → GitHub).
2. Entorno de ejecución → Ejecutar todas.
3. El cuaderno verifica el JDK, escribe los fuentes, compila y ejecuta cada versión
   y muestra con `diff` los cambios de cada evolución.
