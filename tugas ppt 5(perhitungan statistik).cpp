#include "iostream"
using namespace std;

int main(){

int n,counter,a,bmax,bmin,btot=0,avg;
cout<<"program ini akan mencari bilangan terbesar, bilangan terkecil, rata-rata, dan total dari n bilangan yang anda masukkan\n";

cout<<"masukkan n(batas akhir): ";
    cin>>n;
    for(counter=1;counter<=n;++counter){
        cout<<"masukkan bilangan ke "<<counter<<": ";
        cin>>a;
        if (counter==1){
            bmax=a; //menyimpan nilai awal bmax
            bmin=a; //menyimpan nilai aal bmin
            }
        else if (a>bmax){
            bmax=a; //memperbarui nilai bmax saat a>bmax
            }
        else{
            bmin=a; //memperbarui nilai bmin saat a<bmin
            }
    btot+=a; //btot=btot+a
    avg=btot/n; //rata-rata
    }
    cout<<"bilangan terbesar adalah: "<<bmax<<endl;
    cout<<"bilangan terkecil adalah: "<<bmin<<endl;
    cout<<"rata-rata adalah: "<<avg<<endl;
    cout<<"total bilangan adalah: "<<btot<<endl;
    }
