package br.edu.insper.desagil.whats;

public class VideoMessage extends MediaMessage {

	public VideoMessage(String user, String text, String src) {
		super(user, text, src);
		
	}
	
	public String preRender(){
		return "<video src="+ getSrc() + "\">";
	
	}
	
}