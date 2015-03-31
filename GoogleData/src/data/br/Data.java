package data.br;

import java.util.Calendar;

public class Data {

	private int dia;
	private int mes;
	private int ano;
	
	public Data() {
	}
	
	public Data(int dia, int mes, int ano) {
	this.dia = dia;
	this.mes = mes;
	this.ano = ano;
	}
	
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		if(dia>0 && dia<30){
		this.dia = dia;
		}else
			System.out.println("Dia invalida!!!");
	}
	
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		if(mes>0 && mes<=12){
		this.mes = mes;
		}else
			System.out.println("mes invalida!!!");
	}
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		if(ano<=2015)
		this.ano = ano;
	}

	public String toString() {
	return dia + "/" + mes + "/" + ano;
	}
	
}
