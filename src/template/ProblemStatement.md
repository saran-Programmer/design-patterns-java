# Order Fulfillment System

You are building a CLI-based Order Fulfillment System for a food delivery application.

The application supports multiple order types, each following the same overall fulfillment process but with slight variations in how individual steps are performed.

The system currently supports the following order types:

* **Standard Delivery**
* **Express Delivery**
* **Self Pickup**

Every order must go through the following fulfillment process:

1. Validate Order
2. Prepare Order
3. Calculate Final Price
4. Process Payment
5. Arrange Delivery
6. Notify Customer

Each order type follows this sequence but may perform certain steps differently.

For example:

### Standard Delivery

* Uses the standard delivery fee.
* Assigns a regular delivery partner.

### Express Delivery

* Uses an express delivery fee.
* Assigns a high-priority delivery partner.

### Self Pickup

* Does not require a delivery partner.
* Notifies the customer when the order is ready for pickup.

The system must support the following:

1. **Process Order** — Execute the complete order fulfillment workflow for the selected order type.

2. **Calculate Final Price** — Compute the final amount based on the selected order type.

3. **Process Payment** — Complete the payment for the order.

4. **Arrange Delivery** — Assign an appropriate delivery partner whenever delivery is required.

5. **Notify Customer** — Inform the customer once the order has been processed.

Additional order types with different fulfillment requirements will be introduced as the application evolves.
