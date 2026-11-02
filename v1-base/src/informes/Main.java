package informes;

import java.io.File;
import java.util.Arrays;

/**
 * Prueba del sistema. Sin argumentos usa la lista de ejemplo; con una ruta
 * de carpeta procesa los .txt que contiene; con varios argumentos los toma
 * como nombres de informe.
 */
public class Main {

    public static void main(String[] args) {
        String[] reports = {
            "ENT_FAC_001.txt", "ENT_COM_001.txt", "SAL_FAC_001.txt", "SAL_COM_001.txt",
            "XYZ_FAC_001.txt", "ENT_FAC.txt"
        };
        if (args.length == 1 && new File(args[0]).isDirectory()) {
            reports = new File(args[0]).list((carpeta, nombre) -> nombre.endsWith(".txt"));
            Arrays.sort(reports);
        } else if (args.length > 0) {
            reports = args;
        }
        new ProcesadorInformes().procesarInformes(reports);
    }
}
