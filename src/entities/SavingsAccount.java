/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Dell
 */
public class SavingsAccount extends Account {
    
    
    
    
    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Double interRate, Integer number, String holder, Double balance) {
        super(number, holder, balance);
        this.interRate = interRate;
    }
    
private Double interRate;
 
    
   public void updateBalance(){
       balance += balance;
   }
   
   @Override
    public void withdraw(Double amount) {
        balance -= amount;
    }
    
}
