/*
 * Copyright 2015-2021 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class MainTests {

	@Test
	void sumTest() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(7);
		l.add(3);
		assertEquals(15, Main.sum(l));
	}

	@Test
	void productTest() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(7);
		l.add(3);
		assertEquals(105, Main.product(l));
	}

	@Test
	void multByConstantTest() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(7);
		l.add(3);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(10);
		expected.add(14);
		expected.add(6);
		assertEquals(expected, Main.multByConstant(l, 2));
	}

	@Test
	void addConstantTest() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(7);
		l.add(3);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(7);
		expected.add(9);
		expected.add(5);
		assertEquals(expected, Main.addConstant(l, 2));
	}


}
