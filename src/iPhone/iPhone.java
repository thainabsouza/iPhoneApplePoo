package iPhone;
import menu.menuIphone;
import musica.ReprodutorMusical;
import telefone.AparelhoTelefonico;
import internet.NavegadorInternet;



public class iPhone {
	public static void main(String[] args) {
		menuIphone em = new menuIphone();
		ReprodutorMusical playerMusic = em; 
		NavegadorInternet chrome = em;
		AparelhoTelefonico telefone = em;
		
		telefone.ligar();
		chrome.atualizarPagina();
		playerMusic.SelecionarMusica(null);
	}

}
