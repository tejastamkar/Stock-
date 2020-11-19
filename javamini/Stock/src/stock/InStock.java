/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock;

/**
 *
 * @author tejas
 */
class InStock {

    private String date, name, time;

    public InStock(String date, String name, String time) {
        this.date = date;
        this.name = name;
        this.time = time;
    }
    public String getdate(){
        return date;
        
    }
    public String getname(){
        return name;
        
    }
    public String gettime(){
        return time;
        
    }
}
