package lesson1;

public class RecommenderImplementation {
	
	public String[] recommendMovies(String movie) {
		// User content based filter and find the similar 
		ContentBasedFilter filter = new ContentBasedFilter();
		String[] result = filter.getRecommendation(movie);
		// returns result
		return result;
	}
	

}
