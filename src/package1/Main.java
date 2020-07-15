package package1;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena = "      1  2          3         14        5  y  u      6   7              ";
        StringTokenizer tokens=new StringTokenizer(cadena);
        int i=0;
        int letra=0;
        int suma=0;
        String datos[] =new String[100];
        while(tokens.hasMoreTokens()){
            String str=tokens.nextToken();
            datos[i]=str;
           try {
                letra=Integer.parseInt(datos[i]);
                suma=suma + letra;
            } catch(NumberFormatException ex) {
                System.out.println(datos[i] +  " - No es numero");
            }i++;
            
        }
        System.out.println("la suma de los numeros es:" +suma);
	}
}