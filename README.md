# **System Design and Design Patterns Project**

## **Project Overview**

This repository, **System-Design**, is a collection of various system design implementations and design pattern examples. The goal of this project is to provide a comprehensive reference for understanding system design principles, object-oriented programming concepts, and commonly used design patterns. Each module in the repository tackles a specific design problem or pattern, providing code implementations and diagrams to illustrate the concepts.

The project is organized into multiple subdirectories, each representing a system or a design pattern, with clearly defined classes and functions.

---

## **Modules Overview**

### 1. **CHESS**
   - **Description**: Implements a functional chess game with classes for the board, cells, pieces, moves, and players.
   - **Files**:
     - `board.java`: Represents the chessboard layout.
     - `cell.java`: Defines individual cells of the chessboard.
     - `chessController.java`: Manages game logic and player interactions.
     - `pieces.java` and `pieceType.java`: Represent chess pieces and their types.
     - `players.java`: Handles player-specific data.
   - **Diagram**: `chess.dio` provides a UML diagram for the chess system.

---

### 2. **Elevator**
   - **Description**: A basic design for an elevator system.
   - **Files**:
     - `elevator.dio`: UML diagram illustrating the elevator's system design.

---

### 3. **Factory Pattern**
   - **Description**: Demonstrates the Factory Design Pattern to create shapes (Circle and Square) dynamically.
   - **Files**:
     - `circle.java`, `square.java`: Represent concrete shape implementations.
     - `shape.java`: Defines the abstract base class for shapes.
     - `factory.java`: Implements the factory for creating shape objects.
     - `main.java`: Entry point to test the factory pattern.

---

### 4. **Parking**
   - **Description**: Simulates a parking system for two-wheelers and four-wheelers with entry and exit gates, slot management, and pricing.
   - **Files**:
     - `entranceGate.java` & `exitGate.java`: Manage vehicle entry and exit.
     - `parkingSlot.java`: Handles individual parking slots.
     - `manageFourWheleerParking.java` & `manageTwoWheleerParking.java`: Handle parking operations for different vehicle types.
     - `priceOfFourWheleer.java` & `priceOfTwoWheleer.java`: Calculate parking charges.
     - `parkingManager.java`: Manages overall parking operations.
   - **Diagram**: `parking.dio` provides the UML representation of the parking system.

---

### 5. **SOLID Principles**
   - **Description**: Demonstrates implementations of the SOLID principles in object-oriented design.
   - **Files**:
     - `singleResponsible.java`: Example of the Single Responsibility Principle.
     - `interfaceSegment.java`: Demonstrates the Interface Segregation Principle.
     - `liskove.java`: Example of the Liskov Substitution Principle.
     - `decorator.java`: Demonstrates the Decorator Pattern.
     - `observer.java`: Implements the Observer Pattern.

---

### 6. **TIC_TAC_TOE**
   - **Description**: Implements a two-player Tic Tac Toe game with classes for the board, players, and pieces.
   - **Files**:
     - `board.java`: Represents the Tic Tac Toe board.
     - `piece.java` & `pieceType.java`: Handle the game pieces and their types.
     - `players.java`: Manages player-specific information.
     - `ticTacToeGame.java`: Manages the game flow and rules.
   - **Diagram**: `tic_tac_toe.dio` provides the UML representation of the Tic Tac Toe system.

---

### 7. **Vending Machine**
   - **Description**: Simulates a vending machine system with inventory management and state transitions.
   - **Files**:
     - `vendingMachine.java`: Represents the vending machine.
     - `vendingState.java`: Manages the states of the machine.
     - `State/`: Contains individual states such as `idelState.java`, `payment.java`, and `selectProduct.java`.
     - `imp/inventory/`: Manages stock, product types, and inventory operations.
   - **Diagram**: `vending.dio` illustrates the UML structure of the vending machine.

---

### 8. **Decorator Pattern**
   - **Description**: Demonstrates the Decorator Pattern for extending functionalities dynamically.
   - **Files**:
     - `basePizza.java`: Base class for pizza.
     - `decorator.dio`: UML representation of the decorator pattern.
     - `main/main.java`: Main class to test the pattern.

---

### 9. **Observable Pattern**
   - **Description**: Implements the Observer Pattern, showcasing how objects notify others of state changes.
   - **Files**:
     - `main/observal.java`: Example implementation of the Observable pattern.

---

## **Features**

- Modularized code for each system or pattern.
- UML diagrams (`.dio` files) for visualizing the design structure.
- Adherence to **SOLID Principles** and object-oriented best practices.
- Comprehensive implementations of common design patterns like Factory, Observer, and Decorator.
- Systems designed to be extensible and easy to understand.

---

## **Setup and Usage**

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd Amansonukumarsah-System-Design
   ```

2. Navigate to the specific module directory.

3. Compile and run the `.java` files using your favorite IDE or the following commands:
   ```bash
   javac *.java
   java main
   ```

---

## **Potential Improvements**

- Add documentation comments (`Javadoc`) for all classes and methods.
- Extend the chess system to support multiplayer and online play.
- Add a web or GUI interface for the systems (e.g., Tic Tac Toe, Vending Machine).
- Implement test cases for each system using JUnit.
