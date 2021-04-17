package br.edu.insper.desagil.site;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Blog {
	private List<String> tags;
	private String name;
	private List<Post> posts;
	
	
	public Blog(String name) {
		super();
		this.name = name;
		this.tags= new ArrayList<>();
		this.posts= new ArrayList<>();
	}


	public List<String> getTags() {
		return this.tags;
	}

	public List<Post> getPosts() {
		return this.posts;
	}
	
	public void addPost(String title, String content, List<String> tags) {
		Post post = new Post(title, content);
		for (String tag: this.tags) {
			post.addTag(tag);
			if (!this.tags.contains(tag)) {
				this.tags.add(tag);
			}
		}
		this.posts.add(post);
	}

	private List<Post> getPostsWithTag(String tag) {
		List<Post> postsWith = new ArrayList<>();
		for (Post post: this.posts) {
			if (post.contains(tag)) {
				postsWith.add(post);
			}
		}
		return postsWith;
	}

	public Map<String, List<Post>> getPostsPerTag() {
		Map<String, List<Post>> postsPerTag = new HashMap<>();
		for (String tag: this.tags) {
			postsPerTag.put(tag, getPostsWithTag(tag));
		}
		return postsPerTag;
	}
	
	
	
}


