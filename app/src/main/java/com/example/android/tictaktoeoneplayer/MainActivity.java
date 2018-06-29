package com.example.android.tictaktoeoneplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public int a=0;
    public int c=0;
    int[] ch={0,0,0,0,0,0,0,0,0};
    int [] marked={0,0,0,0,0,0,0,0,0};
    ImageButton [] b=new ImageButton[10];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            b[1] = (ImageButton) findViewById(R.id.button1);
            b[2] = (ImageButton) findViewById(R.id.button11);
            b[3] = (ImageButton) findViewById(R.id.button12);
            b[4] = (ImageButton) findViewById(R.id.button13);
            b[5] = (ImageButton) findViewById(R.id.button14);
            b[6] = (ImageButton) findViewById(R.id.button15);
            b[7] = (ImageButton) findViewById(R.id.button16);
            b[8] = (ImageButton) findViewById(R.id.button17);
            b[9] = (ImageButton) findViewById(R.id.button18);
        }
        catch (Exception E)
        {
            Toast.makeText(this,""+E,Toast.LENGTH_SHORT).show();
        }
    }
    public void playbot()
    {
        check3();
    }
    public void check3()
    {
check1();
    }
    public void set1()
    {
        Toast.makeText(this,"PLAYER 1 WINS",Toast.LENGTH_SHORT).show();
        for(int i=0;i<9;i++) {
            marked[i] = 1;

        }
    }


    public void set2()
    {
        Toast.makeText(this,"COMPUTER WINS",Toast.LENGTH_SHORT).show();
        for(int i=0;i<9;i++)
           marked[i]=1;
    }
    public int  add1(int i,int j,int k)
    {
        int l=ch[i]+ch[j]+ch[k];
        if(l==-2)
        {
            Toast.makeText(this,""+i+" "+j+" "+k,Toast.LENGTH_LONG).show();
            if(ch[i]==0)
                return i;
            if(ch[j]==0)
                return j;
            else
                return k;
        }
        else
            return -1;
    }
    public int  mark(int i)
    {
        if(marked[i]==0)
        {
            a++;
            b[i+1].setBackgroundResource(R.drawable.cross);
            marked[i]=1;
            ch[i]=-1;
            return 1;
        }
        else return 0;
    }
    public int  play1(int i)
    {
        return mark(i);
    }
    public int  check_own_winning()
    {
        int k=add1(0,1,2);
        if(k!=-1)
        {
            mark(k);
           // set2();
            return 1;
        }
        else {
            k = add1(3, 4, 5);
            if (k != -1) {
                mark(k);
               // set2();
                return 1;
            }
            else {
                k = add1(6, 7, 8);
                if (k != -1) {
                    mark(k);
                    set2();
                    return 1;
                }
                else {
                    k = add1(0, 4, 8);
                    if (k != -1) {
                        mark(k);
                        set2();
                        return 1;
                    } else {
                        k = add1(2, 4, 6);
                        if (k != -1) {
                            mark(k);
                            set2();
                            return 1;
                        }
                        else{
                        k = add1(0, 3, 6);
                        if (k != -1) {
                            mark(k);
                            set2();
                            return 1;
                        }else{
                        k = add1(1, 4, 7);
                        if (k != -1) {
                            mark(k);
                            set2();
                            return 1;
                        }
                        else{
                        k = add1(2, 5, 8);
                        if (k != -1) {
                            mark(k);
                            set2();
                            return 1;
                        }
                        else
                        {
                            return -1;
                        }
                    }}}}
                }
            }
        }


    }
    public void playop(int i)
    {
        //Toast.makeText(this,"HERE AT OP"+i,Toast.LENGTH_SHORT).show();
        if(i==0)
        {
            if(marked[4]==0)
            play1(4);
            marked[4]=1;
            ch[4]=-1;
        }
       else if(i==1)
        {
          //  Toast.makeText(this,"HERE AT OP"+i,Toast.LENGTH_SHORT).show();
            if(marked[4]==0)
            {
                int e2;
                e2=play1(4);

                if(e2==1)
                {
                    marked[4] = 1;
                    ch[4]=-1;
                    //Toast.makeText(this,"in play op code 1st",Toast.LENGTH_SHORT).show();
                    return;}
                if(true)
                {
                    if(ch[1]==1 && ch[3]==1)
                    {
                       // Toast.makeText(this,"in play op code 2st",Toast.LENGTH_SHORT).show();
                        e2=play1(0);

                        if(e2==1)
                        {
                            marked[0] = 1;
                            ch[0]=-1;
                          //  Toast.makeText(this,"in play op code 2st",Toast.LENGTH_SHORT).show();
                            return;
                    }}
                    if(ch[4]==1 &&ch[8]==1)
                    {
                        e2=play1(5);

                        if(e2==1)
                        {
                            marked[5] = 1;
                            ch[5]=-1;
                           // Toast.makeText(this,"in play op code 3st",Toast.LENGTH_SHORT).show();
                            return;
                        }}
                    if(ch[1]==1 &&ch[5]==1)
                    {
                        e2=play1(2);

                        if(e2==1)
                        {
                            marked[2] = 1;
                            ch[2]=-1;
                           // Toast.makeText(this,"in play op code 4st",Toast.LENGTH_SHORT).show();
                            return;
                    }}
                    if(ch[5]==1 &&ch[7]==1)
                    {
                        e2=play1(8);
                        if(e2==1)
                        {
                            marked[8] = 1;
                            ch[8]=-1;
                            //Toast.makeText(this,"in play op code 5st",Toast.LENGTH_SHORT).show();
                            return;
                    }}
                    if(ch[3]==1 &&ch[7]==1)
                    {
                        e2=play1(6);
                        if(e2==1)
                        {
                            marked[6] = 1;
                            ch[6]=-1;
                           // Toast.makeText(this,"in play op code 6st",Toast.LENGTH_SHORT).show();
                            return;
                        }
                    }
                   if(true)
                    {

                        for(int j=0;j<9;j++)
                        {
                            if(marked[j]==0)
                            {
                                play1(j);
                                marked[j] = 1;
                                ch[j]=-1;
                            //    Toast.makeText(this,"in play op code loopst",Toast.LENGTH_SHORT).show();
                                return;
                            }

                        }
                    }
                }
            }else
            {
                int e2;
                if(ch[1]==1 && ch[3]==1)
                {
                    e2=play1(0);
                    if(e2==1)
                    {
                        marked[0] = 1;
                        ch[0]=-1;
                        //Toast.makeText(this,"in play op code 8st",Toast.LENGTH_SHORT).show();
                        return;
                    }
                }
                if(ch[4]==1 &&ch[8]==1)
                {
                    e2=play1(5);

                    if(e2==1)
                    {
                        marked[5] = 1;
                        ch[5]=-1;
                       // Toast.makeText(this,"in play op code 9st",Toast.LENGTH_SHORT).show();
                        return;

                    }}
                if(ch[1]==1 &&ch[5]==1)
                {
                    e2=play1(2);
                    if(e2==1)
                    {
                        marked[2] = 1;
                        ch[2]=-1;
                       // Toast.makeText(this,"in play op code 10st",Toast.LENGTH_SHORT).show();
                        return;
                    }
                }
                if(ch[5]==1 &&ch[7]==1)
                {
                    e2=play1(8);
                    if(e2==1)
                    {
                        marked[8] = 1;
                        ch[8]=-1;
                      //  Toast.makeText(this,"in play op code 11st",Toast.LENGTH_SHORT).show();
                        return;
                    }
                }
                if(ch[3]==1 &&ch[7]==1)
                {
                    e2=play1(6);
                    if(e2==1)
                    {
                        marked[6] = 1;
                        ch[6]=-1;
                       // Toast.makeText(this,"in play op code 12st",Toast.LENGTH_SHORT).show();
                        return;
                    }
                }
                if(true)
                {
                    for(int j=0;j<9;j++)
                    {
                        if(marked[j]==0)
                        {
                            play1(j);
                            marked[j] = 1;
                            ch[j]=-1;
                          //  Toast.makeText(this,"in play op code 13st",Toast.LENGTH_SHORT).show();
                            return;
                        }

                    }
                }
            }
        }
        else if(i==2)
        {
            if(marked[4]==0) {
                play1(4);
                marked[4] = 1;
                ch[4]=-1;
            }else{
                if(marked[0]==0) {
                    play1(0);
                    marked[0]=1;
                    ch[0]=-1;
                }
            }
        }
    }
    public void s1(View view) {
        try {
            if (marked[0] == 0) {


                b[1].setBackgroundResource(R.drawable.cir);
                a++;

                if (a % 2 == 1) {
                    marked[0] = 1;

                    ch[0] = 1;
                    check_draw();
                    int e2;
                    int e = check_own_winning();
                    if (e == -1) {
                        if (ch[1] == 1) {

                            e2=play1(2);
                            if(e2==1)
                                return;
                        } if (ch[2] == 1) {

                           e2= play1(1);
                            if(e2==1)
                                return;
                        } if (ch[3] == 1) {

                            e2=play1(6);
                            if(e2==1)
                                return;
                        } if (ch[4] == 1) {

                            e2= play1(8);
                            if(e2==1)
                                return;
                        } if (ch[6] == 1) {

                            e2= play1(3);
                            if(e2==1)
                                return;
                        }if (ch[8] == 1) {

                            e2=play1(4);
                            if(e2==1)
                                return;
                        } if(true){
                             playop(1);

                        }


                    }
                } else {
                    Toast.makeText(this, "error with code or computer wins", Toast.LENGTH_SHORT).show();
                }
            }
        } catch (Exception e)
        {
            Toast.makeText(this,""+e,Toast.LENGTH_LONG).show();
        }
    }
    public void s3(View view) {
        try {
            if (marked[2] == 0) {

                b[3].setBackgroundResource(R.drawable.cir);
                a++;
int e2;
                if (a % 2 == 1) {
                    marked[2] = 1;

                    ch[2] = 1;
                    check_draw();
                    int e = check_own_winning();
                    if (e == -1) {
                        if (ch[1] == 1) {

                            e2= play1(0);
                            if(e2==1)
                                return;
                        }  if (ch[0] == 1) {

                            e2= play1(1);
                            if(e2==1)
                                return;
                        } if (ch[5] == 1) {

                            e2= play1(8);
                            if(e2==1)
                                return;
                        }if (ch[4] == 1) {

                            e2= play1(6);
                            if(e2==1)
                                return;
                        } if (ch[6] == 1) {

                            e2= play1(4);
                            if(e2==1)
                                return;
                        } if (ch[8] == 1) {

                            e2= play1(5);
                            if(e2==1)
                                return;
                        }if(true){
                            playop(1);
                        }


                    }
                } else {
                    Toast.makeText(this, "error with code or computer wins", Toast.LENGTH_SHORT).show();
                }
            }
        } catch (Exception e)
        {
            Toast.makeText(this,""+e,Toast.LENGTH_LONG).show();
        }
    }
    public void s2(View view)
    {
        if(marked[1]==0)
        {
            b[2].setBackgroundResource(R.drawable.cir);
            a++;
            if(a%2==1)
            {
                marked[1] = 1;
int e2;
                ch[1] = 1;
                check_draw();
                int e = check_own_winning();
                if (e == -1) {
                    //Toast.makeText(this,"11",Toast.LENGTH_SHORT).show();
                    if (ch[0] == 1) {
                     //   Toast.makeText(this,"0",Toast.LENGTH_SHORT).show();
                        e2=play1(2);
                        if(e2==1)
                            return;
                    } if (ch[2] == 1) {
//Toast.makeText(this,"1",Toast.LENGTH_SHORT).show();
                        e2=play1(0);
                        if(e2==1)
                            return;
                    } if (ch[4] == 1) {
                    //    Toast.makeText(this,"2",Toast.LENGTH_SHORT).show();
                        e2= play1(7);
                        if(e2==1)
                            return;
                    } if (ch[7] == 1) {
                      //  Toast.makeText(this,"3",Toast.LENGTH_SHORT).show();
                        e2=play1(4);
                        if(e2==1)
                            return;
                    }if(true){
                     //   Toast.makeText(this,"111",Toast.LENGTH_SHORT).show();
                        playop(1);
                    }


                }
            } else {
                Toast.makeText(this, "error with code or computer wins", Toast.LENGTH_SHORT).show();
            }
            }
        }
        public void s4(View view)
        {
            if(marked[3]==0)
            {
                b[4].setBackgroundResource(R.drawable.cir);
                a++;

                if (a % 2 == 1) {
                    marked[3] = 1;
                    int e2;
                    ch[3] = 1;
                    check_draw();
                    int e = check_own_winning();
                    if (e == -1) {
                        if (ch[0] == 1) {

                            e2=  play1(6);
                            if(e2==1)
                                return;
                        } if (ch[4] == 1) {

                            e2=  play1(5);
                            if(e2==1)
                                return;
                        } if (ch[6] == 1) {

                            e2= play1(0);
                            if(e2==1)
                                return;
                        } if (ch[5] == 1) {

                            e2=play1(4);
                            if(e2==1)
                                return;
                        } if(true){
                            playop(1);
                        }


                    }
                } else {
                    Toast.makeText(this, "error with code or computer wins", Toast.LENGTH_SHORT).show();
                }
            }
        }

    public void s5(View view)
    {
        if(marked[4]==0)
        {
            b[5].setBackgroundResource(R.drawable.cir);
            a++;

            if (a % 2 == 1) {
                marked[4] = 1;
                int e2;
                ch[4] = 1;
                check_draw();
                int e = check_own_winning();
                if (e == -1) {
                    if (ch[0] == 1) {

                        e2=  play1(8);
                        if(e2==1)
                            return;
                    } if (ch[1] == 1) {

                        e2=  play1(7);
                        if(e2==1)
                            return;
                    } if (ch[2] == 1) {

                        e2= play1(6);
                        if(e2==1)
                            return;
                    } if (ch[3] == 1) {

                        e2=play1(5);
                        if(e2==1)
                            return;
                    }
                    if (ch[5] == 1) {

                        e2=play1(3);
                        if(e2==1)
                            return;
                    }
                    if (ch[6] == 1) {

                        e2=play1(2);
                        if(e2==1)
                            return;
                    }
                    if (ch[7] == 1) {

                        e2=play1(1);
                        if(e2==1)
                            return;
                    }
                    if (ch[8] == 1) {

                        e2=play1(0);
                        if(e2==1)
                            return;
                    }
                    if(true) {
                        playop(1);
                    }


                }
            } else {
                Toast.makeText(this, "error with code or computer wins", Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void s6(View view)
    {
        if(marked[5]==0)
        {
            b[6].setBackgroundResource(R.drawable.cir);
            a++;

            if (a % 2 == 1) {
                marked[5] = 1;
                int e2;
                ch[5] = 1;
                check_draw();
                int e = check_own_winning();
                if (e == -1) {
                    if (ch[2] == 1) {

                        e2=  play1(8);
                        if(e2==1)
                            return;
                    } if (ch[4] == 1) {

                        e2=  play1(3);
                        if(e2==1)
                            return;
                    } if (ch[3] == 1) {

                        e2= play1(0);
                        if(e2==4)
                            return;
                    } if (ch[8] == 1) {

                        e2=play1(2);
                        if(e2==1)
                            return;
                    }if(true){
                        playop(1);
                    }


                }
            } else {
                Toast.makeText(this, "error with code or computer wins", Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void s7(View view) {
        try {
            if (marked[6] == 0) {
                b[7].setBackgroundResource(R.drawable.cir);
                a++;

                if (a % 2 == 1) {
                    marked[6] = 1;

                    ch[6] = 1;
                    int e2;
                    check_draw();
                    int e = check_own_winning();
                    if (e == -1) {
                        if (ch[7] == 1) {

                            e2=play1(8);
                            if(e2==1)
                                return;
                        } if (ch[8] == 1) {

                            e2= play1(7);
                            if(e2==1)
                                return;
                        } if (ch[3] == 1) {

                            e2=play1(0);
                            if(e2==1)
                                return;
                        } if (ch[0] == 1) {

                            e2= play1(3);
                            if(e2==1)
                                return;
                        } if (ch[4] == 1) {

                            e2= play1(2);
                            if(e2==1)
                                return;
                        }if (ch[2] == 1) {

                            e2=play1(3);
                            if(e2==1)
                                return;
                        }if(true){
                            playop(1);

                        }


                    }
                } else {
                    Toast.makeText(this, "error with code or computer wins", Toast.LENGTH_SHORT).show();
                }
            }
        } catch (Exception e)
        {
            Toast.makeText(this,""+e,Toast.LENGTH_LONG).show();
        }
    }
    public void s8(View view)
    {
        if(marked[7]==0)
        {
            b[8].setBackgroundResource(R.drawable.cir);
            a++;
            if(a%2==1)
            {
                marked[7] = 1;
                int e2;
                ch[7] = 1;
                check_draw();
                int e = check_own_winning();
                if (e == -1) {
                    if (ch[4] == 1) {

                        e2=play1(1);
                        if(e2==1)
                            return;
                    } if (ch[1] == 1) {

                        e2=play1(4);
                        if(e2==1)
                            return;
                    } if (ch[6] == 1) {

                        e2= play1(8);
                        if(e2==1)
                            return;
                    } if (ch[8] == 1) {

                        e2=play1(6);
                        if(e2==1)
                            return;
                    }if(true){
                        playop(1);
                    }


                }
            } else {
                Toast.makeText(this, "error with code or computer wins", Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void s9(View view) {
        try {
            if (marked[8] == 0) {
                b[9].setBackgroundResource(R.drawable.cir);
                a++;
                int e2;
                if (a % 2 == 1) {
                    marked[8] = 1;

                    ch[8] = 1;
                    check_draw();
                    int e = check_own_winning();
                    if (e == -1) {
                        if (ch[2] == 1) {

                            e2= play1(5);
                            if(e2==1)
                                return;
                        }  if (ch[5] == 1) {

                            e2= play1(2);
                            if(e2==1)
                                return;
                        } if (ch[4] == 1) {

                            e2= play1(0);
                            if(e2==1)
                                return;
                        }if (ch[0] == 1) {

                            e2= play1(4);
                            if(e2==1)
                                return;
                        } if (ch[6] == 1) {

                            e2= play1(7);
                            if(e2==1)
                                return;
                        } if (ch[7] == 1) {

                            e2= play1(6);
                            if(e2==1)
                                return;
                        }if(true){
                            playop(1);
                        }


                    }
                } else {
                    Toast.makeText(this, "error with code or computer wins", Toast.LENGTH_SHORT).show();
                }
            }
        } catch (Exception e)
        {
            Toast.makeText(this,""+e,Toast.LENGTH_LONG).show();
        }
    }
    public void dr()
    {
        Toast.makeText(this,"DRAW",Toast.LENGTH_SHORT).show();
        for(int i=0;i<9;i++)
            marked[i]=1;
    }
    public void clear(View view)
    {
        try {
            a = 0;
            c = 0;
            for (int i = 0; i < 9; i++) {
                ch[i] = 0;
                marked[i] = 0;
                b[i+1].setBackgroundResource(R.color.grey);
            }
        }catch (Exception E)
        {
            Toast.makeText(this,""+E,Toast.LENGTH_LONG).show();
        }
    }
    public void check_draw()
    {
        check1();
    }
    public void check1()
    {

        int a1=ch[0]+ch[1]+ch[2];
        int a2=ch[3]+ch[4]+ch[5];
        int a3=ch[6]+ch[7]+ch[8];
        if(a1==3||a2==3||a3==3)
        {
            set1();
            return;
        }
        else if(a1==-3||a2==-3||a3==-3)
        {
            set2();
            return;
        }
        else
        {
            a1=ch[0]+ch[4]+ch[8];
            a2=ch[2]+ch[4]+ch[6];
            if(a1==3||a2==3)
                set1();
            else if(a1==-3||a2==-3)
                set2();
            else
            {
                a1=ch[0]+ch[3]+ch[6];
                a2=ch[1]+ch[4]+ch[7];
                a3=ch[2]+ch[5]+ch[8];
                if(a1==3||a2==3||a3==3)
                {
                    set1();
                    return;
                }
                else if(a1==-3||a2==-3||a3==-3)
                {
                    set2();
                    return;
                }
                else
                {
                    if(a==9)
                        dr();
                    else
                        return;
                }

            }
        }
    }
}
