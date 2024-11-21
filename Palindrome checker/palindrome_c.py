x = 'niitin'
y = len(x) // 2

for i in range(y): 
    if x[i] != x[-(i + 1)]: 
        print("Your content is not a palindrome")
        break  
else:
    print("Your content is a palindrome")
