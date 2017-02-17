
	Mathematical Logic

        We cant use Binary search Tree as we only have 2 eggs to break
        We can use linear search only as worst case could be 100 drops

        Thus we find the best possible starting point and iterations to
        find the thresh hold with our two eggs

        1st egg will tell us the region we are interested in
        2nd egg will get us the thresh hold


        // Triangular Formulae
        n*(n+1)/2 = 100

        // Into a Quadratic Equation
        (n*n + n - 200)/2 = 0  * 2 to eliminate the 0

        => n*n + n -200 = 0

        a = 1 (n^2)
        b = 1 (n)
        c = -200

        // Formulae
        n = (-B +- square root of (B^2-4AC))2A

        = (-1 +- sr of (1 - 4(1*200)))/2

        = (-1 +- sr of (1-(-800))2

        = ((-1 +- sr of 801))2

        = (-1 +- 28.3))/2

        = (-1 - 28.3)/2 or (-1 + 28.3)/2

        = -29.3/2  or 27.3/2

        = -14.65  or  13.65

        // Take the positive number

        => 13.65

        round it to 14

        Thus we have to start dropping eggs from floor 14
        Decrementing by one (14-1 for 2nd drop) to keep our worst case the same in any scenario
