package com.zyt.myshop.commons.mapper;

import com.zyt.myshop.commons.domain.TbContent;
import com.zyt.myshop.commons.utils.RedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import tk.mybatis.mapper.MyMapper;

@CacheNamespace(implementation = RedisCache.class)
public interface TbContentMapper extends MyMapper<TbContent> {
}