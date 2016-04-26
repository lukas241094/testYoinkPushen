package org.wallerlab.yoink.regionizer.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.wallerlab.yoink.api.model.molecular.Coord;
import org.wallerlab.yoink.api.model.molecular.Molecule;
import org.wallerlab.yoink.api.service.Calculator;

public class DistanceRegionizerQmBufferListBuilder {
	
	private double distanceThreshold;
	private Map<Molecule,Integer> qmRegion;
	private Map<Molecule,Integer> bufferRegion;
	private List<Map<Molecule,Integer>> regions;
	
	
	
	public DistanceRegionizerQmBufferListBuilder(double distanceThreshold){
		this.distanceThreshold = distanceThreshold;
		this.qmRegion = new HashMap<Molecule,Integer>();
		this.bufferRegion = new HashMap<Molecule,Integer>();
		this.regions = Arrays.asList(qmRegion, bufferRegion);
	}

	
	public DistanceRegionizerQmBufferListBuilder mergeBuilder(DistanceRegionizerQmBufferListBuilder other){
		this.regions.get(0).putAll(other.regions.get(0));
		this.regions.get(1).putAll(other.regions.get(1));
		return this;
	}

	
	public DistanceRegionizerQmBufferListBuilder evaluateMolecules(Molecule molecule){
		
		// System.out.println("Distance to core at the ListBuilder " + molecule.getDistanceToCore());
		
		if (molecule.getDistanceToCore() < this.distanceThreshold) {
			this.regions.get(0).put(molecule, molecule.getIndex());
		}
		else {
			this.regions.get(1).put(molecule, molecule.getIndex());
		}
		
		return this;	
		}
	
	
	public List<Map<Molecule, Integer>> getRegions() {
		return regions;
	}
}
