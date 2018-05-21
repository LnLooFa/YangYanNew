package com.yangyan.xxp.yangyannew.mvp.contract

import com.jess.arms.mvp.IModel
import com.jess.arms.mvp.IView

/**
 * Author : zhongwenpeng
 * Email : 1340751953@qq.com
 * Time :  2018/5/21
 * Description :搜索
 */
interface SearchContract {
    interface View : IView

    interface Model : IModel {
        fun searchByKeyword(keyword: String)
    }
}