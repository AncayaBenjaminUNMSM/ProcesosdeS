#include<iostream>
#include<stdlib.h>
#include<conio.h>
using namespace std;
#define max 15
//Funciones
int Menu();

//Funcion principal
int main()
{
 int opc=0;
 opc=Menu();
 do{
 system("cls");
  switch(opc)
  { case 1: cout<<"\t\tRegistro de inventario"<<endl;
			break;            
    case 2: cout<<"\t\tMovimiento de inventario"<<endl;
			break;
    case 3: cout<<"\t\tRegistro de tiempo"<<Promedio(Dato,Promedio,nD)<<endl;
	        break;     
  } 
 }while(opc!=8);
 system("cls");
 cout<<"***********FIN DEL PROCESO*************"<<endl;
getch();
return 0;	
}
// Menu
int Menu()
{int op;
 system("cls");
 cout<<"\t\t\tMENU"<<endl;
 cout<<"\n\t\t[1] Registro de inventario"<<endl;
 cout<<"\n\t\t[2] Movimiento de inventario"<<endl;
 cout<<"\n\t\t[3] Registro de tiempo"<<endl;

 do{
 	cout<<"\n\tIgrese una opcion"<<endl;
 	cin>>op;
 }while(op>4 || op<1);
 return op;
}
