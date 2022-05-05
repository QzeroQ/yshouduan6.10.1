package com.authine.cloudpivot.ext.service.goods;

import com.authine.cloudpivot.ext.entity.SwGoods;
import com.authine.cloudpivot.ext.model.base.BaseSwQueryModel;
import com.authine.cloudpivot.ext.model.base.SwPageVo;
import com.authine.cloudpivot.ext.model.doo.SwGoodsListDo;
import com.authine.cloudpivot.ext.model.dto.GoodsQueryParam;
import com.authine.cloudpivot.ext.model.vo.SwGSlistVo;
import com.authine.cloudpivot.ext.model.vo.SwGoodResult;
import com.authine.cloudpivot.ext.model.vo.SwGoodslistVo;
import com.authine.cloudpivot.ext.model.vo.SwgetstoreVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
@Service
public interface GoodsService {



    void addGoods(SwGoodsListDo swGoodsDo);


    SwPageVo<SwGoods> list(SwGoodslistVo swGoodslistVo, BaseSwQueryModel query);

/*
   List<GoodsQueryParam> goodslist(Byte isEnabled, Date startTime, Date endTime,String goodsName, String goodsCode);
*/


    //多表条件查询
    @Transactional
    SwPageVo<SwGoodResult> goodslist(GoodsQueryParam goodsQueryParam, BaseSwQueryModel query);

    List<SwgetstoreVo> getenableswstore();

   List <SwGSlistVo> getgslist(String id);
}
