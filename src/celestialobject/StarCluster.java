package src.celestialobject;

//Sets up the qualities of a star cluster
public class StarCluster {
		private int starCount; //the amount of stars
		private String clusterType; //the type of star cluster
		
		//changes the value of starCount with stars
		public void setStarCount(int stars){
			starCount = stars;
		}
		//changes the value of clusterType with cluster
		public void setClusterType(String cluster){
			clusterType = cluster;
		}
		//adds a star 
		public void addStar(){
			
		}
		//removes a star
		public void removeStar(){
			
		}
		//returns starCount
		public int getStarCount(){
			return starCount;
		}
		//returns clusterType
		public String getClusterType(){
			return clusterType;
		}
}
