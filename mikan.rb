n, m = gets.split.map(&:to_i)
puts m.times.map {[(gets.to_i + n / 2) / n, 1].max * n}
