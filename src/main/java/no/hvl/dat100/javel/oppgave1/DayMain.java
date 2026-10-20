package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();
         
        System.out.println("PRICES");
        DailyPower.printPowerPrices(powerprices_day);

        System.out.println("\nUSAGE");
        DailyPower.printPowerUsage(powerusage_day);

        System.out.println("\nDAILY CONSUMPTION");
        System.out.printf("%.2f kWh \n", DailyPower.computePowerUsage(powerusage_day));        
        
        System.out.println("\nSPOT PRICE");
        System.out.printf("%.2f NOK \n", DailyPower.computeSpotPrice(powerusage_day, powerprices_day));
    
        System.out.println("\nSUPPORT");
        System.out.printf("%.2f NOK \n", DailyPower.computePowerSupport(powerusage_day, powerprices_day));
        
        System.out.println("\nNORGESPRICE");
        System.out.printf("%.2f NOK \n", DailyPower.computeNorgesPrice(powerusage_day));
    
        System.out.println("\nPEAK POWER USAGE");
        System.out.printf("%.2f NOK \n", DailyPower.findPeakUsage(powerusage_day));
        
        System.out.println("\nAVG POWER USAGE");
        System.out.printf("%.2f NOK \n", DailyPower.findAvgPower(powerusage_day));
    }
}
