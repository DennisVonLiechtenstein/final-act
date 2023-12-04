package healers;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fallen {
	String email=" ";
	String senha=" ";
	String situacao=" ";
	int duracao=0;
	String disponivel=" ";
	String nome=" ";
	int idade=0;
	String genero=" ";
	String cpf=""; 
	String cidade=" ";
	String estado=" ";
	String rua=""; 
	String bairro=" "; 
	int numero=0;
	String telefone=" ";
	String profissao=" ";
	String estadoCivil=" ";
	String filhos=" ";
	String credo=" ";
	String hobby=" ";
	String teste="Não Funcionou!";
	ArrayList<Fallen> fall = new ArrayList<>();
	
	public String getTeste() {
		return teste;
	}




	public void setTeste(String teste) {
		this.teste = teste;
	}




	public boolean isNumerosTel() {
		return numerosTel;
	}




	public void setNumerosTel(boolean numerosTel) {
		this.numerosTel = numerosTel;
	}




	public boolean isNumerosCpf() {
		return numerosCpf;
	}




	public void setNumerosCpf(boolean numerosCpf) {
		this.numerosCpf = numerosCpf;
	}

	String sonho=" ";
    boolean numerosTel=false;
    boolean numerosCpf=false;
	boolean allright=false;
	int opcao;
	int confere=0;

	




	public int getConfere() {
		return confere;
	}




	public void setConfere(int confere) {
		this.confere = confere;
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




	public boolean isAllright() {
		return allright;
	}




	public void setAllright(boolean allright) {
		this.allright = allright;
	}




	public boolean cadastroFallen(/*String email,String senha,String situacao,int duracao,String disponivel,String nome,
	int idade,String genero,String cpf, String cidade,String estado,String rua, String bairro, int numero,String telefone,
	String profissao,String estadoCivil,String filhos,String credo,String hobby,String sonho, boolean numerosTel,boolean numerosCpf*/) throws IOException, InterruptedException {
		
		Scanner scaneia = new Scanner(System.in);
		//int checkList=1;
		boolean allright=false;
		while(allright==false) {
			System.out.println("**********************");
			System.out.println("* CADASTRO DO FALLEN *");
			System.out.println("**********************");

			
			System.out.println("Seu email:");
			this.email=scaneia.next();
			setEmail(email);

			System.out.println("Sua senha de 8 caracteres para Login:");
			this.senha=scaneia.next();
            setSenha(senha);
			System.out.println("Sua area de situação resiliente:");
			System.out.println("Digite 'Ps' para psiquica,\n'F' para fisica,\n'A' para autoestima,\n'Pe'para perda\n ou 'Pr' para progresiva degenerativa");	
			this.situacao=scaneia.next();

			System.out.println("Quantos anos durou ou dura essa condição?");		
			this.duracao=scaneia.nextInt();
			System.out.println("Qual sua disponibilidade em ser assistido,alta,normal ou relutante?");		
			this.disponivel=scaneia.next();

			scaneia=new Scanner(System.in);
			System.out.print("Seu nome completo:");	
			this.nome=scaneia.nextLine();
            setNome(nome);
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
			this.estado=scaneia.next();
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
			//System.out.println(numerosTel);
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

			
			System.out.println("Seus dados cadastrados:\nEmail: "+getEmail()+" Senha: "+getSenha()+" Situação: "+getSituacao()+" Duração: "+getDuracao()+" Disponibilidade: "+getDisponivel()+" Nome: "+getNome()+" Idade: "
					+getIdade()+" Sexo: "+getGenero()+" Cpf: "+getCpf()+" Cidade: "+getCidade()+" Estado: "+getEstado()+" Rua:"+getRua()+" Bairro: "+getBairro()+" Numero: "+getNumero()+" Telefone: "+getTelefone()+" Profissão: "
					+getProfissao()+" Estado civil: " +getEstadoCivil()+" Filhos?: " +getFilhos()+" Religião:  "+getCredo()+" Hobbys: "+getHobby()+" Sonho: "+getSonho()+" "/*" "+email+" "+senha+" "+situacao+" "+duracao+" "+disponivel+" "+nome+" "
					+idade+" "+genero+" "+cpf+" "+cidade+" "+estado+" "+rua+" "+bairro+" "+numero+" "+telefone+" "
					+profissao+" "+estadoCivil+" "+filhos+" "+credo+" "+hobby+" "+sonho+" "*/);

            

		if((email.endsWith(".com") && senha.length()==8) && (situacao.equalsIgnoreCase("Ps") || situacao.equalsIgnoreCase("F") || situacao.equalsIgnoreCase("Ps")
				|| situacao.equalsIgnoreCase("A") || situacao.equalsIgnoreCase("Pe") || situacao.equalsIgnoreCase("Pr")) && (duracao > 0 && duracao < 100)
				&& (disponivel.equalsIgnoreCase("alta") || disponivel.equalsIgnoreCase("normal") || disponivel.equalsIgnoreCase("relutante")) && (nome.length() > 0 &&
				idade > 18) && (idade < 100 && genero.equalsIgnoreCase("m") || genero.equalsIgnoreCase("f") || genero.equalsIgnoreCase("o")) && (numerosCpf==true &&
				cidade.length() > 0) && (estado.length()==2 && rua.length() > 0) && (bairro.length() > 0 && numero > 0) &&
				(numerosTel==true && profissao.length() > 0) && (estadoCivil.equalsIgnoreCase("Casado") || estadoCivil.equalsIgnoreCase("Solteiro") ||
				estadoCivil.equalsIgnoreCase("Divorciado") || estadoCivil.equalsIgnoreCase("Viuvo")) && (filhos.equalsIgnoreCase("Sim") || 
				filhos.equalsIgnoreCase("Nao")) && (credo.length() > 0 && hobby.length() > 0 && sonho.length() > 0)) {

				System.out.println("Cadastro realizado!\nSeja muito bem vindo FALLEN "+nome+"!!!");
				//Fallen fall1=new Fallen(); e se passar tudo pro arraylist do scanner?
				//fall.add(null);
				setAllright(true);
				System.out.println(isAllright());
				setConfere(1);
                MenuFallen();
			}else {
				System.out.println("Dados incorretos!");
			}
			

		}
		System.out.println(isAllright());
		return allright;
	}
	public void MenuFallen() throws IOException, InterruptedException {
		Scanner scaneia = new Scanner(System.in);
		Healer callHealer;
		callHealer=new Healer();
		ShowMaker maker;
		maker=new ShowMaker();
		while(this.opcao!=3){
			System.out.println("***************");
			System.out.println("* MENU FALLEN *");
			System.out.println("***************");
			System.out.println("DIGITE O NUMERO CORRESPONDENTE AO QUE DESEJA:");
			System.out.println("1-SESSÃO");
			System.out.println("2-RELATÓRIO");
			System.out.println("3-VOLTAR");

			this.opcao=scaneia.nextInt();
			switch (opcao) {
			case 1: {
				if(callHealer.isAllright()==true) {

					System.out.println("Dados de seu Healer para a sessão.\n Nome de seu Healer:"+callHealer.nome+"\nCidade: "+callHealer.cidade+
							"\nEstado: "+callHealer.estado+"\nRua:"+callHealer.rua+"\nBairro:"+callHealer.bairro+"\nNumero:"+callHealer.numero);
				}else {
					System.out.println(" :´( Ainda não foi lhe designado nenhum Healer.");
					System.out.println("\n");
				}
				break;
			}
			case 2:{
				//if(callFallen.isAllright()==true) {
				System.out.println("Você recebera um documento em seu C: chamado relatorioFallen.txt");
				String caminho ="C:\\relatorioFallen.txt"; 
				String conteudo="Recomendações:\r\n"
						+ "Fallen, faça o seu relatório descrevendo os detalhes que te chamaram atenção na sessão com o Healer, assim como uma avaliação de como foi o desempenho de seu Healer,sua métodologia e sua conduta durante a sessão.\r\n"
						+ "Descreva também o que você acha que lhe foi acrescentado de bom depois da sessão,suas perpectivas de futuro e ponto de vista.\r\n"
						+ "\r\n"
						+ "ESCREVA O RELATÓRIO A SEGUIR:\r\n"
						+ "Data:___\\___\\____\r\n"
						+ "Nome do Fallen:________________________________________________________\r\n"
						+ "CPF do FALLEN:____________________\r\n"
						+ "Nome do Healer:________________________________________________________";
				FileWriter escreve=new FileWriter(caminho);
				escreve.write(conteudo);
				escreve.close();
				//}
				break;
			}
			case 3:{
				
				maker.main(null);
				break;

			}//case 3

			default:
				throw new IllegalArgumentException("Unexpected value: " );
			}//Switch case

		}
	}//MenuHealer
	 
     public static void RF() throws IOException {
    	 String caminho ="C:\\relatorioFallen.txt"; 
			String conteudo="Recomendações:\r\n"
					+ "Fallen, faça o seu relatório descrevendo os detalhes que te chamaram atenção na sessão com o Healer, assim como uma avaliação de como foi o desempenho de seu Healer,sua métodologia e sua conduta durante a sessão.\r\n"
					+ "Descreva também o que você acha que lhe foi acrescentado de bom depois da sessão,suas perpectivas de futuro e ponto de vista.\r\n"
					+ "\r\n"
					+ "ESCREVA O RELATÓRIO A SEGUIR:\r\n"
					+ "Data:___\\___\\____\r\n"
					+ "Nome do Fallen:________________________________________________________\r\n"
					+ "CPF do FALLEN:____________________\r\n"
					+ "Nome do Healer:________________________________________________________";
			FileWriter escreve=new FileWriter(caminho);
			escreve.write(conteudo);
			escreve.close();
    	 return;
    	 
     }
	
	/*public boolean MostraFallen(boolean check) {
		if(allright){ getEmail().endsWith(".com") && getSenha().length()==8) && (getSituacao().equalsIgnoreCase("Ps") || getSituacao().equalsIgnoreCase("F") || getSituacao().equalsIgnoreCase("Ps")
					|| getSituacao().equalsIgnoreCase("A") || getSituacao().equalsIgnoreCase("Pe") || getSituacao().equalsIgnoreCase("Pr")) && (getDuracao() > 0 && getDuracao() < 100)
					&& (getDisponivel().equalsIgnoreCase("alta") || getDisponivel().equalsIgnoreCase("normal") || getDisponivel().equalsIgnoreCase("relutante")) && (getNome().length() > 0 &&
							getIdade() > 18) && (getIdade() < 100 && getGenero().equalsIgnoreCase("m") || getGenero().equalsIgnoreCase("f") || getGenero().equalsIgnoreCase("o")) && (isNumerosCpf()==true &&
							getCidade().length() > 0) && (getEstado().length()==2 && getRua().length() > 0) && (getBairro().length() > 0 && getNumero() > 0) &&
					(isNumerosTel()==true && getProfissao().length() > 0) && (getEstadoCivil().equalsIgnoreCase("Casado") || getEstadoCivil().equalsIgnoreCase("Solteiro") ||
							getEstadoCivil().equalsIgnoreCase("Divorciado") || getEstadoCivil().equalsIgnoreCase("Viuvo")) && (getFilhos().equalsIgnoreCase("Sim") || 
									getFilhos().equalsIgnoreCase("Nao")) && (getCredo().length() > 0 && getHobby().length() > 0 && getSonho().length() > 0)) {
			check=this.allright;
			System.out.println(" "+this.email+" "+this.email+" "/*+getSituacao()+" "+getDuracao()+" "+getDisponivel()+" "+getNome()+" "
					+getIdade()+" "+getGenero()+" "+getCpf()+" "+getCidade()+" "+getEstado()+" "+getRua()+" "+getBairro()+" "+getNumero()+" "+getTelefone()+" "
					+getProfissao()+" "+getEstadoCivil()+" "+getFilhos()+" "+getCredo()+" "+getHobby()+" "+getSonho()+" ");
			
		}else {
			System.out.println(" :´( Ainda não foi lhe designado nenhum Fallen.");
			
		}
		
		return check;
		
	}*/
	
	
	
	
	
	
	
}
