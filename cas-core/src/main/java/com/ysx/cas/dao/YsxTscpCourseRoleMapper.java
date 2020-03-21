package com.ysx.cas.dao;



import com.ysx.cas.dao.bean.YsxTscpCourseRoleBean;

import java.util.List;

/**
 * @实体名称: 
 * @数据库表: YSX_TSCP_COURSE_ROLE
 * @开发日期: 2019-12-30
 */
public interface YsxTscpCourseRoleMapper {

    /**
     * 1.新增一条数据
     * 注: 根据Bean实体执行新增操作.
     * @param ysxTscpCourseRoleBean  - 
     * @return int                   - 执行结果
     * @throws Exception             - 异常捕捉
     */
    public void getInsert(YsxTscpCourseRoleBean ysxTscpCourseRoleBean) throws Exception;


    /**
     * 2.删除一条数据
     * 注: 根据Bean实体的主键ID执行删除操作.
     * @param id                      - 
     * @return YsxTscpCourseRoleBean  - 执行结果
     * @throws Exception              - 异常捕捉
     */
    public int getDelete(long id) throws Exception;


    /**
     * 3.变更一条数据
     * 注: 根据Bean实体的主键ID执行变更操作.
     * @param ysxTscpCourseRoleBean  - 
     * @return int                   - 执行结果
     * @throws Exception             - 异常捕捉
     */
    public int getUpdate(YsxTscpCourseRoleBean ysxTscpCourseRoleBean) throws Exception;


    /**
     * 4.获取一个Bean实体
     * 注: 根据Bean实体的主键ID获取一个Bean实体.
     * @param id                      - 
     * @return YsxTscpCourseRoleBean  - 执行结果
     * @throws Exception              - 异常捕捉
     */
    public YsxTscpCourseRoleBean getBean(long id) throws Exception;


    /**
     * 5.条件查询
     * 注: 支持多条件查询、分页查询、模糊查询、日期比较查询等操作.
     * @param ysxTscpCourseRoleBean         - 
     * @return List<YsxTscpCourseRoleBean>  - 执行结果
     * @throws Exception                    - 异常捕捉
     */
    public List<YsxTscpCourseRoleBean> getList(YsxTscpCourseRoleBean ysxTscpCourseRoleBean) throws Exception;


    /**
     * 6.删除一条数据
     * 注: 根据Bean实体执行删除操作.
     * @param ysxTscpCourseRoleBean  - 
     * @return int                   - 执行结果
     * @throws Exception             - 异常捕捉
     */
    public int getDeleteBean(YsxTscpCourseRoleBean ysxTscpCourseRoleBean) throws Exception;


    /**
     * 7.删除多条数据
     * 注: 根据拼接有限个主键ID执行多条数据的删除操作.
     * @param ids         - 
     * @return int        - 执行结果
     * @throws Exception  - 异常捕捉
     */
    public int getDeleteIn(long[] ids) throws Exception;


    /**
     * 8.删除批量数据
     * 注: 根据多种条件执行批量删除操作.
     * @param ysxTscpCourseRoleBean  - 
     * @return int                   - 执行结果
     * @throws Exception             - 异常捕捉
     */
    public int getDeleteBy(YsxTscpCourseRoleBean ysxTscpCourseRoleBean) throws Exception;


    /**
     * 9.变更批量数据
     * 注: 根据多种条件执行批量变更操作.
     * @param ysxTscpCourseRoleBean  - 
     * @return int                   - 执行结果
     * @throws Exception             - 异常捕捉
     */
    public int getUpdateBy(YsxTscpCourseRoleBean ysxTscpCourseRoleBean) throws Exception;


    /**
     * 10.验证一条数据是否存在
     * 注: 根据Bean实体的主键ID验证该数据是否存在.
     * @param id          - 
     * @return int        - 存在数量
     * @throws Exception  - 异常捕捉
     */
    public int getCheck(long id) throws Exception;


    /**
     * 11.验证多条件数据是否存在
     * 注: 该方法返回数据量 ,若返回0则表示数据不存在.
     * @param ysxTscpCourseRoleBean  - 
     * @return int                   - 存在数量
     * @throws Exception             - 异常捕捉
     */
    public int getCheckBy(YsxTscpCourseRoleBean ysxTscpCourseRoleBean) throws Exception;


    /**
     * 12.Batch - 批量新增数据
     * 注: 根据List对象执行批量新增操作.
     * @param list        - List
     * @throws Exception  - 异常捕捉
     */
    public void getInsertBatch(List<YsxTscpCourseRoleBean> list) throws Exception;

    /**
     * @Description: 判断是否存在用户授权
     * @author zhangxiong
     * @Date 2020-01-16
     */
    YsxTscpCourseRoleBean getMemberRoleStatus(YsxTscpCourseRoleBean tscpCourseRoleBean)throws Exception;

    /**
     * @Description: 根据规格id查询该规格下授权用户
     *      authorizeType  1课程，2课节
     * @author zhangxiong
     * @Date 2020-02-25
     */
    List<Long> getTscpCourseRoleMember(YsxTscpCourseRoleBean tscpCourseRoleBean)throws Exception;
}
