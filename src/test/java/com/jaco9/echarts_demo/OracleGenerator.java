package com.jaco9.echarts_demo;

import java.util.ArrayList;
import java.util.List;

import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 标题、简要说明. <br>
 * 代码生成器
 * <p>
 * Copyright: Copyright (c) 2017年9月21日 下午4:37:22
 * <p>
 * Company: 苏州罗想软件有限公司
 * <p>
 * 
 * @author qian.zhou@roadshare.com
 * @version 1.0.0
 */
@RunWith(SpringRunner.class)
//@SpringBootTest
public class OracleGenerator {


	@Test
	public void generator()
	{
		// 自定义需要填充的字段
		List<TableFill> tableFillList = new ArrayList<>();
		tableFillList.add(new TableFill("ASDD_SS", FieldFill.INSERT_UPDATE));

		// 代码生成器
		AutoGenerator mpg = new AutoGenerator().setGlobalConfig(
		                                                        // 全局配置
		                                                        new GlobalConfig().setOutputDir("/home/jaco/Desktop/roadshare/generate/")// 输出目录
		                                                                .setFileOverride(true)// 是否覆盖文件
		                                                                .setActiveRecord(true)// 开启
		                                                                                      // activeRecord
		                                                                                      // 模式
		                                                                .setEnableCache(false)// XML
		                                                                                      // 二级缓存
		                                                                .setBaseResultMap(true)// XML
		                                                                                       // ResultMap
		                                                                .setBaseColumnList(true)// XML
		                                                                                        // columList
		                                                                .setAuthor("yi.zhang")
		// 自定义文件命名，注意 %s 会自动填充表实体属性！
		// .setMapperName("%sDao")
		// .setXmlName("%sDao")
		// .setServiceName("MP%sService")
		// .setServiceImplName("%sServiceDiy")
		// .setControllerName("%sAction")
		).setDataSource(
		                // 数据源配置
		                new DataSourceConfig().setDbType(DbType.ORACLE)// 数据库类型
		                        .setDriverName("oracle.jdbc.driver.OracleDriver").setUsername("rspub").setPassword("rspub")
		                        .setUrl("jdbc:oracle:thin:@192.168.10.64:1521:orclpub"))
		        .setStrategy(
		                     // 策略配置
		                     new StrategyConfig()
		                             // .setCapitalMode(true)// 全局大写命名
		                             // .setDbColumnUnderline(true)//全局下划线命名
		                             // .setTablePrefix(new String[]{"ROLE_"})//
		                             // 此处可以修改为您的表前缀
		                             .setNaming(NamingStrategy.underline_to_camel)// 表名生成策略
		                             .setInclude(new String[] { "JS_RK_SZ_DAY" }) // 需要生成的表
		                             // .setExclude(new String[]{"test"}) //
		                             // 排除生成的表
		                             // 自定义实体父类
		                             //.setSuperEntityClass("com.roadshare.clothing.model.BaseModel")
		                             // 自定义实体，公共字段
		                             //.setSuperEntityColumns(new String[] { "ID", "DEL_FLAG", "CREATE_BY", "UPDATE_BY", "CREATE_TIME", "UPDATE_TIME" })
		                             .setTableFillList(tableFillList)
				// 自定义 mapper 父类
				// .setSuperMapperClass("com.baomidou.demo.TestMapper")
				// 自定义 service 父类
				// .setSuperServiceClass("com.baomidou.demo.TestService")
				// 自定义 service 实现类父类
				// .setSuperServiceImplClass("com.baomidou.demo.TestServiceImpl")
				// 自定义 controller 父类
				// .setSuperControllerClass("com.baomidou.demo.TestController")
				// 【实体】是否生成字段常量（默认 false）
				// public static final String ID = "test_id";
				// .setEntityColumnConstant(true)
				// 【实体】是否为构建者模型（默认 false）
				// public User setName(String name) {this.name = name; return
				// this;}
				// .setEntityBuilderModel(true)
				// 【实体】是否为lombok模型（默认 false）<a
				// href="https://projectlombok.org/">document</a>
				// .setEntityLombokModel(true)
				// Boolean类型字段是否移除is前缀处理
				// .setEntityBooleanColumnRemoveIsPrefix(true)
				// .setRestControllerStyle(true)
				// .setControllerMappingHyphenStyle(true)
				).setPackageInfo(
				                 // 包配置
				                 new PackageConfig().setModuleName("basic_demo").setParent("com.jaco9.echarts_demo")// 自定义包路径
				                         .setController("controller")// 这里是控制器包名，默认
				                                                     // web
		);

		// 执行生成
		mpg.execute();

	}

}
