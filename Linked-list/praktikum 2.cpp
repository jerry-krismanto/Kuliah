#include <iostream>
#include <cstring>
using namespace std;

struct node
{
    string nim;
    string nama;
    string prodi;
    node *next;
};

node *head;

void init()
{
    head=NULL;
}

int isEmpty()
{
    if(head==NULL) return 1;
    else return 0;
}

void insertdata(string newnim, string newnama, char newprodi[])
{
    node* temp= head;
    node* prev;

    prev=NULL;
    temp=head;
    while ((temp != NULL) && (newnim > temp->nim)){
        prev = temp;
        temp = temp->next;
    }

    node* newitem= new node;
    newitem->nim=newnim;
    newitem->nama=newnama;
    newitem->prodi=newprodi;

    if( prev != NULL){
        newitem->next=temp;
        prev->next=newitem;
    }
    else{
        newitem->next=head;
        head=newitem;
    }

    if(isEmpty()==1){
        head = new node;
        head->nim=newnim;
        head->nama=newnama;
        head->prodi=newprodi;
        head->next=NULL;
    }
    cout<<"Data Telah Dimasukkan\n";
}

void deletedata(string delnim)
{
    if(isEmpty()==1){
        cout<<"List masih kosong\n";
    }
    else{
        node* temp=head;
        node* prev;

        prev=NULL;
        temp=head;
        while((temp != NULL) && (delnim != temp->nim)){
            prev=temp;
            temp=temp->next;
        }
        if(temp==NULL){
            cout<<"Data Tidak Ditemukan\n";
        }
        else{
            if((temp != NULL) && (delnim == temp->nim)){
                if(prev!=NULL){
                    prev->next=temp->next;
                }
                else{
                    head=temp->next;
                }
            }
            delete temp;
            cout<<"Data Telah Dihapus\n";
        }
    }
}

void showdata()
{
    node *temp;
    temp=head;
    if(isEmpty()==0){
        while(temp != NULL){
            cout<<"NIM: "<<temp->nim<<endl;
            cout<<"Nama: "<<temp->nama<<endl;
            cout<<"Prodi: "<<temp->prodi<<endl<<endl;
            temp=temp->next;
        }
    }
    else{
        cout<<"List masih kosong\n";
    }
}

int main()
{
    int kodeprodi,menu;
    string nim,nama;
    char prodi[100];
    char ulang='y';

    while((ulang=='y')||(ulang=='Y')){
        system("cls");
        cout<<"1. Masukkan Data Baru\n";
        cout<<"2. Hapus Data\n";
        cout<<"3. Tampilkan Data\n\n";
        cout<<"Masukkan pilihan anda: ";
        cin>>menu;

        switch(menu)
        {
            case 1:{
            cout<<"Masukkan Nim: ";
            cin>>nim;
            cout<<"Masukkan Nama: ";
            cin>>nama;
            cout<<"Kode prodi: \n"<<"1. S1 Teknik Informatika\n"<<"2. S1 Sistem Informasi\n"<<"3. S1 Pendidikan Teknologi Informasi\n"<<"4. D4 Manajemen Informatika\n";
            cout<<"\nMasukkan Kode Prodi (urutan angkanya): ";
            cin>>kodeprodi;
            switch(kodeprodi)
            {
                case 1:{
                strcpy(prodi,"S1 Teknik Informatika");
                break;
                }
                case 2:{
                strcpy(prodi,"S1 Sistem Informasi");
                break;
                }
                case 3:{
                strcpy(prodi,"S1 Pendidikan Teknologi Informasi");
                break;
                }
                case 4:{
                strcpy(prodi,"D4 Manajemen Informatika");
                break;
                }
            }
            insertdata(nim,nama,prodi);
            break;
            }

            case 2:{
            cout<<"Masukkan NIM yang akan dihapus: ";
            cin>>nim;
            deletedata(nim);
            break;
            }

            case 3:{
            showdata();
            break;
            }

            default:{
            cout<<"Input anda salah\n";
            }
        }
    cout<<"Apa anda ingin kembali ke menu?(y/n): ";
    cin>>ulang;
    }

}
