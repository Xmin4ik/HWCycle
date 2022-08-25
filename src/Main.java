public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Задача №1");
int a = 1;
while (a<=10){
    System.out.print(a+"");
    a ++;
}
        System.out.print("\n");
for (int i=10; i>=0;i--){
    System.out.print(i+"");
}
        System.out.println("Задача №2");
        System.out.print("\n");
for (int day=1; day <=31; day=day+7){
            System.out.println("Сегодня пятница,"+day + "-е число. Необходимо подготовить отчет");
}
        System.out.println("Задача №3");
for(int year=0; year<=2100;year=year+79){
if (year > 1822)
{    System.out.println(year);
}}
        System.out.println("Задача №4");
for (int boll= 1; boll<=30;boll++){
    if( boll %3==0 && boll %5==0 ){
        System.out.println(boll +"ping pong");
    }else if( boll %3==0 ){
    System.out.println(boll +"ping");
    }else if ( boll %5==0 ){
    System.out.println(boll +"pong");}
    else {
        System.out.println(boll);}
}
        System.out.println("Задача №5");

for (int c=0;c<=10 ;c=c+1){
    int w=0;
    int d=w+0+c;

        System.out.print(" "+d);


    }



}
}