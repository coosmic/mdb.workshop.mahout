package mahout.workshop;

import java.io.IOException;
import java.io.NotActiveException;
import java.util.ArrayList;
import java.util.List;

import org.apache.mahout.math.Vector;
import org.apache.mahout.math.VectorWritable;
import org.apache.commons.lang.NotImplementedException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.SequenceFile;
import org.apache.hadoop.io.Text;
import org.apache.mahout.clustering.Cluster;
import org.apache.mahout.clustering.classify.WeightedPropertyVectorWritable;
import org.apache.mahout.clustering.kmeans.KMeansDriver;
import org.apache.mahout.clustering.kmeans.Kluster;
import org.apache.mahout.common.HadoopUtil;
import org.apache.mahout.common.distance.EuclideanDistanceMeasure;
import org.apache.mahout.math.NamedVector;
import org.apache.mahout.math.RandomAccessSparseVector;

public class Clustering {
	private double[][] points = { {1, 1}, {2, 1}, {1, 2}, {2, 2}, {3, 3}, {8, 8},{9, 8}, {8, 9}, {9, 9} };
	
	void vectorizeInputAndWriteToSequenceFile(String pathToData) {
		throw new NotImplementedException();
	}
	
	void chooseClustersToBeginAndWriteToSequenceFile(String pathToClusterCenters) {
		throw new NotImplementedException();
	}
	
	void runKMeansClustering(String pathToDataFolder, String pathToClusterCentersFolder, String pathToOutputDataFolder) {
		throw new NotImplementedException();
	}
	
	void printSolution(String pathToOutputData) {
		throw new NotImplementedException();
	}
	
}
