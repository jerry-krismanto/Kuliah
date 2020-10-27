#include "iostream"
#include "conio.h"
#include "cstdlib"
using namespace std;

int main(){

int menu,n,r,i,f1,f2,f3;
char ulang;
do{
system("CLS");
cout<<"|1. Permutasi |"<<endl<<"|2. Kombinasi |"<<endl;
cout<<"===============\n";
cout<<"Masukkan Pilihan Anda: ";cin>>menu;
switch(menu){
case 1:{
    cout<<"Masukkan Masalah (P(n,r)) Syarat: n>=r"<<endl;
    cout<<"Masukkan n: ";cin>>n;
    cout<<"Masukkan r: ";cin>>r;
    f1=1;
    f3=1;
    if(r<=n){
    for(i=1;i<=n;++i){
        f1*=i;}
    for(i=1;i<=(n-r);++i){
        f3*=i;}
cout<<"Permutasi dari P("<<n<<","<<r<<") adalah: "<<f1/f3<<"\n\n";}
else{
    cout<<"r harus lebih kecil atau sama dengan n\n";}
break;
}        
case 2:{
    cout<<"Masukkan Masalah (C(n,r)) Syarat: n>=r"<<endl;
    cout<<"Masukkan n: ";cin>>n;
    cout<<"Masukkan r: ";cin>>r;
    f1=1;
    f2=1;
    f3=1;
    if(r<=n){
    for(i=1;i<=n;++i){
        f1*=i;}
    for(i=1;i<=r;++i){
        f2*=i;}
    for(i=1;i<=(n-r);++i){
        f3*=i;}
cout<<"Kombinasi dari C("<<n<<","<<r<<") adalah: "<<f1/(f2*f3)<<"\n\n";}
else{
    cout<<"r harus lebih kecil atau sama dengan n\n";}
break;
}
default:{
cout<<"Pilihan Anda Tidak Valid\n\n";}
break;}
cout<<"Apakah anda ingin mengulang?: ";cin>>ulang;
}
while(ulang=='y'||ulang=='Y');
}
