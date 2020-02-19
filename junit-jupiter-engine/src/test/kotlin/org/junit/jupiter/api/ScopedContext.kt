/*
 * Copyright 2015-2020 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */
package org.junit.jupiter.api

fun <T> contextScope(block: ContextScope.() -> T): T = object : ContextScope {
    override fun <T> launch(block: ContextScope.() -> T): T = run(block)
}.run(block)
