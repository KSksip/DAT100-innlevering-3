package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave2.MonthPowerData;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        System.out.println("\nPOWER USAGE");
        MonthlyPower.printPowerUsage(power_usage_month);

        System.out.println("\nPOWER PRICES");
        MonthlyPower.printPowerPrices(power_prices_month);

        System.out.println("\nMONTHLY POWER USAGE");
        System.out.printf("%.2f kWh\n", MonthlyPower.computePowerUsage(power_usage_month));
        
        System.out.println("\nTHRESHOLD EXCEEDED (120 kWh)");
        System.out.println(MonthlyPower.exceedThreshold(power_usage_month, 120.00));

        System.out.println("\nSPOT PRICE");
        System.out.printf("%.2f NOK\n", MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month));
        
        System.out.println("\nSUPPORT");
        System.out.printf("%.2f NOK\n", MonthlyPower.computePowerSupport(power_usage_month, power_prices_month));

        System.out.println("\nNORGESPRICE");
        System.out.printf("%.2f NOK\n", MonthlyPower.computeNorgesPrice(power_usage_month));
    }
}