# ITCS473 Project Assignment 1
# Unit Test for Open-Source Software Projects

# By Group 1

## 



# test case

## 1. calcCheckingDeposit
วัตถุประสงค์ของ test case นี้คือการตรวจสอบว่าใครจะเป็นผู้เล่นก่อนระหว่าง HUMAN และ Computer ว่าได้เริ่มต้นถูกหรือไม่


- Characteristics:


    1. Interface-based

        C1 = Balance

        C2 = Deposit amount

    2. Functionality-based

        C1 = Available amount

-  Partition characteristics:

   -    Interface-based


        | Characteristics        | b1              | b2             
        | :--                    | :--             | :--            
        | C1 = Balance           | Great than 100 | Great than 1000
        | C2 = Deposit amount    | Great than 100 | Great than 1000


   -	Functionality-based

        | Characteristics        | b1              | b2                 |
        | :--                    | :--             | :--                |
        | C1 = Available amount  | Great than or Equal 100 | Great than 1000 |

-	Identify (possible) values: 
    -	Interface-based

        | Characteristics          | b1              | b2        |
        | :--                      | :--             | :--       |
        | C1 = Balance             | 2000            | 3000      |
        | C2 = Deposit amount      | 200             | 1200      |


    - Functionality-based
        | Characteristics        | b1              | b2             |
        | :--                    | :--             | :--            |
        | C1 = Available amount  | 2200            | 3000           |



-	Combine partitions and test values:
    -	ACoC

        (C1b1, C2b1) -> (2000, 200), expected value = 2200

        (C1b1, C2b2) -> (2000, 1200), expected value = 3200

        (C1b2, C2b1) -> (3000, 200), expected value = 3200

        (C1b2, C2b2) -> (3000, 1200), expected value = 4200

## 2. calcSavingDeposit
วัตถุประสงค์ของ test case นี้คือการตรวจสอบว่าใครจะเป็นผู้เล่นก่อนระหว่าง HUMAN และ Computer ว่าได้เริ่มต้นถูกหรือไม่


- Characteristics:


    1. Interface-based

        C1 = Saving Balance

        C2 = Deposit amount

    2. Functionality-based

        C1 = Saving amount

-  Partition characteristics:

   -    Interface-based


        | Characteristics        | b1              | b2              |
        | :--                    | :--             | :--             |
        | C1 = Saving Balance    | Great than 100  | Great than 1000 |
        | C2 = Deposit amount    | Great than 100  | Great than 1000 |


   -	Functionality-based

        | Characteristics        | b1              | b2                 |
        | :--                    | :--             | :--                |
        | C1 = Saving amount  | Great than or Equal 100 | Great than 1000 |

-	Identify (possible) values: 
    -	Interface-based

        | Characteristics          | b1              | b2        |
        | :--                      | :--             | :--       |
        | C1 = Balance             | 4000            | 2300      |
        | C2 = Deposit amount      | 3000            | 3000      |


    - Functionality-based
        | Characteristics        | b1              | b2             |
        | :--                    | :--             | :--            |
        | C1 = Available amount  | 7000            | 5500           |



-	Combine partitions and test values:
    -	ECC

        (C1b1, C2b1) -> (4000, 3000), expected value = 7000

        (C2b1, C2b2) -> (2300, 3000), expected value = 5300

## 3. calcCheckingWithdrawTest 
วัตถุประสงค์เพื่อทดสอบความถูกต้องของเมทอด start() และ findStartPlayer() ในคลาส Game โดยตรวจสอบว่าเมื่อเริ่มเกม (game.start())เกมได้ถูกเปิดหรือไม่โดยเช็คจากการที่หน้าต่างของเกมถูกเปิดหรือไม่ 
- Characteristics:
1. Interface-based

C1 = Balance

C2 = Withdrawal amount

2. Functionality-based

C1 = Remaining Balance

-  Partition characteristics:

   -    Interface-based


        | Characteristics        | b1              | b2             
        | :--                    | :--             | :--            
        | C1 = Balance           | Great than 100 | Great than 1000
        | C2 = Withdrawal amount | Great than 100 | Great than 1000


   -	Functionality-based

        | Characteristics        | b1              | b2                 |
        | :--                    | :--             | :--                |
        | C1 = Remaining Balance | Great than or Equal 0 | Great than 0 |

-	Identify (possible) values: 
    -	Interface-based

        | Characteristics          | b1              | b2        |
        | :--                      | :--             | :--       |
        | C1 = Balance             | 2000            | 5000      |
        | C2 = Withdrawal amount   | 500             | 1500      |


    - Functionality-based
        | Characteristics        | b1              | b2             |
        | :--                    | :--             | :--            |
        | C1 = Remaining Balance | 1500            | 3500           |



-	Combine partitions and test values:
    -	ACoC

        (C1b1, C2b1) -> (2000, 500), expected value = 1500

        (C1b1, C2b2) -> (2000, 1500), expected value = 500

        (C1b2, C2b1) -> (5000, 500), expected value = 4500

        (C1b2, C2b2) -> (5000, 1500), expected value = 3500

## 4. calcSavingWithdraw
วัตถุประสงค์ของ test case นี้คือการตรวจสอบว่าใครจะเป็นผู้เล่นก่อนระหว่าง HUMAN และ Computer ว่าได้เริ่มต้นถูกหรือไม่


- Characteristics:


    1. Interface-based

        C1 = Saving Balance

        C2 = Withdrawal amount

    2. Functionality-based

        C1 = Saving amount

-  Partition characteristics:

   -    Interface-based


        | Characteristics        | b1              | b2              |
        | :--                    | :--             | :--             |
        | C1 = Saving Balance    | Great than 100  | Great than 1000 |
        | C2 = Withdrawal amount | Great than 100  | Great than 1000 |


   -	Functionality-based

        | Characteristics        | b1              | b2                 |
        | :--                    | :--             | :--                |
        | C1 = Saving amount  | Great than or Equal 0 | Great than 1000 |

-	Identify (possible) values: 
    -	Interface-based

        | Characteristics          | b1              | b2        |
        | :--                      | :--             | :--       |
        | C1 = Balance             | 4000            | 10000     |
        | C2 = Deposit amount      | 4000            | 3000      |


    - Functionality-based
        | Characteristics        | b1              | b2             |
        | :--                    | :--             | :--            |
        | C1 = Available amount  | 0               | 7000           |



-	Combine partitions and test values:
    -	ECC

        (C1b1, C2b1) -> (4000, 4000), expected value = 0

        (C2b1, C2b2) -> (10000, 3000), expected value = 7000

## 5. calcCheckTransfer
วัตถุประสงค์ของ test case นี้คือ...


- Characteristics:


    1. Interface-based

        C1 = Amount transfer

        C2 = Saving Balance

        C3 = Checking Balance 

    2. Functionality-based

        C1 = Amount in saving balance
        C2 = Amount in Checking balance

-  Partition characteristics:

   -    Interface-based


        | Characteristics        | b1              | b2              |
        | :--                    | :--             | :--             |
        | C1 = Amount transfer   | Great than 100  | Great than 1000 |
        | C2 = Saving Balance    | Great than 100  | Great than 1000 |
        | C3 = Checking Balance  | Great than 100  | Great than 1000 |
        


   -	Functionality-based

        | Characteristics        | b1              | b2                 |
        | :--                    | :--             | :--                |
        | C1 = Amount in saving balance  | Great than 100 | Great than 1000 |
        |C2 = Amount in Checking balance | Great than 100  | Great than 1000|

-	Identify (possible) values: 
    -	Interface-based

        | Characteristics          | b1              | b2        |
        | :--                      | :--             | :--       |
        | C1 = Amount transfer     | 400             | 1000      |
        | C2 = Saving Balance      | 800             | 2000      |
        | C3 = Checking Balance    | 800             | 2000      |


    - Functionality-based
        | Characteristics                | b1              | b2             |
        | :--                            | :--             | :--            |
        | C1 = Amount in saving balance  | 1200            | 3000           |
        |C2 = Amount in Checking balance | 400             | 1000           |



-	Combine partitions and test values:
    -	PWC

        (400,800) 

        (400,2000) 

        (400,800) 

        (400,2000) 

        (1000,800)

        (1000,2000)

        (1000,800)

        (1000,2000)

        (800,800)

        (800,2000)

        (2000,800)

        (2000,2000)

        testcase = (Amount transfer,SavingBalance,CheckingBalance)

        testcase 1 = (400,800,800)        testcase 3 =(1000,800,2000)

        testcase 2 =(400,2000,800)       testcase 4 =(1000,2000,2000)

## 6. calcSavingTransfer
วัตถุประสงค์ของ test case นี้คือ...


- Characteristics:


    1. Interface-based

        C1 = Amount transfer

        C2 = Saving Balance

        C3 = Checking Balance 

    2. Functionality-based

        C1 = Amount in Checking balance

        C2 = Amount in Saving balance

-  Partition characteristics:

   -    Interface-based


        | Characteristics        | b1              | b2              |
        | :--                    | :--             | :--             |
        | C1 = Amount transfer   | Great than 100  | Great than 1000 |
        | C2 = Saving Balance   | Great than 100  | Great than 1000 |
        | C3 = Checking Balance  |  Great than 100 |  Great than 1000 |


   -	Functionality-based

        | Characteristics        | b1              | b2                 |
        | :--                    | :--             | :--                |
        | C1 = Amount in saving balance  | Great than 100 | Great than 1000 |
        |C2 = Amount in Checking balance | Great than 100  | Great than 1000|

-	Identify (possible) values: 
    -	Interface-based

        | Characteristics          | b1              | b2        |
        | :--                      | :--             | :--       |
        | C1 = Amount transfer     | 500             | 8000      |
        | C2 = Saving Balance      | 800             | 9000      |
        | C3 = Checking Balance    |  200            |  7000     |


    - Functionality-based
        | Characteristics                | b1              | b2             |
        | :--                            | :--             | :--            |
        |C1 = Amount in saving balance   | 300            | 1000            |
        |C2 = Amount in Checking balance | 700            | 15000           |w



-	Combine partitions and test values:
    -	PWC

        (500,800)

        (500,200)

        (500,9000)

        (500,7000)

        (500,800)

        (8000,800)

        (8000,9000)

        (8000,200)

        (8000,7000)

        (800,200)

        (800,7000)

        (9000,200)

        (9000,7000)

        testcase = (Amount transfer,SavingBalance,CheckingBalance)

        testcase 1 = (500,800,200)        testcase 3 =(1000,800,800)

        testcase 2 =(500,9000,200)       testcase 4 =(8000,9000,7000)
        
