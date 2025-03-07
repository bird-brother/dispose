package org.birdbro.common.entity;

/**
 * @author bird
 * @date 2022-1-20 11:09
 **/
public class PublicKeyMap {

    private String ownModulus;
    private String exponent;

    public String getOwnModulus() {
        return ownModulus;
    }

    public void setOwnModulus(String ownModulus) {
        this.ownModulus = ownModulus;
    }

    public String getExponent() {
        return exponent;
    }

    public void setExponent(String exponent) {
        this.exponent = exponent;
    }

    @Override
    public String toString() {
        return "PublicKeyMap [modulus=" + ownModulus + ", exponent=" + exponent + "]";
    }
}
