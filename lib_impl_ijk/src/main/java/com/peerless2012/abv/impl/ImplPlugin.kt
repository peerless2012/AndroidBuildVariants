package com.peerless2012.abv.impl

import com.peerless2012.abv.impl.ijk.IJKImpl

/**
 * @Author peerless2012
 * @Email peerless2012@126.com
 * @DateTime 2023/7/25 18:06
 * @Version V1.0
 * @Description
 */
object ImplPlugin {

    private val impl = IJKImpl()

    fun getImpl(): IImpl {
        return impl
    }

}