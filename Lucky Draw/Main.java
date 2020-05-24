#include <iostream>
using namespace std;
int main()
{
  int n, i;
  int a= 1;
  cin >> n;
  for(i = 2; i <= n / 2; ++i)
  {
      if(n % i == 0)
      {
          a = 0;
          break;
      }
  }
  if (a && n!=1)
      cout << "Eligible";
  else
      cout << "Not eligible";
  return 0;
}