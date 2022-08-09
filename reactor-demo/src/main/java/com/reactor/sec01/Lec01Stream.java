package com.reactor.sec01;

import java.util.stream.Stream;

public class Lec01Stream {

	public static void main(String[] args) {
		
		
		
		Stream<Integer> strIntStream =  Stream.of(1,2,3,4,5,5).map(x->{
			
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			return x*2;
			
		});
		
		strIntStream.forEach(System.out::println);
		
		
		
		

	}

}
