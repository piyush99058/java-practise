package PojoAndJavaBean;

import javax.sound.sampled.SourceDataLine;

public class pojo {
    int choclate_price;
    String choclate_name;
    pojo(int price,String name)
    {
        this.choclate_price = price; 
        this.choclate_name=name;
    }
    public void display(){
        System.out.println("Price->"+this.choclate_price+" "+"choclate-name->"+this.choclate_name);
    }
    
    public static void main(String[] args)
    {

        pojo p1 = new pojo(10, "Dairy milk");
        p1.display();

    }
}
