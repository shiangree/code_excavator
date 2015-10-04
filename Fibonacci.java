public BigInteger Solution(int K)
{
    if(K==0) return 0;
    if(K==1) return 1;
    BigInteger k1 = BigInteger.valueOf(0);
    BigInteger k2 = BigInteger.valueOf(1);
    BigInteger fib = k1.add(k2);//K==2
    for(int i=2; i<K;++i)
    {
        k1 = k2;
        k2 = fib;
        fib = k1.add(k2);
    }
    return fib;
}