#include "iostream"
using namespace std;

int main(){

int a,n,x;
cout<<"masukkan nilai n: ";
cin>>n;

for (a=1;a<=n;++a){   //dua baris for ini adalah nested loop
for (x=1;x<=a;++x){   //for ini dieksekusi sebanyak nilai a hingga nilai a=n
cout<<a;}
cout<<endl;}
}
