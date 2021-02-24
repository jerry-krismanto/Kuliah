#include <iostream>
using namespace std;

struct node
{
    int nim;
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

void insertdata(int newnim, string newnama, string newprodi)
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
    cout<<"data added\n";
}

void deletedata(int delnim)
{
    if(isEmpty()==1){
        cout<<"list is empty\n";
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
        if((temp != NULL) && (delnim == temp->nim)){
                if(prev!=NULL){
                    prev->next=temp->next;
                }
                else{
                    head=temp->next;
                }
        }
        delete temp;
    }
    cout<<"data deleted\n";
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
        cout<<"list kosong\n";
    }
}

int main()
{
    int menu, nim;
    string nama,prodi;
    char ulang='y';

    while((ulang=='y')||(ulang=='Y')){
        system("cls");
        cout<<"1. add data\n";
        cout<<"2. delete data\n";
        cout<<"3. show data(s)\n\n";
        cout<<"masukkan pilihan anda: ";
        cin>>menu;

        switch(menu)
        {
            case 1:{
            cout<<"masukkan nim: ";
            cin>>nim;
            cout<<"masukkan nama: ";
            cin>>nama;
            cout<<"masukkan prodi: ";
            cin>>prodi;
            insertdata(nim,nama,prodi);
            break;
            }

            case 2:{
            cout<<"masukkan nim yang akan dihapus: ";
            cin>>nim;
            deletedata(nim);
            break;
            }

            case 3:{
            showdata();
            break;
            }

            default:{
            cout<<"input anda salah\n";
            }
        }
    cout<<"apa anda ingin kembali ke menu?(y/n): ";
    cin>>ulang;
    }

}
