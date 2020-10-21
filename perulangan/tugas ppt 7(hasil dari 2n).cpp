#include "iostream"
using namespace std;

int main(){

int n,tot,counter;
char ulangi='y';
while (ulangi=='y'){
    cout<<"program ini akan menghitung hasil dari 2^n"<<endl<<endl;
    cout<<"masukkan nilai n: ";cin>>n;
    tot=2; //menetapkan nilai awal tot
    for (counter=1;counter<n;counter++) //tot akan mulai pangkatkan saat counter=1,perpangkatan harus berhenti sebelum counter=1
        tot*=2;
    cout<<"hasil dari 2^"<<n<<" adalah: "<<tot<<endl;
    cout<<"ingin mengulang?(y/t):";cin>>ulangi; //merupakan perulangan untuk menghitung ulang
}
}
