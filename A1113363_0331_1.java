import java.util.Scanner;

class animal{
    Scanner sc = new Scanner(System.in);

    String name;
    double high;
    int weight;
    int speed;
    
    animal(){  //建構
    }

    void show(){
        System.out.printf("姓名:%-3s 身高:%-4.1f 體重:%-28d 速度:%-7d\t\n", name, high, weight, speed);
    }

    int distance(int x,double y){
        if(x>=0 && y>=0){
            return (int)(x*y*this.speed);
        }else{
            return 0;
        }
    }
    String getName(){
        return name;
    }

    static void showinfo(){
        System.out.println("歡迎進入冰雪奇緣系統"); //static方法
    }
}

class human extends animal{
    String sex;
   
    human(String sex){
        this.sex = sex;               
    }

    void show(){
        System.out.printf("姓名:%-3s 身高:%-4.1f 體重:%-3d 性別：%-17s 速度:%-3d\n",name,high,weight,sex,speed);
    }
}

class snow extends human{
    String snowPower;

    snow(String sex,String snowPower){
        super(sex);
        this.snowPower = snowPower;
    }

    void show(){
        System.out.printf("姓名:%-3s 身高:%-4.1f 體重:%-3d 性別：%-2s 冰凍技能：%-4s 速度:%-3d\n",name,high,weight,sex,snowPower,speed);

    }

    int distance(int x,double y){
        if(x>=0 && y>=0){
            return (int)(x*y*this.speed*2);
        }else{
            return 0;
        }
    }

}

public class A1113363_0331_1{
    public static void main(String[] argv){

        Scanner sc = new Scanner(System.in);

        animal a = new animal();
        animal b = new animal();
        human c = new human("男");
        human d = new human("男");
        human e = new human("女");
        snow f = new snow("女","Yes");

        a.name = "雪寶";
        a.high = 1.1;
        a.weight = 52;
        a.speed = 100;

        b.name = "驢子";
        b.high = 1.5;
        b.weight = 99;
        b.speed = 200;

        c.name = "阿克";
        c.high = 1.9;
        c.weight = 80;
        c.speed = 150;

        d.name = "漢斯";
        d.high = 1.8;
        d.weight = 78;
        d.speed = 130;

        e.name = "安那";
        e.high = 1.7;
        e.weight = 48;
        e.speed = 120;

        f.name = "愛沙";
        f.high = 1.7;
        f.weight = 50;
        f.speed = 120;

        animal.showinfo();

        a.show();   
        b.show();
        c.show();
        d.show();
        e.show();
        f.show();

        String[] nameArr = {"雪寶","驢子","阿克","漢斯","安那","愛沙"};
        int i = 0;
        for(String name : nameArr){
            System.out.printf("\n請輸入%s的跑步時間：", name);
            int x = sc.nextInt();
            System.out.printf("是否輸入加速度？(是：直接輸入加速度值/否：輸入1)：");
            double y = sc.nextDouble();
            if (i == 0) {
                System.out.printf("%s的跑步距離為:%d", name, a.distance(x, y));
            } else if (i == 1) {
                System.out.printf("%s的跑步距離為:%d", name, b.distance(x, y));
            } else if (i == 2) {
                System.out.printf("%s的跑步距離為:%d", name, c.distance(x, y));
            } else if (i == 3) {
                System.out.printf("%s的跑步距離為:%d", name, d.distance(x, y));
            } else if (i == 4) {
                System.out.printf("%s的跑步距離為:%d", name, e.distance(x, y));
            } else if (i == 5) {
                System.out.printf("%s的跑步距離為:%d", name, f.distance(x, y));
            }
            i++;
        }
    }
} 