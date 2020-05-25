puts "Test task for RoR courses"
puts "Enter initial sequence and number of elements separated by space:"
input = gets
abort if input.nil? or input.empty?
input.chomp!
abort "input #{input} should contains initial sequence and number of elements separated by space" if input !~ /[0-9]+[ ][0-9]+/
initial_sequence, number_of_str = input.split(" ")
i = 0
current_sequence = initial_sequence
next_sequence = ""
puts initial_sequence
while i < number_of_str.to_i - 1 do
  pos = 0
  length = current_sequence.length
  while pos < length
    counter = 1
    while (pos + 1 != length) & (current_sequence[pos] == current_sequence[pos + 1])
      counter += 1
      pos += 1
    end
    next_sequence = next_sequence + counter.to_s + current_sequence[pos]
    pos += 1
  end
  puts next_sequence
  current_sequence = next_sequence
  next_sequence = ""
  i += 1
end
exit 0