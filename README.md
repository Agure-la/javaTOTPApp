Time-Based One-Time Password (TOTP) Authentication System

The Time-Based One-Time Password (TOTP) Authentication System is a secure and reliable two-factor authentication mechanism that provides an extra layer of security for user access to the system. TOTP is based on the Time-Based One-Time Password algorithm, which generates short-lived, time-dependent tokens that are valid only for a short period.

Features
Two-Factor Authentication (2FA): TOTP adds a second layer of security, requiring users to provide a time-based one-time password in addition to their regular credentials.
User-Friendly: The system provides a user-friendly graphical interface for easy token generation and verification.
Secure and Encrypted: TOTP uses cryptographic algorithms to generate secure and encrypted one-time passwords, reducing the risk of unauthorized access.
Time Synchronization: The system automatically synchronizes time with the server to ensure accurate token validation.
Customizable Time Window: Administrators can configure the time window for token validation to strike a balance between security and usability.
Email-Based OTP Delivery: One-time passwords are sent to users' registered email addresses using the SMTP protocol, ensuring seamless and secure delivery.
Random OTP Generation: OTPs are generated using the java.util.Random mechanism, providing unpredictability and improved security.
Technologies Used
Java: The core implementation is built using Java, ensuring platform independence and reliability.
Time-Based OTP Algorithm: TOTP is implemented using the RFC 6238 standard, which ensures interoperability with various authenticator apps.
Spring Boot: The system utilizes the Spring Boot framework for easy configuration, quick setup, and integration with Spring's security features.
Spring Security: Security features in Spring Boot provide a robust foundation for user authentication and authorization.
MySQL Database: User data and authentication records are securely stored in a MySQL database.


Getting Started
Follow these steps to get the project up and running on your local machine:

Clone the repository to your local machine.
Set up the MySQL database and update the configuration files with the appropriate credentials.
Configure the SMTP settings for email delivery.
Build the project using Maven or your preferred build tool.
Use the generated one-time passwords for two-factor authentication during login.
