package healers;

import java.util.Scanner;

import javax.swing.JTextField;

import java.io.FileWriter;
import java.io.IOException;

public class Healer {
	String email=" ";
	String senha=" ";
	String situacao=" ";
	int duracao=0;
	String disponivel=" ";
	String nome=" ";
    int idade=0;
    String genero=" ";
    String cpf=" "; 
    String cidade=" ";
    String estado=" ";
    String rua=""; 
    String bairro=" "; 
	int numero=0;
	String telefone=" ";
	String profissao=" ";
	String estadoCivil= " ";
	String filhos=" ";
	String credo=" ";
	String hobby=" ";
	String sonho=" ";
	boolean allright=false;
	int opcao;
	
  

	public boolean isAllright() {
		return allright;
	}

	public void setAllright(boolean allright) {
		this.allright = allright;
	}

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

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(String disponivel) {
		this.disponivel = disponivel;
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

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
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

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getFilhos() {
		return filhos;
	}

	public void setFilhos(String filhos) {
		this.filhos = filhos;
	}

	public String getCredo() {
		return credo;
	}

	public void setCredo(String credo) {
		this.credo = credo;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getSonho() {
		return sonho;
	}

	public void setSonho(String sonho) {
		this.sonho = sonho;
	}

	
public boolean cadastroHealer() throws IOException, InterruptedException {
	Scanner scaneia = new Scanner(System.in);
	
	
	while(allright==false) {
		System.out.println("**********************");
		System.out.println("* CADASTRO DO HEALER *");
		System.out.println("**********************");
		
		System.out.println("Seu email:");
		this. email=scaneia.next();
		
		System.out.println("Sua senha de 8 caracteres para Login:");
		this. senha=scaneia.next();
		
		System.out.println("Sua area de situação resiliente:");
		System.out.println("Digite 'Ps' para psiquica,\n'F' para fisica,\n'A' para autoestima,\n'Pe'para perda\n ou 'Pr' para progresiva degenerativa");	
		this.situacao=scaneia.next();
		
		System.out.println("Quantos anos durou ou dura essa condição?");		
		this. duracao=scaneia.nextInt();
	    System.out.println("Qual sua disponibilidade em atuar,alta,media ou baixa?");		
	    this.disponivel=scaneia.next();
		
		scaneia=new Scanner(System.in);
		System.out.print("Seu nome completo:");	
		this.nome=scaneia.nextLine();
		
		System.out.println(nome);
		System.out.println("Sua idade:");		
		this.idade=scaneia.nextInt();
		
		System.out.println("Seu genero,m(masculino),f(feminino), ou o(outros):");		
		this.genero=scaneia.next();
		
		System.out.println("Seu cpf,exemplo:12345678910:");		
		this.cpf=scaneia.next();
		boolean numerosCpf=cpf.matches("^\\d{11}+$");
		//System.out.println(numerosCpf);
		
		scaneia=new Scanner(System.in);
		System.out.println("Sua cidade:");		
		this.cidade=scaneia.nextLine();
		
		System.out.println("A sigla do seu estado:");		
		this. estado=scaneia.next();
		
		scaneia=new Scanner(System.in);
		System.out.println("Sua rua:");		
		this.rua=scaneia.nextLine();
		
		scaneia=new Scanner(System.in);
		System.out.println("Seu bairro:");		
		this.bairro=scaneia.nextLine();
		
		System.out.println("Seu numero de residencia:");		
		this.numero=scaneia.nextInt();
		scaneia=new Scanner(System.in);
		
		System.out.println("Seu telefone,exemplo 35991111111:");		
		this.telefone=scaneia.next();
		boolean numerosTel=telefone.matches("^\\d{11}+$");
		System.out.println(numerosTel);
		scaneia=new Scanner(System.in);
		
		System.out.println("Sua profissão:");
		this.profissao=scaneia.nextLine();
		scaneia=new Scanner(System.in);
		
		System.out.println("Seu estado civil,Casado,Solteiro,Divorciado ou Viuvo:");
		this.estadoCivil=scaneia.next();
		
		System.out.println("tem filhos?:");
		this.filhos=scaneia.next();
		
		scaneia=new Scanner(System.in);
		System.out.println("Sua religião ou crença:");
		this.credo=scaneia.nextLine();
		
		scaneia=new Scanner(System.in);
		System.out.println("Seus hobbys:");
		this.hobby=scaneia.nextLine();
		
		scaneia=new Scanner(System.in);
		System.out.println("Seu maior sonho:");
		this.sonho=scaneia.nextLine();
		
 	        //testando valores capturados cpf.matches("\b{ALPHA}*");
		System.out.println("Seus dados cadastrados:\nEmail: "+getEmail()+" Senha: "+getSenha()+" Situação: "+getSituacao()+" Duração: "+getDuracao()+" Disponibilidade: "+getDisponivel()+" Nome: "+getNome()+" Idade: "
				+getIdade()+" Sexo: "+getGenero()+" Cpf: "+getCpf()+" Cidade: "+getCidade()+" Estado: "+getEstado()+" Rua:"+getRua()+" Bairro: "+getBairro()+" Numero: "+getNumero()+" Telefone: "+getTelefone()+" Profissão: "
				+getProfissao()+" Estado civil: "+getEstadoCivil()+" Filhos?: "+getFilhos()+" Religião:  "+getCredo()+" Hobbys: "+getHobby()+" Sonho: "+getSonho()+" "/*" "+email+" "+senha+" "+situacao+" "+duracao+" "+disponivel+" "+nome+" "
				+idade+" "+genero+" "+cpf+" "+cidade+" "+estado+" "+rua+" "+bairro+" "+numero+" "+telefone+" "
				+profissao+" "+estadoCivil+" "+filhos+" "+credo+" "+hobby+" "+sonho+" "*/);
			
		
		
		
		if((email.endsWith(".com") && senha.length()==8) && (situacao.equalsIgnoreCase("Ps") || situacao.equalsIgnoreCase("F") || situacao.equalsIgnoreCase("Ps")
			|| situacao.equalsIgnoreCase("A") || situacao.equalsIgnoreCase("Pe") || situacao.equalsIgnoreCase("Pr")) && (duracao > 0 && duracao < 100)
			&& (disponivel.equalsIgnoreCase("alta") || disponivel.equalsIgnoreCase("media") || disponivel.equalsIgnoreCase("baixa")) && (nome.length() > 0 &&
			idade > 18) && (idade < 100 && genero.equalsIgnoreCase("m") || genero.equalsIgnoreCase("f") || genero.equalsIgnoreCase("o")) && (numerosCpf==true &&
			 cidade.length() > 0) && (estado.length()==2 && rua.length() > 0) && (bairro.length() > 0 && numero > 0) &&
			(numerosTel==true && profissao.length() > 0) && (estadoCivil.equalsIgnoreCase("Casado") || estadoCivil.equalsIgnoreCase("Solteiro") ||
			estadoCivil.equalsIgnoreCase("Divorciado") || estadoCivil.equalsIgnoreCase("Viuvo")) && (filhos.equalsIgnoreCase("Sim") || 
			filhos.equalsIgnoreCase("Nao")) && (credo.length() > 0 && hobby.length() > 0 && sonho.length() > 0)) {
			
			System.out.println("Cadastro realizado!\nSeja muito bem vindo HEALER "+nome+"!!!");
			allright=true;
		     MenuHealer();
			
		}else {
			System.out.println("Dados incorretos!");
		}
		
}
	
	return allright;
}
     public void MenuHealer() throws IOException, InterruptedException {
    	 Scanner scaneia = new Scanner(System.in);
    	 Fallen callFallen;
    	   callFallen=new Fallen();
    	   ShowMaker maker;
    	   maker=new ShowMaker();
    	   while(this.opcao!=4){
    	System.out.println("***************");
 		System.out.println("* MENU HEALER *");
 		System.out.println("***************");
 		
    	System.out.println("DIGITE O NUMERO CORRESPONDENTE AO QUE DESEJA:");
 		System.out.println("1-SESSÃO");
 		System.out.println("2-TERMO DE RESPONSABILIDADE");                       
 		System.out.println("3-RELATÓRIO");
 		System.out.println("4-VOLTAR");
 		 this.opcao=scaneia.nextInt();
    	 switch (opcao) {
		case 1: {
			
			if(callFallen.isAllright()!= false) {
				System.out.println(callFallen.isAllright());
			System.out.println("Dados de sua proxima sessão.\n Nome de seu Fallen:"+callFallen.getNome()/*+"\nCidade: "+callFallen.getCidade()+
				"\nEstado: "+callFallen.getEstado()+"\nRua:"+callFallen.getRua()+"\nBairro:"+callFallen.getBairro()+"\nNumero:"+callFallen.getNumero()*/);
			       break;
			}else {
				System.out.println(" :´( Ainda não foi lhe designado nenhum Fallen.");
				System.out.println("\n");
			}
			break;
		}
		case 2:{
		
			System.out.println("Você recebera um documento em seu C: chamado termoHealer.txt");
			String caminho ="C:\\termoHealer.txt"; 
			String conteudo="O seguinte termo deve ser lido,compreendido e assinado pelo Healer,que por meio da assinatura do mesmo diz estar ciente das suas responsabilidades perante a sessão com o seu respectivo fallen.\r\n"
					+ "É proibido:\r\n"
					+ "Fazer filmagens ou fotos do fallen,de sua casa,dos seus amigos ou parentes e da sessão em si.\r\n"
					+ "Cobrar ou aceitar qualquer tipo de valor,recompensa,ou vantagem pessoal em relação a sessão.\r\n"
					+ "Falar sobre politica,religião ou assuntos que distoam do objetivo da sessão. Falar sobre religião apenas será possivel se partir do fallen tal assunto.\r\n"
					+ "Divulgar,comentar,negociar ou realizar qualquer atividade que possa expor informações pessoais sensiveis do Fallen,tal infração sera punida pela lei.\r\n"
					+ "Recomendações:\r\n"
					+ "Ser sereno,gentil e educado,ter paciência,saber ouvir e se expressar com empatia.\r\n"
					+ "Não criticar,repreender ou dirigir palavras ofensivas ao fallen ou aos que o cercam.\r\n"
					+ "\r\n"
					+ "EU______________________________________ portador do cpf__________________,me comprometo a realizar uma sessão de apoio a um Fallen, obedecendo as leis e recomendações relativas a sessão e a confidencialidade das informações pessoais sensiveis,estou ciente que qualquer desvio de conduta ou transgressão a lei,minhas informações serão usadas para me identificar e me punir perante minhas violações,este documento é verdadeiro e dou fé.\r\n"
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
			System.out.println("Você recebera um documento em seu C: chamado relatorioHealer.txt");
			String caminho ="C:\\relatorioHealer.txt"; 
			String conteudo="Recomendações: Faça aqui seu relatòrio incluindo os tópicos que mais chamaram a atenção durante a sessão,comente sobre as projeções do fallen e suas duvidas sobre sua vida,escreva tudo que achar relevante:\r\n"
					+ "\r\n"
					+ "Relatório:\r\n"
					+ "Nome do Healer:_______________________________________________\r\n"
					+ "CPF do Healer:______________________\r\n"
					+ "Nome do Fallen:_____________________\r\n"
					+ "\r\n"
					+ "Data:___\\___\\___\r\n"
					+ "Hora de inicio:______________\r\n"
					+ "Hora de termino:____________\r\n"
					+ "\r\n"
					+ "ESCREVA A SEGUIR SEU REALATORIO:                    ";
			FileWriter escreve=new FileWriter(caminho);
			escreve.write(conteudo);
			escreve.close();
			//}
			break;
			
		}//case 3
		case 4:{
			
			maker.main(null);
			
			
		}
			
		default:
			throw new IllegalArgumentException("Unexpected value: " );
		}//Switch case
    	  
    	   }
    	   
    	   
     }//MenuHealer
     public static void TH() throws IOException {
    	 String caminho ="C:\\termoHealer.txt"; 
			String conteudo="O seguinte termo deve ser lido,compreendido e assinado pelo Healer,que por meio da assinatura do mesmo diz estar ciente das suas responsabilidades perante a sessão com o seu respectivo fallen.\r\n"
					+ "É proibido:\r\n"
					+ "Fazer filmagens ou fotos do fallen,de sua casa,dos seus amigos ou parentes e da sessão em si.\r\n"
					+ "Cobrar ou aceitar qualquer tipo de valor,recompensa,ou vantagem pessoal em relação a sessão.\r\n"
					+ "Falar sobre politica,religião ou assuntos que distoam do objetivo da sessão. Falar sobre religião apenas será possivel se partir do fallen tal assunto.\r\n"
					+ "Divulgar,comentar,negociar ou realizar qualquer atividade que possa expor informações pessoais sensiveis do Fallen,tal infração sera punida pela lei.\r\n"
					+ "Recomendações:\r\n"
					+ "Ser sereno,gentil e educado,ter paciência,saber ouvir e se expressar com empatia.\r\n"
					+ "Não criticar,repreender ou dirigir palavras ofensivas ao fallen ou aos que o cercam.\r\n"
					+ "\r\n"
					+ "EU______________________________________ portador do cpf__________________,me comprometo a realizar uma sessão de apoio a um Fallen, obedecendo as leis e recomendações relativas a sessão e a confidencialidade das informações pessoais sensiveis,estou ciente que qualquer desvio de conduta ou transgressão a lei,minhas informações serão usadas para me identificar e me punir perante minhas violações,este documento é verdadeiro e dou fé.\r\n"
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
     public static void RH() throws IOException {
    	 String caminho ="C:\\relatorioHealer.txt"; 
			String conteudo="Recomendações: Faça aqui seu relatòrio incluindo os tópicos que mais chamaram a atenção durante a sessão,comente sobre as projeções do fallen e suas duvidas sobre sua vida,escreva tudo que achar relevante:\r\n"
					+ "\r\n"
					+ "Relatório:\r\n"
					+ "Nome do Healer:_______________________________________________\r\n"
					+ "CPF do Healer:______________________\r\n"
					+ "Nome do Fallen:_____________________\r\n"
					+ "\r\n"
					+ "Data:___\\___\\___\r\n"
					+ "Hora de inicio:______________\r\n"
					+ "Hora de termino:____________\r\n"
					+ "\r\n"
					+ "ESCREVA A SEGUIR SEU REALATORIO:                    ";
			FileWriter escreve=new FileWriter(caminho);
			escreve.write(conteudo);
			escreve.close();
    	 return;
    	 
     }
     public static boolean validarCPF(String cpf) {
	       
	       
	        if (cpf.length() != 11) {
	            return false;
	        }

	        if (cpf.matches("(\\d)\\1{10}")) {
	            return false;
	        }

	       
	        int soma = 0;
	        for (int i = 0; i < 9; i++) {
	            soma += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
	        }
	        int primeiroDigito = 11 - (soma % 11);
	        if (primeiroDigito > 9) {
	            primeiroDigito = 0;
	        }

	       
	        if (Character.getNumericValue(cpf.charAt(9)) != primeiroDigito) {
	            return false;
	        }

	       
	        soma = 0;
	        for (int i = 0; i < 10; i++) {
	            soma += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
	        }
	        int segundoDigito = 11 - (soma % 11);
	        if (segundoDigito > 9) {
	            segundoDigito = 0;
	        }

	        
	        return Character.getNumericValue(cpf.charAt(10)) == segundoDigito;
	    }
	}
            
//}//classe 
