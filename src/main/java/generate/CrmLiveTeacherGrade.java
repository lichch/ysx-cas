package generate;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * crm_live_teacher_grade
 * @author 
 */
@Data
public class CrmLiveTeacherGrade implements Serializable {
    private Long teacherGradeId;

    private Long teacherId;

    /**
     * 年级[从1-12代表K12的年级]
     */
    private Byte grade;

    /**
     * 老师类型
     */
    private String teacherType;

    /**
     * 创建人
     */
    private Long creator;

    private Date createAt;

    /**
     * 最后修改人
     */
    private Long modifier;

    private Date updateAt;

    /**
     * 是否删除[0正常1已删除]
     */
    private Byte deleted;

    private static final long serialVersionUID = 1L;
}