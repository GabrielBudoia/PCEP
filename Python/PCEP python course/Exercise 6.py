my_list = [1, 2, 4, 4, 1, 4, 2, 6, 2, 9]
unique_list = []

for number in my_list:
    if number not in unique_list:
        unique_list.append(number)
# Remove duplicates from the listor i in my_list:
  
print("The list with unique elements only:", unique_list)
print(my_list)
