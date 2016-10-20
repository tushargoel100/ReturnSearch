package xxsg.oracle.apps.ont.stargatev2.osaportal.returnsearch.views.beans;

public class ValueFilter {
    
    public ValueFilter() {
        super();
    }
    
    private String paramName;
    private String paramValue;
    private String paramLabel;

    public ValueFilter(String paramName, String paramLabel, String paramValue){
        setParamLabel(paramLabel);
        setParamName(paramName);
        setParamValue(paramValue);
    }
    
    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamLabel(String paramLabel) {
        this.paramLabel = paramLabel;
    }

    public String getParamLabel() {
        return paramLabel;
    }
}
