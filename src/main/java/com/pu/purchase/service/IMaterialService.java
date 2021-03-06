package com.pu.purchase.service;

import com.pu.purchase.entity.Material;
import com.baomidou.mybatisplus.extension.service.IService;
import com.pu.purchase.vo.DeliverFormVo;

/**
 * <p>
 * 产品表 服务类
 * </p>
 *
 * @author 
 * @since 2020-03-01
 */
public interface IMaterialService extends IService<Material> {


    Object updateDeliver(DeliverFormVo deliverFormVo);


}
