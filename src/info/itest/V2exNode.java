package info.itest; 


/**
 * Copyright (c) 2019年6月8日 Leon All rights reserved. 
 * Description: json对象转java对象
 */
public class V2exNode{
	
	/**

	{
"avatar_large":"//cdn.v2ex.com/navatar/8613/985e/90_large.png?m=1564378564",
"name":"python",
"avatar_normal":"//cdn.v2ex.com/navatar/8613/985e/90_normal.png?m=1564378564",
"title":"Python",
"url":"https://www.v2ex.com/go/python",
"topics":11896,
"footer":"",
"header":"杩欓噷璁ㄨ鍚勭Python璇█缂栫▼璇濋锛屼篃鍖呮嫭Django锛孴ornado绛夋鏋剁殑璁ㄨ銆傝繖閲屾槸涓�涓
兘澶熷府鍔╀綘瑙ｅ喅瀹為檯闂鐨勫湴鏂广��",
"title_alternative":"Python",
"avatar_mini":"//cdn.v2ex.com/navatar/8613/985e/90_mini.png?m=1564378564",
"stars":8248,
"root":false,
"id":90,
"parent_node_name":"programming"
}

	*/
	
	private String avatar_large;
	private String name;
	private String avatar_normal;
	private String title;
	private String url;
	private int topics;
	private String footer;
	private String header;
	private String title_alternative;
	private String avatar_mini;
	private int stars;
	private boolean root;
	private int id;
	private String parent_node_name;
	public void setAvatar_large(String avatar_large){
		this.avatar_large = avatar_large;
	}
	public String getAvatar_large(){
		return this.avatar_large;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setAvatar_normal(String avatar_normal){
		this.avatar_normal = avatar_normal;
	}
	public String getAvatar_normal(){
		return this.avatar_normal;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return this.title;
	}
	public void setUrl(String url){
		this.url = url;
	}
	public String getUrl(){
		return this.url;
	}
	public void setTopics(int topics){
		this.topics = topics;
	}
	public int getTopics(){
		return this.topics;
	}
	public void setFooter(String footer){
		this.footer = footer;
	}
	public String getFooter(){
		return this.footer;
	}
	public void setHeader(String header){
		this.header = header;
	}
	public String getHeader(){
		return this.header;
	}
	public void setTitle_alternative(String title_alternative){
		this.title_alternative = title_alternative;
	}
	public String getTitle_alternative(){
		return this.title_alternative;
	}
	public void setAvatar_mini(String avatar_mini){
		this.avatar_mini = avatar_mini;
	}
	public String getAvatar_mini(){
		return this.avatar_mini;
	}
	public void setStars(int stars){
		this.stars = stars;
	}
	public int getStars(){
		return this.stars;
	}
	public void setRoot(boolean root){
		this.root = root;
	}
	public boolean getRoot(){
		return this.root;
	}
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return this.id;
	}
	public void setParent_node_name(String parent_node_name){
		this.parent_node_name = parent_node_name;
	}
	public String getParent_node_name(){
		return this.parent_node_name;
	}
}

	