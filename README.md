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
{"content":"??????????????????????????????????????????"}
'
```

```bash
curl -XPOST http://localhost:9200/index/_create/2 -H 'Content-Type:application/json' -d'
{"content":"??????????????????????????????????????????"}
'
```

```bash
curl -XPOST http://localhost:9200/index/_create/3 -H 'Content-Type:application/json' -d'
{"content":"????????????????????????????????????????????????1???????????????"}
'
```

```bash
curl -XPOST http://localhost:9200/index/_create/4 -H 'Content-Type:application/json' -d'
{"content":"???????????????????????????????????????????????? ???????????????"}
'
```

4.query with highlighting

```bash
curl -XPOST http://localhost:9200/index/_search  -H 'Content-Type:application/json' -d'
{
    "query" : { "match" : { "content" : "??????" }},
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
                    "content": "???????????????????????????????????????????????? ???????????????"
                },
                "highlight": {
                    "content": [
                        "<tag1>??????</tag1>?????????????????????????????????????????? ??????????????? "
                    ]
                }
            },
            {
                "_index": "index",
                "_type": "fulltext",
                "_id": "3",
                "_score": 2,
                "_source": {
                    "content": "????????????????????????????????????????????????1???????????????"
                },
                "highlight": {
                    "content": [
                        "????????????1???<tag1>??????</tag1>?????? "
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
	<comment>IK Analyzer ????????????</comment>
	<!--???????????????????????????????????????????????? -->
	<entry key="ext_dict">custom/mydict.dic;custom/single_word_low_freq.dic</entry>
	 <!--?????????????????????????????????????????????????????????-->
	<entry key="ext_stopwords">custom/ext_stopword.dic</entry>
 	<!--????????????????????????????????????????????? -->
	<entry key="remote_ext_dict">location</entry>
 	<!--??????????????????????????????????????????????????????-->
	<entry key="remote_ext_stopwords">http://xxx.com/xxx.dic</entry>
</properties>
```

### ????????? IK ??????????????????

?????????????????????????????? IK ???????????????????????? IK ????????????????????????????????????

```xml
 	<!--????????????????????????????????????????????? -->
	<entry key="remote_ext_dict">location</entry>
 	<!--??????????????????????????????????????????????????????-->
	<entry key="remote_ext_stopwords">location</entry>
```

?????? `location` ???????????? url????????? `http://yoursite.com/getCustomDict`??????????????????????????????????????????????????????????????????

1. ??? http ??????????????????????????????(header)???????????? `Last-Modified`???????????? `ETag`???????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????

2. ??? http ??????????????????????????????????????????????????????????????? `\n` ?????????

??????????????????????????????????????????????????????????????????????????? ES ?????????

????????????????????????????????????????????? UTF-8 ????????? .txt ?????????????????? nginx ??????????????? http server ????????? .txt ??????????????????http server ?????????????????????????????????????????????????????? Last-Modified ??? ETag???????????????????????????????????????????????????????????????????????????????????? .txt ?????????

have fun.

????????????
-------

1.???????????????????????????????????????

????????????????????????????????????????????? UTF8 ??????

2.?????????????????????


```bash
git clone https://github.com/medcl/opensearch-analysis-ik
cd opensearch-analysis-ik
git checkout tags/{version}
mvn clean
mvn compile
mvn package
```

???????????????release????????????: #{project_path}/opensearch-analysis-ik/target/releases/opensearch-analysis-ik-*.zip ????????? opensearch ????????????, ???: plugins/ik
??????opensearch

3.??????????????????
???????????????????????????analyze????????????,?????????????????????analyze??????
???:
```bash
curl -XGET "http://localhost:9200/your_index/_analyze" -H 'Content-Type: application/json' -d'
{
   "text":"?????????????????????MN","tokenizer": "my_ik"
}'
```


4. ik_max_word ??? ik_smart ?????????????


ik_max_word: ?????????????????????????????????????????????????????????????????????????????????????????????????????????????????????,????????????,??????,??????,???????????????,??????,???,???,?????????,??????,???,??????,??????????????????????????????????????????????????? Term Query???

ik_smart: ????????????????????????????????????????????????????????????????????????????????????????????????????????????,?????????????????? Phrase ?????????


Thanks
------
YourKit supports IK Analysis for ElasticSearch project with its full-featured Java Profiler.
YourKit, LLC is the creator of innovative and intelligent tools for profiling
Java and .NET applications. Take a look at YourKit's leading software products:
<a href="http://www.yourkit.com/java/profiler/index.jsp">YourKit Java Profiler</a> and
<a href="http://www.yourkit.com/.net/profiler/index.jsp">YourKit .NET Profiler</a>.
