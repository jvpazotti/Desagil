package br.edu.insper.desagil.whats;

import java.util.ArrayList;
import java.util.List;

public class Chat {
	
	private List<Message> messages;

	public Chat() {
		this.messages = new ArrayList<>();
	}
	
	public void post(Message mensagem) {
		this.messages.add(mensagem);
	}
	
	public String renderAll(){
		String s = "<main>";
		for(Message mensagem:messages) {
			s+=mensagem.render();
		}
		return s+"<main>";
	}
	
	
	
	
}
