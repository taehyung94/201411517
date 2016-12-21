import java.util.*;

class CountMW{
	public static void main(String[] args){
		int[][] data={{74425, 76326},{61164, 61636},{109688, 115744},{144796, 146776},{174996, 181676},{177841, 177434},{204630, 205980},{223373, 232245},{161055, 166130},{171576, 176735},{279169, 293772}, {239450, 251066},{148690, 156510},{182977, 196992}, {237792, 242641},{283869, 296762},{209344, 210282},{118965, 114441},{186503, 186856},{195734, 203014},{254381, 249472},{212401, 229111},{271654, 295354},{319197, 335045},{229829, 231671}};
		Map<String,Integer> m=new HashMap<String,Integer>();
		Map<String,Integer> w=new HashMap<String,Integer>();
		for(int[] d:data){
			if(m.containsKey("m")&&w.containsKey("w")){
				m.put("m",m.get("m")+d[0]);
			    w.put("w",w.get("w")+d[1]);
			}
			else{
				m.put("m",d[0]);
				w.put("w",d[1]);			
			}
		}
		System.out.println("sum is "+(m.get("m")+w.get("w")));
		System.out.println("avg is "+(m.get("m")+w.get("w"))/2);
	}
}		
