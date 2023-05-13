#include <iostream>
using  namespace  std;

int main() {
    int i,j,result=0;
    char c;
    while (true){
        cin>>i>>j>>c;
        switch (c) {
            case '+':
                result=i+j;
                cout<<result<<endl;
                break;
            case '-':
                result=i-j;
                cout<<result<<endl;
                break;
            case '*':
                result=i*j;
                cout<<result<<endl;
                break;
            case '/':
                if(j==0)
                    cout<<"Divided by zero!"<<endl;
                else{
                    result=i/j;
                    cout<<result<<endl;
                }

                break;
            default:
                cout<<"Invalid operator!"<<endl;
        }
    }

}
