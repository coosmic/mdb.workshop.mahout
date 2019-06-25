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
	public Recommender(String pathToInputData) {
		//create DataModel here
	}
	
	public void setupRecommender(float thresholdUserNeighborhood) {
		throw new NotImplementedException();
	}
	
	public List<RecommendedItem> getRecommendationsByUserID(int userID, int recommendationAmount){
		throw new NotImplementedException();
	}
	
	public void printRecommendationsForUser(int userID, int recommendationAmount) {
		
	}
}
