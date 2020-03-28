package com.liuming.eshop.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

/**
 * @Description 自定义响应结构
 * @ClassName DataResult
 * @author 张孙峰
 * @date 2018.03.02 10:39:51
 */
public class DataResult {

    // 定义jackson对象
    private static final ObjectMapper MAPPER = new ObjectMapper();

    // 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;

    //响应错误
    private Exception e;

    public static DataResult build(Integer status, String msg, Object data) {
        return new DataResult(status, msg, data);
    }

    public static DataResult ok(Object data) {
        return new DataResult(data);
    }
    public static DataResult ok(Object data,String msg) {
    	return new DataResult(data,msg);
    }

    public static DataResult ok() {
        return new DataResult(null);
    }

    public DataResult() {

    }

    public static DataResult build(Integer status, String msg) {
        return new DataResult(status, msg, null);
    }

    public static DataResult exception(Integer status, Exception e) {
        return new DataResult(status, e, null);
    }

    public static DataResult exception(Integer status, String e) {
        return new DataResult(status, e, null);
    }
    
    /**
     * @Description 参数不问为空
     * @Title build
     * @return DataResult
     * @author 张孙峰
     * @date 2018.03.02 10:33:08
     */
    public static DataResult build() {
    		return new DataResult(401, "Parameters cannot be empty", null);			
    }

    public DataResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public DataResult(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }
    
    public DataResult(Object data,String msg) {
    	this.status = 200;
    	this.msg = msg;
    	this.data = data;
    }

    public DataResult(Integer status, Exception e, Object data) {
        this.status = 999;
        this.e = e;
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * @Description 将Json结果集转化为MayiDBResult对象
     * @Title formatToPojo
     * @param jsonData Json数据
     * @param clazz MayiDBResult中的Object类型
     * @return DataResult
     * @author 张孙峰
     * @date 2018.03.02 10:33:36
     */
    public static DataResult formatToPojo(String jsonData, Class<?> clazz) {
        try {
            if (clazz == null) {
                return MAPPER.readValue(jsonData, DataResult.class);
            }
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (clazz != null) {
                if (data.isObject()) {
                    obj = MAPPER.readValue(data.traverse(), clazz);
                } else if (data.isTextual()) {
                    obj = MAPPER.readValue(data.asText(), clazz);
                }
            }
            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * @Description 没有Object对象的转化
     * @Title format
     * @param json
     * @return DataResult
     * @author 张孙峰
     * @date 2018.03.02 10:34:09
     */
    public static DataResult format(String json) {
        try {
            return MAPPER.readValue(json, DataResult.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @Description Object是集合转化
     * @Title formatToList
     * @param jsonData Json数据
     * @param clazz 集合中的类型
     * @return DataResult
     * @author 张孙峰
     * @date 2018.03.02 10:34:22
     */
    public static DataResult formatToList(String jsonData, Class<?> clazz) {
        try {
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (data.isArray() && data.size() > 0) {
                obj = MAPPER.readValue(data.traverse(),
                        MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
            }
            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }

}
