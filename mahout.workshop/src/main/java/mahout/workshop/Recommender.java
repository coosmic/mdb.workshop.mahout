package mahout.workshop;

import java.util.List;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.ThresholdUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.UserBasedRecommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;

import org.apache.commons.lang.NotImplementedException;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;

public class Recommender {
	
	DataModel model;
	UserBasedRecommender recommenderUserBased;
	
	public Recommender(String pathToInputData) throws IOException {
		model = new FileDataModel(new File(pathToInputData));
	}
	
	public void setupRecommender(float thresholdUserNeighborhood) throws TasteException {
		UserSimilarity similarity = new PearsonCorrelationSimilarity(model);
		UserNeighborhood neighborhood = new ThresholdUserNeighborhood(thresholdUserNeighborhood, similarity, model);
		recommenderUserBased = new GenericUserBasedRecommender(model, neighborhood, similarity);
		
	}
	
	public List<RecommendedItem> getRecommendationsByUserID(int userID, int recommendationAmount) throws TasteException{
		return recommenderUserBased.recommend(userID, recommendationAmount);
	}
	
	public void printRecommendationsForUser(int userID, int recommendationAmount) throws TasteException {
		List<RecommendedItem> recommendations = getRecommendationsByUserID(userID, recommendationAmount);
		int i = 1;
		System.out.println("Recommendations for user with id "+userID+":");
		for(RecommendedItem recommendation : recommendations) {
			System.out.println("\t"+i+" Item: " + recommendation.getItemID()+" Rating:"+recommendation.getValue());
			i++;
		}
	}
}
