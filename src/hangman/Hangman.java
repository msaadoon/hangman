/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.util.Scanner;

/**
 *
 * @author mahaalsaadoon
 */
public class Hangman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        char [] w={'C','O','D','I','N','G',' ','M','A', 'R','A','T','H','O','N'};
        char [] s={'_','_','_','_','_','_',' ','_','_','_','_','_','_','_','_',};
        char [] r=new char [6];
        int c=0;
        int end=0;
        while(c<6 && end==0){
            for(int i=0; i<s.length;i++){
                System.out.print(" "+s[i]);
            }
            System.out.println("");
            System.out.println("enter a letter: ");
            String n=k.next();
            n=n.toUpperCase();
            int q=0;
            for(int i=0; i<s.length;i++){
                if(n.charAt(0)==w[i]){
                    s[i]=w[i];
                    q=1;
                }
            }
            if(q==0){
                r[c]=n.charAt(0);
                c++;
                System.out.println("wrong char: #"+c +" ");
                for(int i=0; i<c; i++){
                    System.out.print(r[i]);
                }
                System.out.println("");
            }
            for(int i=0; i<s.length;i++){
                if(s[i]!=w[i]){
                    break;
                }if(i==s.length-1){
                    end=1;
                }
                
            }
        }
        
        if(end==1){
            System.out.println("congrats! its codign marathon 2015");
        }else{
            System.out.println("sorry, no more chances...try again");
        }
    }
    
}
