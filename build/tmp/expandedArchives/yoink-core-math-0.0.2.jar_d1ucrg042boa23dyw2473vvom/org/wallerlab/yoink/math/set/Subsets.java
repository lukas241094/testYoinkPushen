package org.wallerlab.yoink.math.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * this class is to get all subsets of an integer array,return an list of
 * integer lists. 
 * It is from  @see <a href="http://www.programcreek.com/2013/01/leetcode-subsets-java/">this website.</a>
 * 
 * 
 *
 */
public class Subsets {

	/**
	 * 
	 * @param S
	 *            - an integer array
	 * @return if the input S is empty,return null else return an list of
	 *         integer lists
	 */
	public static ArrayList<ArrayList<Integer>> split(int[] S) {
		if (S == null)
			return null;
		Arrays.sort(S);
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < S.length; i++) {
			ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
			// get sets that are already in result
			for (ArrayList<Integer> a : result) {
				temp.add(new ArrayList<Integer>(a));
			}
			// add S[i] to existing sets
			for (ArrayList<Integer> a : temp) {
				a.add(S[i]);
			}
			// add S[i] only as a set
			ArrayList<Integer> single = new ArrayList<Integer>();
			single.add(S[i]);
			temp.add(single);
			result.addAll(temp);
		}
		// add empty set
		result.add(new ArrayList<Integer>());
		return result;
	}

	/**
	 * this method is to get all subsets with the same size of an integer array.
	 * integer lists
	 * 
	 * @param S
	 *            - an integer array
	 * @param size
	 *            - the size of subsets
	 * 
	 * @return if the input S is empty,return null else return an list of
	 *         integer lists
	 */
	public static ArrayList<ArrayList<Integer>> split(int[] S, int size) {
		if (S == null)
			return null;
		Arrays.sort(S);
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < S.length; i++) {
			ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
			// get sets that are already in result
			for (ArrayList<Integer> a : result) {
				temp.add(new ArrayList<Integer>(a));
			}
			// add S[i] to existing sets
			for (ArrayList<Integer> a : temp) {
				a.add(S[i]);
			}
			// add S[i] only as a set
			ArrayList<Integer> single = new ArrayList<Integer>();
			single.add(S[i]);
			temp.add(single);
			
			
				result.addAll(temp);
			
		}
		ArrayList<ArrayList<Integer>> sizeResult = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<result.size();i++){
			if(result.get(i).size()==size){
				sizeResult.add(result.get(i));
			}
		}
		
		return sizeResult;
	}
	

	/**
	 * 
	 * @param S
	 *            - an Double array
	 * @return if the input S is empty,return null else return an list of
	 *         Double lists
	 */
	public static ArrayList<ArrayList<Double>> splitDoubleArray(double[] S) {
		if (S == null)
			return null;
		Arrays.sort(S);
		ArrayList<ArrayList<Double>> result = new ArrayList<ArrayList<Double>>();
		for (int i = 0; i < S.length; i++) {
			ArrayList<ArrayList<Double>> temp = new ArrayList<ArrayList<Double>>();
			// get sets that are already in result
			for (ArrayList<Double> a : result) {
				temp.add(new ArrayList<Double>(a));
			}
			// add S[i] to existing sets
			for (ArrayList<Double> a : temp) {
				a.add(S[i]);
			}
			// add S[i] only as a set
			ArrayList<Double> single = new ArrayList<Double>();
			single.add(S[i]);
			temp.add(single);
			result.addAll(temp);
		}
		// add empty set
		result.add(new ArrayList<Double>());
		return result;
	}
	
	
}
