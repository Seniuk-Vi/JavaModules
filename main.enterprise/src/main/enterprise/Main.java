package main.enterprise;

import main.api.Accountant;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello enterprise");
        ServiceLoader<Accountant> loader = ServiceLoader.load(Accountant.class);
        loader.forEach(Accountant::doJob);
        System.out.println("Done!");
    }
}
