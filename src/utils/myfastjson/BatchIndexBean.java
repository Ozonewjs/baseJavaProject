package utils.myfastjson;


import java.util.HashMap;
import java.util.Map;

public class BatchIndexBean {
    private String CONTENT_STATUS;
    private String BUSINESS_TIME;
    private String BATCH_FLAG;
    private String SERVER_ID;
    private String UPLOAD_USER;
    private String CONTENT_ID;
    private String AMOUNT;
    private String SERVER_IP;
    private String MIGRATION_STATUS;
    private String UPLOAD_TIME;
    private String SOCKET_PORT;
    private String HTTP_PORT;
    private String ONLINE;
    private String VERSION;
    private String MAX_VERSION;
    private String GROUP_ID;
    private String GROUP_NAME;
    private Map<String, String> customMap;


    public String getContentStatus() {
        return this.CONTENT_STATUS;
    }

    public void setContentStatus(String conentStatus) {
        this.CONTENT_STATUS = conentStatus;
    }

    public String getGroupName() {
        return this.GROUP_NAME;
    }

    public void setGroupName(String groupName) {
        this.GROUP_NAME = groupName;
    }

    public String getBusinessTime() {
        return this.BUSINESS_TIME;
    }

    public void setBusinessTime(String businessTime) {
        this.BUSINESS_TIME = businessTime;
    }

    public String getBatchFlag() {
        return this.BATCH_FLAG;
    }

    public void setBatchFlag(String batchFlag) {
        this.BATCH_FLAG = batchFlag;
    }

    public String getServerID() {
        return this.SERVER_ID;
    }

    public void setServerID(String serverID) {
        this.SERVER_ID = serverID;
    }

    public String getContentID() {
        return this.CONTENT_ID;
    }

    public void setContentID(String contentID) {
        this.CONTENT_ID = contentID;
    }

    public String getAmount() {
        return this.AMOUNT;
    }

    public void setAmount(String amount) {
        this.AMOUNT = amount;
    }

    public String getServerIp() {
        return this.SERVER_IP;
    }

    public void setServerIp(String serverIp) {
        this.SERVER_IP = serverIp;
    }

    public String getMigrationStatus() {
        return this.MIGRATION_STATUS;
    }

    public void setMigrationStatus(String migrationStatus) {
        this.MIGRATION_STATUS = migrationStatus;
    }

    public String getUploadTime() {
        return this.UPLOAD_TIME;
    }

    public void setUploadTime(String uploadTime) {
        this.UPLOAD_TIME = uploadTime;
    }

    public String getSocketPort() {
        return this.SOCKET_PORT;
    }

    public void setSocketPort(String socketPort) {
        this.SOCKET_PORT = socketPort;
    }

    public String getHttpPort() {
        return this.HTTP_PORT;
    }

    public void setHttpPort(String httpPort) {
        this.HTTP_PORT = httpPort;
    }

    public String getOnLine() {
        return this.ONLINE;
    }

    public void setOnLine(String onLine) {
        this.ONLINE = onLine;
    }

    public String getVersion() {
        return this.VERSION;
    }

    public void setVersion(String version) {
        this.VERSION = version;
    }

    public Map<String, String> getCustomMap() {
        return this.customMap;
    }

    public void setCustomMap(Map<String, String> customMap) {
        this.customMap = customMap;
    }

    public void addCustomMap(String key, String value) {
        if (this.customMap == null) {
            this.customMap = new HashMap();
        }

        this.customMap.put(key, value);
    }

    public String getMaxVersion() {
        return this.MAX_VERSION;
    }

    public void setMaxVersion(String maxVersion) {
        this.MAX_VERSION = maxVersion;
    }

    public String getUploadUser() {
        return this.UPLOAD_USER;
    }

    public void setUploadUser(String uploadUser) {
        this.UPLOAD_USER = uploadUser;
    }

    public String getGroupID() {
        return this.GROUP_ID;
    }

    public void setGroupID(String groupID) {
        this.GROUP_ID = groupID;
    }
}
