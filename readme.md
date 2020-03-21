### 班课cas后台
---

#### 技术架构
SpringBoot

#### 项目结构
启动类：```CasWebApplication```
- `crm-web` Controller模块，遵循Restful
- `crm-api` 接口模块，可对外暴露RPC接口

#### 运行环境
- `Tomcat8`
- `JDK1.8`
- `Lombok插件`

### 日志输出
- 使用日志:注解`@Slf4j`，举例：
```
/**
    * 主讲老师管理
    */
   @Slf4j
   @RestController
   @RequestMapping("/initiator")
   public class InitiatorManageController {
       /**
        * 查询主讲老师列表
        * @return ResponseResult
        */
       @RequestMapping(method = RequestMethod.GET)
       public ResponseResult<Object> initiatorList(){
           ResponseResult<Object> result = new ResponseResult<>();
           try{
               log.info("获取主讲教师列表...");
           }catch (Exception e){
               result.setResultCode(ResponseCode.FAIL);
               result.setMessage("主讲老师列表查询异常!");
           }
           return result;
       }
   }
```
- 日志配置[暂未全局配置]

#### TODO list
- [x] SSO接入
- [x] SSO工具类
- [x] 日志公共类
- [x] dubbo接入
- [x] 环境切换
- [x] 依赖版本管理
- [x] 环境日志输出
- [x] 验证码短信接入
- [x] redis接入
- [ ] 日志配置完善
