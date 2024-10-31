package main;

import service.AparelhoTelefonico;
import service.NavegadorInternet;
import service.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	
	
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		
		// teste ligacao telefonica
		iphone.ligacaoTelefonica("12334567");
		iphone.atenderTelefone();
		iphone.iniciarCorreioVoz();
		
		// Navegador
		iphone.exibirPagina("https://www.dio.me/");
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		
		// Player music
		iphone.selecionarMusica("Dream Theater - Home");
		iphone.tocarMusica();
		iphone.pausarMusica();
	}
	
	
	// Aparelho telefonico
	@Override
	public void ligacaoTelefonica(String numero) {
		System.out.println("Ligar " + numero);
	}

	@Override
	public void atenderTelefone() {
		System.out.println("Atender telefone");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciar correio de voz");
	}

	
    // Navegador  
	@Override
	public void exibirPagina(String url) {
		System.out.println("exibir pagina de url " + url);		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionar nova Aba");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizar pagina");
	}

	
	// Player musica

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionar musica " + musica);
	}
	
	@Override
	public void tocarMusica() {
		System.out.println("Tocar musica");
	}

	@Override
	public void pausarMusica() {
		System.out.println("Pausar musica");
	}
	

}
