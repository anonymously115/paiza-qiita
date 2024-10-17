def fizzbuzz(i):
	if i % 3 == 0 and i % 5 == 0
		return "Fizz Buzz"
	elsif i % 3 == 0
		return "Fizz"
	elsif i % 5 == 0
		return "Buzz"
	else
		return i
	end
end

for i in 1..gets.to_i
	puts fizzbuzz(i)
end
