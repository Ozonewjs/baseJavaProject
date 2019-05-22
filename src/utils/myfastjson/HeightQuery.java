package utils.myfastjson;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HeightQuery {
    private String USER_NAME;
    private int COUNT;
    private String TABLE_NAME;
    private int LIMIT;
    private int PAGE;
    private String MODEL_CODE;
    private Map<String, String> customAtt;
    private List<String> filters;
    private String groupId;
    private List<BatchIndexBean> indexBeans;
    private String PASSWORD;
    private String NEED_OFFLINE;


    public String getNEED_OFFLINE() {
        return this.NEED_OFFLINE;
    }

    public void setNEED_OFFLINE(String nEED_OFFLINE) {
        this.NEED_OFFLINE = nEED_OFFLINE;
    }

    public int getCount() {
        return this.COUNT;
    }

    public String getPASSWORD() {
        return this.PASSWORD;
    }

    public void setPASSWORD(String pASSWORD) {
        this.PASSWORD = pASSWORD;
    }

    public void setCount(int count) {
        this.COUNT = count;
    }

    public int getLimit() {
        return this.LIMIT;
    }

    public void setLimit(int limit) {
        this.LIMIT = limit;
    }

    public String getModelCode() {
        return this.MODEL_CODE;
    }

    public void setModelCode(String modelCode) {
        this.MODEL_CODE = modelCode;
    }

    public List<BatchIndexBean> getIndexBeans() {
        return this.indexBeans;
    }

    public void setIndexBeans(List<BatchIndexBean> indexBeans) {
        this.indexBeans = indexBeans;
    }

    public void addIndexBeans(BatchIndexBean indexBean) {
        if (this.indexBeans == null) {
            this.indexBeans = new ArrayList();
        }

        this.indexBeans.add(indexBean);
    }

    public int getPage() {
        return this.PAGE;
    }

    public void setPage(int page) {
        this.PAGE = page;
    }

    public Map<String, String> getCustomAtt() {
        return this.customAtt;
    }

    public void setCustomAtt(Map<String, String> customAtt) {
        this.customAtt = customAtt;
    }

    public void addCustomAtt(String key, String value) {
        if (this.customAtt == null) {
            this.customAtt = new HashMap();
        }

        this.customAtt.put(key, value);
    }

    public List<String> getFilters() {
        return this.filters;
    }

    public void setFilters(List<String> filters) {
        this.filters = filters;
    }

    public void addfilters(String filter) {
        if (this.filters == null) {
            this.filters = new ArrayList();
        }

        this.filters.add(filter);
    }

    public String getUserName() {
        return this.USER_NAME;
    }

    public void setUserName(String userName) {
        this.USER_NAME = userName;
    }

    public String getTableName() {
        return this.TABLE_NAME;
    }

    public void setTableName(String tableName) {
        this.TABLE_NAME = tableName;
    }



    public String getGroupId() {
        return this.groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}
