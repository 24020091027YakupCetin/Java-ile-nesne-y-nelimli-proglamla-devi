
package Rectangle;


public class Rectangle {
  double with=1;
  double heigh=1;
  
  public Rectangle(){}
  
  
    public Rectangle(double with,double heigh){
        this.with=with;
        this.heigh=heigh;
    }
    
   public double getArea(){
     return this.with*this.heigh;
       
   }
   
   public double getPerimeter(){
      return  2 * (this.with) + 2 *(this.heigh);
       
       
   }
       

    

}