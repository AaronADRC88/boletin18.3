package boletin18.pkg2;

import javax.swing.JOptionPane;

public class Alumnos {

    public static final int NOTAS = 5;
    int[] notas = new int[NOTAS];
    public static final int ALUMNOS=5;
    //String[] alumnos=new String[ALUMNOS];
    String[]alumnos={"aa","bb","cc","dd","ee"};
    public Alumnos() {
    }

    public void visualizar() {
        int i;
        int a=0, s=0;
        for (i = 0; i < NOTAS; i++) {
            double random = Math.random() * 10 + 1;
            int valor = (int) random;
            notas[i] = valor;
            if (notas[i] >= 5) {
                a++;
            } else {
                s++;

            }
            System.out.println(notas[i]+"\t"+alumnos[i]+"\n"+ s + "suspensos\n" + a + "aprobados");
        }

    }

    public void notaMedia() {
        int i, c = 0;
        int notaMedia;
        for (i = 0; i < NOTAS; i++) {
            c += notas[i];
        }
        notaMedia = c / NOTAS;
        System.out.println("nota media: "+notaMedia);
    }

    public void notaBiggest() {
        int biggestNot = 0;
        for (int i = 0; i < NOTAS; i++) {
            if (notas[i] > biggestNot) {
                biggestNot = notas[i];
            }
        }
        System.out.println("nota más alta: "+biggestNot);
    }
    public void aprobados(){
        for (int i =0;i<notas.length;i++)
            if(notas[i]>=5)
                System.out.println("aprobados\n"+alumnos[i]);
    }
  public void ordenaCrcente(){
        int i,j,aux;
        String aux2;
        for(i=0;i<notas.length-1;i++)
            for(j=i;j<notas.length;j++)
                if(notas[i]>notas[j]){
                    aux=notas[i];
                    notas[i]=notas[j];
                    notas[j]=aux;
        
                    aux2=alumnos[i];
                    alumnos[i]=alumnos[j];
                    alumnos[j]=aux2;
        }
        
    }
public void visOrd(){
    for(int i=0;i<notas.length;i++)
        System.out.println(alumnos[i]+"-->"+notas[i]);
}
 public void alumn(){
     String n= JOptionPane.showInputDialog("nome");
     //n=n.toUpperCase();
     for(int i=0;i<NOTAS;i++)
         if(n.equals(alumnos[i]))
             JOptionPane.showMessageDialog(null,"Alumno: "+n+" Nota: "+notas[i]);
 }
}
