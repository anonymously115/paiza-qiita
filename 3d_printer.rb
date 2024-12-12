X, Y, Z = gets.chomp.split.map(&:to_i)
S = []

Z.times do |z|
  S.push []
  X.times do
    S[z].push gets.chomp
  end
  gets
end

z = Z
while z > 0
  z -= 1
  t = ""
  Y.times do |y|
    t += X.times.any? { |x| S[z][x][y] == '#' } ? '#' : '.'
  end
  puts t
end
