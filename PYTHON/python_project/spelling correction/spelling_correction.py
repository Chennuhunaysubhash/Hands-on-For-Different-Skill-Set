from textblob import TextBlob

a = input('enter the your incorrect one:  ')

print('original text: '+str(a))

b = TextBlob(a)
print(' ')
print("corrected text: "+str(b.correct()))

