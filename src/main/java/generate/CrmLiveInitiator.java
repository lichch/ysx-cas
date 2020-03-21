package generate;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * crm_live_initiator
 * @author 
 */
@Data
public class CrmLiveInitiator implements Serializable {
    /**
     * 主讲老师ID
     */
    private Long initiatorId;

    /**
     * 老师姓名
     */
    private String name;

    /**
     * 老师手机号
     */
    private String phone;

    /**
     * 老师照片URL
     */
    private String photoUrl;

    /**
     * SSO用户ID
     */
    private Long userId;

    /**
     * 最高学历
     */
    private String degree;

    /**
     * 毕业院校
     */
    private String university;

    /**
     * 院校性质
     */
    private String universityType;

    /**
     * 所学专业
     */
    private String specialty;

    /**
     * 是否有教师资格证[0没有1有]
     */
    private Byte certified;

    /**
     * 教师资格证号
     */
    private String certificateNo;

    private Byte teachingYears;

    /**
     * 个人简介
     */
    private String selfIntro;

    /**
     * 是否可用[0正常1停用]
     */
    private Byte enable;

    /**
     * 是否为测试账号[0不是1是]
     */
    private Byte testAccount;

    /**
     * 创建人
     */
    private Long creator;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 最后修改人
     */
    private Long modifier;

    /**
     * 更新时间
     */
    private Date updateAt;

    /**
     * 是否删除[0正常1已删除]
     */
    private Byte deleted;

    private static final long serialVersionUID = 1L;
}