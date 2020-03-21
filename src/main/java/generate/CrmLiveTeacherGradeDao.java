package generate;

public interface CrmLiveTeacherGradeDao {
    int deleteByPrimaryKey(Long teacherGradeId);

    int insert(CrmLiveTeacherGrade record);

    int insertSelective(CrmLiveTeacherGrade record);

    CrmLiveTeacherGrade selectByPrimaryKey(Long teacherGradeId);

    int updateByPrimaryKeySelective(CrmLiveTeacherGrade record);

    int updateByPrimaryKey(CrmLiveTeacherGrade record);
}