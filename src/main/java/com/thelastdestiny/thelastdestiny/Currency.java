package com.thelastdestiny.thelastdestiny;

import java.text.NumberFormat;
import java.util.Locale;

public class Currency {

    public static final NumberFormat currency = NumberFormat.getCurrencyInstance(new Locale("es","CR"));
}
