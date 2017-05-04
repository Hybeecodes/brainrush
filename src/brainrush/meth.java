/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Obikoya Emmanuel
 */
public class meth {
    public void sort(int x[]){
        //first stage
        if(x[1]<x[0]){
            int temp = x[0];
            x[0]=x[1];
            x[1]=temp;
        }
        //2nd stage
        if(x[2]<x[1]){
            int temp = x[1];
            x[1]=x[2];
            x[2]=temp;
             if(x[1]<x[0]){
            temp = x[0];
            x[0]=x[1];
            x[1]=temp;
        }
    }
    for(int i:x){
        System.out.println(i);
    } 
}
}
