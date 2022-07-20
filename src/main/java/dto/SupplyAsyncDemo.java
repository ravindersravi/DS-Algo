package dto;

import dto.database.EmployeeDatabase;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class SupplyAsyncDemo {

    public List<Employee> getEmployees() {
        Executor executor = Executors.newCachedThreadPool();

         CompletableFuture<List<Employee>> listCompletableFuture = CompletableFuture.supplyAsync(() -> {
             System.out.println(" Executed by : "+Thread.currentThread().getName());
            return EmployeeDatabase.fetchEmployee();
        },executor);
        try {
            return listCompletableFuture.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        SupplyAsyncDemo supplyAsyncDemo = new SupplyAsyncDemo();
        List<Employee> employees = supplyAsyncDemo.getEmployees();
        employees.stream().forEach(System.out::println);

    }
}
