/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_felipelin;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author felipelinzhao
 */
public class Universo {

    private String nombre;
    private ArrayList<SeresVivos> lista = new ArrayList();
    private File archivo = null;

    public Universo() {
    }

    public Universo(String nombre, String path) {
        this.nombre = nombre;
        archivo = new File(path);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<SeresVivos> getLista() {
        return lista;
    }

    public void setLista(ArrayList<SeresVivos> lista) {
        this.lista = lista;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setSeresVivos(SeresVivos p) {
        this.lista.add(p);
    }

    @Override
    public String toString() {
        return "Universo{" + "nombre=" + nombre + ", lista=" + lista + ", archivo=" + archivo + '}';
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (SeresVivos t : lista) {
                bw.write(t.getNombre() + "|");
                bw.write(t.getPoder() + "|");
                bw.write(t.getYears() + "|");
                bw.write(t.getPlaneta() + "|");
                bw.write(t.getRaza() + "|");

            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        lista = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    lista.add(new SeresVivos(sc.next(), sc.nextInt(), sc.next(), sc.next(), sc.next()));

                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }

}
