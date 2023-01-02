// keywords -> class, case, cout, struct, static, switch, print, pass, break
// operators -> 

#include<iostream>
#include<string>
using namespace std;

int fail(int s){
    if (s>=0 && s<=51)
        return 52;
    else if(s>=52 && s<=54) {
        return 55;
    }
    else if(s>=55 && s<=57) {
        return 58;
    }
    else if(s>=58 && s<=65) {
        return 66;
    }
}

void LexAnalyser(string s){
    int n = s.size();
    int state = 0;
    int i = 0;

    while(1){
        switch(state){
            case 0: 
                if(s[i]=='s'){
                    state=1;
                    i++;
                }
                else if(s[i]=='c'){
                    state=17;
                    i++;
                }
                else if(s[i]=='p'){
                    state=36;
                    i++;    
                }
                else if(s[i]=='b'){
                    state=46;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;
            
            case 1:
                if (s[i]=='t')
                {
                    state=2;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;

            case 2:
                if(s[i]=='a'){
                    state=3;
                    i++;
                }
                else if(s[i]=='r'){
                    state=8;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;

            case 3:
                if (s[i]=='t')
                {
                    state=4;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;
            
            case 4:
                if (s[i]=='i')
                {
                    state=5;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;
            
            case 5:
                if (s[i]=='c')
                {
                    state=6;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;

            case 6:
                if (isspace(s[i]) || s[i]=='\0')
                {
                    state=7;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;
            
            case 7:
                cout<<s<<' is a keyword.\n';
                break;
            
            case 8:
                if (s[i]=='u')
                {
                    state=9;
                    i++;
                }
                else if (s[i]=='i'){
                    state=13;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;
            
            case 9:
                if (s[i]=='c')
                {
                    state=10;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;
            
            case 10:
                if (s[i]=='t')
                {
                    state=11;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;

            case 11:
                if (isspace(s[i]) || s[i]=='\0')
                {
                    state-12;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;

            case 12:
                cout<<s<<" is a keyword.\n";
                break;
            
            case 13:
                if (s[i]=='n')
                {
                    state=14;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;
            
            case 14:
                if (s[i]=='g')
                {
                    state=15;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;
            
            case 15:
                if (isspace(s[i]) || s[i]=='\0')
                {
                    state=16;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;
            
            case 16:
                cout<<s<<" is a keyword.\n";
                break;
            
            case 17:
                if (s[i]=='l')
                {
                    state=18;
                    i++;
                }
                else if(s[i]=='a'){
                    state=23;
                    i++;
                }
                else if(s[i]=='o'){
                    state=28;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;
            
            case 18:
                if (s[i]=='a')
                {
                    state=19;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;
            
            case 19:
                if (s[i]=='s')
                {
                    state=20;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;
            
            case 20:
                if (s[i]=='s')
                {
                    state=21;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;

            case 21:
                if (isspace(s[i]) || s[i]=='\0')
                {
                    state=22;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;
            
            case 22:
                cout<<s<<" is a keyword.\n";
                break;
            
            case 23:
                if (s[i]=='t')
                {
                    state=24;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;
            
            case 24:
                if (s[i]=='c')
                {
                    state=25;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;
            
            case 25:
                if (s[i]=='h')
                {
                    state=26;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;
            
            case 26:
                if (isspace(s[i]) || s[i]=='\0')
                {
                    state=27;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;
            
            case 27:
                cout<<s<<" is a keyword.\n";
                break;

            case 28:
                if (s[i]=='h')
                {
                    state=26;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;

            case 31:
                if (isspace(s[i]) || s[i]=='\0')
                {
                    state=32;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;
            
            case 32:
                cout<<s<<" is a keyword.\n";
                break;

            case 34:
                if (isspace(s[i]) || s[i]=='\0')
                {
                    state=35;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;
            
            case 35:
                cout<<s<<" is a keyword.\n";
                break;
            
            case 40:
                if (isspace(s[i]) || s[i]=='\0')
                {
                    state=41;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;
            
            case 41:
                cout<<s<<" is a keyword.\n";
                break;

            case 44:
                if (isspace(s[i]) || s[i]=='\0')
                {
                    state=45;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;
            
            case 45:
                cout<<s<<" is a keyword.\n";
                break;
            
            case 50:
                if (isspace(s[i]) || s[i]=='\0')
                {
                    state=51;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;
            
            case 51:
                cout<<s<<" is a keyword.\n";
                break;
            
            case 53:
                if (isspace(s[i]) || s[i]=='\0')
                {
                    state=54;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;
            
            case 54:
                cout<<s<<" is a keyword.\n";
                break;
            
            case 56:
                if (isspace(s[i]) || s[i]=='\0')
                {
                    state=57;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;
            
            case 57:
                cout<<s<<" is a keyword.\n";
                break;
            
            case 62:
                if (isspace(s[i]) || s[i]=='\0')
                {
                    state=32;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;
            
            case 63:
                cout<<s<<" is a keyword.\n";
                break;
            
            case 64:
                if (isspace(s[i]) || s[i]=='\0')
                {
                    state=65;
                    i++;
                }
                else {
                    s = fail(state);
                    i = 0;
                }
                break;
            
            case 65:
                cout<<s<<" is a keyword.\n";
                break;
            
            case 66:
                cout<<s<<" is not a token.\n";
                break;
        }
    }

}