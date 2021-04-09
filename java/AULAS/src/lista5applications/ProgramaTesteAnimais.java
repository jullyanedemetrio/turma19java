package lista5applications;

import lista5entities.Cachorro;
import lista5entities.Cavalo;
import lista5entities.Preguica;

public class ProgramaTesteAnimais {
	
	public static void main(String[] args) {
	
		Cachorro cachorro = new Cachorro("Doguinho", 2, "au au");
		Cavalo cavalo = new Cavalo("Horsinho", 4, "hinn in in");
		Preguica preguica = new Preguica("Adormecido", 6, "zzZzz");
		
		System.out.printf("O %s tem %d anos e está latindo: %s%n",cachorro.getNome(), cachorro.getIdade(), cachorro.emitirSom());
		System.out.printf("O %s tem %d anos e está relinchando: %s%n",cavalo.getNome(), cavalo.getIdade(), cavalo.emitirSom());
		System.out.printf("O %s tem %d anos e está roncando: %s%n",preguica.getNome(), preguica.getIdade(), preguica.emitirSom());	
	}
}
