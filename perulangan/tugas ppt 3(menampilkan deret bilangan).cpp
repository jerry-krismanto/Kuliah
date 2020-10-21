#include "iostream"
using namespace std;

int main(){

int menu,a,n,fib1=1,fib2=0;
char ulangi;
do{
cout<<"1.cacah\n"<<"2.genap\n"<<"3.ganjil\n"<<"4.fibonacci\n";
cout<<"deret mana yang ingin anda buat?: ";
cin>>menu;

switch (int(menu)){

case 1:{
cout<<"masukkan n (batas akhir): ";
cin>>n;
for (a=1;a<=n;++a){  //perintah dibawah akan dieksekusi hingga nilai a=n
    cout<<a<<"\n";}
break;}

case 2:{
cout<<"masukkan n (batas akhir): ";
cin>>n;
for (a=1;a<=n;++a){  //perintah dibawah akan dieksekusi hingga nilai a=n
    if (a%2==0)      //baris ini digunakan untuk memeriksa apakah nilai a genap
    cout<<a<<"\n";}
break;}

case 3:{
cout<<"masukkan n (batas akhir): ";
cin>>n;
for (a=1;a<=n;++a){  //perintah dibawah akan dieksekusi hingga nilai a=n
    if (a%2!=0)      //baris ini digunakan untuk memeriksa apakah nilai a ganjil
    cout<<a<<"\n";}
break;}

case 4:{
cout<<"masukkan n (batas akhir): ";
cin>>n;
for (a=1;a<=n;++a){  //perintah dibawah akan dieksekusi hingga nilai a=n
    a=fib1+fib2;     //digunakan untuk menyimpan nilai a sebagai bilangan fibonacci
    fib2=fib1;       //digunakan untuk memperbarui nilai fib2 agar sama dengan fib 1 untuk digunakan di loop selanjutnya
    fib1=a;          //digunakan untuk memperbarui nilai fib1 agar sama dengan a untuk digunakan di loop selanjutnya
    cout<<a<<"\n";}
break;
}
}
cout<<endl;
cout<<"ingin mengulang?(y/n): ";cin>>ulangi;
}
while (ulangi=='y');
}

