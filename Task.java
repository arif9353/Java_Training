import java.util.Scanner;
import java.util.Arrays;

//BANKING SYSTEM

interface RBI{
    double minsaving = 4;
    double mincurrent = 2;
    void calculateInterest();
}

abstract class Bankaccount{
    Scanner sc  = new Scanner(System.in);
    int accono;
    double balance;
    String cName, city;
    int deposit;
    void inputData(){
        System.out.println("Enter the Account number:");
        accono = sc.nextInt();
        System.out.println("Enter City name");
        city = sc.next();
        System.out.println("Enter Customer name");
        cName = sc.next();
        System.out.println("Enter the Account balance:");
        balance = sc.nextDouble();
    }
    void display(){
        System.out.println("The account number is:"+accono);
        System.out.println("The account customer name is:"+cName);
        System.out.println("The customer city is:"+city);
        System.out.println("The account balance is:"+this.balance);
    }
    abstract void deposit();
    abstract void withDraw();
}

class Savingsaccount extends Bankaccount implements RBI{

    void withDraw(){
        System.out.println("Enter the amount to be withdrawn");
        int amount = sc.nextInt();
        if(super.balance-amount<1000){
            System.out.println("Sorry cannot be withdrawn due to account balance limit");
        }
        else if(amount>=10000){
            System.out.println("You can only withdraw amount less than 10000 at a time.");
        }
        else{
            super.balance = super.balance - amount;
        }
    }
    void deposit(){
        System.out.println("Enter amount to be deposited");
        deposit = sc.nextInt();
        super.balance = deposit+super.balance;
    }
    public void calculateInterest(){
        System.out.println("Enter the Interest percentage for Savings Account:");
        double interest = sc.nextDouble();
        if(interest>=minsaving){
            double lmn = (super.balance/100)*interest;
            System.out.println("The amount of interest on the current balance is: "+lmn);  
            System.out.println("The total amount is: "+ (super.balance+lmn)); 
        }
        else{
            System.out.println("Set a valid interest rate as per RBI guidelines");
        }
    }
}

class Currentaccount extends Bankaccount implements RBI{
     void withDraw(){
        System.out.println("Enter the amount to be withdrawn");
        int amount = sc.nextInt();
        if(super.balance-amount<1000){
            System.out.println("Sorry cannot be withdrawn due to account balance limit");
        }
        else if(amount>=8000){
            System.out.println("You can only withdraw amount less than 8000 from current account");
        }
        else{
            super.balance = super.balance - amount;
        }
    }
    void deposit(){
        System.out.println("Enter amount to be deposited");
        deposit = sc.nextInt();
        super.balance = deposit+super.balance;
    }   
    public void calculateInterest(){
        System.out.println("Enter the Interest percentage for Current Account:");
        double interest = sc.nextInt();
        if(interest>=mincurrent){
            double lmn = (super.balance/100)*interest;
            System.out.println("The amount of interest on the current balance is: "+lmn);  
            System.out.println("The total amount is: "+ (super.balance+lmn)); 
        }
        else{
            System.out.println("Set a valid interest rate as per RBI guideline");
        }
    }
}

//STUDENT DATABASE (CRUD OPERATIONS)

class Student{
    Scanner sc = new Scanner(System.in);
    int[] rollno = new int[30];
    String[] sname = new String[30];
    long[] mno = new long[30];
    String[] city = new String[30];
    int i=0;
    public void insert(){
        System.out.println("Enter the Student's Roll Number, Student's Name, Student's Address, Student's Mobile");
        for(int y=i;y<=i;y++){
            rollno[y]= sc.nextInt();
            sname[y]=sc.next();
            city[y]=sc.next();
            sc.nextLine();
            mno[y]=sc.nextLong();
        }
        i++;
    }
    public void display(){
        System.out.println("--------STUDENT DETAILS--------");
        System.out.println("-------------------------------");
        System.out.println("rollno\tsname\tmobile\t\taddress");
        for(int p=0;p<i;p++){
            System.out.println(rollno[p]+"\t"+sname[p]+"\t"+mno[p]+"\t"+city[p]);
        }
    }
    public void update(){
        System.out.println("Enter the roll number:");
        int l = sc.nextInt();
        int flag=0;
        int arif =0;
        for(int u =0; u<i;u++){
            if(rollno[u]==l){
                flag = u;
                arif =1;
            }
        }
        if(arif!=1){
            System.out.println("Enter a valid roll number");
        }
        else{
            System.out.println("Enter what data to update:1 name, 2 mobile, 3 address");
            int choice6 = sc.nextInt();
            switch(choice6){
                case 1:
                    System.out.println("Enter the name:");
                    sname[flag]=sc.next();
                    break;
                case 2:
                    System.out.println("Enter the mobile:");
                    mno[flag]=sc.nextLong();
                    break;
                case 3:
                    System.out.println("Enter address");
                    city[flag]=sc.next();
                    break;
                default:
                    System.out.println("Enter a valid choice");
            }
        }
    }
    public void delete(){
        System.out.println("Enter the roll number:");
        int l = sc.nextInt();
        int flag=0;
        for(int u =0; u<i;u++){
            if(rollno[u]==l){
                flag = 1;
                for(int g = u;g<i-1;g++){
                    rollno[g]=rollno[g+1];
                    mno[g]=mno[g+1];
                    sname[g]=sname[g+1];
                    city[g]=city[g+1];   
                }
                i--;
            }
        }
        if(flag!=1){
            System.out.println("Enter a valid roll number");
        }
    }
}

//CALCULATOR

class Calculator{
    Scanner sc = new Scanner(System.in);
    void addition(){
        System.out.println("Enter the count of total numbers whose addition is to be performed:");
        int num = sc.nextInt();
        System.out.println("Enter the numbers one by one:");
        int sum =0;
        for(int d =1; d<=num;d++){
            sum=sum+sc.nextInt();
        }
        System.out.println("The sum of numbers entered is: "+sum);
    }
    void subtraction(){
        System.out.println("Enter the count of total numbers whose subtraction is to be performed:");
        int num = sc.nextInt();
        System.out.println("Enter the numbers one by one:");
        int sum =sc.nextInt();
        for(int d =1; d<num;d++){
            sum=sum-sc.nextInt();
        }
        System.out.println("The difference/Subtraction of numbers entered is: "+sum);
    }
    void multiplication(){
        System.out.println("Enter the count of total numbers whose multiplication is to be performed:");
        int num = sc.nextInt();
        System.out.println("Enter the numbers one by one:");
        int sum =1;
        for(int d =1; d<=num;d++){
            sum=sum*sc.nextInt();
        }
        System.out.println("The multiplication of numbers entered is: "+sum);
    }
    void division(){
        System.out.println("Enter the count of total numbers whose division is to be performed:");
        int num = sc.nextInt();
        System.out.println("Enter the numbers one by one:");
        double sum =sc.nextInt();
        for(int d =1; d<num;d++){
            sum=sum/sc.nextInt();
        }
        System.out.println("The division of numbers entered is: "+sum);
    }
    void mean(){
        System.out.println("Enter the entries putting space in between consecutive entries for finding mean:");
        String xyz = sc.nextLine();
        String[] split = xyz.split(" ");
        int[] arr = new int[split.length];
        double sum = 0;
        int count = 0; 

        for (int i = 0; i < split.length; i++){
            if (!split[i].isEmpty()){
                arr[count] = Integer.parseInt(split[i]);
                sum = sum + arr[count];
                count++;
            }
        }

        if (count > 0){
            System.out.println("The mean is: " + (sum /count));
        } 
        else{
        System.out.println("No valid entries to calculate the mean.");
        }
    }

    void median(){
        System.out.println("Enter the entries putting space in between consecutive entries for finding median:");
        String xyz = sc.nextLine();
        String[] split = xyz.split(" ");
        int[] arr = new int[split.length];
        for(int i=0;i< split.length; i++){
            arr[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(arr);
        int med=0;
        for(int i=0;i<=split.length/2; i++){
            med = arr[i];
        }
        System.out.println("The median is:"+med);
    }
    void mode(){
        System.out.println("Enter the entries putting space in between consecutive entries for finding mode:");
        String xyz = sc.nextLine();
        String[] split = xyz.split(" ");
        int[] arr = new int[split.length];
        for(int i=0;i< split.length; i++){
            arr[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(arr);
        int mod=0;
        int max =0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=i;j<arr.length-1;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                if(count>max){
                    max =count;
                    mod = arr[i];
                }
            }
        }
        System.out.println("The mode is:"+mod);
    }
    void factorial(){
        System.out.println("Enter the number whose factorial is to be found: ");
        int num = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact = fact*i ;
        }
        System.out.println("The factorial is: "+fact);
    }
    void armstrong(){
        int v;
        int flag=0;
        int m=0;
        System.out.println("Enter the number:");
        v = sc.nextInt();
        int w = v;
        int xyz;
        int arif=v;
        while(v>0){
            v=v/10;
            flag++;
        }
        while(w>0){
            int sum =1;
            xyz = w%10;
            for(int x = 1; x<=flag;x++){
                sum=sum*xyz;
            }
            m=m+sum;
            w=w/10;
        }
        if(m==arif){
            System.out.println("The number is Armstrong");
        }
        else{
            System.out.println("The number is not Armstrong");
        }
    }
    void palindrome(){
        System.out.println("Enter the number or string:");
        String pqr = sc.next();
        StringBuilder rev = new StringBuilder(pqr);
        rev.reverse();
        if(pqr.equals(rev.toString())){
            System.out.println("The entered input is a palindrome");
        }
        else{
            System.out.println("The entered input is not a palindrome");
        }
    }
    void sumNum(){
        System.out.println("Enter the value of x:");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<=num;i++){
            sum+=i;
        }
        System.out.println("The sum of all numbers between 0 to "+num+" is: "+sum);
    }
    void remainder(){
        System.out.println("Enter the divisor and dividend:");
        int divis = sc.nextInt();
        int divid = sc.nextInt();
        System.out.println("The remainder is:"+(divid%divis));
    }
    void fibonacci(){
        System.out.println("Enter the number until which fibonacci series is to be found:");
        int num = sc.nextInt();
        int sum=0;
        int[] arr = new int[num];
        if(num==1){
            arr[0]=0;
        }
        if(num>=2){
            arr[0]=0;
            arr[1]=1;
        }
        for(int i=0;i<num-2;i++){
            sum=arr[i]+arr[i+1];
            arr[i+2]=sum;
        }
        System.out.println("Fibonacci series is:");
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+",");
        }
    }
    void percentage(){
        System.out.println("Enter the total number of subjects");
        int num = sc.nextInt();
        System.out.println("Enter the total marks of subjects");
        int max = sc.nextInt();
        System.out.println("Enter the marks of each subjects one by one:");
        double sum =0;
        for(int i=0;i<num;i++){
            sum = sum+sc.nextDouble();
        }
        System.out.println("The percentage obtained is:"+((sum/(max*num))*100));
    }
    void simpleInterest(){
        System.out.println("Enter the rate of interest to find simple interest:");
        double inter= sc.nextDouble();
        double interest= inter/100;
        System.out.println("Enter the Principal amount: ");
        double amount = sc.nextDouble();
        System.out.println("Enter the time in years: ");
        double year = sc.nextDouble();
        
        System.out.println("The total Simple interest amount earned is: "+(interest*amount*year));
    }
    void compoundInterest(){
        System.out.println("Enter the rate of interest to find compound interest:");
        double inter= sc.nextDouble();
        double interest= inter/100;
        System.out.println("Enter the Principal amount: ");
        double amount = sc.nextDouble();
        System.out.println("Enter the number of compounding years:");
        double year = sc.nextDouble();
        double ci = amount*(Math.pow((1+interest),year)-1);
        System.out.println("The Total Compound Interest amount earned is: "+ci);
    }
    void areaOfTriangle(){
        System.out.println("Enter the three sides of a triangle:");
        double x = sc.nextInt();
        double y = sc.nextInt();
        double z = sc.nextInt();
        double s = (x+y+z)/2;
        double p = 0.5;
        double area = Math.pow((s*(s-x)*(s-y)*(s-z)),p);
        System.out.println("The area of triangle is: "+area);
    }
    void perimOfTriangle(){
        System.out.println("Enter the three sides of triangle:");
        double x = sc.nextInt();
        double y = sc.nextInt();
        double z = sc.nextInt();
        System.out.println("The perimeter of triangle is: "+(x+y+z));
    }
    void areaOfRightAngleTriangle(){
        System.out.println("Enter the height and base of triangle:");
        double h = sc.nextInt();
        double b = sc.nextInt();
        System.out.println("The area of Right Angled Triangle is:"+(0.5*h*b));
    }
    void areaOfRectangle(){
        System.out.println("Enter the length and breadth");
        double l = sc.nextInt();
        double b = sc.nextInt();
        System.out.println("The area of rectangle is: "+(l*b));
    }
    void perimOfRectangle(){
        System.out.println("Enter the sides of rectangle:");
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The perimeter of rectangle is:"+(2*(l+b)));
    }
    void volumeOfSphere(){
        System.out.println("The radius of sphere is: ");
        double r = sc.nextDouble();
        System.out.println("The volume of sphere "+((1.3333)*3.14*r*r*r));
    }
    void surfaceAreaOfSphere(){
        System.out.println("The radius of sphere is: ");
        double r = sc.nextDouble();
        System.out.println("The volume of sphere "+(4*3.14*r*r));
    }
    void areaOfSquare(){
        System.out.println("Enter the side of square");
        int side = sc.nextInt();
        System.out.println("The area of square is: "+(side*side));
    }
    void perimOfSquare(){
        System.out.println("Enter the side of square");
        int side = sc.nextInt();
        System.out.println("The perimeter of square is: "+(4*side));
    }

}

//MAIN CLASS

public class Task{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while(choice!=4){
            System.out.println("\n1. For using this program as a Banking System\n2. For using this program as a Student Database (CRUD operations).\n3. For using this program as a calculator\n4. For Exiting the program");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    Savingsaccount a = new Savingsaccount();
                    Currentaccount b = new Currentaccount();
                    int choice1 =0;
                    int choice2=0;
                    int choice3=0;
                    while(choice2!=3){
                        System.out.println("\n1. For Savings Account\n2. For Current Account\n3. For Exit");
                        choice2 = sc.nextInt();
                        switch (choice2){
                            case 1: 
                                while(choice1!=6){ 
                                    System.out.println("\n1. For Inserting the details\n2. For Depositing the amount\n3. For withdrawing the amount\n4. For displaying the amount\n5. For Calculating Interest on the savings account amount\n6. For Exit");
                                    choice1 = sc.nextInt();
                                    switch(choice1){
                                        case 1: a.inputData();
                                            break;
                                        case 2: a.deposit();
                                            break;
                                        case 3: a.withDraw();
                                            break;
                                        case 4: a.display();
                                            break;
                                        case 5: a.calculateInterest();
                                            break;
                                        case 6:
                                            break;
                                        default: System.out.println("Enter valid choice");
                                        }
                                    }
                                break;
                            case 2: 
                                while(choice3!=6){
                                    System.out.println("\n1. For Inserting the details\n2. For Depositing the amount\n3. For withdrawing the amount\n4. For displaying the amount\n5. For Calculating Interest on the current account amount\n6. For Exit");
                                    choice3 = sc.nextInt();
                                    switch(choice3){
                                        case 1: 
                                            b.inputData();
                                            break;
                                        case 2: 
                                            b.deposit();
                                            break;
                                        case 3: 
                                            b.withDraw();
                                            break;
                                        case 4: 
                                            b.display();
                                            break;
                                        case 5: 
                                            b.calculateInterest();
                                            break;
                                        case 6:
                                            break;
                                        default: System.out.println("Enter a valid choice!!");
                                    }
                                }
                                break;
                            default:
                                System.out.println("Enter a valid choice");
                        }
                    } 
                break;
                case 2:
                    int choice4=0;
                    Student c = new Student();
                    while(choice4!=5){
                        System.out.println("\n1. For Inserting a Student's Detail\n2. For Deleting a Student's Detail\n3. For Dislpaying Students Details\n4. For Updating a Student's Detail\n5. For Exiting");
                        choice4 = sc.nextInt();
                        switch(choice4){
                            case 1:
                                c.insert();
                                break;
                            case 2:
                                c.delete();
                                break;
                            case 3:
                                c.display();
                                break;
                            case 4:
                                c.update();
                                break;
                            case 5:
                                break;
                            default : System.out.println("Enter a valid choice!");
                        }
                    } 
                    break;
                case 3:
                    Calculator d = new Calculator();
                    int choice5 = 0;
                    while(choice5!=26){
                        System.out.println("\n1. For ADDITION of numbers\n2. For SUBTRACTION of numbers\n3. For MULTIPLICATION of numbers\n4. For DIVISION of numbers\n5. For finding MEAN of 1-dimensional dataset\n6. For finding MEDIAN of 1-dimensional dataset\n7. For finding MODE of 1-dimensional dataset\n8. For finding FACTORIAL of a number\n9. For checking if a number is ARMSTRONG\n10. For Checking if a number/string is PALINDROME\n11. For Finding SUM OF NUMBERS from 0 till x\n12. For finding remainder\n13. For finding FIBONACCI series\n14. For finding PERCENTAGE obtained for subjects\n15. For calculating SIMPLE INTEREST amount\n16. For calculating COMPOUND INTEREST amount\n17. For calculating area of a TRIANGLE\n18. For calculating perimeter of TRIANGLE\n19. For calculating area of RIGHT ANGLE TRIANGLE\n20. For calculating area of RECTANGLE\n21. For calculating perimeter of RECTANGLE\n22. For calculating volume of SPHERE\n23. For calculating surface area of SPHERE\n24. For calculating area of SQUARE\n25. For calculating perimeter of SQUARE\n26. For exiting.\n");
                        choice5 = sc.nextInt();
                        switch(choice5){
                            case 1: 
                                d.addition();
                                break;
                            case 2: 
                                d.subtraction();
                                break;
                            case 3: 
                                d.multiplication();
                                break;
                            case 4: 
                                d.division();
                                break;
                            case 5: 
                                d.mean();
                                break;
                            case 6: 
                                d.median();
                                break;    
                            case 7: 
                                d.mode();
                                break;
                            case 8: 
                                d.factorial();
                                break;
                            case 9: 
                                d.armstrong();
                                break;  
                            case 10: 
                                d.palindrome();
                                break;
                            case 11: 
                                d.sumNum();
                                break;
                            case 12: 
                                d.remainder();
                                break;
                            case 13: 
                                d.fibonacci();
                                break;
                            case 14: 
                                d.percentage();
                                break;  
                            case 15: 
                                d.simpleInterest();
                                break;
                            case 16: 
                                d.compoundInterest();
                                break;
                            case 17: 
                                d.areaOfTriangle();
                                break;
                            case 18: 
                                d.perimOfTriangle();
                                break;
                            case 19: 
                                d.areaOfRightAngleTriangle();
                                break;
                            case 20: 
                                d.areaOfRectangle();
                                break;
                            case 21: 
                                d.perimOfRectangle();
                                break; 
                            case 22: 
                                d.volumeOfSphere();
                                break;  
                            case 23: 
                                d.surfaceAreaOfSphere();
                                break;
                            case 24: 
                                d.areaOfSquare();
                                break;
                            case 25: 
                                d.perimOfSquare();
                                break;  
                            case 26:
                                break;
                            default:
                                System.out.println("Enter a valid choice!");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                        } 
                    }
                    break;
                case 4: 
                    System.out.println("Thank You for choosing this program!");
                    break;
                default: 
                    System.out.println("Enter a valid choice!");
            }
        }
    }
}