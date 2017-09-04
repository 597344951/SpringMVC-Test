package com.springmvc.test.bean;

public class TestBean {
    private String un;
    private String ps;
    
    
    
    /** 
     * 
     * @see java.lang.Object#toString() 
     */  
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("TestBean [");
        if (un != null) {
            builder.append("un=");
            builder.append(un);
            builder.append(", ");
        }
        if (ps != null) {
            builder.append("ps=");
            builder.append(ps);
        }
        builder.append("]");
        return builder.toString();
    }

    /**
     * 获取un  
     * @return the un
     */
    public String getUn() {
        return un;
    }
    
    /**
     * 设置un  
     * @param un the un to set
     */
    public void setUn(String un) {
        this.un = un;
    }
    
    /**
     * 获取ps  
     * @return the ps
     */
    public String getPs() {
        return ps;
    }
    
    /**
     * 设置ps  
     * @param ps the ps to set
     */
    public void setPs(String ps) {
        this.ps = ps;
    }
    
    

}
