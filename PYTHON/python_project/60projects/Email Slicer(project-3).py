email = input('Enter the user Email: ').strip()
user_name = email[:email.index('@')]
domain_name = email[email.index('@')+1:]
format_ = (f"Your user name is '{user_name}' and your domain is '{domain_name}'")
print(format_)

