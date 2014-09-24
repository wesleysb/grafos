package net.unesc.model;

public class Grafo {

    private int vertices;
    private String nmVertices;
    private int arcos;
    private String nmArcos;
    private int matrizAdjacencia[][];
    private int matrizIncidencia[][];

    public Grafo() {
    }

    public int getVertices() {
        return vertices;
    }

    public void setVertices(int vertices) {
        this.vertices = vertices;
    }

    public int getArcos() {
        return arcos;
    }

    public void setArcos(int arcos) {
        this.arcos = arcos;
    }

    public int[][] getMatrizAdjacencia() {
        return matrizAdjacencia;
    }

    public void setMatrizAdjacencia(int[][] matrizAdjacencia) {
        this.matrizAdjacencia = matrizAdjacencia;
    }

    public int[][] getMatrizIncidencia() {
        return matrizIncidencia;
    }

    public void setMatrizIncidencia(int[][] matrizIncidencia) {
        this.matrizIncidencia = matrizIncidencia;
    }

    public String Laco() {
        String nos = "";

        for (int i = 0; i < (vertices - 1); i++) {
            if (matrizAdjacencia[i][i] > 0) {
                nos += nmVertices.charAt(i) + ", ";
            }
        }
        return nos;
    }

    public boolean ArestaParalela() {
//        String arcos = "";
//        
//        for (int j = 0; j < (vertices - 1); j++) {
//            for (int i = 0; i < (vertices - 1); i++) {
//                if (matrizAdjacencia[j][i] > 1) {
//                    arcos += arcos.charAt(i)
//                }
//            }
//        }
        //Mostar quais arestas são paralelas
        return true;
    }

    public boolean noIsolado() {
        //Mostrar quais vertices são isolados;
        return true;
    }

    public int ordemGrafo() {
        return vertices;
    }

    public boolean aciclico() {
        //Mostrar todos os ciclos;
        return true;
    }

    public boolean conexo() {
        return true;
    }

    public boolean verificaCaminho() {
        //Se possuir caminhos, informar o mais curto (Djkistra)
        return true;
    }

    public String grauVerticeDirecionado() {
        return "";
    }

    public String grauVerticeNaoDirecionado() {
        return "";
    }

    public String verticesAdjacentes() {
        return "";
    }
}
