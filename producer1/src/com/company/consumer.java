package com.company;

public class consumer {

        Iproducer ip;
        consumer(Iproducer ip){
            this.ip=ip;
        }
        public void consumer()
        {
            ip.first();
        }
    }
