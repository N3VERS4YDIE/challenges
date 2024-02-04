def descending_order(num):
    if num < 0:
        raise ValueError('num must be a positive integer')

    return int(''.join(sorted(str(num), reverse=True)))


# Alternative solution
def descending_order2(num):
    if num < 0:
        raise ValueError('num must be a positive integer')

    digits = []

    while num > 0:
        digits.append(num % 10)
        num //= 10

    greater_nums_found = 0
    while True:
        for i in range(len(digits) - 1):
            if digits[i + 1] > digits[i]:
                greater_nums_found += 1
                digits[i], digits[i + 1] = digits[i + 1], digits[i]
        if greater_nums_found == 0:
            break
        greater_nums_found = 0

    result = 0
    for i, digit in enumerate(digits):
        result += digit * 10**(len(digits) - i - 1)

    return result
