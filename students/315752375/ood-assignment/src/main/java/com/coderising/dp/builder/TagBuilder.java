package com.coderising.dp.builder;

import java.util.List;

public class TagBuilder {
	private TagNode rootNode;
	private TagNode curNode;
	private TagNode parent;
	public TagBuilder(String rootTagName){
		this.rootNode=new TagNode(rootTagName);
		curNode=rootNode;
		parent=null;
	}
	
	public TagBuilder addChild(String childTagName){
		parent= curNode;
		curNode=new TagNode(childTagName);
		parent.add(curNode);
		return this;
	}
	public TagBuilder addSibling(String siblingTagName){
		curNode=new TagNode(siblingTagName);
		parent.add(curNode);
		
		return this;
		
	}
	public TagBuilder setAttribute(String name, String value){
		curNode.setAttribute(name, value);
		return this;
	}
	public TagBuilder setText(String value){
		this.curNode.setValue(value);
		return this;
	}
	public String toXML(){
		return rootNode.toXML();
	}
}
