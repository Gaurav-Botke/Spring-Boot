package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;


@Component("hotel")
@Getter

public class HotelInfo {

    @Value("#{cust.dosaPrice + cust.pohaPrice + cust.samosaPrice}")
    private Float billAmt;

    @Value("${hotel.disCount}")
    private Float discount;

    private Float finalBillAmt;

    // This is an instance method now
    public Float getFinalBill(int minAmount) {
        if (billAmt != null && discount != null && billAmt > minAmount) {
            finalBillAmt = billAmt - (billAmt * discount / 100.0f);
        } else {
            finalBillAmt = billAmt;  // No discount
        }
        return finalBillAmt;
    }

	@Override
	public String toString() {
		return "HotelInfo [billAmt=" + billAmt + ", discount=" + discount +  "]";
	}
    
    
}
