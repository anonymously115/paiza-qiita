def leftover(m, p, q)
  return m * (100 - p) * (100 - q) / 10000
end

m, p, q = gets.split.map(&:to_f) 
p leftover(m, p, q)
