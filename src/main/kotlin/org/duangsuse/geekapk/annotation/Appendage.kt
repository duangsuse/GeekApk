package org.duangsuse.geekapk.annotation

/**
 * Appendage to another entity
 *
 * @param entity owing entity
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
annotation class Appendage(val entity: String)
