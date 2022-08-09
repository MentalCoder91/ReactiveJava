package com.reactor.sec01;

import com.reactor.courseUtil.Util;

import reactor.core.publisher.Mono;

public class Lec04MonoEmptyOrError {
	
	
	public static void main(String[] args) {
		
		
		userRepository(1100)
			.subscribe(Util.onNext(),Util.onError(),Util.onComplete());
		
	}
	
	
	
	private static Mono<String> userRepository(int userId){
		
		if(userId == 1) {
			return Mono.just(Util.faker().name().firstName());
		}else if(userId == 2){
			return Mono.empty();
		}else {
			
			return Mono.error(new RuntimeException("Not in Allowed range"));
		}
		
	}

}
