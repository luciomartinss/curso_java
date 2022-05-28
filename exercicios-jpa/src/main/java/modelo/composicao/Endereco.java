package modelo.composicao;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {

	private String logradoro;
	private String complemento;
	
	
	public String getLogradoro() {
		return logradoro;
	}
	public void setLogradoro(String logradoro) {
		this.logradoro = logradoro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
}
