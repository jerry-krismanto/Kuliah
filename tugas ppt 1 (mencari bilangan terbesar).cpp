#include "iostream"
using namespace std;

int main(){

int counter,bil,bmax=0;
 cout<<"program ini akan mencari bilangan terbesar dari 6 bilangan yang anda masukkan"<<endl;
for (counter=0;counter<6;++counter) //baris ini membuat perintah akan terus dilakukan sampai counter menjadi 5
{
    cout<<"masukkan bilangan: ";
    cin>>bil;

if (bil>bmax){
    bmax=bil;} //ini digunakan untuk memperbarui nilai bmax jika bilangan yang dimasukkan lebih besar dari bilangan sebelumnya
}
cout<<"bilangan terbesar adalah: "<<bmax;
}
