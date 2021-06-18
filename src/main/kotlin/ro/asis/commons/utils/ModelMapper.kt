package ro.asis.commons.utils

interface ModelMapper<A, E> {
    fun toApi(source: E): A
    fun toEntity(source: A): E
    fun toApi(source: Collection<E>): List<A> = source.map { toApi(it) }
    fun toEntity(source: Collection<A>): List<E> = source.map { toEntity(it) }
}
