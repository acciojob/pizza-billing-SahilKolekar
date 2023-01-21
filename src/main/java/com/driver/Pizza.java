package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheese;
    private  int toppings;
    boolean isBillGenerated;
    boolean isExtraCheeseAdded;
    boolean isExtraToppingsAdded;
    boolean isPaperBagAdded; //takeAway

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isBillGenerated=false;
        this.isExtraCheeseAdded=false;
        this.isExtraToppingsAdded=false;
        this.isPaperBagAdded=false;
        this.bill="";
        if(isVeg){
            this.price=300;
            this.toppings=70;
        }
        else{   //nonveg
            this.price=400;
            this.toppings=120;
        }
        this.cheese=80;
        this.bill="Base Price Of The Pizza: "+this.price+"\n"; //to convert to string
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheeseAdded){
            this.price=this.price+cheese;
            isExtraCheeseAdded=true;
        }

    }

    public void addExtraToppings(){
        if(!isExtraToppingsAdded){
            this.price=this.price+toppings;
            isExtraToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isPaperBagAdded){
            this.price=this.price+20;  //bag price
        }
        isPaperBagAdded=true;
    }

    public String getBill(){
        if(!isBillGenerated){
            if(isExtraCheeseAdded)
                this.bill+="Extra Cheese Added: "+this.cheese+"\n";
            if(isExtraToppingsAdded)
                this.bill+="Extra Toppings Added: "+this.toppings+"\n";
            if(isPaperBagAdded)
                this.bill+="Paperbag Added: "+"20"+"\n";
            this.bill+="Total Price: "+this.price+"\n";
            isBillGenerated=true;
        }
        return this.bill;
    }
}
