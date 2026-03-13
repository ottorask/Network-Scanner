Create a professional README.md file for the Java project "Network Scanner".

Requirements:

1. Create a file named README.md in the root of the repository.

2. The README must contain the following sections:

# Network Scanner

## Description
Explain that this is a Java-based command line tool that scans a local network to detect reachable devices. The tool will help identify active hosts on a subnet and measure response time.

## Purpose
Explain that the purpose of this project is:
- to practice Java networking
- to build a real-world command line tool
- to learn clean project structure and professional development workflows

## Features (Planned)
List the planned features:
- Scan a subnet (example: 192.168.1.0/24)
- Detect reachable hosts
- Display response time
- Multi-threaded scanning for performance
- Command line interface
- Clear formatted output

## Example Usage
Provide an example of how the program will eventually be used:

java -jar network-scanner.jar 192.168.1.0/24

Example output:

192.168.1.1   Router
192.168.1.10  Laptop
192.168.1.20  NAS

## Project Structure
Explain the Maven-style directory structure:

src/
└── main/
└── java/
└── com/
└── networkscanner/

## Current Status
State that this project is under active development and currently includes the base project structure and application entry point.

## Technologies
List the technologies used:
- Java
- Git
- GitHub
- IntelliJ IDEA

## License
Add a placeholder line saying that a license will be added later.