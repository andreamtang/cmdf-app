package com.example.cmdf_app;

public class Serving {

    private double size;
    private String metric;

    public Serving(double size, String metric) {
        this.size = size;
        this.metric = metric;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }
}
