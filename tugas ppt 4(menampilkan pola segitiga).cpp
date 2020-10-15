#include "iostream"
using namespace std;

int main(){

int menu,n,i,j,k,a;
char ulangi='y';
while(ulangi='y'){
cout<<"program ini akan menampilkan pola segitiga pascal,ganjil, dan genap dengan tinggi n"<<endl;
cout<<"1.pascal\n"<<"2.ganjil\n"<<"3.genap\n"<<"pilih pola: ";cin>>menu;

switch(int(menu)){
case 1: {
cout<<"masukkan n: ";cin>>n;
for (i=0;i<n;++i){
    for (k=n;k>=i;--k){ //perulangang ini membuat spasi pada pola segitiga,semakin kebawah spasi yang dicetak makin sedikit
        cout<<" ";
        }
    for (j=0;j<=i;++j){ //perulangan ini akan dieksekusi hingga nilai j=i
        if(j==0){ //saat nilai j=0 maka a=1 (nilai a disimpan)
        a=1;
    }
        else{
            a=a*(i+1-j)/j; //jika tidak maka a=a*(i+1-j)/j
        }
        cout<<" ";
        cout<<a; //a disini merupakan deret segitiga pascal
        cout<<"";
        }
        cout<<endl;
}
break;
}
case 2:{
cout<<"masukkan n: ";cin>>n;
for(i=1;i<=n;++i){
 for(k=n;k>=i;--k){ //perulangang ini membuat spasi pada pola segitiga,semakin kebawah spasi yang dicetak makin sedikit
        cout<<" ";
        }
        for (j=1;j<=i+(i-1);++j){ //perulangan ini menentukan banyak ^ yang akan dicetak tiap baris tergantung jumlah i
         cout<<"^";
        }
        cout<<endl;
}
break;
}
case 3:{
cout<<"masukkan n: ";cin>>n;
for(i=1;i<=n;++i){
 for(k=n;k>=i;--k){ //perulangang ini membuat spasi pada pola segitiga,semakin kebawah spasi yang dicetak makin sedikit
        cout<<" ";
        }
        for (j=1;j<=i+i;++j){  //perulangan ini menentukan banyak ^ yang akan dicetak tiap baris tergantung jumlah i
         cout<<"^";
        }
        cout<<endl;
}
break;
}
}
cout<<"apakah anda ingin mengulang?(y/n): ";cin>>ulangi; //digunakan untuk mengulang program jika user input y
}
}
