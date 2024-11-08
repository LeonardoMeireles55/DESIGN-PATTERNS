package Solid.SingleResponsibilityPrinciple;
import java.util.List;

//The violation of the Single Responsibility Principle (SRP) occurs in the OrderManager class, which has multiple responsibilities:

// Order management: The placeOrder(), cancelOrder(), and getOrders() methods are responsible for managing the orders.
// Invoicing: The sendInvoice() method is responsible for generating and sending invoices for orders.
// Payment processing: The processPayment() method is responsible for processing payments for orders.

// These different responsibilities are not directly related to each other, and they should be separated into different classes or services to maintain the Single Responsibility Principle.
// By separating these responsibilities, you can improve the maintainability, testability, and modularity of your codebase. For example, you could create the following classes:

// OrderService: Responsible for managing the order-related operations (creating, canceling, retrieving orders).
// InvoiceService: Responsible for generating and sending invoices.
// PaymentService: Responsible for processing payments.

// This way, each class has a single responsibility, making the codebase more maintainable, testable, and easier to understand.

public class OrderManager {
    private List<Order> orders;

    // Order management responsibilities
    public void placeOrder(Customer customer, Product product, int quantity) {
        // Logic to create a new order
        Order order = new Order(customer, product, quantity);
        orders.add(order);
    }

    public void cancelOrder(Order order) {
        // Logic to cancel an existing order
        orders.remove(order);
    }

    public List<Order> getOrders() {
        return orders;
    }

    // Invoicing responsibility
    public void sendInvoice(Order order) {
        // Logic to generate and send an invoice for the order
        // This could include connecting to a third-party invoicing system
    }

    // Payment processing responsibility
    public void processPayment(Order order, PaymentMethod paymentMethod) {
        // Logic to process the payment for the order
        // This could include connecting to a payment gateway
    }
}