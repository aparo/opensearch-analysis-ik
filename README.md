IK Analysis for OpenSearch
==========================

This is a port of [medcl's IK Analysis](https://github.com/medcl/elasticsearch-analysis-ik).

The IK Analysis plugin integrates Lucene IK analyzer (http://code.google.com/p/ik-analyzer/) into OpenSearch, and support customized dictionary.

Analyzer: `ik_smart` , `ik_max_word` , Tokenizer: `ik_smart` , `ik_max_word`

Install
-------

| OS    | Command |
| ----- | ------- |
| 1.1.0  | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/1.1.0/opensearch-analisys-ik-1.1.0.zip` |
| 1.2.0  | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/1.2.0/opensearch-analisys-ik-1.2.0.zip` |
| 1.2.2  | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/1.2.2/opensearch-analisys-ik-1.2.2.zip` |
| 1.2.3  | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/1.2.3/opensearch-analisys-ik-1.2.3.zip` |
| 1.3.0  | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/1.3.0/opensearch-analisys-ik-1.3.0.zip` |
| 1.3.1  | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/1.3.1/opensearch-analisys-ik-1.3.1.zip` |
| 1.3.2  | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/1.3.2/opensearch-analisys-ik-1.3.2.zip` |
| 2.0.0  | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/2.0.0.1/opensearch-analisys-ik-2.0.0.1.zip` |
| 2.0.1  | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/2.0.1/opensearch-analisys-ik-2.0.1.zip` |
| 2.1.0  | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/2.1.0.0/opensearch-analisys-ik-2.1.0.0.zip` |
| 2.2.0  | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/2.2.0/opensearch-analisys-ik-2.2.0.zip` |
| 2.2.1  | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/2.2.0/opensearch-analisys-ik-2.2.1.zip` |
| 2.3.0  | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/2.3.0/opensearch-analisys-ik-2.3.0.zip` |
| 2.4.0  | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/2.4.0/opensearch-analisys-ik-2.4.0.zip` |
| 2.4.1  | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/2.4.1/opensearch-analisys-ik-2.4.1.zip` |
| 2.5.0  | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/2.5.0/opensearch-analisys-ik-2.5.0.zip` |
| 2.6.0  | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/2.6.0/opensearch-analisys-ik-2.6.0.zip` |
| 2.7.0  | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/2.7.0/opensearch-analisys-ik-2.7.0.zip` |
| 2.8.0  | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/2.8.0/opensearch-analisys-ik.zip` |
| 2.9.0  | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/2.9.0/opensearch-analisys-ik.zip` |
| 2.10.0 | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/2.10.0/opensearch-analisys-ik.zip` |
| 2.11.0 | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/2.11.0/opensearch-analisys-ik.zip` |
| 2.11.1 | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/2.11.1/opensearch-analisys-ik.zip` |
| 2.12.0 | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/2.12.0/opensearch-analisys-ik.zip` |
| 2.13.0 | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/2.13.0/opensearch-analisys-ik.zip` |
| 2.14.0 | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/2.14.0/opensearch-analisys-ik.zip` |
| 2.15.0 | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/2.15.0/opensearch-analisys-ik.zip` |
| 2.16.0 | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/2.16.0/opensearch-analisys-ik.zip` |
| 2.17.0 | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/2.17.0/opensearch-analisys-ik.zip` |
| 2.18.0 | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/2.18.0/opensearch-analisys-ik.zip` |
| 2.19.0 | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/2.19.0/opensearch-analisys-ik.zip` |
| 2.19.1 | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/2.19.1/opensearch-analisys-ik.zip` |
| 2.19.2 | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/2.19.2/opensearch-analisys-ik.zip` |
| 3.0.0 | `bin/opensearch-plugin install https://github.com/aparo/opensearch-analysis-ik/releases/download/3.0.0/opensearch-analisys-ik.zip` |

# Note
For version 2.0.0 or below, there is a bug in coping the final config data. After having installed the plugin please copy the *config* dir in plugin directory.

#### Quick Example

1.create a index

```bash
curl -XPUT http://localhost:9200/index
```

2.create a mapping

```bash
curl -XPOST http://localhost:9200/index/_mapping -H 'Content-Type:application/json' -d'
{
        "properties": {
            "content": {
                "type": "text",
                "analyzer": "ik_max_word",
                "search_analyzer": "ik_smart"
            }
        }

}'
```

3.index some docs

```bash
curl -XPOST http://localhost:9200/index/_create/1 -H 'Content-Type:application/json' -d'
{"content":"美国留给伊拉克的是个烂摊子吗"}
'
```

```bash
curl -XPOST http://localhost:9200/index/_create/2 -H 'Content-Type:application/json' -d'
{"content":"公安部：各地校车将享最高路权"}
'
```

```bash
curl -XPOST http://localhost:9200/index/_create/3 -H 'Content-Type:application/json' -d'
{"content":"中韩渔警冲突调查：韩警平均每天扣1艘中国渔船"}
'
```

```bash
curl -XPOST http://localhost:9200/index/_create/4 -H 'Content-Type:application/json' -d'
{"content":"中国驻洛杉矶领事馆遭亚裔男子枪击 嫌犯已自首"}
'
```

4.query with highlighting

```bash
curl -XPOST http://localhost:9200/index/_search  -H 'Content-Type:application/json' -d'
{
    "query" : { "match" : { "content" : "中国" }},
    "highlight" : {
        "pre_tags" : ["<tag1>", "<tag2>"],
        "post_tags" : ["</tag1>", "</tag2>"],
        "fields" : {
            "content" : {}
        }
    }
}
'
```

Result

```json
{
    "took": 14,
    "timed_out": false,
    "_shards": {
        "total": 5,
        "successful": 5,
        "failed": 0
    },
    "hits": {
        "total": 2,
        "max_score": 2,
        "hits": [
            {
                "_index": "index",
                "_type": "fulltext",
                "_id": "4",
                "_score": 2,
                "_source": {
                    "content": "中国驻洛杉矶领事馆遭亚裔男子枪击 嫌犯已自首"
                },
                "highlight": {
                    "content": [
                        "<tag1>中国</tag1>驻洛杉矶领事馆遭亚裔男子枪击 嫌犯已自首 "
                    ]
                }
            },
            {
                "_index": "index",
                "_type": "fulltext",
                "_id": "3",
                "_score": 2,
                "_source": {
                    "content": "中韩渔警冲突调查：韩警平均每天扣1艘中国渔船"
                },
                "highlight": {
                    "content": [
                        "均每天扣1艘<tag1>中国</tag1>渔船 "
                    ]
                }
            }
        ]
    }
}
```

### Dictionary Configuration

`IKAnalyzer.cfg.xml` can be located at `{conf}/analysis-ik/config/IKAnalyzer.cfg.xml`
or `{plugins}/opensearch-analysis-ik-*/config/IKAnalyzer.cfg.xml`

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE properties SYSTEM "http://java.sun.com/dtd/properties.dtd">
<properties>
    <comment>IK Analyzer 扩展配置</comment>
    <!--用户可以在这里配置自己的扩展字典 -->
    <entry key="ext_dict">custom/mydict.dic;custom/single_word_low_freq.dic</entry>
     <!--用户可以在这里配置自己的扩展停止词字典-->
    <entry key="ext_stopwords">custom/ext_stopword.dic</entry>
     <!--用户可以在这里配置远程扩展字典 -->
    <entry key="remote_ext_dict">location</entry>
     <!--用户可以在这里配置远程扩展停止词字典-->
    <entry key="remote_ext_stopwords">http://xxx.com/xxx.dic</entry>
</properties>
```

### 热更新 IK 分词使用方法

目前该插件支持热更新 IK 分词，通过上文在 IK 配置文件中提到的如下配置

```xml
     <!--用户可以在这里配置远程扩展字典 -->
    <entry key="remote_ext_dict">location</entry>
     <!--用户可以在这里配置远程扩展停止词字典-->
    <entry key="remote_ext_stopwords">location</entry>
```

其中 `location` 是指一个 url，比如 `http://yoursite.com/getCustomDict`，该请求只需满足以下两点即可完成分词热更新。

1. 该 http 请求需要返回两个头部(header)，一个是 `Last-Modified`，一个是 `ETag`，这两者都是字符串类型，只要有一个发生变化，该插件就会去抓取新的分词进而更新词库。

2. 该 http 请求返回的内容格式是一行一个分词，换行符用 `\n` 即可。

满足上面两点要求就可以实现热更新分词了，不需要重启 ES 实例。

可以将需自动更新的热词放在一个 UTF-8 编码的 .txt 文件里，放在 nginx 或其他简易 http server 下，当 .txt 文件修改时，http server 会在客户端请求该文件时自动返回相应的 Last-Modified 和 ETag。可以另外做一个工具来从业务系统提取相关词汇，并更新这个 .txt 文件。

have fun.

常见问题
-------

1.自定义词典为什么没有生效？

请确保你的扩展词典的文本格式为 UTF8 编码

2.如何手动安装？


```bash
git clone https://github.com/medcl/opensearch-analysis-ik
cd opensearch-analysis-ik
git checkout tags/{version}
mvn clean
mvn compile
mvn package
```

拷贝和解压release下的文件: #{project_path}/opensearch-analysis-ik/target/releases/opensearch-analysis-ik-*.zip 到你的 opensearch 插件目录, 如: plugins/ik
重启opensearch

3.分词测试失败
请在某个索引下调用analyze接口测试,而不是直接调用analyze接口
如:
```bash
curl -XGET "http://localhost:9200/your_index/_analyze" -H 'Content-Type: application/json' -d'
{
   "text":"中华人民共和国MN","tokenizer": "my_ik"
}'
```


4. ik_max_word 和 ik_smart 什么区别?


ik_max_word: 会将文本做最细粒度的拆分，比如会将“中华人民共和国国歌”拆分为“中华人民共和国,中华人民,中华,华人,人民共和国,人民,人,民,共和国,共和,和,国国,国歌”，会穷尽各种可能的组合，适合 Term Query；

ik_smart: 会做最粗粒度的拆分，比如会将“中华人民共和国国歌”拆分为“中华人民共和国,国歌”，适合 Phrase 查询。


Thanks
------
YourKit supports IK Analysis for ElasticSearch project with its full-featured Java Profiler.
YourKit, LLC is the creator of innovative and intelligent tools for profiling
Java and .NET applications. Take a look at YourKit's leading software products:
<a href="http://www.yourkit.com/java/profiler/index.jsp">YourKit Java Profiler</a> and
<a href="http://www.yourkit.com/.net/profiler/index.jsp">YourKit .NET Profiler</a>.
