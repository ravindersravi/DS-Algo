package dto;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class RunAsyncDemo {
    public void saveEmployee(File jsonFile) throws ExecutionException, InterruptedException {
        ObjectMapper mapper = new ObjectMapper();
        //we are not expecting retirn type
        CompletableFuture<Void> runAsyncFeature = CompletableFuture.runAsync(
                new Runnable() {
                    @Override
                    public void run() {


                        try {
                            List<Employee> employeeList = mapper.readValue(jsonFile, new TypeReference<List<Employee>>() {

                            });
                            //TODO @sneky throws from lombok
                            // write login to save list of employee to database
                            System.out.println("Thread : " + Thread.currentThread().getName());
                            System.out.println(employeeList.size());
                            employeeList.stream().forEach(System.out::println);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
        );

        runAsyncFeature.get();
    }

    public void saveEmployeesWithLambda(File jsonFile) throws ExecutionException, InterruptedException {
        ObjectMapper mapper = new ObjectMapper();
        Executor executor = Executors.newFixedThreadPool(5);
        //we are not expecting retirn type
        CompletableFuture<Void> runAsyncFeature = CompletableFuture.runAsync(
                () -> {
                    try {
                        List<Employee> employeeList = mapper.readValue(jsonFile, new TypeReference<List<Employee>>() {

                        });
                        //TODO @sneky throws from lombok
                        // write login to save list of employee to database
                        System.out.println("Thread : " + Thread.currentThread().getName());
                        employeeList.stream().forEach(System.out::println);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                },executor
        );
        // we can complete the thread manulaly as part of blocking code
       // runAsyncFeature.toCompletableFuture();

        runAsyncFeature.get();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RunAsyncDemo runAsyncDemo = new RunAsyncDemo();
        runAsyncDemo.saveEmployee(new File("employee.json"));
        runAsyncDemo.saveEmployeesWithLambda(new File("employee.json"));
    }
}
