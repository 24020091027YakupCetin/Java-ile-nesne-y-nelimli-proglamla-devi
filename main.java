
package zaman;

import java.util.GregorianCalendar;


public class main {
    
     public static void main(String[] args) {
         
      GregorianCalendar tarih = new GregorianCalendar();  
       
     tarih.get(GregorianCalendar.YEAR);
     tarih.get((GregorianCalendar.MONTH) + 1);
     tarih.get(GregorianCalendar.DAY_OF_MONTH);
     
     tarih.setTimeInMillis(1234567898765L);
     
     System.out.print("tarih:" + tarih.get(GregorianCalendar.DAY_OF_MONTH) + ".");
     System.out.print( + tarih.get((GregorianCalendar.MONTH)+ 1) + ".");
     System.out.print( + tarih.get(GregorianCalendar.YEAR)+".");
     
     tarih.set(2026, 9, 29);
     
     System.out.print("yeni tarih:" + tarih.get(GregorianCalendar.DAY_OF_MONTH) + ".");
     System.out.print( + tarih.get((GregorianCalendar.MONTH)+ 1) + ".");
     System.out.print( + tarih.get(GregorianCalendar.YEAR)+".");
     
    tarih.set(GregorianCalendar.YEAR, 2030);        
    tarih.set(GregorianCalendar.MONTH, 5);           
    tarih.set(GregorianCalendar.DAY_OF_MONTH, 15);
       
      
     
         
     }
         
        
    }

