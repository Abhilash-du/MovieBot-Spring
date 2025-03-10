package io.datajek.spring.basics.movierecommendersystem.lesson2;

public class CollaborativeFilter implements Filter{
	
	public String[] getRecommendations(String movie) {
		// logic to collaborative filter
		return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
	}

}
