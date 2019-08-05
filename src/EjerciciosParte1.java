import java.util.Scanner;

public class EjerciciosParte1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Generamos todas las variables necesarias en el MAIN
		
		Scanner teclado = new Scanner(System.in);
		
		int ejercicio=0;
		
		do {
		System.out.println("Introduzca el número de ejercicio que desea ejecutar [1-29]: ");
		ejercicio=teclado.nextInt();
		teclado.nextLine();
		}while(ejercicio<1 || ejercicio>29);
		
		System.out.println();
		
		switch(ejercicio)
		{
			case 1:
			{
				float base=0;
				float altura=0;
				float area=0;
				
				System.out.println("-----EJERCICIO 1------CALCULAR EL ÁREA DE UN TRIÁNGULO-----");
				
				System.out.println("Introduzca la longitud de la base del triángulo [sólo números]: ");
				base=teclado.nextFloat();
				teclado.nextLine();
				
				System.out.println("Introduzca la altura del triángulo [sólo números]: ");
				altura=teclado.nextFloat();
				teclado.nextLine();
				
				System.out.println("--CALCULAMOS EL ÁREA DEL TRIÁNGULO--");
				area=(base*altura)/2;
				System.out.println("\nEl área del triángulo introducido es: " + area + "\n\n");
				break;
			}
			case 2:
			{
				double nota1=0;
				double nota2=0;
				double nota3=0;
				double media=0;
				
				System.out.println("-----EJERCICIO 2------CALCULAR NOTA MEDIA DE 3 EXÁMENES------");
				
				System.out.println("Introduzca la nota del primer exámen: ");
				nota1=teclado.nextDouble();
				teclado.nextLine();
				
				System.out.println("Introduzca la nota del segundo exámen: ");
				nota2=teclado.nextDouble();
				teclado.nextLine();
				
				System.out.println("Introduzca la nota del tercer exámen: ");
				nota3=teclado.nextDouble();
				teclado.nextLine();
				
				System.out.println("--CALCULAMOS LA NOTA MEDIA DE LOS TRES EXÁMENES--");
				media=(nota1+nota2+nota3)/3;
				System.out.println("\nLa nota media de las notas " + nota1 + ", " + nota2 + " y " + nota3 + " es: | " + media + " |\n\n");
				break;
			}
			case 3:
			{
				double euros=0;
				double dolares=0;
				double conversion=1.1222;
				
				System.out.println("-----EJERCICIO 3-----CONVERSOR EUROS - DOLARES-----");
				
				System.out.println("Introduzca los euros a convertir a dólares: ");
				euros=teclado.nextDouble();
				teclado.nextLine();
				
				System.out.println("--REALIZAMOS LA CONVERSIÓN A DÓLARES--");
				dolares=euros*conversion;
				System.out.println("\nLa conversión de " + euros + " € en dólares da " + dolares + " dólares [$].");
				break;
			}
			case 4:
			{
				double euros=0;
				double dolares=0;
				double libras=0;
				int opcion=0;
				double conversionDolares=1.1222;
				double conversionLibras=0.861845;
				
				System.out.println("-----EJERCICIO 4-----CONVERSOR EUROS - DOLARES - LIBRAS-----");
				
				do {
				System.out.println("Introduzca una opción: ");
				System.out.println("1.Convertir a dólares.--" + "\n2.Convertir a libras.--" + "\nOpción: ");
				opcion=teclado.nextInt();
				teclado.nextLine();
				}while(opcion!=1 && opcion!=2);
				
				System.out.println("\nIntroduzca una cantidad a convertir [en euros]: ");
				euros=teclado.nextDouble();
				teclado.nextLine();
				
				if(opcion==1) {
					System.out.println("--REALIZAMOS LA CONVERSIÓN A DÓLARES--");
					dolares=euros*conversionDolares;
					System.out.println("\nLa conversión de " + euros + " € en dólares da " + dolares + " dólares [$].");
				}
				else {
					System.out.println("--REALIZAMOS LA CONVERSIÓN A LIBRAS--");
					libras=euros*conversionLibras;
					System.out.println("\nLa conversión de " + euros + " € en libras da " + libras + " libras [£].");
				}
				break;
			}
			case 5:
			{
				double radio=0;
				double pi=3.14159265359;
				double area=0;
				
				System.out.println("-----EJERCICIO 5------CALCULAR EL ÁREA DE UN CÍRCULO-----");
				
				System.out.println("Introduzca el radio del círculo [sólo números]: ");
				radio=teclado.nextDouble();
				teclado.nextLine();
				
				System.out.println("--CALCULAMOS EL ÁREA DEL CÍRCULO--");
				area=(pi*Math.pow(radio,2));
				System.out.println("\nEl área del círculo introducido es: " + area + "\n\n");
				break;
			}
			case 6:
			{
				int a=0;
				int b=0;
				int c=0;
				double x=0;
				String signo1="+";
				String signo2="+";
				double resultado1=0;
				double resultado2=0;
				
				System.out.println("-----EJERCICIO 6-----CALCULAR LA ECUACIÓN DE SEGUNDO GRADO-----");
				System.out.println("\nLas ecuaciones de sengundo grado tienen este formato: [ax^2 +(-) bx +(-) c]");
				
				System.out.print("\nIntroduzca el primer valor perteneciente a [Ax^2]: ");
				a=teclado.nextInt();
				teclado.nextLine();

				System.out.print("\nIntroduzca el segundo valor perteneciente a [bx]: " );
				b=teclado.nextInt();
				teclado.nextLine();

				System.out.print("\nIntroduzca el tercer valor perteneciente a [c]: ");
				c=teclado.nextInt();
				teclado.nextLine();
				
				System.out.println("\n--CALCULAMOS LA ECUACIÓN DE SEGUNDO GRADO--");
				
				if(b*b<4*a*c)
				{
					System.out.println("Solución con números complejos");
				}
				else {
					if(a!=0 && b*b>4*a*c)
					{
						resultado1=(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
						resultado2=(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);	
						System.out.println("\nLos resultados de x son: ");
						System.out.println("x1=" + resultado1 + "\nx2=" + resultado2);
					}
					else {
						System.out.println("Esta ecuación no es de segundo grado.");
					}
				}
				break;
			}
			case 7:
			{
				float celsius=0;
				float fahrenheit=0;
				
				System.out.println("-----EJERCICIO 7------CONVERTIDOR DE GRADOS CELSIUS A FAHRENHEIT-----");
				
				System.out.println("Introduzca los grados celsius que desea convertir: ");
				celsius=teclado.nextFloat();
				teclado.nextLine();
		
				System.out.println("--CONVERTIMOS LOS GRADOS DE CELSIUS A FAHRENHEIT--");
				fahrenheit=(9*celsius/5)+32;
				System.out.println("\nLos " + celsius + " grados celsius convertidos en escala Fahrenheit son: " + fahrenheit + "\n\n");
				break;
			}
			case 8:
			{
				float nota=0;
				
				System.out.println("-----EJERCICIO 8------CALIFICACIÓN DEL EXÁMEN-----");
				
				System.out.println("Introduzca la nota del exámen para comprobar si el alumno está aprobado: ");
				nota=teclado.nextFloat();
				teclado.nextLine();
				
				System.out.println("--COMPROBAMOS LA CALIFICACIÓN DEL ALUMNO--");
				
				if(nota>=0 && nota<5)
				{
					System.out.println("\nEl alumno ha obtenido una calificación de SUSPENSO.");
				}
				else {
					if(nota>=5 && nota<7)
					{
						System.out.println("\nEl alumno ha obtenido una calificación de APROBADO.");
					}
					else {
						if(nota>=7 && nota<9)
						{
							System.out.println("\nEl alumno ha obtenido una calificación de NOTABLE.");
						}
						else {
								if(nota>=9 && nota<=10)
									System.out.println("\nEl alumno ha obtenido una calificación de SOBRESALIENTE.");
								else
									System.out.println("\nLa nota introducida no es correcta.");
						}
					}
				}
				break;
			}
			case 9:
			{
				int viento=0;
				
				System.out.println("-----EJERCICIO 9------CATEGORÍA DE HURACÁN-----");
				
				System.out.println("Introduzca la velocidad del viento en Km/h: ");
				viento=teclado.nextInt();
				teclado.nextLine();
				
				System.out.println("--COMPROBAMOS LA CATEGORÍA DEL HURACÁN--");
				
				if(viento<=80)
				{
					System.out.println("\nEl huracán tiene una categoría de nivel 2.");
				}
				else {
					if(viento>80 && viento<110)
					{
						System.out.println("\nEl huracán tiene una categoría de nivel 3.");
					}
					else {
						if(viento>=110 && viento<150)
						{
							System.out.println("\nEl huracán tiene una categoría de nivel 4.");
						}
						else {
							System.out.println("\nEl huracán tiene una categoría de nivel 5.");
						}
					}
				}
				break;
			}
			case 10:
			{
				System.out.println("-----EJERCICIO 10------CORREGIR EJERCÍCIO-----");
				System.out.println("\nEl ejercicio a corregier es el siguiente: \n");
				System.out.println("int n1,n2\niguales bool;\n2 = n1;\n3 = n3;\nif(n1 = n2);\n    iguales = true;\nelse (n1!=n2)\n    iguales = false;");
				System.out.println("\n\nEl ejercicio corregido queda de la siguiente manera: \n");
				System.out.println("int n1,n2;\nboolean iguales;\nn1=2;\nn2=3;\nif(n1==n2)\n    iguales=true;\nelse\n    iguales==false;");
				int n1, n2;
				boolean iguales;
				n1=2;
				n2=3;
				if(n1==n2)
					iguales=true;
				else
					iguales=false;
				
				break;
			}
			case 11:
			{
				float nota=0;
				
				System.out.println("-----EJERCICIO 11------CALIFICACIÓN DEL EXÁMEN (MODIFICADO)-----");
				
				System.out.println("Introduzca la nota del exámen para comprobar si el alumno está aprobado: ");
				nota=teclado.nextFloat();
				teclado.nextLine();
				
				System.out.println("--COMPROBAMOS LA CALIFICACIÓN DEL ALUMNO--");
				
				if(nota>=0 && nota<5)
				{
					System.out.println("\nEl alumno ha obtenido una calificación de SUSPENSO.");
				}
				else {
					if(nota>=5 && nota<7)
					{
						System.out.println("\nEl alumno ha obtenido una calificación de APROBADO.");
					}
					else {
						if(nota>=7 && nota<9)
						{
							System.out.println("\nEl alumno ha obtenido una calificación de NOTABLE.");
						}
						else {
								if(nota>=9 && nota<=10)
									System.out.println("\nEl alumno ha obtenido una calificación de SOBRESALIENTE.");
								else
									System.out.println("\nLa nota no es válida si está fuera del rango 0-10.");
						}
					}
				}
				break;
			}
			case 12:
			{
				int num1=0;
				int num2=0;
				int num3=0;
				int num4=0;
				int num5=0;
				int pares=0;
				int impares=0;
				
				System.out.println("-----EJERCICIO 12------NÚMEROS PARES E IMPARES-----");
				
				System.out.print("\nIntroduzca el primer número: ");
				num1=teclado.nextInt();
				teclado.nextLine();
				if(num1%2==0)
					pares++;
				else
					impares++;
				
				System.out.print("\nIntroduzca el segundo número: ");
				num2=teclado.nextInt();
				teclado.nextLine();
				if(num2%2==0)
					pares++;
				else
					impares++;
				
				System.out.print("\nIntroduzca el tercer número: ");
				num3=teclado.nextInt();
				teclado.nextLine();
				if(num3%2==0)
					pares++;
				else
					impares++;
				
				System.out.print("\nIntroduzca el cuarto número: ");
				num4=teclado.nextInt();
				teclado.nextLine();
				if(num4%2==0)
					pares++;
				else
					impares++;
				
				System.out.print("\nIntroduzca el quinto número: ");
				num5=teclado.nextInt();
				teclado.nextLine();
				if(num5%2==0)
					pares++;
				else
					impares++;
				
				System.out.println("\n--COMPROBAMOS CUANTOS SON PARES Y CUANTOS IMPARES--");
				
				System.out.println("\nEn total hay " + pares + " números pares y " + impares + " números impares.");
				
				System.out.print("\nLos números pares son: ");
				
				if(num1%2==0)
					System.out.print(num1 + ", ");
				if(num2%2==0)
					System.out.print(num2 + ", ");
				if(num3%2==0)
					System.out.print(num3 + ", ");
				if(num4%2==0)
					System.out.print(num4 + ", ");
				if(num5%2==0)
					System.out.print(num5);
				System.out.println(".");
				
				System.out.print("\nLos números impares son: ");
				
				if(num1%2!=0)
					System.out.print(num1 + ", ");
				if(num2%2!=0)
					System.out.print(num2 + ", ");
				if(num3%2!=0)
					System.out.print(num3 + ", ");
				if(num4%2!=0)
					System.out.print(num4 + ", ");
				if(num5%2!=0)
					System.out.print(num5);
				System.out.println(".");
				
				break;
			}
			case 13:
			{
				int numero=0;
				int mayor=0;
				int menor=0;
				float suma=0;
				float promedio=0;
				
				System.out.println("-----EJERCICIO 13------NÚMEROS MAYOR, MENOR Y PROMEDIO-----");
				
				for(int i=1; i<=3; i++)
				{
					System.out.print("Introduzca el número " + i + ": ");		
					numero=teclado.nextInt();
					teclado.nextLine();
					suma = suma + numero;
					
					if(i==1)
					{
						menor=numero;
						mayor=numero;
					}
					else{
						if(numero < menor)
							menor=numero;
						if(numero > mayor)
							mayor=numero;
					}
					
					promedio=suma/i;
				}
				System.out.println("\n--COMPROBAMOS LOS NÚMEROS MAYOR, MENOR Y PROMEDIO--");
				
				System.out.print("\nEl número mayor es: " + mayor);
				System.out.print("\nEl número menor es: " + menor);
				System.out.print("\nEl promedio de los números es: " + promedio);
			}
			case 14:
			{
				int numero=0;
				int pares=0;
				int impares=0;
				
				System.out.println("-----EJERCICIO 14------NÚMEROS PARES E IMPARES (MODIFICACIÓN)-----");
				
				for(int i=1; i<=10; i++)
				{
					System.out.print("\nIntroduzca el número " + i + " : ");
					numero=teclado.nextInt();
					teclado.nextLine();
					if(numero%2==0)
						pares++;
					else
						impares++;
				}
				
				System.out.println("\n--COMPROBAMOS CUANTOS SON PARES Y CUANTOS IMPARES--");
				
				System.out.println("\nEn total hay " + pares + " números pares y " + impares + " números impares.");
				
				break;
			}
			case 15:
			{
				int dni=0;
				int resul=0;
				String letra="";
				
				System.out.println("-----EJERCICIO 15------OBTENER LETRA DNI-----");
				
				System.out.print("\nIntroduzca el número de DNI: ");
				dni=teclado.nextInt();
				teclado.nextLine();
				
				resul=dni%23;
				System.out.println(dni + " " + resul);
				switch(resul)
				{
					case 0:
						letra="T";
						break;
					case 1:
						letra="R";
						break;
					case 2:
						letra="W";
						break;
					case 3:
						letra="A";
						break;
					case 4:
						letra="G";
						break;
					case 5:
						letra="M";
						break;
					case 6:
						letra="Y";
						break;
					case 7:
						letra="F";
						break;
					case 8:
						letra="P";
						break;
					case 9:
						letra="D";
						break;
					case 10:
						letra="X";
						break;
					case 11:
						letra="B";
						break;
					case 12:
						letra="N";
						break;
					case 13:
						letra="J";
						break;
					case 14:
						letra="Z";
						break;
					case 15:
						letra="S";
						break;
					case 16:
						letra="Q";
						break;
					case 17:
						letra="V";
						break;
					case 18:
						letra="H";
						break;
					case 19:
						letra="L";
						break;
					case 20:
						letra="C";
						break;
					case 21:
						letra="K";
						break;
					case 22:
						letra="E";
						break;
					case 23:
						letra="T";
						break;
					default:
						break;
				}
				System.out.println("\n--COMPROBAMOS LA LETRA DEL DNI--");
				System.out.println("\nLa letra del DNI " + dni + " es la [" + letra + "].");
				System.out.println("El DNI completo es: " + dni + letra);
				
				break;
			}
			case 16:
			{
				int numero=0;
				int cantidad=0;
				
				System.out.println("-----EJERCICIO 16------CANTIDAD DE NUMEROS INTRODUCIDOS-----\n");
				
				System.out.print("Introduzca el número " + (cantidad+1) + ": ");
				numero=teclado.nextInt();
				teclado.nextLine();
				
				while(numero>=0)
				{
					cantidad++;
					System.out.print("Introduzca el número " + (cantidad+1) + ": ");
					numero=teclado.nextInt();
					teclado.nextLine();
				}
				
				System.out.println("\n--COMPROBAMOS CUANTOS NUMEROS HA INTRODUCIDO--");
				System.out.println("\nSe han introducido " + cantidad + " números.");
				break;
			}
			case 17:
			{
				int numero=0;
				boolean par=true;
				
				System.out.println("-----EJERCICIO 17------NUMEROS INFERIORES PARES / IMPARES-----\n");
				
				System.out.println("Introduzca un número, si el número es par obtendremos los números impares de 0 hasta su número,");
				System.out.println("si el número es impar obtendremos todos los números pares de 0 hasta su número.\n");
				System.out.print("Introduzca el número: ");
				numero=teclado.nextInt();
				teclado.nextLine();
				
				System.out.println("\n--MOSTRAMOS LOS NÚMEROS INFERIORES--");
				
				if(numero%2!=0)
				{
					par=false;
					for(int i=1; i<numero; i++)
					{
						if(i%2==0)
							System.out.print(i + " ");
					}
				}
				else
					for(int i=1; i<numero; i++)
					{
						if(i%2!=0)
							System.out.print(i + " ");
					}
				
				break;
			}
			case 18:
			{
				int numero=0;
				boolean primo=true;
				
				System.out.println("-----EJERCICIO 18------NUMEROS PRIMOS-----\n");

				System.out.print("Introduzca el número: ");
				numero=teclado.nextInt();
				teclado.nextLine();
				
				for(int i=2; i<numero; i++)
				{
					if(numero%i==0)
						primo=false;
				}
				
				System.out.println("\n--MOSTRAMOS SI EL NUMERO ES PRIMO--\n");
				
				if(primo)
					System.out.println("Enhorabuena!, el numero " + numero + " es primo!!");
				else
					System.out.println("Lo sentimos, el numero " + numero + " NO es primo.");
				
				break;
			}
			case 19:
			{
				int numero=0;
				int factorial=1;
				
				System.out.println("-----EJERCICIO 19------FACTORIAL DE NUMEROS-----\n");

				System.out.print("Introduzca el número: ");
				numero=teclado.nextInt();
				teclado.nextLine();
				
				for(int i=numero; i>0; i--)
				{
					factorial=factorial*i;
				}
				
				System.out.println("\n--MOSTRAMOS EL FACTORIAL--\n");
				System.out.println("El factorial del número " + numero + " es: " + factorial);
				break;
			}
			case 20:
			{
				int numero=0, cifras=0;
				boolean fin=false;
				System.out.println("-----EJERCICIO 20------CIFRAS DE UN NUMERO-----\n");
				System.out.print("\nIntroduce un número para calcular el número de cifras que tiene: ");
				numero=teclado.nextInt();
				teclado.nextLine();
				
				while(!fin)
				{
					if(numero>0)
					{
						numero=numero/10;
						cifras++;
					}
					else
						fin=true;
				}
				System.out.println("\nEl número tiene " + cifras + " cifras.");
				break;
			}
			case 21:
			{
				long numero=0, reves=0;
				boolean fin=false;
				
				System.out.println("-----EJERCICIO 21------NUMERO AL REVÉS-----\n");
				System.out.print("\nIntroduce un número para ponerlo al revés: ");
				numero=teclado.nextLong();
				teclado.nextLine();
				
				while(!fin)
				{
					if(numero>0)
					{
						reves=(reves+(numero%10))*10;
						numero=numero/10;
					}
					else
					{
						reves=reves/10;
						fin=true;
					}
				}
				System.out.println("\nEl número introducido escrito al revés es: " + reves);
				break;
			}
			case 22:
			{
				int cifras=0;
				int numero=0, reves=0, dividendo=0;
				boolean fin=false, finreves=false;
				System.out.println("-----EJERCICIO 22------NÚMERO CAPICÚA 4 DÍGITOS-----\n");
				
				System.out.print("\nIntroduce un número para comprobar si es capicúa ");
				numero=teclado.nextInt();
				teclado.nextLine();
				
				dividendo=numero;
				while(!fin)
				{
					if(dividendo>0)
					{
						dividendo=dividendo/10;
						cifras++;
					}
					else
					{
						fin=true;
					}
				}
				
				if(cifras==4)
				{
					dividendo=numero;
					while(!finreves)
					{
						if(dividendo>0)
						{
							reves=(reves+(dividendo%10))*10;
							dividendo=dividendo/10;
						}
						else
						{
							reves=reves/10;
							finreves=true;
						}
					}
					if(reves==numero)
						System.out.println("El número es capicúa. El número introducido es [" + numero + "] y el invertido es [" + reves + "].");
					else
						System.out.println("El número -NO- es capicúa. El número introducido es [" + numero + "] y el invertido es [" + reves + "].");
				}
				else {
					System.out.println("Este número no tiene 4 dígitos. [" + numero + "]");
				}
					
				break;
			}
			case 23:
			{
				int numero=0, reves=0, dividendo=0;
				boolean finreves=false;
				System.out.println("-----EJERCICIO 23------NÚMEROS CAPICÚAS-----\n");
				
				System.out.print("\nIntroduce un número para comprobar si es capicúa: ");
				numero=teclado.nextInt();
				teclado.nextLine();

				dividendo=numero;
				while(!finreves)
				{
					if(dividendo>0)
					{
						reves=(reves+(dividendo%10))*10;
						dividendo=dividendo/10;
					}
					else
					{
						reves=reves/10;
						finreves=true;
					}
				}
				if(reves==numero)
					System.out.println("El número es capicúa. El número introducido es [" + numero + "] y el invertido es [" + reves + "].");
				else
					System.out.println("El número -NO- es capicúa. El número introducido es [" + numero + "] y el invertido es [" + reves + "].");
				break;
			}
			case 24:
			{
				int base=0;

				System.out.println("-----EJERCICIO 24------TABLAS DE MULTIPLICAR-----\n");
				
				System.out.print("\nIntroduce un número para obtener su tabla de multiplicar: ");
				base=teclado.nextInt();
				teclado.nextLine();
				
				System.out.println("Tabla de multiplicar del " + base);
				
				for(int i=0; i<11; i++)
				{
					System.out.println(base + " x " + i + " = " + base*i);
				}
				break;
			}
			case 25:
			{
	
				System.out.println("-----EJERCICIO 25------COMPROBAR SALIDA-----\n");
				int suma;
				for (int i=0;i<4;i++){
					for (int j=3;j>0;j--){
						suma=i*10+j;
						System.out.println(suma);
					}
				}
				break;
			}
			case 26:
			{
				int numero=0;
				
				System.out.println("-----EJERCICIO 26------PAREJAS DE VALORES-----\n");
				do {
				System.out.print("Introduce un número comprendido entre 1 y 9 [0 < N <= 9]: ");
				numero=teclado.nextInt();
				teclado.nextLine();
				if(numero<1 || numero>9)
					System.out.println("Error! Número introducido fuera del rango solicitado.");
				}while(numero<1 || numero >9);
				
				for(int i=1; i<=numero; i++)
				{
					for(int j=1; j<=numero; j++)
					{
						System.out.print("(" + i + ", " + j + ") ");
					}
					System.out.println();
				}
				break;
			}
			case 27:
			{
				int numero=0;
				System.out.println("-----EJERCICIO 27------DIBUJAR CUADRADO CON *-----\n");
				System.out.print("Introduce el lado del cuadrado: ");
				numero=teclado.nextInt();
				teclado.nextLine();
				
				for(int i=0; i<numero; i++)
				{
					for(int j=0; j<numero; j++)
					{
						System.out.print("* ");
					}
					System.out.println();
				}
				break;
			}
			case 28:
			{
				int filas=0, columnas=0;
				String simbolo=" ";
				System.out.println("-----EJERCICIO 28------DIBUJAR FIGURA CON CARACTERES-----\n");
				System.out.print("Introduce las filas: ");
				filas=teclado.nextInt();
				teclado.nextLine();
				System.out.print("Introduce las columnas: ");
				columnas=teclado.nextInt();
				teclado.nextLine();
				System.out.print("Introduce el caracter: ");
				simbolo=teclado.nextLine();
				
				for(int i=0; i<filas; i++)
				{
					for(int j=0; j<columnas; j++)
					{
						System.out.print(simbolo + " ");
					}
					System.out.println();
				}
				break;
			}
			case 29:
			{
				int numero=0;
				System.out.println("-----EJERCICIO 29------DIBUJAR FIGURA  DESCENDENTE-----\n");
				System.out.print("Introduce el lado del cuadrado: ");
				numero=teclado.nextInt();
				teclado.nextLine();
				
				for(int i=0; i<numero; i++)
				{
					for(int j=0; j<=i; j++)
					{
						System.out.print("* ");
					}
					System.out.println();
				}
				break;
			}
			default:
				break;
		}
		System.out.println("\n\n------FIN DEL PROGRAMA-------");
	}

}
