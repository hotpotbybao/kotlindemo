package com.vslimit.kotlindemo.base

/**
 * Created by sky on 17/1/6.
 */
interface BaseView<T> {
    fun setPresenter(presenter: T)
}