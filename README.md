# Tyre-diameter-change-calculator
An android app to calculate change in diameter of tyre size when changing tyres in cars, safe values are considered to be +-2% (Made for Tyre distributors of chennai SH Tyrestore)

## Formula
1. Width x Aspect Ratio = Section Height
2. Section Height x 2 = Combined Section Height
3. Combined Section Height + Wheel Diameter = Tyre Diameter


### Example: 185/60HR14
185mm x .60=111mm
111mm x 2=222mm
222mm + 355.6mm(14")= 577.6mm or 22.74"

The first number is the width of the tyre in millimeters, measured from sidewall to sidewall. To convert to inches, divide by 25.4 In the example above, the width is 185mm or 7.28".

The second number is the aspect ratio. This is a ratio of sidewall height to width. In the example above, the tyre is 7.28" wide, multiply that by the aspect ratio to find the height of one sidewall. 

In this case, 185x0.60=111mm or 7.28"x0.60=4.36".

The last number is the diameter of the wheel in inches.
To figure the outside diameter of a tyre, take the sidewall height and multiply by 2,(remember that the diameter is made up of 2 sidewalls, the one above the wheel, and the one below the wheel) and add the diameter of the wheel to get your answer.

# Calculate change in Old diameter and new diamater by (new - old)*100/old

See if change is greater than 2%

![Tyre Image](https://github.com/munzzz5/Tyre-diameter-change-calculator/blob/master/tyre.png)
