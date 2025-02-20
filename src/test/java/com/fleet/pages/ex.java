package com.fleet.pages;

import com.fleet.utilities.ConfigurationReader;

public class ex {
    public static void main(String[] args) {
        ConfigurationReader.getProperty("sales_manager_username");
        ConfigurationReader.getProperty("store_manager_password");
    }
}
