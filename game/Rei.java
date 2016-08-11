package game;

import java.io.IOException;

import properties.Constantes;

public class Rei extends Peca {
	
	public Rei(Cor cor) {
		super.cor = cor;
		try {
			carregarImagem();
		} catch (IOException e) {
			System.out.println("Erro ao carregar rei.png");
		}
	}

	
	@Override
	protected String getEnderecoImagem() {
		System.out.println("cor do rei: " + cor);
		System.out.println("cor do rei equals preto? " + cor.equals(cor.PRETO));
		return cor.equals(cor.PRETO) ? Constantes.ENDERECO_IMAGEM_REI_PRETO :
			 Constantes.ENDERECO_IMAGEM_REI_BRANCO;
	}

}