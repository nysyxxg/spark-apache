package org.apache.spark.examples

import org.apache.spark.rdd.RDD
import org.apache.spark.sql.{DataFrame, Dataset, SparkSession}

/**
  * 开发Spark案例之WordCount
  */
object WordCount {

  def main(args: Array[String]): Unit = {

    // -Dhadoop.home.dir=C:\\SoftWare\\hadoop-2.7.7
    // System.setProperty("hadoop.home.dir", "C:\\SoftWare\\hadoop-2.7.7")
    //    val conf = new SparkConf()
    //    conf.setAppName("WordCountLocal")
    //    conf.setMaster("local")
    //    val sparkContext = new SparkContext(conf)
    //    val textFileRDD = sparkContext.textFile("D:\\Spark_Ws\\spark-apache\\examples\\src\\main\\resources\\word.txt")
    //    val wordRDD = textFileRDD.flatMap(line => line.split(" "))
    //    val pairWordRDD = wordRDD.map(word => (word, 1))
    //    val wordCountRDD = pairWordRDD.reduceByKey((a, b) => a + b)
    //    wordCountRDD.saveAsTextFile("wordcount")

    val spark = SparkSession
      .builder
      .appName("Spark Pi").master("local")
      .getOrCreate()
    val lines = spark.read.textFile("D:\\Spark_Ws\\spark-apache\\examples\\src\\main\\resources\\word.txt").rdd
    println("----------打印Dataset----------")

    //整理数据切分压平
    //Dataset只有一列，默认列名为value
    val wordRDD: RDD[String] = lines.flatMap(_.split(","))
    println("----------打印切分压平之后的Dataset----------")


    val pairWordRDD = wordRDD.map(word => {
      println(word)
      new Tuple2(word, 1)
    })
    pairWordRDD.count();

    pairWordRDD.collect().foreach(line => {
      println(line._1 + "----------->" + line._2)
    })
    val wordCountRDD = pairWordRDD.reduceByKey((a, b) => a + b)
    wordCountRDD.collect().foreach(line => {
      println(line._1 + "----------->" + line._2)
    })

    wordCountRDD.saveAsTextFile("wordcount/res3")

  }

}

