public class Solution {

public int[] kSmallest(int[] array, int k) {

    int[] klist=new int[k];

    for(int i=0;i<k;++i)

    {

    klist[i] = select(array, 0, array.length-1, i);

    }

    

    return klist;

    

    

  }



int select(int[] array, int l, int r, int k)

{



while(l<r)

{

    int p = partition(array, l, r, (l+r)/2);

    if(p == k)

        return array[p];

    else

        if(p < k)

        {

            l = p+1;

        }

        else

        {

            r = p-1;

        }

   }

    return array[l];

}

int partition(int[] array, int l, int r, int pivot)

  {

    int pValue = array[pivot];

    swap(array, pivot, r);

    int i = l;

    int j = r-1;

    while(i<=j)

    {

      if(array[i]<pValue)

      {

        ++i;

      }

      else

      {

        swap(array, i, j--);

      }

    }

    swap(array, i, r);

    return i;

  }

void swap(int[] array, int a, int b)

  {

if(a==b) return;

    array[a]^=array[b];

    array[b]^=array[a];

    array[a]^=array[b];

  }

}