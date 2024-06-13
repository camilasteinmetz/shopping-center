package principal;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
		boolean dataValida = true;
		
		if (dia <= 0 || dia > 31 || mes <= 0 || mes > 12) {
			dataValida = false;
		} else if (dia == 31 && (
				mes == 2 || 
				mes == 4 || 
				mes == 6 || 
				mes == 9 || 
				mes == 11)
			) {
			// meses com 31 dias: 1 3 5 7 8 10 12
			dataValida = false;
		} else if (dia >= 29 && mes == 2 && !this.bissexto(ano)) {
			dataValida = false;
		}
		
		
		if (dataValida) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		} else {
			this.dia = 1;
			this.mes = 1;
			this.ano = 2000;
		}
	}
	
	@Override
	public String toString() {
		return this.addZero(this.dia) + "/" + this.addZero(this.mes) + "/" + this.ano;
	}
	
	public String addZero(int valor) {
		if (valor < 10) {
			return "0" + valor;
		} else {
			return Integer.toString(valor);
		}
	}
	
	public boolean verificaAnoBissexto() {
		return this.bissexto(this.ano);
	}

	public boolean bissexto(int ano) {
	    return (ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0);
	}
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
