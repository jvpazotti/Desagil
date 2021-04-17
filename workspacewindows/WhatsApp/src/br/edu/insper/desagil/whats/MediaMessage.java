package br.edu.insper.desagil.whats;

public abstract class MediaMessage extends Message {
	private String src;
	
	public MediaMessage(String user, String text, String src) {
		super(user, text);
		this.src=src;
	}

	public String Render() {
		return "<figure>"+super.render()+preRender()+"</figure>";
	}
	
	
	public String getSrc() {
		return this.src;
	}

	public abstract String preRender();
}
