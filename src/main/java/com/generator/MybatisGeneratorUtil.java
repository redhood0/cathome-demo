package com.generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @PackgeName: com.generator
 * @ClassName: MybatisGeneratorUtil
 * @Author: redhood
 * Date: 2020/4/12 16:43
 * project name: cathome
 * @Version:
 * @Description:
 */
public class MybatisGeneratorUtil {
    /**
     * 通过执行本方法，调用 Mybatis Generator 工具，生成相应代码。
     * 避免 Eclipse、IDEA 之间插件使用的差异。
     * @param args
     * @return
     */
    public static void main(String[] args) throws Exception {
        List<String> warnings = new ArrayList<>();
        String configFilePath = MybatisGeneratorUtil.class.getClassLoader().getResource("generatorConfig.xml").getFile(); // mybatis-generator.xml 配置文件放在 resources 目录里。
        File configFile = new File(configFilePath);
        ConfigurationParser parser = new ConfigurationParser(warnings);
        Configuration config = parser.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(true); // 存在则覆盖
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }
}
