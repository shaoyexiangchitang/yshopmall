/**
 * Copyright (C) 2018-2022
 * All rights reserved, Designed By www.yixiang.co
 * 注意：
 * 本软件为www.yixiang.co开发研制
 */
package co.yixiang.modules.shop.service.impl;

import co.yixiang.common.service.impl.BaseServiceImpl;
import co.yixiang.modules.shop.domain.YxStoreProductAttr;
import co.yixiang.modules.shop.service.YxStoreProductAttrService;
import co.yixiang.modules.shop.service.mapper.StoreProductAttrMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
// 默认不使用缓存
//import org.springframework.cache.annotation.CacheConfig;
//import org.springframework.cache.annotation.CacheEvict;
//import org.springframework.cache.annotation.Cacheable;


/**
 * @author hupeng
 * @date 2020-05-12
 */
@Service
@AllArgsConstructor
//@CacheConfig(cacheNames = "yxStoreProductAttr")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true, rollbackFor = Exception.class)
public class YxStoreProductAttrServiceImpl extends BaseServiceImpl<StoreProductAttrMapper, YxStoreProductAttr> implements YxStoreProductAttrService {


}
