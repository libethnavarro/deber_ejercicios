package deber;
import java.util.Scanner;
public class promedio {
	static Scanner valor= new Scanner(System.in);
	static Scanner dato= new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	Obtener el promedio de calificaciones de un grupo de n alumnos.*/
 promedio();
	}
 public static void promedio(){
	 String[]n_alumnos= new String[7];
	 float nota= 0, sum_n=0;
	 float[] prom= new float[7];
	 int num_alumno;
	
	 System.out.println("Ingrese la cantidad de alumnos");
     num_alumno=valor.nextInt();
      for(int i=0;i<num_alumno;i++){
     System.out.println("Ingrese el nombre del alumno["+(i+1)+"]");
     n_alumnos[i]=dato.next();
      }
      for(int i=0;i<num_alumno;i++){
    	  System.out.println("Ingrese el nota del alumno"+ n_alumnos[i]+".");
    	  sum_n=valor.nextFloat();
     for(int j=0;j<3;j++){
    	 System.out.println("Ingrese nota ["+(j+1)+"]");
    	 nota=valor.nextFloat();
    	 sum_n=sum_n+nota;
     }
     prom[i]= sum_n/3;
      }
      for(int i=0;i<num_alumno;i++){
    	  System.out.println("el promedio es ["+n_alumnos[i]+"]:"+ prom[i]);
    	  
     }
	 
	}

}