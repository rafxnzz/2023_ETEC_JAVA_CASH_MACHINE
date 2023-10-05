import javax.swing.JOptionPane;

public class AvaliacaoJava 
{
    public static void main(String[] args) 
    {
        double saldo, saque, deposito, emprestimo, imposto, contaimp;
        int senha, acesso, finalizar, menu;
        saldo = 10000;
        imposto = 0.05;
        acesso = 0;
        finalizar = 0;
        
        acesso = Integer.parseInt(JOptionPane.showInputDialog("DESEJA TER ACESSO A SUA CONTA?"+"\n"+"SIM = 1"+"\n"+"NÃO = 0"));
        
        while (acesso == 1){
            
            senha = Integer.parseInt(JOptionPane.showInputDialog("DIGITE A SUA SENHA:"));
            if(senha == 12345) {
                JOptionPane.showMessageDialog(null, "ACESSO CONCEDIDO");
                
                finalizar = 0;
                
                while (finalizar == 0){
                    menu = Integer.parseInt(JOptionPane.showInputDialog("MENU:"+"\n"+"1. SALDO"+"\n"+"2. SAQUE"+"\n"+"3. DEPOSITO"+"\n"+"4. EMPRÉSTIMO"+"\n"+"5. FINALIZAR:"));
                    if (menu == 1){
                        JOptionPane.showMessageDialog(null, "SALDO ATUAL: R$"+saldo);
                    }
                    else if (menu == 2){
                        saque = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR A SER SACADO:"+"\n"+"SALDO ATUAL: R$"+saldo));
                        
                        if((saque<=saldo) && (saque>0)) {
                              saldo = saldo - saque;
                              JOptionPane.showMessageDialog(null, "SAQUE EFETUADO COM SUCESSO \nNOVO SALDO: R$"+saldo);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "erro:404:"+"\n"+"SALDO: R$"+saldo);
                        }
                    }
                    else if (menu == 3){
                        deposito = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR DO DEPÓSITO:"+"\n"+"SALDO ATUAL: R$"+saldo));
                        if(deposito>0) {
                              saldo = saldo + deposito;
                              JOptionPane.showMessageDialog(null, "DEPOSITO REALIZADO COM SUCESSO \nNOVO SALDO: R$"+saldo);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "erro:404:"+"\n"+"VALOR INVALIDO");
                        }
                        
                    }
                    else if (menu == 4){
                        emprestimo = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O VALOR DO EMPRÉSTIMO:"+"\n"+"SALDO ATUAL: R$"+saldo));
                        if(emprestimo > 0) {
                              contaimp = emprestimo*imposto;
                              emprestimo = emprestimo - contaimp;
                              saldo = saldo + emprestimo;
                              
                              JOptionPane.showMessageDialog(null, "EMPRESTIMO REALIZADO COM SUCESSO \nNOVO SALDO: R$"+saldo);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "erro:404:"+"\n"+"VALOR INVALIDO");
                        }
                        
                    }
                    else if (menu == 5){
                        finalizar = Integer.parseInt(JOptionPane.showInputDialog("DESEJA REALMENTE SAIR?"+"\n"+"SIM = 1"+"\n"+"NÃO = 0"));
                        acesso = 0;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA");
                    }
                 }
            }
            else {
                JOptionPane.showMessageDialog(null, "SENHA INVALIDA");
            } 
        }
         
    }
}
