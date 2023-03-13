package com.ivettepinto.learningspringframework02.examples.c1;

public class MongoDBDataService implements DataService {

	@Override
	public int[] retrieveData() {
		return new int[] {11, 22, 33, 44, 55};
	}

}
