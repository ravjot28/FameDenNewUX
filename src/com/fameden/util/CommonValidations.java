/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fameden.util;

/**
 *
 * @author Ravjot
 */
public class CommonValidations {

    public static boolean isStringEmpty(String data) {
        boolean result = false;
        if (data == null || data.trim().length() == 0) {
            result = true;
        }
        return result;
    }
}
