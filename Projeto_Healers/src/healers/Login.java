package healers;

import java.io.IOException;
import java.util.Scanner;

public class Login {
	String emailUser;
	String senha;
	String ator;

	public String getEmailUser() {
		return emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String sesnha) {
		this.senha = senha;
	}

	public boolean autentica() throws IOException, InterruptedException { 
		Scanner scaneia = new Scanner(System.in);
		ShowMaker maker;
 	    maker=new ShowMaker();
 	    Healer h;
		h=new Healer();
		Fallen f;
		f=new Fallen();
		Guardian g;
		g = new Guardian();

		Boolean ok=false;
		while(ok==false) {
			System.out.println("*********");
	 		System.out.println("* LOGIN *");
	 		System.out.println("*********");
			System.out.println("Você é um Healer,um fallen ou um Guardian??");
			this.ator=scaneia.next();
			if(this.ator.equalsIgnoreCase("Healer")) {

				
				System.out.println("Digite seu E-mail:");
				this.emailUser=scaneia.next();
				System.out.println("Digite sua senha:");
				this.senha=scaneia.next();
				System.out.println("Usuario:"+emailUser);
				System.out.println("Senha:"+senha);
				if(emailUser.equals("Healer") & senha.equals("asd123")) {
					System.out.println("Acesso confirmado!");
					ok=true;
					h.MenuHealer();
					break;
				}else{
					System.out.println("Email ou senha incorretos,tente novamente.");
					System.out.println("Digite qualquer tecla para continuar ou V para voltar");
					String vaiOUracha=scaneia.next();
					if(vaiOUracha.equalsIgnoreCase("V")) {
						maker.main(null);
					}
				}
			} if(this.ator.equalsIgnoreCase("Fallen")) {
				
				System.out.println("Digite seu E-mail:");
				String emailUser=scaneia.next();
				System.out.println("Digite sua senha:");
				String senha=scaneia.next();
				System.out.println("Usuario:"+emailUser);
				System.out.println("Senha:"+senha);
				if(emailUser.equals("Fallen") & senha.equals("asd123")) {
					System.out.println("Acesso confirmado!");
					ok=true;
                f.MenuFallen();
					break;
				}else{
					System.out.println("Email ou senha incorretos,tente novamente.");
					System.out.println("Digite qualquer tecla para continuar ou V para voltar\n");
					String vaiOUracha=scaneia.next();
					if(vaiOUracha.equalsIgnoreCase("V")) {
						maker.main(null);
					}
				}

			} if(this.ator.equalsIgnoreCase("Guardian")) {
				
				System.out.println("Digite seu E-mail:");
				String emailUser=scaneia.next();
				System.out.println("Digite sua senha:");
				String senha=scaneia.next();
				System.out.println("Usuario:"+emailUser);
				System.out.println("Senha:"+senha);
				if(emailUser.equals("Guardian") & senha.equals("asd123")) {
					System.out.println("Acesso confirmado!");
					g.MenuGuardian();
					ok=true;
					break;
				}else{
					System.out.println("Email ou senha incorretos,tente novamente.");
					System.out.println("Digite qualquer tecla para continuar ou V para voltar\n");
					String vaiOUracha=scaneia.next();
					if(vaiOUracha.equalsIgnoreCase("V")) {
						maker.main(null);
					}
				}

			}else {
				System.out.println("Escreva o nome da sua Função,(Healer,Fallen ou Guardian)");
				System.out.println("Para voltar a pagina inicial digite V");
				String volta=scaneia.next();
				if(volta.equalsIgnoreCase("V")) {
					System.out.println("Você sera redirecionado para a pagina inicial.\n");
					maker.main(null);
				}
			}
		}
		return ok;
	}
}


