#include <bits/stdc++.h>
using namespace std;

int missingNumber(int arr[], int n);

int main()
{
    int arr[5] = {1, 2, 3, 4, 5};
    int size = end(arr) - begin(arr);
    int ans = missingNumber(arr, size);
    cout << ans;
}

int missingNumber(int arr[], int n)
{
    int c = 1;
    sort(arr, arr + n);
    for (int i = 0; i < n; i++)
    {
        if (arr[i] == c)
            c++;
    }
    return c;
}
