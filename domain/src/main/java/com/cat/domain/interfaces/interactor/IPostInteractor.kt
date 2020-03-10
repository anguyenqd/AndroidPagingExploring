package com.cat.domain.interfaces.interactor

import android.content.Context
import com.cat.domain.DataWrapper
import com.cat.domain.entity.PagingPosts
import com.cat.domain.entity.request.LoadPostRequest
import com.cat.domain.interfaces.states.LoadPostState

interface IPostInteractor {
    fun loadPosts(loadPostRequest: LoadPostRequest) : DataWrapper<PagingPosts?, LoadPostState>
    fun currentSubName() : String
    fun setSubName(subName : String)
}