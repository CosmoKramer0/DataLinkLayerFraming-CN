# Data Link Layer Framing Methods: Character Stuffing

This project demonstrates the simulation of data link layer framing methods using character stuffing in Java. It includes two Java programs (`stuffed.java` and `stuffing.java`) that perform character stuffing and unstuffing.

## Files

- `stuffed.java`: A program that allows continuous input for character stuffing and unstuffing.
- `stuffing.java`: A simpler version that performs character stuffing and unstuffing on a single input string.
- `README.md`: This file.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your machine.
- Computer Networks (Basic idea of character stuffing on Data Link Layer)

### Running the Programs

1. **Compile the Java programs:**

    ```bash
    javac stuffed.java
    javac stuffing.java
    ```

2. **Run `stuffed.java`:**

    ```bash
    java stuffed
    ```

    - The program will prompt you to enter the data you want to send.
    - It will display the stuffed and unstuffed data.
    - You can choose to continue or exit.

3. **Run `stuffing.java`:**

    ```bash
    java stuffing
    ```

    - Enter the data you want to send.
    - The program will display the stuffed and unstuffed data.

## Example

### stuffed.java
Enter 1 if you want to continue
Enter 0 to exit
```bash
1
```
Enter the data you want to send:
```bash
hello<world>
```

###
Stuffed Data:
```bash
<!hello!<!world!>>
```

###
Unstuffed Data:
```bash
hello<world>
```
Enter 1 if you want to continue
Enter 0 to exit
```bash
0
```
### stuffing.java
```bash
hello<world>
```
```bash
<!hello!<!world!>>
```
```bash
hello<world>
```


## Implementation Details

### Character Stuffing

Character stuffing is a technique used to differentiate data from control information by inserting special characters. In this implementation:

- `SOF` (Start of Frame) character: `<`
- `EOF` (End of Frame) character: `>`
- `esc` (Escape) character: `!`

### stuffed.java

This program continuously prompts the user to enter data for stuffing and unstuffing.

### stuffing.java

This program performs stuffing and unstuffing for a single input string.

## Contact

For any questions or feedback, please contact fahadbaig247@gmail.com.
