class Concentration
  def initialize(n, t)
    @N = n
    @T = t
    @acquired_cards = Array.new(n, 0)
    @P = 0
  end

  def concentration(a, b, c, d)
    if @T[a][b] == @T[c][d]
      @acquired_cards[@P] += 2
    else
      @P = (@P + 1) % @N
    end
  end

  def acquired_cards
    @acquired_cards
  end
end

H, W, N = gets.split.map(&:to_i)
T = Array.new(H) { gets.split }
concentration = Concentration.new(N, T)
L = gets.to_i
L.times do
  a, b, c, d = gets.split.map { |x| x.to_i - 1 }
  concentration.concentration(a, b, c, d)
end
concentration.acquired_cards.each { |card| puts card }
