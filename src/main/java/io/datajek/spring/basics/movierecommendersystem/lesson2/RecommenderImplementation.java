package io.datajek.spring.basics.movierecommendersystem.lesson2;

public class RecommenderImplementation {
	
	// use filter interface to select filter
	private Filter filter;
	
	public RecommenderImplementation(Filter filter) {
		super();
		this.filter = filter;
	}

	// using filter to find recommendations 
	public String[] recommendMovies(String movie) {
	    
		//use content based filter to find similar movies
		System.out.println("Name of the filter in use: "+ filter +"\n");
	    CollaborativeFilter filter = new CollaborativeFilter();
		String[] results = filter.getRecommendations(movie);
		
		//return the results
		return results;
		
	}

}
