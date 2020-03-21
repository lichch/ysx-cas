package generate;

public interface CrmLiveInitiatorDao {
    int deleteByPrimaryKey(Long initiatorId);

    int insert(CrmLiveInitiator record);

    int insertSelective(CrmLiveInitiator record);

    CrmLiveInitiator selectByPrimaryKey(Long initiatorId);

    int updateByPrimaryKeySelective(CrmLiveInitiator record);

    int updateByPrimaryKey(CrmLiveInitiator record);
}