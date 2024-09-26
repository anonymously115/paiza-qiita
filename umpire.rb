strike = 3
ball = 4
gets.to_i.times do
	s = gets.chomp
	if s === "strike"
		strike -= 1
		puts strike > 0 ? "strike!" : "out!"
	elsif s === "ball"
		ball -= 1
		puts ball > 0 ? "ball!" : "fourball!"
	end
end
