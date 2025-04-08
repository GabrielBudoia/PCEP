beatles = []

print("Step 1:", beatles)

beatles.append("John Lennon")
beatles.append("Paul McCartney")
beatles.append("George Harrison")

print("Step 2:", beatles)

for i in range(2):
    new_member = input("Enter a new member: ")
    beatles.append(new_member)

print("Step 3:", beatles)

beatles.insert(0, "Ringo Starr")

print("Step 4:", beatles)

del beatles[5]
del beatles[4]

print("Step 5:", beatles)
print('this is the length of the list:', len(beatles))