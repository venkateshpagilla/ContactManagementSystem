# 📞 Contact Management System (Java Console Application)

This is a simple **Contact Management System** built in Java. It allows users to manage their contacts through a console-based interface. You can add, view, and store contact details including **name, phone number, and email address**.

## ✨ Features

- ✅ **Add Contact**: Enter a name, phone number, and email to save a new contact.  
- 📄 **View Contacts**: Display all saved contacts in a formatted manner.  
- 💾 **Persistent Storage (Optional)**: Can be extended to save contacts to a file and load them on startup.  
- 🛠️ **Simple and Easy-to-Use**: Designed for beginners learning Java.  

## 🖥️ Technologies Used

- **Java (Core Java)**  
- `ArrayList` for storing contacts in memory  
- `Scanner` for user input  
- (Optional) `FileReader` and `FileWriter` for saving/loading contacts  

## 🚀 How It Works

1. The program starts and **loads existing contacts** (if implemented with file storage).  
2. The user is presented with a **menu** to:  
   - Add a new contact  
   - View all contacts  
   - Exit the application  
3. Each contact is stored as a **Contact object** containing a name, phone, and email.  


## 📚 How to Run

1. Compile the program:  
   ```bash
   javac ContactManagementSystem.java

2. Run the program
   ```bash
   java ContactManagementSystem.java
