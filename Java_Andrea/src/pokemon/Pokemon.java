package pokemon;

public class Pokemon {
	Tipo tipo;
	String nombre;
	int nivelVida;
	int poderDaño;
	int poderDefensa;
	int velocidad;
	
	public Pokemon() {}
	
	public Pokemon(Tipo t, String n, int nv, int pda, int pde, int v) {
	this.tipo = t;
	this.nombre = n;
	this.nivelVida = nv;
	this.poderDaño = pda;
	this.poderDefensa = pde;
	this.velocidad = v;
	}
	
	public int atacar() {
		int valor = (int) (Math.random()*100 % 10) +1;
		return valor;
	}
	public boolean esquivar() {
		int valor = (int) (Math.random()*100 % 2);
		if(valor == 0) {
			return true;
		}else {
			return false;
		}
	}
	public void setVida(int v) {
		this.nivelVida = v;
	}
	
	public int getVida() {
		return this.nivelVida;
	}
}
