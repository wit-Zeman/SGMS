package com.magic.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.sql.Types;
import java.util.Collections;

public class CodeGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://47.103.83.64:3306/student_grade_management", "root", "123456")
                .globalConfig(builder -> {
                    builder.author("magic") // 设置作者
                            .enableSpringdoc() // 开启 springDoc 模式
                            .outputDir("D://WorkSpace//student_grade_management_backend//src//main//java"); // 指定输出目录
                })
                .dataSourceConfig(builder -> builder.typeConvertHandler((globalConfig, typeRegistry, metaInfo) -> {
                    int typeCode = metaInfo.getJdbcType().TYPE_CODE;
                    if (typeCode == Types.SMALLINT) {
                        // 自定义类型转换
                        return DbColumnType.INTEGER;
                    }
                    return typeRegistry.getColumnType(metaInfo);

                }))
                .packageConfig(builder -> {
                    builder.parent("com.magic") // 设置父包名
                            .moduleName("system") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "D://WorkSpace//student_grade_management_backend//src//main//resources//mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("t_user","t_class","t_course","t_grade","t_student","t_teacher")// 设置需要生成的表名
                            .addTablePrefix("t_"); // 设置过滤表前缀
                })
                .strategyConfig(builder -> builder.entityBuilder().enableFileOverride().enableLombok())
                .strategyConfig(builder -> builder.controllerBuilder().enableFileOverride().enableRestStyle())
                .strategyConfig(builder -> builder.mapperBuilder().enableFileOverride())
                .strategyConfig(builder -> builder.serviceBuilder().enableFileOverride())
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
