package healers;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Guardian {
	String email;
	String senha;
	String nome;
	int idade;
	String genero;
	String cpf; 
	String cidade;
	String estado;
	String bairro;
	int numero;
	String telefone;
	String profissao;
	String ajuda;
	String disponivel;
	int opcao;
	
			
			
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getajuda() {
		return ajuda;
	}
	public void setajuda(String ajuda) {
		this.ajuda = ajuda;
	}
	public String getDisponivel() {
		return disponivel;
	}
	public void setDisponivel(String disponivel) {
		this.disponivel = disponivel;
	}
	public int getOpcao() {
		return opcao;
	}
	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}
	public boolean cadastroGuardian() throws IOException, InterruptedException {
		Scanner scaneia = new Scanner(System.in);
		
		boolean allright=false;
		while(allright==false) {
			System.out.println("************************");
			System.out.println("* CADASTRO DO GUARDIAN *");
			System.out.println("************************");

			System.out.println("Seu email:");
			String email=scaneia.next();

			System.out.println("Sua senha de 8 caracteres para Login:");
			String senha=scaneia.next();

			scaneia=new Scanner(System.in);
			System.out.print("Seu nome completo:");	
			String nome=scaneia.nextLine();

			System.out.println("Sua idade:");		
			int idade=scaneia.nextInt();

			System.out.println("Seu genero,m(masculino),f(feminino), ou o(outros):");		
			String genero=scaneia.next();

			System.out.println("Seu cpf,exemplo:12345678910:");		
			String cpf=scaneia.next();
			boolean numerosCpf=cpf.matches("^\\d{11}+$");
			System.out.println(numerosCpf);

			scaneia=new Scanner(System.in);
			System.out.println("Sua cidade:");		
			String cidade=scaneia.nextLine();

			System.out.println("A sigla do seu estado:");		
			String estado=scaneia.next();
			
			scaneia=new Scanner(System.in);
			System.out.println("Sua rua:");		
			String rua=scaneia.nextLine();
			scaneia=new Scanner(System.in);
			System.out.println("Seu bairro:");		
			String bairro=scaneia.nextLine();

			System.out.println("Seu numero de residencia:");		
			int numero=scaneia.nextInt();
			scaneia=new Scanner(System.in);

			System.out.println("Seu telefone,exemplo 35991111111:");		
			String telefone=scaneia.next();
			boolean numerosTel=telefone.matches("^\\d{11}+$");
			System.out.println(numerosTel);
			scaneia=new Scanner(System.in);

			System.out.println("Sua profissão:");
			String profissao=scaneia.nextLine();

			System.out.println("Sua ajuda sera em que área?:");
			System.out.println("Digite 'F' para Financeira,\n'P' para Profissional,\n ou 'M' para mentoria.");	
			String ajuda=scaneia.next();

			System.out.println("Qual sua disponibilidade em atuar,frequente,esporadica ou unitaria?");		
			String disponivel=scaneia.next();



			
			System.out.println(" Dados cadastrados. Email: "+email+" Senha: "+senha+" Nome:  "+nome+" Idade: "
					+idade+" Sexo: "+genero+" Cpf: "+cpf+" Cidade: "+cidade+" Estado: "+estado+" Rua: "+rua+" Bairro: "+bairro+" Numero: "+numero+" Telefone: "+telefone+" Profissão: "
					+profissao+" Tipo de ajuda: "+ajuda+" Disponibilidade: "+disponivel+"");

			if((email.endsWith(".com") && senha.length()==8) && (nome.length() > 0 && idade > 18) && 
					(genero.equalsIgnoreCase("m") || genero.equalsIgnoreCase("f") || genero.equalsIgnoreCase("o"))
					&& (numerosCpf==true && cidade.length() > 0) && (estado.length()==2 && rua.length() > 0) &&
					(bairro.length() > 0 && numero > 0 ) && (numerosTel==true && profissao.length() > 0) &&
					(ajuda.equalsIgnoreCase("F") || ajuda.equalsIgnoreCase("P") || ajuda.equalsIgnoreCase("M")) &&
					(disponivel.equalsIgnoreCase("frequente") || disponivel.equalsIgnoreCase("esporadica") || disponivel.equalsIgnoreCase("unitaria"))) {

				System.out.println("Cadastro realizado! Seja bem vindo GUARDIAN "+nome+"!!!");
				allright=true;
				MenuGuardian();
			}else {
				System.out.println("Dados incorretos!");
			}

			/*if((email.endsWith(".com") && senha.length()==8) && (ajuda.equalsIgnoreCase("Ps") || ajuda.equalsIgnoreCase("F") || ajuda.equalsIgnoreCase("Ps")
				|| ajuda.equalsIgnoreCase("A") || ajuda.equalsIgnoreCase("Pe") || ajuda.equalsIgnoreCase("Pr")) && (duracao > 0 && duracao < 100)
				&& (disponivel.equalsIgnoreCase("alta") || disponivel.equalsIgnoreCase("media") || disponivel.equalsIgnoreCase("baixa")) && (nome.length() > 0 &&
				idade > 18) && (idade < 100 && genero.equalsIgnoreCase("m") || genero.equalsIgnoreCase("f") || genero.equalsIgnoreCase("o")) && (numerosCpf==true &&
				 cidade.length() > 0) && (estado.length()==2 && rua.length() > 0) && (bairro.length() > 0 && numero > 0) &&
				(numerosTel==true && profissao.length() > 0) && (estadoCivil.equalsIgnoreCase("Casado") || estadoCivil.equalsIgnoreCase("Solteiro") ||
				estadoCivil.equalsIgnoreCase("Divorciado") || estadoCivil.equalsIgnoreCase("Viuvo")) && (filhos.equalsIgnoreCase("Sim") || 
				filhos.equalsIgnoreCase("Nao")) && (credo.length() > 0 && hobby.length() > 0 && sonho.length() > 0)) {

				System.out.println("Cadastro realizado!\nSeja muito bem vindo Healer "+nome+"!!!");
				allright=true;

			}else {
				System.out.println("Dados incorretos!");
			}*/

		}
		return allright;
	}
	public void MenuGuardian() throws IOException, InterruptedException {
   	 Scanner scaneia = new Scanner(System.in);
   	 Fallen callFallen;
   	   callFallen=new Fallen();
   	   ShowMaker maker;
   	   maker=new ShowMaker();
   	   
   	   while(this.opcao!=4){
   		   
      	System.out.println("*****************");
		System.out.println("* MENU GUARDIAN *");
		System.out.println("*****************");
		
   	System.out.println("DIGITE O NUMERO CORRESPONDENTE AO QUE DESEJA:");
        System.out.println("1-DADOS DO FALLEN");
		System.out.println("2-TERMO DE RESPONSABILIDADE");
		System.out.println("3-AVALIAÇÂO");
		System.out.println("4-VOLTAR");
		 this.opcao=scaneia.nextInt();
   	 switch (opcao) {
		case 1: {
			if(callFallen.isAllright()==true) {
				
			System.out.println("Dados de sua proxima sessão.\n Nome de seu Fallen:"+callFallen.getNome()+"\nCidade: "+callFallen.cidade+
					"\nEstado: "+callFallen.estado+"\nRua:"+callFallen.rua+"\nBairro:"+callFallen.bairro+"\nNumero:"+callFallen.numero);
			}else {
				System.out.println(" :´( Ainda não foi lhe designado nenhum Fallen.");
				System.out.println("\n");
			}
			break;
		}
		case 2:{
			//if(callFallen.isAllright()==true) {
			System.out.println("Você recebera um documento em seu C: chamado termoGuardian.txt");
			String caminho ="C:\\termoGuardian.txt"; 
			String conteudo="O seguinte termo deve ser lido,compreendido e assinado pelo Guardian,que por meio da assinatura do mesmo diz estar ciente das suas responsabilidades perante o seu respectivo fallen.\r\n"
					+ "É proibido:\r\n"
					+ "Fazer filmagens ou fotos do fallen,de sua casa,dos seus amigos ou parentes e da sessão em si.\r\n"
					+ "Cobrar ou aceitar qualquer tipo de valor,recompensa,ou vantagem pessoal em relação a sessão.\r\n"
					+ "Falar sobre politica,religião ou assuntos que distoam do seu objetivo. Falar sobre religião apenas será possivel se partir do fallen tal assunto.\r\n"
					+ "Divulgar,comentar,negociar ou realizar qualquer atividade que possa expor informações pessoais sensiveis do Fallen,tal infração sera punida pela lei.\r\n"
					
					+ "\r\n"
					+ "EU______________________________________ portador do cpf__________________,me comprometo a realizar apoio a um Fallen, obedecendo as leis e recomendações relativas a confidencialidade das informações pessoais sensiveis,estou ciente que qualquer desvio de conduta ou transgressão a lei,minhas informações serão usadas para me identificar e me punir perante minhas violações,este documento é verdadeiro e dou fé.\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "                                                Data:___\\____\\_____              assinatura:__________________________________   ";
			FileWriter escreve=new FileWriter(caminho);
			escreve.write(conteudo);
			escreve.close();
			//}
			break;
		}
		case 3:{
			//if(callFallen.isAllright()==true) {
			System.out.println("Você recebera um documento em seu C: chamado avaliacaoGuardian.txt");
			String caminho ="C:\\avaliacaoGuardian.txt"; 
			String conteudo="Recomendações:Nobre Guardian,descreva aqui o progresso que seu fallen está tendo com sua mentoria ou na atividade profissional oferecida por você,inclua as mudanças que você observar nele quanto ao seu estado de espirito,tambem descreva as dificuldades,habilidades e possibilidades\r\n"
					+ "referente ao que você oferece.\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "Nome:____________________________________________\r\n"
					+ "CPF:_______________________\r\n"
					+ "Nome do Fallen:___________________________________________ \r\n"
					+ "\r\n"
					+ "ESCREVA A PARTIR DAQUI:";
			FileWriter escreve=new FileWriter(caminho);
			escreve.write(conteudo);
			escreve.close();
			//}
			break;
			
		}//case 3
		case 4:{
			maker.main(null);
			break;
			
		}
			
		default:
			throw new IllegalArgumentException("Unexpected value: " );
		}//Switch case
   	  
   	   }
    }//MenuHealer
	
	 public static void TG() throws IOException {
		 String caminho ="C:\\termoGuardian.txt"; 
			String conteudo="O seguinte termo deve ser lido,compreendido e assinado pelo Guardian,que por meio da assinatura do mesmo diz estar ciente das suas responsabilidades perante o seu respectivo fallen.\r\n"
					+ "É proibido:\r\n"
					+ "Fazer filmagens ou fotos do fallen,de sua casa,dos seus amigos ou parentes e da sessão em si.\r\n"
					+ "Cobrar ou aceitar qualquer tipo de valor,recompensa,ou vantagem pessoal em relação a sessão.\r\n"
					+ "Falar sobre politica,religião ou assuntos que distoam do seu objetivo. Falar sobre religião apenas será possivel se partir do fallen tal assunto.\r\n"
					+ "Divulgar,comentar,negociar ou realizar qualquer atividade que possa expor informações pessoais sensiveis do Fallen,tal infração sera punida pela lei.\r\n"
					
					+ "\r\n"
					+ "EU______________________________________ portador do cpf__________________,me comprometo a realizar apoio a um Fallen, obedecendo as leis e recomendações relativas a confidencialidade das informações pessoais sensiveis,estou ciente que qualquer desvio de conduta ou transgressão a lei,minhas informações serão usadas para me identificar e me punir perante minhas violações,este documento é verdadeiro e dou fé.\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "                                                Data:___\\____\\_____              assinatura:__________________________________   ";
			FileWriter escreve=new FileWriter(caminho);
			escreve.write(conteudo);
			escreve.close();
    
		   return;
	   }
     public static void AG() throws IOException {
    	 String caminho ="C:\\avaliacaoGuardian.txt"; 
			String conteudo="Recomendações:Nobre Guardian,descreva aqui o progresso que seu fallen está tendo com sua mentoria ou na atividade profissional oferecida por você,inclua as mudanças que você observar nele quanto ao seu estado de espirito,tambem descreva as dificuldades,habilidades e possibilidades\r\n"
					+ "referente ao que você oferece.\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "Nome:____________________________________________\r\n"
					+ "CPF:_______________________\r\n"
					+ "Nome do Fallen:___________________________________________ \r\n"
					+ "\r\n"
					+ "ESCREVA A PARTIR DAQUI:";
			FileWriter escreve=new FileWriter(caminho);
			escreve.write(conteudo);
			escreve.close();
    	 return;
    	 
     }

}
