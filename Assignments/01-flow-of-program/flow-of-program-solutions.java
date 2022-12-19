// Q1: Input a year and find whether it is a leap year or not.

start
//input year
if year %4||100 =0
output leap year
end

// Q 2 : Take two numbers and print the sum of both.

start
//input num1
//input num2
sum=num1+num2
output sum
end

// Q 3 : Take a number as input and print the multiplication table for it.

start
num1=scanner.nextInt()
for 1 to 10 i++
multiplication_table=inum1
printf=%d %d=%d,num1,i,multiplication_table//should be inside the loop
sample input 2
output 21=2,22=4,23=6,24=8,25=10,26=12,27=14,28=16,29=18,2*10=20
end

// 4 : Take 2 numbers as inputs and find their HCF and LCM.

start
num1=sc	.nextInt()
num2=sc.nextInt()
temp1=num1
temp2=num2
while temp2!0
{temp=temp2
temp2=temp1%temp2
temp1=temp}
hcf=temp1
lcm=num1*num2/hcf
print hcf
print lcm
sample input num1=12 num2=6
output hcf=6 lcm=12
end

// Q 5 : Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

user=scanner.nextInt();
while(scanner.hasNextInt())
num=user.nextint();
for j=0 j<=i i++
sum += num
print sum
end