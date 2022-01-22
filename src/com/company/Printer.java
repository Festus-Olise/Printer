package com.company;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        if(tonerLevel<-1 || tonerLevel > 100) {
            tonerLevel = -1;
        }
        this.duplex = duplex;
    }

    public int addToner (int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            } else {
                this.tonerLevel += tonerAmount;
                return  this.tonerLevel;
            }
        } else return -1;

    }

    public int printPages (int pages) {

        int pagesToPrint = pages;
        if (duplex){
            System.out.println("Now printing in duplex mode.");
            pagesToPrint = pagesToPrint/2 + pagesToPrint%2;
        }
        this.pagesPrinted += pagesToPrint;

        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
