# Task 3 - ATM Machine Interface

## Project Description  
Ye project ek simple ATM machine simulation hai jisme user apne bank account se paise nikal sakta hai, deposit kar sakta hai, aur apna balance check kar sakta hai. User authentication ke liye 4-digit PIN verification bhi hai.

## Features  
- 4-digit PIN verification to access ATM  
- Check current account balance  
- Deposit money into the account  
- Withdraw money with balance validation  
- Menu-driven console interface  
- Input validation with appropriate success/error messages  

## Code Explanation  
- `balance` variable stores current balance (initially INR 10,000).  
- User is prompted to enter a 4-digit PIN (`1234` hardcoded).  
- Agar PIN galat ho to program exit kar deta hai.  
- Valid PIN ke baad user ko menu options dikhaye jaate hain:  
  1. Check Balance  
  2. Deposit  
  3. Withdraw  
  4. Exit  
- User ke input ke hisaab se relevant action perform hota hai, aur feedback message print hota hai.  
- Withdrawal amount agar balance se zyada hota hai toh error message aata hai.  
- Exit option program ko band kar deta hai.  

## How to Run  
1. Open terminal/IDE and navigate to the folder containing `ATMInterface.java`.  

2. Compile the program:  
   ```bash
   javac ATMInterface.java

3. Run the program:
   java ATMInterface


4. Follow on-screen instructions to interact with the ATM simulation.
Welcome to the ATM!
Enter your 4-digit PIN: 1234

ATM Menu:
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Choose an option: 1
Your balance is: INR 10000

ATM Menu:
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Choose an option: 2
Enter deposit amount: INR 5000
INR 5000 deposited successfully.

ATM Menu:
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Choose an option: 3
Enter withdrawal amount: INR 3000
INR 3000 withdrawn successfully.

ATM Menu:
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Choose an option: 4
Thank you for using the ATM. Goodbye!


Developed by: Deepak Singh
Submission for: CODESOFT
Date: 25/07/2025

   


