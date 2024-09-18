package com.vladproduction.c04_advanced_class_design.enum_data_types;

public class EnumTestDetailed {
    public static void main(String[] args) {
        EnumTestDetailed enumTest1 = new EnumTestDetailed(PrinterTypeEnum.PRINTER_A);
        enumTest1.feature();
        EnumTestDetailed enumTest2 = new EnumTestDetailed(PrinterTypeEnum.PRINTER_C);
        enumTest2.feature();
    }

    PrinterTypeEnum printerTypeEnum;

    public EnumTestDetailed(PrinterTypeEnum printerTypeEnum) {
        this.printerTypeEnum = printerTypeEnum;
    }

    public void feature() {
        switch (printerTypeEnum) {
            case PRINTER_A -> System.out.println("printers are economical");
            case PRINTER_B -> System.out.println("printers are home-user");
            case PRINTER_C -> System.out.println("printers are productions");
        }
        System.out.println("Print page capacity per minute: " +
                printerTypeEnum.getPageCapacity());
    }
}

enum PrinterTypeEnum {
    PRINTER_A(5), PRINTER_B(10), PRINTER_C(15);

    private int pageCapacity;

    PrinterTypeEnum(int pageCapacity) {
        this.pageCapacity = pageCapacity;
    }

    public int getPageCapacity() {
        return pageCapacity;
    }
}
