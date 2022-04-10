package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    //Тест: Сумма всех продаж
    @Test
    void shouldStatisticsSalesAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;

        int actualSum = service.statisticsSalesAmount(sales);

        assertEquals(expectedSum, actualSum);
    }

    //Тест: Среднняя сумма продаж в месяц
    @Test
    void shouldStatisticsAverageSalesAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverageSum = 15;

        int actualAverageSum = service.statisticsAverageSalesAmount(sales);

        assertEquals(expectedAverageSum, actualAverageSum);
    }

    //Тест: Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
    @Test
    void shouldStatisticsMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSales = 8;

        int actualMaxSales = service.statisticsMaxSales(sales);

        assertEquals(expectedMaxSales, actualMaxSales);
    }

    //Тест: Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
    @Test
    void shouldStatisticsMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinSales = 9;

        int actualMinSales = service.statisticsMinSales(sales);

        assertEquals(expectedMinSales, actualMinSales);
    }

    //Тест: Кол-во месяцев, в которых продажи были ниже среднего
    @Test
    void shouldStatisticsBelowAverageSalesAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedBelowSales = 5;

        int actualBelowSales = service.statisticsBelowAverageSalesAmount(sales);

        assertEquals(expectedBelowSales, actualBelowSales);
    }

    //Тест: Кол-во месяцев, в которых продажи были выше среднего
    @Test
    void shouldStatisticsHigherAverageSalesAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedHigherSales = 5;

        int actualHigherSales = service.statisticsHigherAverageSalesAmount(sales);

        assertEquals(expectedHigherSales, actualHigherSales);
    }
}



