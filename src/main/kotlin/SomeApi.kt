package org.example

@RequiresOptIn(level = RequiresOptIn.Level.ERROR)
annotation class ExperimentalApi

/**
 * This is an experimental function! I might change it soon!
 *
 * @return `42`
 *
 * @sample org.example.Samples.expFunSample
 */
@ExperimentalApi
public fun experimentalFunction(): Int = 42
