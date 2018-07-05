package com.machine.learning.explore;

import java.io.IOException;
import java.util.List;

import org.jsoup.nodes.Document;

public interface Explore {
	
	public void findContent() throws IOException;
	
	public List<String> findUrlInContent();
	
	public void doFindUseFulInfo();

	
	public Document getContent();
	
	public void setUrl(String url);
	
	public Explore getNewInstance();
}
