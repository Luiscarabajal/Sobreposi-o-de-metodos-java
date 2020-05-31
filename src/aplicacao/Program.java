/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

/**
 *
 * @author Dell
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Account acc1 = new Account(1001, "Luis Pires", 600.00);
        acc1.withdraw(200.00);
        System.out.println("Saldo Conta acc1 " + acc1.getBalance());

        //comprovando que após sobre escrever o metodo não tenho mais o desconto de 5 sobre o saque
       SavingsAccount acc2 = new SavingsAccount(0.01,1002,"Maria",1000.0);
       acc2.withdraw(200.0);
        System.out.println("Saving tem o balanço "+acc2.getBalance());
        
        Account acc3 = new BusinessAccount(200.0, 1003, "Felipe", 1000.0);
        acc3.withdraw(100.0);
        System.out.println("BusinessAccount" +acc3.getBalance());
    }

}
