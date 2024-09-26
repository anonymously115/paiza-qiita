$b = gets.to_i

def lottery(a)
    if a === $b
        return "first"
    if abs(a - $b) === 1
        return "adjacent"
    if (a - $b) % 10000
        return "second"
    if (a - $b) % 1000
        return "third"
    return "blank"
end

gets.to_i.times do
    puts lottery(gets.to_i)
end