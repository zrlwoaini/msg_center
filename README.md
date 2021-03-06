# msg_center 消息中心
消息中心是一个非常普遍的基础产品，不管是在互联网还是游戏行业等等使用都很普遍。<br> 
比如：微博里面AT人，他人在消息里面就会提醒有人AT；网站的私信；网站推广广告；发短信通知；<br> 
这个基础产品可以衍生出很多其他的产品<br> 

技术难点：高并发，一致性，实时性，可扩展性<br> 

本产品支持的功能如下(User Case)：<br> 
#### 消息种类
 1.邮件<br> 
 2.短信<br> 
 3.钉钉<br> 
 4.QQ，微信<br> 
 5.web页面<br> 
 6.无线端消息<br> 

#### 消息发送模式
 1.单条消息<br> 
 2.群发消息<br> 
 
#### 消息发送时机
 1.实时发送<br> 
 2.定时发送<br> 
 
#### 消息发送对象
 1.指定设备发送<br> 
 2.指定不同客户端发送（web，安卓，IOS）<br> 
 3.指定用户发送<br> 
 4.给当前业务的所有用户发送<br> 
 5.给整个平台用户发送（跨业务）<br> 
 
#### 消息发送控制
 1.优先级<br> 
 2.群消息分批发送<br> 
 3.发送频率(疲劳度，合并，过滤)<br> 

#### 非功能性需求
##### 1.消息管理运维
 1.1：消息状态：发送成功，发送失败，分发中，未发送，丢弃，被中断<br> 
 1.2：针对不同的状态可以进行不同操作：失败重发，发送中的可以中断，未发送的可以丢弃<br> 
##### 2.数据统计支持业务运维
 2.1：消息发送率，消息到达率，消息延迟时长，点击率，消息删除量，消息阅读量<br> 
 2.2：不同优先级，不同发送对象的，不同发送模式下的2.1的数据<br> 
##### 3.扩展性
 支持消息内容个性化配置，消息发送控制中可以扩展业务的匹配策略，提供API<br> 
 
### 消息中心相关产品
 SNS（微博），IM（微信，钉钉），邮箱，任务<br> 
 基于消息中心基础的技术能力快速实现各个相关产品的业务场景<br> 
 
## 领域模型设计
![image](https://github.com/zrlwoaini/msg_center/raw/master/doc/消息中心领域模型.png)

## 业务架构图
![image](https://github.com/zrlwoaini/msg_center/raw/master/doc/消息中心业务架构图.png)
 