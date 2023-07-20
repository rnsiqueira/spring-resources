package br.com.rnsiqueira.config

import org.apache.spark.SparkConf
import org.apache.spark.api.java.JavaSparkContext
import org.apache.spark.sql.SQLContext
import org.apache.spark.sql.types.DataTypes
import org.apache.spark.sql.types.StructField
import org.apache.spark.sql.types.StructType
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class sparkConfig {

    @Value("\${spring.datasource.url}")
    val url: String? = null
    @Value("\${spring.datasource.username}")
    val userName: String? = null
    @Value("\${spring.datasource.password}")
    val pass: String? = null



    @Bean
    fun anyTest() {
//        val sparkConf = SparkConf()
//        val javaSparkContext = JavaSparkContext(sparkConf)
//        val sqlContext = SQLContext(javaSparkContext)
//        val jdbc = sqlContext.jdbc(url, "users")
//        val rows = jdbc.getRows(2, 2)
//        println(rows)


        println("Config spark!!!")
    }
}