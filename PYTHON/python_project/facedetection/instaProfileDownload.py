import instaloader
bot = instaloader.Instaloader()
print('')
username = input("Enter the User name: ")
print(bot.download_profile(username, profile_pic_only=True))
