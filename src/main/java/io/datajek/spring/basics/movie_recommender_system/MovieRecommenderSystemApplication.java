package io.datajek.spring.basics.movie_recommender_system;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lesson1.RecommenderImplementation;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		RecommenderImplementation recommender = new RecommenderImplementation();
		String[] result = recommender.recommendMovies("Finding Dory");
		// Printing recommended result
		System.out.println(Arrays.toString(result));
	}

}
