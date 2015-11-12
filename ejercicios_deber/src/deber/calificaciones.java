package deber;
import java.util.Scanner;
public class calificaciones {
	static Scanner valor= new Scanner(System.in);
	static Scanner dato= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2.	Leer 50 calificaciones de un grupo de alumnos. Calcule y escriba el porcentaje de reprobados.
		Tomando en cuenta que la calificación mínima aprobatoria es de 70.*/
		int cal=0,re = 0;
	   double porc;
	    for(int i=0;i<=3;i++){
	    System.out.println("ingrese las calificaciones");
	    cal=valor.nextInt();
	    if (cal<70);
	    re= re+1;
	    }
	    porc = (re*100)/50;
	    System.out.println("El porcentaje de reporvado es:"+porc);

	}

}

