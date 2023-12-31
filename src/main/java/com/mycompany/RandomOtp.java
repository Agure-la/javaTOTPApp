/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Random;



/**
 *
 * @author odeny
 */
public class RandomOtp {
    
     private static final int EXPIRY_DURATION_MINUTES = 2;
    
    public static int generateOTP() {
        
        int min = 1000;
        int max = 9999;

        // Generate a random OTP
        Random random = new Random();
        int otpValue = random.nextInt(max - min + 1) + min;

        // Get the current timestamp
        Instant now = Instant.now();

        // Set the expiry time for the OTP (2 minutes)
        Instant expiryTime = now.plus(2, ChronoUnit.MINUTES);

        // Convert the expiry time to a positive number
        long expiryTimePositive = expiryTime.getEpochSecond() - now.getEpochSecond();

        // Combine the OTP value and expiry time
        //int otp = otpValue * 10000 + (int) expiryTimePositive;

        return otpValue;

    }

    public static boolean isOTPExpired(int otp) {
        // Extract the expiry time from the OTP
        long expiryTimePositive = otp % 1000000;

        // Get the current timestamp
        Instant now = Instant.now();

        // Check if the OTP has expired
        return now.isAfter(Instant.ofEpochSecond(now.getEpochSecond() + expiryTimePositive));
    }
    
}
