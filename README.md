# InterfaceAutomation
波波接口自动化demo

  请求 https://www.v2ex.com/api/nodes/show.json?name=python 接口

　　使用OK HTTP框架网络请求

　　使用fastjson框架解析数据

```json
 　　{
   　　　　 "avatar_large": "//cdn.v2ex.com/navatar/8613/985e/90_large.png?m=1564378564",
 　　　　   "name": "python",
  　　　　  "avatar_normal": "//cdn.v2ex.com/navatar/8613/985e/90_normal.png?m=1564378564",
  　　　　  "title": "Python",
  　　　　  "url": "https://www.v2ex.com/go/python",
  　　　　  "topics": 11896,
 　　　　   "footer": "",
 　　　　   "header": "这里讨论各种 Python 语言编程话题，也包括 Django，Tornado 等框架的讨论。这里是一个能够帮助你解决实际问题的地方。",
 　　　　   "title_alternative": "Python",
  　　　　  "avatar_mini": "//cdn.v2ex.com/navatar/8613/985e/90_mini.png?m=1564378564",
  　　　　  "stars": 8248,
 　　　　   "root": false,
 　　　　   "id": 90,
 　　　　   "parent_node_name": "programming"
　　} 
 ```

　　对请求回来的参数做断言 assertEquals(v2exNode.getName(),nodeName);


 最后生成html格式测试报告


<div align="center">
  <img src="https://github.com/leonInShanghai/InterfaceAutomation/blob/master/Json%E5%AF%B9%E8%B1%A1%E8%BD%ACJava%E5%AF%B9%E8%B1%A1%E6%8F%92%E4%BB%B6/QQ%E5%9B%BE%E7%89%8720190804183337.png?raw=true" style="width:100%;height:100%;">
</div>
