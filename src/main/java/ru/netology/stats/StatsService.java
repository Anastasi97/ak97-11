package ru.netology.stats;

public class StatsService {
    public long summ(long[] sales){
        long totalSale = 0;
        for (long sale : sales){
            totalSale += sale;
        }
        return totalSale;
    }

    public long average(long[] sales){
        long totalSale = 0;
        for (long sale : sales){
            totalSale += sale;
        }
        long averege = totalSale / 12;
        return averege;
    }

    public int maxSale(long[] sales){
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[month]){
                month = i;
            }
        }
        return month + 1;
    }

    public int minSale(long[] sales){
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[month]){
                month = i;
            }
        }
        return month + 1;
    }

    public int belowAverage(long[] sales){
        int counter = 0;
        for (long sale : sales){
            if (sale < average(sales)){
                counter++;
            }
        }
        return counter;
    }

    public int overAverage(long[] sales){
        int counter = 0;
        for (long sale : sales){
            if (sale > average(sales)){
                counter++;
            }
        }
        return counter;
    }
}
