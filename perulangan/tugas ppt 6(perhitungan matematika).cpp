#include "iostream"
#include "math.h"
using namespace std;

int main(){
int a,n,total,counter,menu; //variabel total saya gunakan sebagai hasil akhir semua pilihan operasi
char ulangi='y';
while (ulangi=='y'){
cout<<"1.perpangkatan\n"<<"2.perkalian\n"<<"3.fpb\n"<<"4.kpk\n";
cout<<"masukkan pilihan: ";
cin>>menu;
switch(int(menu)){
case 1:{
cout<<"program ini akan menghitung pangkat bilangan \n";
cout<<"masukkan bilangan: ";
cin>>a;
cout<<"masukkan pangkat: ";
cin>>n;
total=a; //menyimpan nilai total
for(counter=1;counter<n;++counter){
    total*=a; //total akan dikalikan dengan nilai a(yaitu total itu sendiri sebanyak n kali
}
cout<<"hasilnya: "<<total;
break;}

case 2:{
cout<<"masukkan jumlah bilangan yang ingin dikalikan: "; //ini mema
cin>>n;
for(counter=1;counter<=n;++counter){
  cout<<"masukkan bilangan ke "<<counter<<" :";
  cin>>a;
  if (counter==1){ //menyimpan nilai pertama total
    total=a;}
    else if (counter>1){ //saat counter sudah melewati 1 maka total akan dikalikan dengan a hingga counter=n
        total*=a;}
        }
  cout<<"hasil perkaliannya adalah: "<<total;
  break;}

case 3:{
cout<<"masukkan bilangan 1: ";
cin>>a;
cout<<"masukkan bilangan 2: ";
cin>>n;
total=abs(a-n); //menggunakan abs agar nilai total tidak negatif
while(a%total!=0){ //selama a tidak habis dibagi total, maka perintah akan terus berlanjut
    total=a%total; //saat total sudah 0 maka sisa terakhir sebelum total menjadi 0 adalah nilai total
}
cout<<"fpb dari "<<a<<" dan "<<n<<" adalah: "<<total;
break;}

case 4:{
cout<<"masukkan bilangan 1: ";
cin>>a;
cout<<"masukkan bilangan 2: ";
cin>>n;
total=a; //menyimpan nilai total awal
while(total%n!=0){ //selama total tidak habis dibagi n maka perintah akan terus dieksekusi
    total+=a; //total akan terus ditambah dengan a sampai total habis dibagi n
}
cout<<"kpk dari "<<a<<" dan "<<n<<" adalah: "<<total;
break;}
}
cout<<endl<<"ingin menghitung lagi?(y/t): ";cin>>ulangi; //merupakan perulangan untuk kembali ke menu awal
}
}
