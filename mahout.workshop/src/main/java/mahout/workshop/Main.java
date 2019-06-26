package mahout.workshop;

import java.io.IOException;

import org.apache.commons.lang.NotImplementedException;
import org.apache.mahout.cf.taste.common.TasteException;

public class Main {
	public static void main(String[] args){ 
        System.out.println("System Start"); 
        Boolean runClustering = true;
        Boolean runRecommender = false;
        Boolean runCSVToDATConverter = false;
        
        
        if(runClustering) {
        	Clustering clustering = new Clustering();
        	clustering.vectorizeInputAndWriteToSequenceFile("./data/clustering/testdata/points/file1");
        	clustering.chooseClustersToBeginAndWriteToSequenceFile("./data/clustering/testdata/clusters/part-00000");
        	clustering.runKMeansClustering(	"./data/clustering/testdata/points", 
        									"./data/clustering/testdata/clusters", 
        									"./data/clustering/output");
        	
        	clustering.printSolution("./data/clustering/output");
        	
        }
        
        if(runRecommender) {
        	Recommender recommender;
			try {
				recommender = new Recommender("./data/recommender/input/ratings.csv");
				recommender.setupRecommender(0.1f);
	        	recommender.printRecommendationsForUser(3, 10);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (TasteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        }
        
        if(runCSVToDATConverter) {
        	CsvDatConverter converter = new CsvDatConverter();
        	converter.convertDatToCSVFile("./data/recommender/input/ratings.dat", "./data/recommender/input/ratings.csv", "?WhatGoesHere?", "?WhatGoesHere?", 3);
        }
        
    }
}
