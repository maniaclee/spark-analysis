package bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lipeng on 2017/3/5.
 */
public class SparkMessage implements Serializable {

    private String uuid;
    private Long userId;
    private int operationType;
    private List<String> categories;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public int getOperationType() {
        return operationType;
    }

    public void setOperationType(int operationType) {
        this.operationType = operationType;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }
}
