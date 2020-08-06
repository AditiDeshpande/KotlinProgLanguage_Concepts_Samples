/*
This class is just to compare Java code and kotlin code
check all these lines of code it's too much compared to kotlin code
which is providing same functionality check file ActivityKotlin and
compare it with this.so many lines of code is saved in kotlin.
 */

import java.util.Objects;

public class ActivityJava{
    private int actId;
    private String actName;

    @Override
    public String toString() {
        return "ActivityJava{" +
                "actId=" + actId +
                ", actName='" + actName + '\'' +
                ", actStatus='" + actStatus + '\'' +
                '}';
    }

    private String actStatus;

    public int getActId() {
        return actId;
    }

    public String getActName() {
        return actName;
    }

    public String getActStatus() {
        return actStatus;
    }

    public void setActId(int actId) {
        this.actId = actId;
    }

    public void setActName(String actName) {
        this.actName = actName;
    }

    public void setActStatus(String actStatus) {
        this.actStatus = actStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActivityJava that = (ActivityJava) o;
        return actId == that.actId &&
                Objects.equals(actName, that.actName) &&
                Objects.equals(actStatus, that.actStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actId, actName, actStatus);
    }
}