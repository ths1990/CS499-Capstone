package com.capstone;

public class Clients {
    private int clientId;
    private String name;
    private String serviceCode;

    public Clients(int clientId,String name, String serviceCode) {
        this.clientId = clientId;
        this.name = name;
        this.serviceCode = serviceCode;
    }

    public int getClientId() {
        return clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    @Override
    public String toString() {
        return "Client{" + "clientId=" + clientId +
                ", name='" + name + '\'' +
                ", choice='" + serviceCode + '\'' +
                '}';
    }
}
