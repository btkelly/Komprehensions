/*
 * Copyright (c) pakoito 2017
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:JvmName("KomprehensionsRx")

package com.pacoworks.komprehensions.rx2

import io.reactivex.Observable
import io.reactivex.ObservableTransformer

import io.reactivex.Single
import io.reactivex.SingleTransformer


/**
 * Composes an [rx.Single] from multiple creation functions chained by [rx.Single.flatMap].
 *
 * @return composed Single
 */
fun <A, R> doFlatMap(
        zero: () -> Single<A>,
        one: (A) -> Single<R>): Single<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                }

/**
 * Composes an [rx.Single] from multiple creation functions chained by [rx.Single.flatMap].
 *
 * @return composed Single
 */
fun <A, B, R> doFlatMap(
        zero: () -> Single<A>,
        one: (A) -> Single<B>,
        two: (A, B) -> Single<R>): Single<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                            .flatMap { b ->
                                two.invoke(a, b)
                            }
                }

/**
 * Composes an [rx.Single] from multiple creation functions chained by [rx.Single.flatMap].
 *
 * @return composed Single
 */
fun <A, B, C, R> doFlatMap(
        zero: () -> Single<A>,
        one: (A) -> Single<B>,
        two: (A, B) -> Single<C>,
        three: (A, B, C) -> Single<R>): Single<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                            .flatMap { b ->
                                two.invoke(a, b)
                                        .flatMap { c ->
                                            three.invoke(a, b, c)
                                        }
                            }
                }

/**
 * Composes an [rx.Single] from multiple creation functions chained by [rx.Single.flatMap].
 *
 * @return composed Single
 */
fun <A, B, C, D, R> doFlatMap(
        zero: () -> Single<A>,
        one: (A) -> Single<B>,
        two: (A, B) -> Single<C>,
        three: (A, B, C) -> Single<D>,
        four: (A, B, C, D) -> Single<R>): Single<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                            .flatMap { b ->
                                two.invoke(a, b)
                                        .flatMap { c ->
                                            three.invoke(a, b, c)
                                                    .flatMap { d ->
                                                        four.invoke(a, b, c, d)
                                                    }
                                        }
                            }
                }

/**
 * Composes an [rx.Single] from multiple creation functions chained by [rx.Single.flatMap].
 *
 * @return composed Single
 */
fun <A, B, C, D, E, R> doFlatMap(
        zero: () -> Single<A>,
        one: (A) -> Single<B>,
        two: (A, B) -> Single<C>,
        three: (A, B, C) -> Single<D>,
        four: (A, B, C, D) -> Single<E>,
        five: (A, B, C, D, E) -> Single<R>): Single<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                            .flatMap { b ->
                                two.invoke(a, b)
                                        .flatMap { c ->
                                            three.invoke(a, b, c)
                                                    .flatMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .flatMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an [rx.Single] from multiple creation functions chained by [rx.Single.flatMap].
 *
 * @return composed Single
 */
fun <A, B, C, D, E, F, R> doFlatMap(
        zero: () -> Single<A>,
        one: (A) -> Single<B>,
        two: (A, B) -> Single<C>,
        three: (A, B, C) -> Single<D>,
        four: (A, B, C, D) -> Single<E>,
        five: (A, B, C, D, E) -> Single<F>,
        six: (A, B, C, D, E, F) -> Single<R>): Single<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                            .flatMap { b ->
                                two.invoke(a, b)
                                        .flatMap { c ->
                                            three.invoke(a, b, c)
                                                    .flatMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .flatMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .flatMap { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                            }
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an [rx.Single] from multiple creation functions chained by [rx.Single.flatMap].
 *
 * @return composed Single
 */
fun <A, B, C, D, E, F, G, R> doFlatMap(
        zero: () -> Single<A>,
        one: (A) -> Single<B>,
        two: (A, B) -> Single<C>,
        three: (A, B, C) -> Single<D>,
        four: (A, B, C, D) -> Single<E>,
        five: (A, B, C, D, E) -> Single<F>,
        six: (A, B, C, D, E, F) -> Single<G>,
        seven: (A, B, C, D, E, F, G) -> Single<R>): Single<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                            .flatMap { b ->
                                two.invoke(a, b)
                                        .flatMap { c ->
                                            three.invoke(a, b, c)
                                                    .flatMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .flatMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .flatMap { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                                        .flatMap { g ->
                                                                                            seven.invoke(a, b, c, d, e, f, g)
                                                                                        }
                                                                            }
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an [rx.Single] from multiple creation functions chained by [rx.Single.flatMap].
 *
 * @return composed Single
 */
fun <A, B, C, D, E, F, G, H, R> doFlatMap(
        zero: () -> Single<A>,
        one: (A) -> Single<B>,
        two: (A, B) -> Single<C>,
        three: (A, B, C) -> Single<D>,
        four: (A, B, C, D) -> Single<E>,
        five: (A, B, C, D, E) -> Single<F>,
        six: (A, B, C, D, E, F) -> Single<G>,
        seven: (A, B, C, D, E, F, G) -> Single<H>,
        eight: (A, B, C, D, E, F, G, H) -> Single<R>): Single<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                            .flatMap { b ->
                                two.invoke(a, b)
                                        .flatMap { c ->
                                            three.invoke(a, b, c)
                                                    .flatMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .flatMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .flatMap { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                                        .flatMap { g ->
                                                                                            seven.invoke(a, b, c, d, e, f, g)
                                                                                                    .flatMap { h ->
                                                                                                        eight.invoke(a, b, c, d, e, f, g, h)
                                                                                                    }
                                                                                        }
                                                                            }
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an [rx.Single] from multiple creation functions chained by [rx.Single.flatMap].
 *
 * @return composed Single
 */
fun <A, B, C, D, E, F, G, H, I, R> doFlatMap(
        zero: () -> Single<A>,
        one: (A) -> Single<B>,
        two: (A, B) -> Single<C>,
        three: (A, B, C) -> Single<D>,
        four: (A, B, C, D) -> Single<E>,
        five: (A, B, C, D, E) -> Single<F>,
        six: (A, B, C, D, E, F) -> Single<G>,
        seven: (A, B, C, D, E, F, G) -> Single<H>,
        eight: (A, B, C, D, E, F, G, H) -> Single<I>,
        nine: (A, B, C, D, E, F, G, H, I) -> Single<R>): Single<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                            .flatMap { b ->
                                two.invoke(a, b)
                                        .flatMap { c ->
                                            three.invoke(a, b, c)
                                                    .flatMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .flatMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .flatMap { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                                        .flatMap { g ->
                                                                                            seven.invoke(a, b, c, d, e, f, g)
                                                                                                    .flatMap { h ->
                                                                                                        eight.invoke(a, b, c, d, e, f, g, h)
                                                                                                                .flatMap { i ->
                                                                                                                    nine.invoke(a, b, c, d, e, f, g, h, i)
                                                                                                                }
                                                                                                    }
                                                                                        }
                                                                            }
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an [rx.Single] from multiple [Transformer] chained by [Single.compose].
 *
 * @return composed Single
 */
fun <A, R> doCompose(
        zero: () -> Single<A>,
        one: SingleTransformer<A, R>): Single<R> =
        zero()
                .compose(one)

/**
 * Composes an [rx.Single] from multiple [Transformer] chained by [Single.compose].
 *
 * @return composed Single
 */
fun <A, B, R> doCompose(
        zero: () -> Single<A>,
        one: SingleTransformer<A, B>,
        two: SingleTransformer<B, R>): Single<R> =
        zero()
                .compose(one)
                .compose(two)

/**
 * Composes an [rx.Single] from multiple [Transformer] chained by [Single.compose].
 *
 * @return composed Single
 */
fun <A, B, C, R> doCompose(
        zero: () -> Single<A>,
        one: SingleTransformer<A, B>,
        two: SingleTransformer<B, C>,
        three: SingleTransformer<C, R>): Single<R> =
        zero()
                .compose(one)
                .compose(two)
                .compose(three)

/**
 * Composes an [rx.Single] from multiple [Transformer] chained by [Single.compose].
 *
 * @return composed Single
 */
fun <A, B, C, D, R> doCompose(
        zero: () -> Single<A>,
        one: SingleTransformer<A, B>,
        two: SingleTransformer<B, C>,
        three: SingleTransformer<C, D>,
        four: SingleTransformer<D, R>): Single<R> =
        zero()
                .compose(one)
                .compose(two)
                .compose(three)
                .compose(four)

/**
 * Composes an [rx.Single] from multiple [Transformer] chained by [Single.compose].
 *
 * @return composed Single
 */
fun <A, B, C, D, E, R> doCompose(
        zero: () -> Single<A>,
        one: SingleTransformer<A, B>,
        two: SingleTransformer<B, C>,
        three: SingleTransformer<C, D>,
        four: SingleTransformer<D, E>,
        five: SingleTransformer<E, R>): Single<R> =
        zero()
                .compose(one)
                .compose(two)
                .compose(three)
                .compose(four)
                .compose(five)

/**
 * Composes an [rx.Single] from multiple [Transformer] chained by [Single.compose].
 *
 * @return composed Single
 */
fun <A, B, C, D, E, F, R> doCompose(
        zero: () -> Single<A>,
        one: SingleTransformer<A, B>,
        two: SingleTransformer<B, C>,
        three: SingleTransformer<C, D>,
        four: SingleTransformer<D, E>,
        five: SingleTransformer<E, F>,
        six: SingleTransformer<F, R>): Single<R> =
        zero()
                .compose(one)
                .compose(two)
                .compose(three)
                .compose(four)
                .compose(five)
                .compose(six)

/**
 * Composes an [rx.Single] from multiple [Transformer] chained by [Single.compose].
 *
 * @return composed Single
 */
fun <A, B, C, D, E, F, G, R> doCompose(
        zero: () -> Single<A>,
        one: SingleTransformer<A, B>,
        two: SingleTransformer<B, C>,
        three: SingleTransformer<C, D>,
        four: SingleTransformer<D, E>,
        five: SingleTransformer<E, F>,
        six: SingleTransformer<F, G>,
        seven: SingleTransformer<G, R>): Single<R> =
        zero()
                .compose(one)
                .compose(two)
                .compose(three)
                .compose(four)
                .compose(five)
                .compose(six)
                .compose(seven)

/**
 * Composes an [rx.Single] from multiple [Transformer] chained by [Single.compose].
 *
 * @return composed Single
 */
fun <A, B, C, D, E, F, G, H, R> doCompose(
        zero: () -> Single<A>,
        one: SingleTransformer<A, B>,
        two: SingleTransformer<B, C>,
        three: SingleTransformer<C, D>,
        four: SingleTransformer<D, E>,
        five: SingleTransformer<E, F>,
        six: SingleTransformer<F, G>,
        seven: SingleTransformer<G, H>,
        eight: SingleTransformer<H, R>): Single<R> =
        zero()
                .compose(one)
                .compose(two)
                .compose(three)
                .compose(four)
                .compose(five)
                .compose(six)
                .compose(seven)
                .compose(eight)

/**
 * Composes an [rx.Single] from multiple [Transformer] chained by [Single.compose].
 *
 * @return composed Single
 */
fun <A, B, C, D, E, F, G, H, I, R> doCompose(
        zero: () -> Single<A>,
        one: SingleTransformer<A, B>,
        two: SingleTransformer<B, C>,
        three: SingleTransformer<C, D>,
        four: SingleTransformer<D, E>,
        five: SingleTransformer<E, F>,
        six: SingleTransformer<F, G>,
        seven: SingleTransformer<G, H>,
        eight: SingleTransformer<H, I>,
        nine: SingleTransformer<I, R>): Single<R> =
        zero()
                .compose(one)
                .compose(two)
                .compose(three)
                .compose(four)
                .compose(five)
                .compose(six)
                .compose(seven)
                .compose(eight)
                .compose(nine)

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.flatMap].
 *
 * @return composed Observable
 */
fun <A, R> doFlatMap(
        zero: () -> Observable<A>,
        one: (A) -> Observable<R>): Observable<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.flatMap].
 *
 * @return composed Observable
 */
fun <A, B, R> doFlatMap(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<R>): Observable<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                            .flatMap { b ->
                                two.invoke(a, b)
                            }
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.flatMap].
 *
 * @return composed Observable
 */
fun <A, B, C, R> doFlatMap(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<R>): Observable<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                            .flatMap { b ->
                                two.invoke(a, b)
                                        .flatMap { c ->
                                            three.invoke(a, b, c)
                                        }
                            }
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.flatMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, R> doFlatMap(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<R>): Observable<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                            .flatMap { b ->
                                two.invoke(a, b)
                                        .flatMap { c ->
                                            three.invoke(a, b, c)
                                                    .flatMap { d ->
                                                        four.invoke(a, b, c, d)
                                                    }
                                        }
                            }
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.flatMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, R> doFlatMap(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<E>,
        five: (A, B, C, D, E) -> Observable<R>): Observable<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                            .flatMap { b ->
                                two.invoke(a, b)
                                        .flatMap { c ->
                                            three.invoke(a, b, c)
                                                    .flatMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .flatMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.flatMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, R> doFlatMap(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<E>,
        five: (A, B, C, D, E) -> Observable<F>,
        six: (A, B, C, D, E, F) -> Observable<R>): Observable<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                            .flatMap { b ->
                                two.invoke(a, b)
                                        .flatMap { c ->
                                            three.invoke(a, b, c)
                                                    .flatMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .flatMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .flatMap { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                            }
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.flatMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, G, R> doFlatMap(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<E>,
        five: (A, B, C, D, E) -> Observable<F>,
        six: (A, B, C, D, E, F) -> Observable<G>,
        seven: (A, B, C, D, E, F, G) -> Observable<R>): Observable<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                            .flatMap { b ->
                                two.invoke(a, b)
                                        .flatMap { c ->
                                            three.invoke(a, b, c)
                                                    .flatMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .flatMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .flatMap { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                                        .flatMap { g ->
                                                                                            seven.invoke(a, b, c, d, e, f, g)
                                                                                        }
                                                                            }
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.flatMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, G, H, R> doFlatMap(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<E>,
        five: (A, B, C, D, E) -> Observable<F>,
        six: (A, B, C, D, E, F) -> Observable<G>,
        seven: (A, B, C, D, E, F, G) -> Observable<H>,
        eight: (A, B, C, D, E, F, G, H) -> Observable<R>): Observable<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                            .flatMap { b ->
                                two.invoke(a, b)
                                        .flatMap { c ->
                                            three.invoke(a, b, c)
                                                    .flatMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .flatMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .flatMap { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                                        .flatMap { g ->
                                                                                            seven.invoke(a, b, c, d, e, f, g)
                                                                                                    .flatMap { h ->
                                                                                                        eight.invoke(a, b, c, d, e, f, g, h)
                                                                                                    }
                                                                                        }
                                                                            }
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.flatMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, G, H, I, R> doFlatMap(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<E>,
        five: (A, B, C, D, E) -> Observable<F>,
        six: (A, B, C, D, E, F) -> Observable<G>,
        seven: (A, B, C, D, E, F, G) -> Observable<H>,
        eight: (A, B, C, D, E, F, G, H) -> Observable<I>,
        nine: (A, B, C, D, E, F, G, H, I) -> Observable<R>): Observable<R> =
        zero.invoke()
                .flatMap { a ->
                    one.invoke(a)
                            .flatMap { b ->
                                two.invoke(a, b)
                                        .flatMap { c ->
                                            three.invoke(a, b, c)
                                                    .flatMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .flatMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .flatMap { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                                        .flatMap { g ->
                                                                                            seven.invoke(a, b, c, d, e, f, g)
                                                                                                    .flatMap { h ->
                                                                                                        eight.invoke(a, b, c, d, e, f, g, h)
                                                                                                                .flatMap { i ->
                                                                                                                    nine.invoke(a, b, c, d, e, f, g, h, i)
                                                                                                                }
                                                                                                    }
                                                                                        }
                                                                            }
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.concatMap].
 *
 * @return composed Observable
 */
fun <A, R> doConcatMap(
        zero: () -> Observable<A>,
        one: (A) -> Observable<R>): Observable<R> =
        zero.invoke()
                .concatMap { a ->
                    one.invoke(a)
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.concatMap].
 *
 * @return composed Observable
 */
fun <A, B, R> doConcatMap(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<R>): Observable<R> =
        zero.invoke()
                .concatMap { a ->
                    one.invoke(a)
                            .concatMap { b ->
                                two.invoke(a, b)
                            }
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.concatMap].
 *
 * @return composed Observable
 */
fun <A, B, C, R> doConcatMap(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<R>): Observable<R> =
        zero.invoke()
                .concatMap { a ->
                    one.invoke(a)
                            .concatMap { b ->
                                two.invoke(a, b)
                                        .concatMap { c ->
                                            three.invoke(a, b, c)
                                        }
                            }
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.concatMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, R> doConcatMap(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<R>): Observable<R> =
        zero.invoke()
                .concatMap { a ->
                    one.invoke(a)
                            .concatMap { b ->
                                two.invoke(a, b)
                                        .concatMap { c ->
                                            three.invoke(a, b, c)
                                                    .concatMap { d ->
                                                        four.invoke(a, b, c, d)
                                                    }
                                        }
                            }
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.concatMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, R> doConcatMap(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<E>,
        five: (A, B, C, D, E) -> Observable<R>): Observable<R> =
        zero.invoke()
                .concatMap { a ->
                    one.invoke(a)
                            .concatMap { b ->
                                two.invoke(a, b)
                                        .concatMap { c ->
                                            three.invoke(a, b, c)
                                                    .concatMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .concatMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.concatMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, R> doConcatMap(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<E>,
        five: (A, B, C, D, E) -> Observable<F>,
        six: (A, B, C, D, E, F) -> Observable<R>): Observable<R> =
        zero.invoke()
                .concatMap { a ->
                    one.invoke(a)
                            .concatMap { b ->
                                two.invoke(a, b)
                                        .concatMap { c ->
                                            three.invoke(a, b, c)
                                                    .concatMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .concatMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .concatMap { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                            }
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.concatMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, G, R> doConcatMap(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<E>,
        five: (A, B, C, D, E) -> Observable<F>,
        six: (A, B, C, D, E, F) -> Observable<G>,
        seven: (A, B, C, D, E, F, G) -> Observable<R>): Observable<R> =
        zero.invoke()
                .concatMap { a ->
                    one.invoke(a)
                            .concatMap { b ->
                                two.invoke(a, b)
                                        .concatMap { c ->
                                            three.invoke(a, b, c)
                                                    .concatMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .concatMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .concatMap { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                                        .concatMap { g ->
                                                                                            seven.invoke(a, b, c, d, e, f, g)
                                                                                        }
                                                                            }
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.concatMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, G, H, R> doConcatMap(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<E>,
        five: (A, B, C, D, E) -> Observable<F>,
        six: (A, B, C, D, E, F) -> Observable<G>,
        seven: (A, B, C, D, E, F, G) -> Observable<H>,
        eight: (A, B, C, D, E, F, G, H) -> Observable<R>): Observable<R> =
        zero.invoke()
                .concatMap { a ->
                    one.invoke(a)
                            .concatMap { b ->
                                two.invoke(a, b)
                                        .concatMap { c ->
                                            three.invoke(a, b, c)
                                                    .concatMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .concatMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .concatMap { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                                        .concatMap { g ->
                                                                                            seven.invoke(a, b, c, d, e, f, g)
                                                                                                    .concatMap { h ->
                                                                                                        eight.invoke(a, b, c, d, e, f, g, h)
                                                                                                    }
                                                                                        }
                                                                            }
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.concatMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, G, H, I, R> doConcatMap(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<E>,
        five: (A, B, C, D, E) -> Observable<F>,
        six: (A, B, C, D, E, F) -> Observable<G>,
        seven: (A, B, C, D, E, F, G) -> Observable<H>,
        eight: (A, B, C, D, E, F, G, H) -> Observable<I>,
        nine: (A, B, C, D, E, F, G, H, I) -> Observable<R>): Observable<R> =
        zero.invoke()
                .concatMap { a ->
                    one.invoke(a)
                            .concatMap { b ->
                                two.invoke(a, b)
                                        .concatMap { c ->
                                            three.invoke(a, b, c)
                                                    .concatMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .concatMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .concatMap { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                                        .concatMap { g ->
                                                                                            seven.invoke(a, b, c, d, e, f, g)
                                                                                                    .concatMap { h ->
                                                                                                        eight.invoke(a, b, c, d, e, f, g, h)
                                                                                                                .concatMap { i ->
                                                                                                                    nine.invoke(a, b, c, d, e, f, g, h, i)
                                                                                                                }
                                                                                                    }
                                                                                        }
                                                                            }
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.switchMap].
 *
 * @return composed Observable
 */
fun <A, R> doSwitchMap(
        zero: () -> Observable<A>,
        one: (A) -> Observable<R>): Observable<R> =
        zero.invoke()
                .switchMap { a ->
                    one.invoke(a)
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.switchMap].
 *
 * @return composed Observable
 */
fun <A, B, R> doSwitchMap(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<R>): Observable<R> =
        zero.invoke()
                .switchMap { a ->
                    one.invoke(a)
                            .switchMap { b ->
                                two.invoke(a, b)
                            }
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.switchMap].
 *
 * @return composed Observable
 */
fun <A, B, C, R> doSwitchMap(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<R>): Observable<R> =
        zero.invoke()
                .switchMap { a ->
                    one.invoke(a)
                            .switchMap { b ->
                                two.invoke(a, b)
                                        .switchMap { c ->
                                            three.invoke(a, b, c)
                                        }
                            }
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.switchMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, R> doSwitchMap(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<R>): Observable<R> =
        zero.invoke()
                .switchMap { a ->
                    one.invoke(a)
                            .switchMap { b ->
                                two.invoke(a, b)
                                        .switchMap { c ->
                                            three.invoke(a, b, c)
                                                    .switchMap { d ->
                                                        four.invoke(a, b, c, d)
                                                    }
                                        }
                            }
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.switchMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, R> doSwitchMap(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<E>,
        five: (A, B, C, D, E) -> Observable<R>): Observable<R> =
        zero.invoke()
                .switchMap { a ->
                    one.invoke(a)
                            .switchMap { b ->
                                two.invoke(a, b)
                                        .switchMap { c ->
                                            three.invoke(a, b, c)
                                                    .switchMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .switchMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.switchMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, R> doSwitchMap(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<E>,
        five: (A, B, C, D, E) -> Observable<F>,
        six: (A, B, C, D, E, F) -> Observable<R>): Observable<R> =
        zero.invoke()
                .switchMap { a ->
                    one.invoke(a)
                            .switchMap { b ->
                                two.invoke(a, b)
                                        .switchMap { c ->
                                            three.invoke(a, b, c)
                                                    .switchMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .switchMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .switchMap { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                            }
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.switchMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, G, R> doSwitchMap(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<E>,
        five: (A, B, C, D, E) -> Observable<F>,
        six: (A, B, C, D, E, F) -> Observable<G>,
        seven: (A, B, C, D, E, F, G) -> Observable<R>): Observable<R> =
        zero.invoke()
                .switchMap { a ->
                    one.invoke(a)
                            .switchMap { b ->
                                two.invoke(a, b)
                                        .switchMap { c ->
                                            three.invoke(a, b, c)
                                                    .switchMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .switchMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .switchMap { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                                        .switchMap { g ->
                                                                                            seven.invoke(a, b, c, d, e, f, g)
                                                                                        }
                                                                            }
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.switchMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, G, H, R> doSwitchMap(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<E>,
        five: (A, B, C, D, E) -> Observable<F>,
        six: (A, B, C, D, E, F) -> Observable<G>,
        seven: (A, B, C, D, E, F, G) -> Observable<H>,
        eight: (A, B, C, D, E, F, G, H) -> Observable<R>): Observable<R> =
        zero.invoke()
                .switchMap { a ->
                    one.invoke(a)
                            .switchMap { b ->
                                two.invoke(a, b)
                                        .switchMap { c ->
                                            three.invoke(a, b, c)
                                                    .switchMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .switchMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .switchMap { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                                        .switchMap { g ->
                                                                                            seven.invoke(a, b, c, d, e, f, g)
                                                                                                    .switchMap { h ->
                                                                                                        eight.invoke(a, b, c, d, e, f, g, h)
                                                                                                    }
                                                                                        }
                                                                            }
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an [rx.Observable] from multiple creation functions chained by [rx.Observable.switchMap].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, G, H, I, R> doSwitchMap(
        zero: () -> Observable<A>,
        one: (A) -> Observable<B>,
        two: (A, B) -> Observable<C>,
        three: (A, B, C) -> Observable<D>,
        four: (A, B, C, D) -> Observable<E>,
        five: (A, B, C, D, E) -> Observable<F>,
        six: (A, B, C, D, E, F) -> Observable<G>,
        seven: (A, B, C, D, E, F, G) -> Observable<H>,
        eight: (A, B, C, D, E, F, G, H) -> Observable<I>,
        nine: (A, B, C, D, E, F, G, H, I) -> Observable<R>): Observable<R> =
        zero.invoke()
                .switchMap { a ->
                    one.invoke(a)
                            .switchMap { b ->
                                two.invoke(a, b)
                                        .switchMap { c ->
                                            three.invoke(a, b, c)
                                                    .switchMap { d ->
                                                        four.invoke(a, b, c, d)
                                                                .switchMap { e ->
                                                                    five.invoke(a, b, c, d, e)
                                                                            .switchMap { f ->
                                                                                six.invoke(a, b, c, d, e, f)
                                                                                        .switchMap { g ->
                                                                                            seven.invoke(a, b, c, d, e, f, g)
                                                                                                    .switchMap { h ->
                                                                                                        eight.invoke(a, b, c, d, e, f, g, h)
                                                                                                                .switchMap { i ->
                                                                                                                    nine.invoke(a, b, c, d, e, f, g, h, i)
                                                                                                                }
                                                                                                    }
                                                                                        }
                                                                            }
                                                                }
                                                    }
                                        }
                            }
                }

/**
 * Composes an [rx.Observable] from multiple [Transformer] chained by [Observable.compose].
 *
 * @return composed Observable
 */
fun <A, R> doCompose(
        zero: () -> Observable<A>,
        one: ObservableTransformer<A, R>): Observable<R> =
        zero()
                .compose(one)

/**
 * Composes an [rx.Observable] from multiple [Transformer] chained by [Observable.compose].
 *
 * @return composed Observable
 */
fun <A, B, R> doCompose(
        zero: () -> Observable<A>,
        one: ObservableTransformer<A, B>,
        two: ObservableTransformer<B, R>): Observable<R> =
        zero()
                .compose(one)
                .compose(two)

/**
 * Composes an [rx.Observable] from multiple [Transformer] chained by [Observable.compose].
 *
 * @return composed Observable
 */
fun <A, B, C, R> doCompose(
        zero: () -> Observable<A>,
        one: ObservableTransformer<A, B>,
        two: ObservableTransformer<B, C>,
        three: ObservableTransformer<C, R>): Observable<R> =
        zero()
                .compose(one)
                .compose(two)
                .compose(three)

/**
 * Composes an [rx.Observable] from multiple [Transformer] chained by [Observable.compose].
 *
 * @return composed Observable
 */
fun <A, B, C, D, R> doCompose(
        zero: () -> Observable<A>,
        one: ObservableTransformer<A, B>,
        two: ObservableTransformer<B, C>,
        three: ObservableTransformer<C, D>,
        four: ObservableTransformer<D, R>): Observable<R> =
        zero()
                .compose(one)
                .compose(two)
                .compose(three)
                .compose(four)

/**
 * Composes an [rx.Observable] from multiple [Transformer] chained by [Observable.compose].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, R> doCompose(
        zero: () -> Observable<A>,
        one: ObservableTransformer<A, B>,
        two: ObservableTransformer<B, C>,
        three: ObservableTransformer<C, D>,
        four: ObservableTransformer<D, E>,
        five: ObservableTransformer<E, R>): Observable<R> =
        zero()
                .compose(one)
                .compose(two)
                .compose(three)
                .compose(four)
                .compose(five)

/**
 * Composes an [rx.Observable] from multiple [Transformer] chained by [Observable.compose].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, R> doCompose(
        zero: () -> Observable<A>,
        one: ObservableTransformer<A, B>,
        two: ObservableTransformer<B, C>,
        three: ObservableTransformer<C, D>,
        four: ObservableTransformer<D, E>,
        five: ObservableTransformer<E, F>,
        six: ObservableTransformer<F, R>): Observable<R> =
        zero()
                .compose(one)
                .compose(two)
                .compose(three)
                .compose(four)
                .compose(five)
                .compose(six)

/**
 * Composes an [rx.Observable] from multiple [Transformer] chained by [Observable.compose].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, G, R> doCompose(
        zero: () -> Observable<A>,
        one: ObservableTransformer<A, B>,
        two: ObservableTransformer<B, C>,
        three: ObservableTransformer<C, D>,
        four: ObservableTransformer<D, E>,
        five: ObservableTransformer<E, F>,
        six: ObservableTransformer<F, G>,
        seven: ObservableTransformer<G, R>): Observable<R> =
        zero()
                .compose(one)
                .compose(two)
                .compose(three)
                .compose(four)
                .compose(five)
                .compose(six)
                .compose(seven)

/**
 * Composes an [rx.Observable] from multiple [Transformer] chained by [Observable.compose].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, G, H, R> doCompose(
        zero: () -> Observable<A>,
        one: ObservableTransformer<A, B>,
        two: ObservableTransformer<B, C>,
        three: ObservableTransformer<C, D>,
        four: ObservableTransformer<D, E>,
        five: ObservableTransformer<E, F>,
        six: ObservableTransformer<F, G>,
        seven: ObservableTransformer<G, H>,
        eight: ObservableTransformer<H, R>): Observable<R> =
        zero()
                .compose(one)
                .compose(two)
                .compose(three)
                .compose(four)
                .compose(five)
                .compose(six)
                .compose(seven)
                .compose(eight)

/**
 * Composes an [rx.Observable] from multiple [Transformer] chained by [Observable.compose].
 *
 * @return composed Observable
 */
fun <A, B, C, D, E, F, G, H, I, R> doCompose(
        zero: () -> Observable<A>,
        one: ObservableTransformer<A, B>,
        two: ObservableTransformer<B, C>,
        three: ObservableTransformer<C, D>,
        four: ObservableTransformer<D, E>,
        five: ObservableTransformer<E, F>,
        six: ObservableTransformer<F, G>,
        seven: ObservableTransformer<G, H>,
        eight: ObservableTransformer<H, I>,
        nine: ObservableTransformer<I, R>): Observable<R> =
        zero()
                .compose(one)
                .compose(two)
                .compose(three)
                .compose(four)
                .compose(five)
                .compose(six)
                .compose(seven)
                .compose(eight)
                .compose(nine)