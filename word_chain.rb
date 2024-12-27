require 'set'

class WordChain
  def initialize(n, d)
    @n = n
    @d = d
    @alive = Array.new(n, true)
    @bef = ""
    @p = 0
  end

  def word_chain(s)
    if @d.include?(s) && (@bef.empty? || @bef[-1] == s[0]) && s[-1] != 'z'
      @d.delete(s)
      @bef = s
    else
      @alive[@p] = false
      @bef = ""
    end
    begin
      @p = (@p + 1) % @n
    end while !@alive[@p]
  end

  def alive_count
    @alive.count(true)
  end

  def is_alive(i)
    @alive[i]
  end
end

n, k, m = gets.split.map(&:to_i)
d = Set.new
k.times do
  d.add(gets.chomp)
end

word_chain = WordChain.new(n, d)
m.times do
  word_chain.word_chain(gets.chomp)
end

puts word_chain.alive_count
(0...n).each do |i|
  puts i + 1 if word_chain.is_alive(i)
end
