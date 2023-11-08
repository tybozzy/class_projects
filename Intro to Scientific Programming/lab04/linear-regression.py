# find average of all x's
# find average of a y's
# find numerator of slope equation
# find denominator of slope equation
# do the slope equation
# use the slope to find y intercept using y intercept equation

f = open("weather-data.txt", "r")

# Code to plot the graph
f = open("weather-data.txt", "r")
x = list()
y = list()
xlabels = list()


xbase = None
for line in f:
    a,b = line.split()
    if xbase is None:
        xbase = float(a)
    x.append(float(a)-xbase)
    y.append(float(b))
    xlabels.append(int(a))
f.close()


xTotal = 0 # the total of all values in list x
yTotal = 0 # the total of all values in list y
for i in x:
    xTotal += i
    xAverage = xTotal / 71 # the average of all x values
for i in y:
    yTotal += i
    yAverage = yTotal / 71 # the average of all y values

numerator = 0
denominator = 0
for i in range(71):
    numerator += (x[i] - xAverage) * (y[i] - yAverage)
    denominator += (x[i] - xAverage) ** 2

m = numerator / denominator # slope

c = yAverage - (m * xAverage)


print ("The slope is " + str(m))
print ("The y-intercept is " + str(c))


import matplotlib.pyplot as plt
plt.plot(x, y, 'bo')
line = [m * x[i] + c for i in range(len(x))]
plt.plot(x, line, 'r')

plt.xlabel("Year")
plt.ylabel("Temperature")
plt.show()
