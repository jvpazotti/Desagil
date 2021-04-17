package br.edu.insper.desagil.whats;

public class ImageMessage extends MediaMessage {

	public ImageMessage(String user, String text, String src) {
		super(user, text, src);
		
	}
	
	public String preRender(){
		return "<img src="+ getSrc() + "\">";
	}
}
