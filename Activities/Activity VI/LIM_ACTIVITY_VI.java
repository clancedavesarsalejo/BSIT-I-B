#include <iostream>

using namespace std;

int main(){

    string input;

    do{
        cout << "You: ";
        getline (cin,input);
        cout << "Clance: ";

        if(input=="Hello!") {
            cout << "Hi"<< endl;
        }
        else if(input=="How are You?"){
            cout << "I'm fine thank you!" << endl;
        }
        else if(input=="What's your name?"){
            cout << "I'm Lim! Nice to meet you!" << endl;
        }
        else if (input=="exit") {
            cout << "Sorry, I don't understand you." << endl;
        }

        }while(input!="exit");
        return 0;
    }