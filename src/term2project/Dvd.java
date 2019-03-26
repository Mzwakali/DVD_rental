/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term2project;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @authors
 * AJ_Wiese_21049612
 * TT_Mzwakali_216194350
 * 
 */
public class Dvd 
{
    private String title;
    private String category;
    private boolean newRelease;
    private double price;
    private boolean avail;
    
    public Dvd()
    {
    }
    
    public Dvd(String title, int category, boolean newRelease, boolean avail)
    {
        setTitle(title);
        setCategory(category);
        setNewRelease(newRelease);
        setAvailableForRent(avail);
        
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    

    public int setCategory(int cat) {
        //int num = 0;
        switch(cat)
        {
            case 0:
                category= "Horror";
                //num =  1;
                break;
            case 1:
                category = "Sci-Fi";
                //num = 2;
                break;
            case 2:
                category = "Drama";
                //num = 3;
                break;
            case 3:
                category = "Romance";
                //num = 4;
                break;
            case 4:
                category = "Comedy";
                //num = 5;
                break;
            case 5:
                category = "Action";
                //num = 6;
                break;
            case 6:
                category = "Cartoons";
                //num = 7;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Please Select Category");
        }
        return cat;
        //this.category = category;
    }
    
    public String getCategory() {
        return category;
    }
    
    private void setPrice() 
    {
        
        if(newRelease==true)
        {
            price=15.0;
        }
        else
        {
            price=10.0;
        }
        
    }

    public boolean isNewRelease() {
        return newRelease;
    }

    public void setNewRelease(boolean newRelease) {
        this.newRelease = newRelease;
        this.setPrice();
    }

        public void setAvailableForRent(boolean avail) {
        this.avail = avail;
    }

    public boolean isAvailable() {
        return avail;
    }

    
    
    public String toString()
    {
        return " Title:\t\t" +title+ "\n  Category: \t\t" +category+ "\n  Recently Release? :\t" +newRelease+ "\n  DVD Price: \t\tR" +price+ "\n  Available for Rental? :\t" +avail+"\n\n";
    }
    
}
