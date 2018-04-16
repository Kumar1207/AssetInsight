package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Util;

import java.util.Random;

public class Utility {
    public static int genRand5DigitNum() {
        Random r = new Random( System.currentTimeMillis() );
        return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
    }
}
