# LAB4

This project implements a program that processes text, sorts words within sentences based on the occurrences of a specific letter, and outputs the sorted text. The text is broken down into sentences and words, where each word is made up of individual letters. The program allows the user to input a block of text and a target letter for sorting the words in ascending order by how many times the target letter appears.

## Content

- [Requirements](#Requirements)
- [Installation](#Installation)
- [Startup](#Startup)
- [Using](#Using)
- [Examples](#Examples)

## Requirements

- JDK 17

## Installation

1. Clone the repository:
   
    ```bash
    git clone https://github.com/IK-24KudinaDiana/LAB4.git
    ```

2. Go to the project directory:
   
    ```bash
    cd LAB4
    ```

## Startup

- Compile and run the program from the command line:

    ```bash
    javac Main.java
    java Main
    ```

## Using

The program processes input text, splits it into sentences and words, and sorts each sentence's words by the number of occurrences of a given letter.

### Input
- The program accepts a block of text and a target letter from the user.

### Output
- The program outputs the sorted version of the original text, where the words are arranged in each sentence based on the number of times the specified letter appears in them.

## Examples

Example of program execution:

```bash
Enter text: Текст написаний і впорядкований
Enter the letter for sorting: и
Sorted text: Текст і впорядкований написаний
