package healers;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.ref.Cleaner;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class ShowMaker {


	public static void main(String[] args) throws IOException, InterruptedException {
     //****DETALHE IMPORTANTE: FEITO INTEGRALMENTE SEM AJUDA DE INTELIGÊNCIA ARTIFICIAL*****


		Login log;
		log=new Login();
		Healer h;
		h=new Healer();
		Fallen f;
		f=new Fallen();
		Guardian g;
		g = new Guardian();
		Presents psts;
		psts=new Presents();
		
		Scanner scaneia = new Scanner(System.in);
		
		psts.main(null);
		
		/*System.out.println("***************************");
		System.out.println("* BEM VINDO AO HEALERS!!! *");
		System.out.println("***************************");

		System.out.println("NÃO É CADASTRADO? VENHA FAZER PARTE DO PROJETO HEALERS!\n");
		System.out.println("O QUE DESEJA FAZER?\n");
		System.out.println("DIGITE 'L' PARA FAZER LOGIN OU 'C' PARA SE CADASTRAR OU 'S' PARA SAIR DO SISTEMA");
		String escolha= scaneia.next();
		
		//System.out.println(f.nome);
		
		if(escolha.equalsIgnoreCase("L")) {
			
			log.autentica();
        }
		if(escolha.equalsIgnoreCase("C")){
			System.out.println("Qual função deseja exercer?:");
			System.out.println("Digite 'H' para exercer a função Healer.");
			System.out.println("Digite 'F' para ser assistido como um Fallen.");
			System.out.println("Digite 'G' para exercer a função guardian.");
			String funcao=scaneia.next();
			
			if(funcao.equalsIgnoreCase("H")) {
				h.cadastroHealer();

				if(h.cadastroHealer()) {
					
					h.MenuHealer();
				}
				//h.MenuHealer();
			}else if(funcao.equalsIgnoreCase("F")) {
				//f.cadastroFallen();
				
              if(f.cadastroFallen()) {
					
					f.MenuFallen();
				}
                // f.MenuFallen();  
			}else if(funcao.equalsIgnoreCase("G")) {
				g.cadastroGuardian();
                if(g.cadastroGuardian()) {
					
					g.MenuGuardian();
				}
                //g.MenuGuardian();
			}

		}else if(escolha.equalsIgnoreCase("S")) {
			System.out.println("VOLTE SEMPRE!!");
			System.exit(0);
		}

		else {
			System.out.println("Escolha uma opção válida!");
		}

	}*/

}



	}



















