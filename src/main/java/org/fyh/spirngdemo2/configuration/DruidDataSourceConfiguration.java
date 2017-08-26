package org.fyh.spirngdemo2.configuration;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.alibaba.druid.pool.DruidDataSource;
/**
 * 数据库连接池
 * @author Administrator
 *
 */
@Configuration
public class DruidDataSourceConfiguration {

	@Bean
    @Primary  //在同样的DataSource中，首先使用被标注的DataSource --> 表示这里定义的DataSource将覆盖其他来源的DataSource
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource druidDataSource() {
		DruidDataSource druidDataSource = new DruidDataSource();
		return druidDataSource;
	}
}