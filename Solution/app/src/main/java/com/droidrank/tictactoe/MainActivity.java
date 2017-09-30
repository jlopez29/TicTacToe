package com.droidrank.tictactoe;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{



    Button block1, block2, block3, block4, block5, block6, block7, block8, block9, restart;
    TextView result;
    int turn = 0;
    ArrayList<Boolean> set = new ArrayList<>();
    String[][] board = new String[3][3];
    int myGreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myGreen = ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary);


        block1 = (Button) findViewById(R.id.bt_block1);
        block2 = (Button) findViewById(R.id.bt_block2);
        block3 = (Button) findViewById(R.id.bt_block3);
        block4 = (Button) findViewById(R.id.bt_block4);
        block5 = (Button) findViewById(R.id.bt_block5);
        block6 = (Button) findViewById(R.id.bt_block6);
        block7 = (Button) findViewById(R.id.bt_block7);
        block8 = (Button) findViewById(R.id.bt_block8);
        block9 = (Button) findViewById(R.id.bt_block9);
        result = (TextView) findViewById(R.id.tv_show_result);
        restart = (Button) findViewById(R.id.bt_restart_game);

        for(int i = 0;i < 9; i++)
        {
            set.add(false);
        }

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                board[i][j] = "";
            }
        }





        block1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn == 0 && !set.get(0))
                {
                    turn = 1;
                    set.set(0,true);
                    board[0][0] = "X";
                    block1.setText("X");
                }
                else if(turn == 1 && !set.get(0))
                {
                    turn = 0;
                    set.set(0,true);
                    board[0][0] = "O";
                    block1.setText("O");
                }

                if(!checkWinner()) {
                    if (fullBoard()) {
                        Log.i("Game", "Tie");
                        redOut();
                    }
                }
            }
        });

        block2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn == 0 && !set.get(1))
                {
                    turn = 1;
                    set.set(1,true);
                    board[0][1] = "X";
                    block2.setText("X");
                }
                else if(turn == 1 && !set.get(1))
                {
                    turn = 0;
                    set.set(1,true);
                    board[0][1] = "O";
                    block2.setText("O");
                }

                if(!checkWinner()) {
                    if (fullBoard()) {
                        Log.i("Game", "Tie");
                        redOut();
                    }
                }
            }
        });

        block3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn == 0 && !set.get(2))
                {
                    turn = 1;
                    set.set(2,true);
                    board[0][2] = "X";
                    block3.setText("X");
                }
                else if(turn == 1 && !set.get(2))
                {
                    turn = 0;
                    set.set(2,true);
                    board[0][2] = "O";
                    block3.setText("O");
                }

                if(!checkWinner()) {
                    if (fullBoard()) {
                        Log.i("Game", "Tie");
                        redOut();
                    }
                }
            }
        });

        block4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn == 0 && !set.get(3))
                {
                    turn = 1;
                    set.set(3,true);
                    board[1][0] = "X";
                    block4.setText("X");
                }
                else if(turn == 1 && !set.get(3))
                {
                    turn = 0;
                    set.set(3,true);
                    board[1][0] = "O";
                    block4.setText("O");
                }

                if(!checkWinner()) {
                    if (fullBoard()) {
                        Log.i("Game", "Tie");
                        redOut();
                    }
                }
            }
        });

        block5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn == 0 && !set.get(4))
                {
                    turn = 1;
                    set.set(4,true);
                    board[1][1] = "X";
                    block5.setText("X");
                }
                else if(turn == 1 && !set.get(4))
                {
                    turn = 0;
                    set.set(4,true);
                    board[1][1] = "O";
                    block5.setText("O");
                }

                if(!checkWinner()) {
                    if (fullBoard()) {
                        Log.i("Game", "Tie");
                        redOut();
                    }
                }
            }
        });

        block6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn == 0 && !set.get(5))
                {
                    turn = 1;
                    set.set(5,true);
                    board[1][2] = "X";
                    block6.setText("X");
                }
                else if(turn == 1 && !set.get(5))
                {
                    turn = 0;
                    set.set(5,true);
                    board[1][2] = "O";
                    block6.setText("O");
                }

                if(!checkWinner()) {
                    if (fullBoard()) {
                        Log.i("Game", "Tie");
                        redOut();
                    }
                }
            }
        });

        block7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn == 0 && !set.get(6))
                {
                    turn = 1;
                    set.set(6,true);
                    board[2][0] = "X";
                    block7.setText("X");
                }
                else if(turn == 1 && !set.get(6))
                {
                    turn = 0;
                    set.set(6,true);
                    board[2][0] = "O";
                    block7.setText("O");
                }

                if(!checkWinner()) {
                    if (fullBoard()) {
                        Log.i("Game", "Tie");
                        redOut();
                    }
                }
            }
        });
        block8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn == 0 && !set.get(7))
                {
                    turn = 1;
                    set.set(7,true);
                    board[2][1] = "X";
                    block8.setText("X");
                }
                else if(turn == 1 && !set.get(7))
                {
                    turn = 0;
                    set.set(7,true);
                    board[2][1] = "O";
                    block8.setText("O");
                }

                if(!checkWinner()) {
                    if (fullBoard()) {
                        Log.i("Game", "Tie");
                        redOut();
                    }
                }
            }
        });

        block9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn == 0 && !set.get(8))
                {
                    turn = 1;
                    set.set(8,true);
                    board[2][2] = "X";
                    block9.setText("X");
                }
                else if(turn == 1 && !set.get(8))
                {
                    turn = 0;
                    set.set(8,true);
                    board[2][2] = "O";
                    block9.setText("O");
                }

                if(!checkWinner()) {
                    if (fullBoard()) {
                        Log.i("Game", "Tie");
                        redOut();
                    }
                }
            }
        });


        /**
         * Restarts the game
         */
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Restart");
                builder.setMessage("Are you sure you want to restart the game?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                resetButtons();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                            }
                        });
                builder.create();
                builder.show();

            }
        });

    }
    public boolean checkWinner()
    {
        showBoard();

        if(checkX()) {
            showWinner("X");
            Log.i("Winner", "X");
            return true;
        }

        if(checkO()) {
            showWinner("O");
            Log.i("Winner", "O");
            return true;
        }

        return false;
    }
    public boolean checkX()
    {

        Log.i("Check","X");
        if(board[0][0].equals("X") && board[0][1].equals("X") && board[0][2].equals("X"))
        {
            block1.setBackgroundColor(Color.YELLOW);
            block2.setBackgroundColor(Color.YELLOW);
            block3.setBackgroundColor(Color.YELLOW);
            Log.i("Game", "Over");
            return true;
        }

        else if(board[1][0].equals("X") && board[1][1].equals("X") && board[1][2].equals("X"))
        {
            block4.setBackgroundColor(Color.YELLOW);
            block5.setBackgroundColor(Color.YELLOW);
            block6.setBackgroundColor(Color.YELLOW);
            Log.i("Game", "Over");
            return true;
        }
        else if(board[2][0].equals("X") && board[2][1].equals("X") && board[2][2].equals("X"))
        {
            block7.setBackgroundColor(Color.YELLOW);
            block8.setBackgroundColor(Color.YELLOW);
            block9.setBackgroundColor(Color.YELLOW);
            Log.i("Game", "Over");
            return true;
        }
        else if(board[0][0].equals("X") && board[1][0].equals("X") && board[2][0].equals("X"))
        {
            block1.setBackgroundColor(Color.YELLOW);
            block4.setBackgroundColor(Color.YELLOW);
            block7.setBackgroundColor(Color.YELLOW);
            Log.i("Game", "Over");
            return true;
        }
        else if(board[0][1].equals("X") && board[1][1].equals("X") && board[2][1].equals("X"))
        {

            block2.setBackgroundColor(Color.YELLOW);
            block5.setBackgroundColor(Color.YELLOW);
            block8.setBackgroundColor(Color.YELLOW);
            Log.i("Game", "Over");
            return true;
        }
        else if(board[0][2].equals("X") && board[1][2].equals("X") && board[2][2].equals("X"))
        {
            block3.setBackgroundColor(Color.YELLOW);
            block6.setBackgroundColor(Color.YELLOW);
            block9.setBackgroundColor(Color.YELLOW);
            Log.i("Game", "Over");
            return true;
        }
        else if(board[0][0].equals("X") && board[1][1].equals("X") && board[2][2].equals("X"))
        {
            block1.setBackgroundColor(Color.YELLOW);
            block5.setBackgroundColor(Color.YELLOW);
            block9.setBackgroundColor(Color.YELLOW);
            Log.i("Game", "Over");
            return true;
        }
        else if(board[0][2].equals("X") && board[1][1].equals("X") && board[2][0].equals("X"))
        {
            block3.setBackgroundColor(Color.YELLOW);
            block5.setBackgroundColor(Color.YELLOW);
            block7.setBackgroundColor(Color.YELLOW);
            Log.i("Game", "Over");
            return true;
        }
        return false;
    }

    public boolean checkO()
    {
        Log.i("Check","O");
        if(board[0][0].equals("O") && board[0][1].equals("O") && board[0][2].equals("O"))
        {
            block1.setBackgroundColor(Color.YELLOW);
            block2.setBackgroundColor(Color.YELLOW);
            block3.setBackgroundColor(Color.YELLOW);
            Log.i("Game", "Over");
            return true;
        }

        else if(board[1][0].equals("O") && board[1][1].equals("O") && board[1][2].equals("O"))
        {
            block4.setBackgroundColor(Color.YELLOW);
            block5.setBackgroundColor(Color.YELLOW);
            block6.setBackgroundColor(Color.YELLOW);
            Log.i("Game", "Over");
            return true;
        }
        else if(board[2][0].equals("O") && board[2][1].equals("O") && board[2][2].equals("O"))
        {
            block7.setBackgroundColor(Color.YELLOW);
            block8.setBackgroundColor(Color.YELLOW);
            block9.setBackgroundColor(Color.YELLOW);
            Log.i("Game", "Over");
            return true;
        }
        else if(board[0][0].equals("O") && board[1][0].equals("O") && board[2][0].equals("O"))
        {
            block1.setBackgroundColor(Color.YELLOW);
            block4.setBackgroundColor(Color.YELLOW);
            block7.setBackgroundColor(Color.YELLOW);
            Log.i("Game", "Over");
            return true;
        }
        else if(board[0][1].equals("O") && board[1][1].equals("O") && board[2][1].equals("O"))
        {
            block2.setBackgroundColor(Color.YELLOW);
            block5.setBackgroundColor(Color.YELLOW);
            block8.setBackgroundColor(Color.YELLOW);
            Log.i("Game", "Over");
            return true;
        }
        else if(board[0][2].equals("O") && board[1][2].equals("O") && board[2][2].equals("O"))
        {
            block3.setBackgroundColor(Color.YELLOW);
            block6.setBackgroundColor(Color.YELLOW);
            block9.setBackgroundColor(Color.YELLOW);
            Log.i("Game", "Over");
            return true;
        }
        else if(board[0][0].equals("O") && board[1][1].equals("O") && board[2][2].equals("O"))
        {
            block1.setBackgroundColor(Color.YELLOW);
            block5.setBackgroundColor(Color.YELLOW);
            block9.setBackgroundColor(Color.YELLOW);
            Log.i("Game", "Over");
            return true;
        }
        else if(board[0][2].equals("O") && board[1][1].equals("O") && board[2][0].equals("O"))
        {
            block3.setBackgroundColor(Color.YELLOW);
            block5.setBackgroundColor(Color.YELLOW);
            block7.setBackgroundColor(Color.YELLOW);
            Log.i("Game", "Over");
            return true;
        }
        return false;
    }
    public void resetButtons()
    {
        block1.setText("");
        block2.setText("");
        block3.setText("");
        block4.setText("");
        block5.setText("");
        block6.setText("");
        block7.setText("");
        block8.setText("");
        block9.setText("");

        block1.setBackgroundColor(myGreen);
        block2.setBackgroundColor(myGreen);
        block3.setBackgroundColor(myGreen);
        block4.setBackgroundColor(myGreen);
        block5.setBackgroundColor(myGreen);
        block6.setBackgroundColor(myGreen);
        block7.setBackgroundColor(myGreen);
        block8.setBackgroundColor(myGreen);
        block9.setBackgroundColor(myGreen);

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                board[i][j] = "";
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        set = new ArrayList<>();

        for(int i = 0;i < 9; i++)
        {
            set.add(false);
        }
        turn = 0;
    }
    public void showBoard()
    {
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean fullBoard()
    {
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(board[i][j].equals("")) {
                    Log.i("Empty","Spot");
                    return false;
                }
            }
        }
        return true;
    }

    public void redOut()
    {
        block1.setBackgroundColor(Color.RED);
        block2.setBackgroundColor(Color.RED);
        block3.setBackgroundColor(Color.RED);
        block4.setBackgroundColor(Color.RED);
        block5.setBackgroundColor(Color.RED);
        block6.setBackgroundColor(Color.RED);
        block7.setBackgroundColor(Color.RED);
        block8.setBackgroundColor(Color.RED);
        block9.setBackgroundColor(Color.RED);

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Game Over");
        builder.setMessage("The game ended in a tie!")
                .setPositiveButton("Restart", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        resetButtons();
                    }
                })
                .setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finishAndRemoveTask();
                    }
                });
        builder.create();
        builder.show();
    }

    public void showWinner(String winner)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Game Over");
        builder.setMessage(winner + " won the game!")
                .setPositiveButton("Restart", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        resetButtons();
                    }
                })
                .setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finishAndRemoveTask();
                    }
                });
        builder.create();
        builder.show();
    }

}
