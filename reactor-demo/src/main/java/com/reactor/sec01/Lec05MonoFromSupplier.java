package com.reactor.sec01;

import com.reactor.courseUtil.Util;

import reactor.core.publisher.Mono;

public class Lec05MonoFromSupplier {

	public static void main(String[] args) {

		// Use only when you have data already.
		// Mono<String> mono = Mono.just(getName());
		// This will call System.out.println("generating name");
		// In this case this will invoke getName directly. Just like JS

		Mono<String> mono = Mono.fromSupplier(() -> getName());

		mono.subscribe(

				Util.onNext());

		// System.out.println(getName());

	}

	private static String getName() {

		System.out.println("generating name");
		return Util.faker().name().firstName();
	}

}
