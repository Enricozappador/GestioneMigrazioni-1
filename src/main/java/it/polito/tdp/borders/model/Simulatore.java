package it.polito.tdp.borders.model;

import java.util.Map;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;

public class Simulatore {
	
	private Graph<Country, DefaultEdge> grafo; 
	
	private int N_MIGRANTI = 1000; 
	private Country partenza; 
	
	private int T; 
	private Map<Country, Integer> stanziali; 
	
	private PriorityQueue<Evento> queue; 
	
	
	

}
