package utils.myfastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

import java.util.ArrayList;
import java.util.List;

public class Test {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        String xmlres = "<HeightQuery USER_NAME=\"XD\" COUNT=\"12\" LIMIT=\"5\" PAGE=\"1\" MODEL_CODE=\"XDZWJYD\" PASSWORD=\"c3lndDM0NTY=\">  <customAtt>    <BUSI_SERIAL_NO><string>20190411000005</string></BUSI_SERIAL_NO>  </customAtt>  <groupId>102</groupId>  <indexBeans>    <BatchIndexBean CONTENT_STATUS=\"1\" SERVER_ID=\"81\" UPLOAD_USER=\"XD\" CONTENT_ID=\"20190428_14_60_2F57D9D1-CA03-BC07-52B7-D1F24725E47A-81\" SERVER_IP=\"192.168.170.143\" MIGRATION_STATUS=\"1\" SOCKET_PORT=\"8021\" HTTP_PORT=\"9080\" MAX_VERSION=\"1\" GROUP_ID=\"102\" GROUP_NAME=\"SunECMDM\">      <customMap>        <K_CUSTNO><string></string></K_CUSTNO>        <BUSI_END_DATE><string></string></BUSI_END_DATE>        <USER_ID><string></string></USER_ID>        <NEAR_PATH><string>20190428/14/60/</string></NEAR_PATH>        <OFFLINE_TIME><string></string></OFFLINE_TIME>        <SANTADEE_CODE><string></string></SANTADEE_CODE>        <K_BILLNO><string></string></K_BILLNO>        <CUSTOM_NO><string></string></CUSTOM_NO>        <AMOUNT><string>0</string></AMOUNT>        <BUSI_START_DATE><string>20190428</string></BUSI_START_DATE>        <ORG_ID><string></string></ORG_ID>        <SCAN_ID><string></string></SCAN_ID>        <K_USERID><string></string></K_USERID>        <BUSI_SERIAL_NO><string>20190411000005</string></BUSI_SERIAL_NO>        <K_BZRNUM><string></string></K_BZRNUM>        <BUSI_REMARK><string></string></BUSI_REMARK>        <K_CUSID><string></string></K_CUSID>        <K_COSNO><string></string></K_COSNO>        <OLD_I_ID><string></string></OLD_I_ID>        <K_DOCID><string></string></K_DOCID>      </customMap>    </BatchIndexBean>    <BatchIndexBean CONTENT_STATUS=\"1\" SERVER_ID=\"81\" UPLOAD_USER=\"XD\" CONTENT_ID=\"20190428_75_60_F69D92FE-DE92-93CD-0B00-B2189C695793-81\" SERVER_IP=\"192.168.170.143\" MIGRATION_STATUS=\"1\" SOCKET_PORT=\"8021\" HTTP_PORT=\"9080\" MAX_VERSION=\"1\" GROUP_ID=\"102\" GROUP_NAME=\"SunECMDM\">      <customMap>        <K_CUSTNO><string></string></K_CUSTNO>        <BUSI_END_DATE><string></string></BUSI_END_DATE>        <USER_ID><string></string></USER_ID>        <NEAR_PATH><string>20190428/75/60/</string></NEAR_PATH>        <OFFLINE_TIME><string></string></OFFLINE_TIME>        <SANTADEE_CODE><string></string></SANTADEE_CODE>        <K_BILLNO><string></string></K_BILLNO>        <CUSTOM_NO><string></string></CUSTOM_NO>        <AMOUNT><string>0</string></AMOUNT>        <BUSI_START_DATE><string>20190428</string></BUSI_START_DATE>        <ORG_ID><string></string></ORG_ID>        <SCAN_ID><string></string></SCAN_ID>        <K_USERID><string></string></K_USERID>        <BUSI_SERIAL_NO><string>20190411000005</string></BUSI_SERIAL_NO>        <K_BZRNUM><string></string></K_BZRNUM>        <BUSI_REMARK><string></string></BUSI_REMARK>        <K_CUSID><string></string></K_CUSID>        <K_COSNO><string></string></K_COSNO>        <OLD_I_ID><string></string></OLD_I_ID>        <K_DOCID><string></string></K_DOCID>      </customMap>    </BatchIndexBean>    <BatchIndexBean CONTENT_STATUS=\"1\" SERVER_ID=\"81\" UPLOAD_USER=\"XD\" CONTENT_ID=\"20190428_90_34_2E4E0D62-6B4F-3188-BD3E-33163925AEA0-81\" SERVER_IP=\"192.168.170.143\" MIGRATION_STATUS=\"1\" SOCKET_PORT=\"8021\" HTTP_PORT=\"9080\" MAX_VERSION=\"1\" GROUP_ID=\"102\" GROUP_NAME=\"SunECMDM\">      <customMap>        <K_CUSTNO><string></string></K_CUSTNO>        <BUSI_END_DATE><string></string></BUSI_END_DATE>        <USER_ID><string></string></USER_ID>        <NEAR_PATH><string>20190428/90/34/</string></NEAR_PATH>        <OFFLINE_TIME><string></string></OFFLINE_TIME>        <SANTADEE_CODE><string></string></SANTADEE_CODE>        <K_BILLNO><string></string></K_BILLNO>        <CUSTOM_NO><string></string></CUSTOM_NO>        <AMOUNT><string>0</string></AMOUNT>        <BUSI_START_DATE><string>20190428</string></BUSI_START_DATE>        <ORG_ID><string></string></ORG_ID>        <SCAN_ID><string></string></SCAN_ID>        <K_USERID><string></string></K_USERID>        <BUSI_SERIAL_NO><string>20190411000005</string></BUSI_SERIAL_NO>        <K_BZRNUM><string></string></K_BZRNUM>        <BUSI_REMARK><string></string></BUSI_REMARK>        <K_CUSID><string></string></K_CUSID>        <K_COSNO><string></string></K_COSNO>        <OLD_I_ID><string></string></OLD_I_ID>        <K_DOCID><string></string></K_DOCID>      </customMap>    </BatchIndexBean>    <BatchIndexBean CONTENT_STATUS=\"1\" SERVER_ID=\"81\" UPLOAD_USER=\"XD\" CONTENT_ID=\"20190428_97_5_95A2861E-725D-2FDB-A145-C9A0B72CC4D4-81\" SERVER_IP=\"192.168.170.143\" MIGRATION_STATUS=\"1\" SOCKET_PORT=\"8021\" HTTP_PORT=\"9080\" MAX_VERSION=\"1\" GROUP_ID=\"102\" GROUP_NAME=\"SunECMDM\">      <customMap>        <K_CUSTNO><string></string></K_CUSTNO>        <BUSI_END_DATE><string></string></BUSI_END_DATE>        <USER_ID><string></string></USER_ID>        <NEAR_PATH><string>20190428/97/5/</string></NEAR_PATH>        <OFFLINE_TIME><string></string></OFFLINE_TIME>        <SANTADEE_CODE><string></string></SANTADEE_CODE>        <K_BILLNO><string></string></K_BILLNO>        <CUSTOM_NO><string></string></CUSTOM_NO>        <AMOUNT><string>0</string></AMOUNT>        <BUSI_START_DATE><string>20190428</string></BUSI_START_DATE>        <ORG_ID><string></string></ORG_ID>        <SCAN_ID><string></string></SCAN_ID>        <K_USERID><string></string></K_USERID>        <BUSI_SERIAL_NO><string>20190411000005</string></BUSI_SERIAL_NO>        <K_BZRNUM><string></string></K_BZRNUM>        <BUSI_REMARK><string></string></BUSI_REMARK>        <K_CUSID><string></string></K_CUSID>        <K_COSNO><string></string></K_COSNO>        <OLD_I_ID><string></string></OLD_I_ID>        <K_DOCID><string></string></K_DOCID>      </customMap>    </BatchIndexBean>    <BatchIndexBean CONTENT_STATUS=\"1\" SERVER_ID=\"81\" UPLOAD_USER=\"XD\" CONTENT_ID=\"20190429_12_1_572631BC-FC30-E2A9-2DE4-5F7AE67EF457-81\" SERVER_IP=\"192.168.170.143\" MIGRATION_STATUS=\"1\" SOCKET_PORT=\"8021\" HTTP_PORT=\"9080\" MAX_VERSION=\"1\" GROUP_ID=\"102\" GROUP_NAME=\"SunECMDM\">      <customMap>        <K_CUSTNO><string></string></K_CUSTNO>        <BUSI_END_DATE><string></string></BUSI_END_DATE>        <USER_ID><string></string></USER_ID>        <NEAR_PATH><string>20190429/12/1/</string></NEAR_PATH>        <OFFLINE_TIME><string></string></OFFLINE_TIME>        <SANTADEE_CODE><string></string></SANTADEE_CODE>        <K_BILLNO><string></string></K_BILLNO>        <CUSTOM_NO><string></string></CUSTOM_NO>        <AMOUNT><string>0</string></AMOUNT>        <BUSI_START_DATE><string>20190429</string></BUSI_START_DATE>        <ORG_ID><string></string></ORG_ID>        <SCAN_ID><string></string></SCAN_ID>        <K_USERID><string></string></K_USERID>        <BUSI_SERIAL_NO><string>20190411000005</string></BUSI_SERIAL_NO>        <K_BZRNUM><string></string></K_BZRNUM>        <BUSI_REMARK><string></string></BUSI_REMARK>        <K_CUSID><string></string></K_CUSID>        <K_COSNO><string></string></K_COSNO>        <OLD_I_ID><string></string></OLD_I_ID><K_DOCID><string></string></K_DOCID></customMap></BatchIndexBean></indexBeans></HeightQuery>";
        //json字符串-简单对象型
          final String  JSON_OBJ_STR = "{\"studentName\":\"lily\",\"studentAge\":12}";
        //json字符串-数组类型
          final String  JSON_ARRAY_STR = "[{\"studentName\":\"lily\",\"studentAge\":12},{\"studentName\":\"lucy\",\"studentAge\":15}]";
        //复杂格式json字符串
          final String  COMPLEX_JSON_STR = "{\"teacherName\":\"crystall\",\"teacherAge\":27,\"course\":{\"courseName\":\"english\",\"code\":1270},\"students\":[{\"studentName\":\"lily\",\"studentAge\":12},{\"studentName\":\"lucy\",\"studentAge\":15}]}";
        //第一种方式
        JSONObject jsonObject = JSONObject.parseObject(JSON_OBJ_STR);

        String studentName = jsonObject.getString("studentName");
        Integer studentAge = jsonObject.getInteger("studentAge");

        //Student student = new Student(studentName, studentAge);

        //第二种方式,使用TypeReference<T>类,由于其构造方法使用protected进行修饰,故创建其子类
        //Student student = JSONObject.parseObject(JSON_OBJ_STR, new TypeReference<Student>() {});

        //第三种方式,使用Gson的思想
        Student student = JSONObject.parseObject(JSON_OBJ_STR, Student.class);

        System.out.println(student);

        //已知复杂JavaBean_obj
        Teacher teacher = JSONObject.parseObject(COMPLEX_JSON_STR, new TypeReference<Teacher>() {});
        String jsonString = JSONObject.toJSONString(teacher);
        System.out.println(jsonString);
        List<HeightQuery> hqst = new ArrayList<>();
        try {
            JSONObject a = Xml2JsonUtils.xml2Json(xmlres);
            String aa = a.toJSONString().replace("@","").replace("\"BatchIndexBean\":","")
                    .replace("{[","[").replace("]}","]");
            HeightQuery heightquery = null;
            heightquery = JSON.parseObject(aa, new TypeReference<HeightQuery>() { });
            hqst.add(heightquery);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(hqst.size());
    }
}
