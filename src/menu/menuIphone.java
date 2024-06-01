package menu;
import telefone.AparelhoTelefonico;
import musica.ReprodutorMusical;
import internet.NavegadorInternet;



	public class menuIphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
		public void exibirPagina() {
			System.out.println("EXIBINDO PAGINA");
			
		}
		
		public void adicionarNovaAba() {
			System.out.println("ADICIONANDO NOVA ABA");
		}
		
		public void atualizarPagina() {
			System.out.println("ATUALIZANDO PAGINA");
		}
		public void trocar() {
			System.out.println("TROCANDO DE MUSICA");
		};
        public void pausar() {
        	System.out.println("PAUSANDO MUSICA");
        };
        public void SelecionarMusica(String musica) {
        	System.out.println("SELECIONAR MUSICA");
        }
        public void ligar() {
        	System.out.println("LIGANDO");
        };
        public void Desligar() {
        	System.out.println("DESLIGANDO");
        };
        public void  iniciarCorreioVoz() {;
        	System.out.println("INICIANDO CORREIO DE VOZ");
        }

		
		public void exibirPagina(String url) {
			System.out.println("EXIBINDO PAGINA");
			
		}
        ;
	}


