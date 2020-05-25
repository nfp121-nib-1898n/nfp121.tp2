package question2;


/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entr�e de cette application, 
      * dont le commentaire est � compl�ter
      *
      *  @param args ...
      */
     public static void main(String[] args){
      for(int i=0;i<args.length;i++){
         try{
         int fahrenheit = 0;
         float celsius = 0;
       
          fahrenheit=Integer.parseInt(args[i]);
          celsius=fahrenheitEnCelsius(Integer.parseInt(args[i]));
          System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); 
            }
       catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
       }
      }
     }
     
     /** 
      * la m�thode � compl�ter. 
      *   @param f la valeur en degr� Fahrenheit
      *   @return  la conversion en degr� Celsius
      */
     public static float fahrenheitEnCelsius( int f){
        float cel;
       	cel =(float)5/9*(f-32);
	float result;
	result=(int)(cel*10)/10.0f;
	return result;
     }

}