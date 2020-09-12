package me.job.phlyt;

public class PointRequest {
    private String requestId;
    private Integer requestSeq;

    public PointRequest() {
    }

    public PointRequest(String requestId, Integer requestSeq) {
        this.requestId = requestId;
        this.requestSeq = requestSeq;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Integer getRequestSeq() {
        return requestSeq;
    }

    public void setRequestSeq(Integer requestSeq) {
        this.requestSeq = requestSeq;
    }

    @Override
    public String toString() {
        return "PointRequest{" +
                "requestId='" + requestId + '\'' +
                ", requestSeq=" + requestSeq +
                '}';
    }
}
