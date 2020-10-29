package com.kj.service.entity;

public class Page {
    //当前页
    private int current=1;
    private int limit=10;
    private int rows;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        if(current>=1){
            this.current = current;
        }

    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if(limit>=1&&limit<=100){
            this.limit = limit;
        }

    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if(rows>=0){
            this.rows = rows;
        }

    }

    @Override
    public String toString() {
        return "Page{" +
                "current=" + current +
                ", limit=" + limit +
                ", rows=" + rows +
                '}';
    }
    public  int getStart(){
        return current*limit-limit;
    }

    public int getTotalPage(){
        int totalPage;
        if(rows%limit==0){
            totalPage=rows/limit;
        }else {
            totalPage=rows/limit+1;
        }
        return totalPage;
    }

    public int getFrom(){
        int from=current-2;
        return from<1 ? 1:from;
    }

    public  int  getEnd(){
        int end=current+2;
        int total=getTotalPage();
        if(end>total){
            return total;
        }else {
            return end;
        }

    }
}
