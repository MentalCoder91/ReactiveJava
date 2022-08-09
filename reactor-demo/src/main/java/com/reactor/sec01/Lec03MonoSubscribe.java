package com.reactor.sec01;

import com.reactor.courseUtil.Util;

import reactor.core.publisher.Mono;

public class Lec03MonoSubscribe {

	public static void main(String[] args) {

		Mono<Integer> mono = Mono.just("ball")
							.map(String::length)
							.map(length -> length/1);

		// 1 mono.subscribe();

		// mono.subscribe(System.out::println);

		mono.subscribe(Util.onNext(),Util.onError(),Util.onComplete());
	}

}
