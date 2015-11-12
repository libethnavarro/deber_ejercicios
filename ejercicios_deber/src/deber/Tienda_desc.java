package deber;
import java.util.Scanner;
public class Tienda_desc{
static Scanner valor= new Scanner(System.in);
static Scanner dato= new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1) En una tienda de descuento las personas que van a pagar el importe de su compra llegan a la caja y sacan una bolita de color,
	    que les dirá que descuento tendrán sobre el total de su compra. Determinar la cantidad que pagara cada cliente desde que la tienda abre hasta que cierra.
	    Se sabe que si el color de la bolita es roja el cliente obtendrá un 40% de descuento; si es amarilla un 25% y si es blanca no obtendrá descuento.*/
	
		int i,impu,opc = 0;
		double desc, total;
		System.out.println("*Bienevenido al sistema*");
		System.out.println("Desea ingresar al sistema SI | si");
		String r=dato.next();
		while ((r.equals ("SI")|r.equals("si"))){
		
		System.out.println("Ingrese el importe");
		impu=valor.nextInt();
		System.out.println("elija el color de la bolita");
		System.out.println("1.Rojo");
		System.out.println("2.Amarilla");
		System.out.println("3.Blanca");
		System.out.println("4.Salir");
		opc=valor.nextInt();
		switch(opc){
		case 1:
			desc=impu*0.4;
			total= impu-desc;
			System.out.println("El total a agar es:"+total);
			break;
		case 2:
			desc= impu*0.25;
			total= impu-desc;
			System.out.println("El total a agar es:"+total);
			break;
		case 3:
			desc=impu;
			System.out.println("El total a agar es:"+desc);
			break;
		case 4:
		default:System.out.println("\n\n Gracias");
		
		/*}
		i++;
		*/}
		if(opc>5){
			System.out.println("Opción inválida.");
		}
		  
		System.out.println("¿ Desea continuar Si/No?");
		 r=dato.next();
		 System.out.println("Gracias por preferirnos");
		
		}	
	
	}

}


