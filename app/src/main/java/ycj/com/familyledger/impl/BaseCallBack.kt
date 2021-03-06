package ycj.com.familyledger.impl

import ycj.com.familyledger.bean.BaseResponse

/**
 * @author: ycj
 * @date: 2017-06-21 17:21
 * @version V1.0 <>
 */
interface BaseCallBack<T> {
    fun onSuccess(data: BaseResponse<T>)
    fun onFail(msg: String)
}