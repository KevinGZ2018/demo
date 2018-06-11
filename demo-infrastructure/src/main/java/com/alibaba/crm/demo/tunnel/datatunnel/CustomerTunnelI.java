package com.alibaba.crm.demo.tunnel.datatunnel;

import java.util.List;

import com.alibaba.sofa.repository.DataTunnel;
import com.alibaba.crm.demo.tunnel.dataobject.CustomerDO;

public interface CustomerTunnelI extends DataTunnel<CustomerDO>{

    public List<CustomerDO> findByCriteria(String... params);

}
