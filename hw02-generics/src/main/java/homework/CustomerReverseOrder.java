package homework;


import java.util.*;

public class CustomerReverseOrder {

    //todo: 2. надо реализовать методы этого класса
    //надо подобрать подходящую структуру данных, тогда решение будет в "две строчки"
    //и этой структурой будет конечно же очередь))))
    Deque<Customer> list = new ArrayDeque<>();

    public void add(Customer customer) {
        list.addFirst(customer);
    }

    public Customer take() {
        return list.pollFirst();
    }
}
