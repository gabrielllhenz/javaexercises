public class JavaApplication1 {
// Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metro e cresce 3 centímetros por ano. //
//Construa um programa  que calcule e imprima quantos anos serão necessários para que Zé seja maior que Chico.//
    public static void main(String[] args) {
        
     float C= (float) 1.5, Z= (float) 1.1;
     int cont=0;   
     
     while (1==1){
         if (C>=Z){
             C+=0.02;
             Z+=0.03;
             cont++;
         }else{
             break;
         }
         
     }
     
     System.out.printf("Para Zé passar Chico, vai precisar de %d anos", cont);
     
     
    }
    
}
