$n, m = gets.split.map(&:to_i)

def mikan(w)
  return [(w + $n / 2) / $n, 1].max * $n
end

m.times do
  p mikan(gets.to_i)
end