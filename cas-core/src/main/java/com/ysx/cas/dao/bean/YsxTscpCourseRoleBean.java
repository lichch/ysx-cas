package com.ysx.cas.dao.bean;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @实体名称: 
 * @数表名称: YSX_TSCP_COURSE_ROLE
 * @开发日期: 2019-12-30
 */
public class YsxTscpCourseRoleBean implements Serializable {

    // (必填项)
    private long id              = -1l;
    // 计划规格id
    private long specificationId = -1l;
    // 课程id
    private long courseId        = -1l;
    // 章节id
    private long chapterId       = -1l;
    // 用户id
    private long memberId        = -1l;
    // 授权类型（1课程，2课节
    private int authorizeType    = -1;
    // 订单sn
    private String orderSn       = null;
    // 订单对应的课程规格
    private String courseSn       = null;
    //状态:1.待授权 2.授权成功 3.取消授权
    private int roleStatus      = -1;
    //授权用户类型:0.默认购买 1.特殊用户 2.内部人员
    private int roleMemberType   = -1;
    // 数据状态0整除1删除
    private int deleted          = -1;
    // 
    private Date createdAt       = null;
    // 
    private Date updatedAt       = null;
    // 排序
    private String orderBy       = null;

    public int getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(int roleStatus) {
        this.roleStatus = roleStatus;
    }

    public int getRoleMemberType() {
        return roleMemberType;
    }

    public void setRoleMemberType(int roleMemberType) {
        this.roleMemberType = roleMemberType;
    }

    @Override
    public String toString() {
        return "YsxTscpCourseRoleBean{" +
                "id=" + id +
                ", specificationId=" + specificationId +
                ", courseId=" + courseId +
                ", chapterId=" + chapterId +
                ", memberId=" + memberId +
                ", authorizeType=" + authorizeType +
                ", orderSn='" + orderSn + '\'' +
                ", courseSn='" + courseSn + '\'' +
                ", roleStatus=" + roleStatus +
                ", roleMemberType=" + roleMemberType +
                ", deleted=" + deleted +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

    /*
     *************************************************************************************
     * Getter方法区
     *************************************************************************************
     */

    public String getCourseSn() {
        return courseSn;
    }

    public void setCourseSn(String courseSn) {
        this.courseSn = courseSn;
    }

    //
    public long getId() {
        return id;
    }
    // 计划规格id
    public long getSpecificationId() {
        return specificationId;
    }
    // 课程id
    public long getCourseId() {
        return courseId;
    }
    // 章节id
    public long getChapterId() {
        return chapterId;
    }
    // 用户id
    public long getMemberId() {
        return memberId;
    }
    // 授权类型（1课程，2课节
    public int getAuthorizeType() {
        return authorizeType;
    }
    // 订单sn
    public String getOrderSn() {
        return orderSn==null?"":orderSn.trim();
    }
    // 数据状态0整除1删除
    public int getDeleted() {
        return deleted;
    }
    // 
    public Date getCreatedAt() {
        return createdAt;
    }
    // 
    public Date getUpdatedAt() {
        return updatedAt;
    }
    // 排序
    public String getOrderBy() {
        return orderBy==null?"":orderBy.trim();
    }

    /*
     *************************************************************************************
     * Setter方法区
     *************************************************************************************
     */

    // 
    public void setId(long id) {
        this.id = id;
    }
    // 计划规格id
    public void setSpecificationId(long specificationId) {
        this.specificationId = specificationId;
    }
    // 课程id
    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }
    // 章节id
    public void setChapterId(long chapterId) {
        this.chapterId = chapterId;
    }
    // 用户id
    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }
    // 授权类型（1课程，2课节
    public void setAuthorizeType(int authorizeType) {
        this.authorizeType = authorizeType;
    }
    // 订单sn
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }
    // 数据状态0整除1删除
    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }
    // 
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    // 
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    // 排序
    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }


    /*
     *************************************************************************************
     * 常用自定义字段
     *************************************************************************************
     */
    // 订单sn(全模糊)
    private String orderSnLike             = null;
    // (起始日期)
    private String createdAtBegin          = null;
    // (结束日期)
    private String createdAtEnd            = null;
    // (起始日期)
    private String updatedAtBegin          = null;
    // (结束日期)
    private String updatedAtEnd            = null;

    // 订单sn(全模糊)
    public String getOrderSnLike() {
        return orderSnLike==null?"":orderSnLike.trim();
    }
    public void setOrderSnLike(String orderSnLike) {
        this.orderSnLike = orderSnLike;
    }
    // (起始日期)
    public String getCreatedAtBegin() {
        return createdAtBegin==null?"":createdAtBegin.trim();
    }
    public void setCreatedAtBegin(String createdAtBegin) {
        this.createdAtBegin = createdAtBegin;
    }
    // (结束日期)
    public String getCreatedAtEnd() {
        return createdAtEnd==null?"":createdAtEnd.trim();
    }
    public void setCreatedAtEnd(String createdAtEnd) {
        this.createdAtEnd = createdAtEnd;
    }
    // (格式化)
    public String getCreatedAtChar() {
        return getDate(createdAt);
    }
    public void setCreatedAtChar(String createdAtChar) {
        this.createdAt = getDate(createdAtChar);
    }
    // (格式化)
    public String getCreatedAtCharAll() {
        return getDateTime(createdAt);
    }
    public void setCreatedAtCharAll(String createdAtCharAll) {
        this.createdAt = getDate(createdAtCharAll);
    }
    // (起始日期)
    public String getUpdatedAtBegin() {
        return updatedAtBegin==null?"":updatedAtBegin.trim();
    }
    public void setUpdatedAtBegin(String updatedAtBegin) {
        this.updatedAtBegin = updatedAtBegin;
    }
    // (结束日期)
    public String getUpdatedAtEnd() {
        return updatedAtEnd==null?"":updatedAtEnd.trim();
    }
    public void setUpdatedAtEnd(String updatedAtEnd) {
        this.updatedAtEnd = updatedAtEnd;
    }
    // (格式化)
    public String getUpdatedAtChar() {
        return getDate(updatedAt);
    }
    public void setUpdatedAtChar(String updatedAtChar) {
        this.updatedAt = getDate(updatedAtChar);
    }
    // (格式化)
    public String getUpdatedAtCharAll() {
        return getDateTime(updatedAt);
    }
    public void setUpdatedAtCharAll(String updatedAtCharAll) {
        this.updatedAt = getDate(updatedAtCharAll);
    }
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private final DateFormat yyyymmddhhmmssFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private final DateFormat yyyymmddFormat = new SimpleDateFormat("yyyy-MM-dd");
    
    public String getDate(Date date)
    {
        if( null == date ) return "";
        return yyyymmddFormat.format(date);
    }
    public String getDateTime(Date date)
    {
        if( null == date ) return "";
        return yyyymmddhhmmssFormat.format(date);
    }
    public Date getDate(String date)
    {
        if( null == date || date.trim().isEmpty() ) return null;
        date = date.trim();
        Date result = null;
        try {
            if( date.length() >= 19 )
            {
                result = yyyymmddhhmmssFormat.parse(date);
            }
            else if( date.length() == 10 )
            {
                result = yyyymmddFormat.parse(date);
            }
        }
        catch (ParseException e) 
        {
            
        }
        return result;
    }

}


/** 
------------------------------------------------------
|  Copy
------------------------------------------------------

//------ Setter ------

// 
YsxTscpCourseRoleBean ysxTscpCourseRoleBean = new YsxTscpCourseRoleBean();

// 
ysxTscpCourseRoleBean.setId(  );
// 计划规格id
ysxTscpCourseRoleBean.setSpecificationId(  );
// 课程id
ysxTscpCourseRoleBean.setCourseId(  );
// 章节id
ysxTscpCourseRoleBean.setChapterId(  );
// 用户id
ysxTscpCourseRoleBean.setMemberId(  );
// 授权类型（1课程，2课节
ysxTscpCourseRoleBean.setAuthorizeType(  );
// 订单sn
ysxTscpCourseRoleBean.setOrderSn(  );
// 数据状态0整除1删除
ysxTscpCourseRoleBean.setDeleted(  );
// 
ysxTscpCourseRoleBean.setCreatedAt(  );
// 
ysxTscpCourseRoleBean.setUpdatedAt(  );


//------ 自定义部分 ------

// 订单sn(全模糊)
ysxTscpCourseRoleBean.setOrderSnLike(  );
// (起始日期)
ysxTscpCourseRoleBean.setCreatedAtBegin(  );
// (结束日期)
ysxTscpCourseRoleBean.setCreatedAtEnd(  );
// (格式化)
ysxTscpCourseRoleBean.setCreatedAtChar(  );
// (起始日期)
ysxTscpCourseRoleBean.setUpdatedAtBegin(  );
// (结束日期)
ysxTscpCourseRoleBean.setUpdatedAtEnd(  );
// (格式化)
ysxTscpCourseRoleBean.setUpdatedAtChar(  );

------------------------------------------------------

//------ Getter ------

// 
YsxTscpCourseRoleBean ysxTscpCourseRoleBean = new YsxTscpCourseRoleBean();

// 
ysxTscpCourseRoleBean.getId();
// 计划规格id
ysxTscpCourseRoleBean.getSpecificationId();
// 课程id
ysxTscpCourseRoleBean.getCourseId();
// 章节id
ysxTscpCourseRoleBean.getChapterId();
// 用户id
ysxTscpCourseRoleBean.getMemberId();
// 授权类型（1课程，2课节
ysxTscpCourseRoleBean.getAuthorizeType();
// 订单sn
ysxTscpCourseRoleBean.getOrderSn();
// 数据状态0整除1删除
ysxTscpCourseRoleBean.getDeleted();
// 
ysxTscpCourseRoleBean.getCreatedAt();
// 
ysxTscpCourseRoleBean.getUpdatedAt();


//------ 自定义部分 ------

// 订单sn(全模糊)
ysxTscpCourseRoleBean.getOrderSnLike();
// (起始日期)
ysxTscpCourseRoleBean.getCreatedAtBegin();
// (结束日期)
ysxTscpCourseRoleBean.getCreatedAtEnd();
// (格式化)
ysxTscpCourseRoleBean.getCreatedAtChar();
// (起始日期)
ysxTscpCourseRoleBean.getUpdatedAtBegin();
// (结束日期)
ysxTscpCourseRoleBean.getUpdatedAtEnd();
// (格式化)
ysxTscpCourseRoleBean.getUpdatedAtChar();

------------------------------------------------------

//------ Getter Setter ------

// 
YsxTscpCourseRoleBean ysxTscpCourseRoleBean = new YsxTscpCourseRoleBean();

// 
ysxTscpCourseRoleBean.setId( ysxTscpCourseRoleBean2.getId() );
// 计划规格id
ysxTscpCourseRoleBean.setSpecificationId( ysxTscpCourseRoleBean2.getSpecificationId() );
// 课程id
ysxTscpCourseRoleBean.setCourseId( ysxTscpCourseRoleBean2.getCourseId() );
// 章节id
ysxTscpCourseRoleBean.setChapterId( ysxTscpCourseRoleBean2.getChapterId() );
// 用户id
ysxTscpCourseRoleBean.setMemberId( ysxTscpCourseRoleBean2.getMemberId() );
// 授权类型（1课程，2课节
ysxTscpCourseRoleBean.setAuthorizeType( ysxTscpCourseRoleBean2.getAuthorizeType() );
// 订单sn
ysxTscpCourseRoleBean.setOrderSn( ysxTscpCourseRoleBean2.getOrderSn() );
// 数据状态0整除1删除
ysxTscpCourseRoleBean.setDeleted( ysxTscpCourseRoleBean2.getDeleted() );
// 
ysxTscpCourseRoleBean.setCreatedAt( ysxTscpCourseRoleBean2.getCreatedAt() );
// 
ysxTscpCourseRoleBean.setUpdatedAt( ysxTscpCourseRoleBean2.getUpdatedAt() );


//------ 自定义部分 ------

// 订单sn(全模糊)
ysxTscpCourseRoleBean.setOrderSnLike( ysxTscpCourseRoleBean2.getOrderSnLike() );
// (起始日期)
ysxTscpCourseRoleBean.setCreatedAtBegin( ysxTscpCourseRoleBean2.getCreatedAtBegin() );
// (结束日期)
ysxTscpCourseRoleBean.setCreatedAtEnd( ysxTscpCourseRoleBean2.getCreatedAtEnd() );
// (格式化)
ysxTscpCourseRoleBean.setCreatedAtChar( ysxTscpCourseRoleBean2.getCreatedAtChar() );
// (起始日期)
ysxTscpCourseRoleBean.setUpdatedAtBegin( ysxTscpCourseRoleBean2.getUpdatedAtBegin() );
// (结束日期)
ysxTscpCourseRoleBean.setUpdatedAtEnd( ysxTscpCourseRoleBean2.getUpdatedAtEnd() );
// (格式化)
ysxTscpCourseRoleBean.setUpdatedAtChar( ysxTscpCourseRoleBean2.getUpdatedAtChar() );



--------------------------------------------------------
 */


    