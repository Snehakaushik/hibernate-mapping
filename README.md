# Hibernate Many-to-Many Mapping Demo

This Java project demonstrates a many-to-many relationship between `Student` and `Laptop` entities using Hibernate annotations. It also uses `@Embedded` for storing a student's full name and shows bidirectional mapping.

## Tech Stack
- Java 21  
- Hibernate ORM  
- MySQL  
- Maven  

## Features
- `@ManyToMany` with `@JoinTable`
- Embedded name object in `Student`
- Bidirectional mapping
- Hibernate config via XML

## Run Steps
1. Update DB credentials in `hibernate.cfg.xml`
2. Build with `mvn clean install`
3. Run `Main.java` to persist data

---

Made with ❤️ by Sneha
