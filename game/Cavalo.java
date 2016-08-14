package game;

import java.awt.Point;
import java.io.IOException;
import java.util.List;

import properties.Constantes;

public class Cavalo extends Peca {
	
	public Cavalo(Cor cor) {
		super.cor = cor;
		try {
			carregarImagem();
		} catch (IOException e) {
			System.out.println("Erro ao carregar cavalo.png");
		}
	}


	@Override
	protected String getEnderecoImagem() {
		return cor.equals(cor.PRETO) ? Constantes.ENDERECO_IMAGEM_CAVALO_PRETO :
			 Constantes.ENDERECO_IMAGEM_CAVALO_BRANCO;
	}


	@Override
	public List<Point> getMovimentosValidos(int linha, int coluna) {
		// TODO Auto-generated method stub
		return null;
	}

}
