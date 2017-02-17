
/**
	Mathematicaly
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
**/

/**
	Programmatically
*/

class dropEggs
{
    // Find max of two integers
    static int max(int a, int b) {
        //returns a if its greater than b else returns b
        return (a > b) ? a : b;
    }

    /*
        e => number of eggs
        f => number of floors
    */
    static int dropEggs(int e, int f)
    {

        int eggFloor[][] = new int[e+1][f+1];
        int res;
        int i, j, x;

        for (i = 1; i <= e; i++)
        {
            eggFloor[i][1] = 1;
            eggFloor[i][0] = 0;
        }

        for (j = 1; j <= f; j++)
            eggFloor[1][j] = j;
        
        for (i = 2; i <= e; i++)
        {
            for (j = 2; j <= f; j++)
            {
                eggFloor[i][j] = Integer.MAX_VALUE;
                for (x = 1; x <= j; x++)
                {
                    res = 1 + max(eggFloor[i-1][x-1], eggFloor[i][j-x]);
                    if (res < eggFloor[i][j])
                        eggFloor[i][j] = res;
                }
            }
        }
        return eggFloor[e][f];
    }

    public static void main(String args[] )
    {
        int e = 2, f = 100;
        System.out.println("Worst Case given " + e +" eggs and " + f + " floors is " + dropEggs(e, f));
    }
}
