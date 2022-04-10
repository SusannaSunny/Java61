package ru.netology.stats;

public class StatsService {
    //Сумма всех продаж
    public int statisticsSalesAmount(int[] sales) {
        int sumSales = 0;
        for (int sale : sales) {
            sumSales += sale;
        }
        return sumSales;
    }

    //Среднняя сумма продаж в месяц
    public int statisticsAverageSalesAmount(int[] sales) {
        int averageSumSales = 0;
        averageSumSales = statisticsSalesAmount(sales) / sales.length;
        return averageSumSales;
    }

    //Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
    public int statisticsMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    //Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
    public int statisticsMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    //Кол-во месяцев, в которых продажи были ниже среднего
    public int statisticsBelowAverageSalesAmount(int[] sales) {
        int belowAverageSumSales = 0;
        int averageSumSalesB = 0;
        averageSumSalesB = statisticsAverageSalesAmount(sales);
        for (long sale : sales) {
            if (sale < averageSumSalesB) {
                belowAverageSumSales += 1;
            }
        }
        return belowAverageSumSales;
    }

    //Кол-во месяцев, в которых продажи были выше среднего
    public int statisticsHigherAverageSalesAmount(int[] sales) {
        int higherAverageSumSales = 0;
        int averageSumSalesH = 0;
        averageSumSalesH = statisticsAverageSalesAmount(sales);
        for (long sale : sales) {
            if (sale > averageSumSalesH) {
                higherAverageSumSales += 1;
            }
        }
        return higherAverageSumSales;
    }

}
