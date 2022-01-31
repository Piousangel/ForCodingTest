from math import gcd, sqrt
from random import randint

    def monte_carlo( n_trials, binary_sampler ):
        return sum(
       
            ## 원주울

            # num=int(input())
            # cnt=0

            # for i in range(num):
            #     x=random.uniform(0,1)
            #     y=random.uniform(0,1)
            #     if x*x + y*y <= 1:
            #         cnt+=1

            # print((cnt/num)*4)
        ) 
    )  / n_trials

    def dirichlet_test():
        return gcd( randint(1, 1000), randint(1, 1000) ) == 1

    def quess_pi( n_trials ):
        return sqrt( 6 / monte_carlo( n_trials, dirichlet_test ) )

    print( quess_pi( 100_000 ))