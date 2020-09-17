package com.xincl.utils;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;

public class DataSourcesFactory extends PooledDataSourceFactory {
    public DataSourcesFactory() {
        this.dataSource = new DruidDataSource();
    }
}
