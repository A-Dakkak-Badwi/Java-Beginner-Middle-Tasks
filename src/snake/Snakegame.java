package snake;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Snakegame extends JPanel implements ActionListener, KeyListener {

    private class Tile{
        int x;
        int y;
        Tile(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    int boardWidth;
    int boardHeight;
    int tileSize= 25;

    //snake
    Tile snakeHead;
    ArrayList<Tile> snakeBody;

    //Food
    Tile food;
    Tile poison;
    Random random;

    //game Logic
    Timer gameLoop;
    int velocityX;
    int velocityY;
    boolean gameOver = false;


    public BufferedImage head_up, head_down, head_left, head_right, body_up, body_right, Food, Poison;
    public String direction;

    Snakegame(int boardWidth, int boardHeight) {
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        setPreferredSize(new Dimension(this.boardWidth, this.boardHeight));
        setBackground(Color.black);
        addKeyListener(this);
        setFocusable(true);

        snakeHead = new Tile(5, 5);
        snakeBody = new ArrayList<Tile>();

        food = new Tile(10, 10);
        poison = new Tile(0, 0);
        random = new Random();
        placeFood();
        placePoison();
        getSnakeImage();
        getFoodImage();
        getPoisonImage();

        velocityX = 0;
        velocityY = 0;
        direction = "head_up";

        gameLoop = new Timer(100, this);
        gameLoop.start();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }
    public void draw(Graphics g) {

        //food
        //g.setColor(Color.red);
        //g.fill3DRect(food.x * tileSize, food.y * tileSize, tileSize, tileSize,true);
        g.drawImage(Food,food.x *tileSize,food.y *tileSize,tileSize,tileSize,null);

        //Snake Head
        //g.setColor(Color.green);
        //g.fill3DRect(snakeHead.x * tileSize, snakeHead.y * tileSize, tileSize, tileSize,true);

        g.drawImage(Poison,poison.x*tileSize,poison.y *tileSize,tileSize,tileSize,null );

        BufferedImage image = null;

        switch(direction){
            case "up":
                image = head_up;
                break;
            case "down":
                image = head_down;
                break;
            case "left":
                image = head_left;
                break;
            case "right":
                image = head_right;
        }
        g.drawImage(image, snakeHead.x * tileSize, snakeHead.y * tileSize, tileSize, tileSize, null);


        //Snake Body
        for (int i = 0; i < snakeBody.size(); i++){
            Tile snakePart = snakeBody.get(i);
            g.fill3DRect(snakePart.x * tileSize, snakePart.y * tileSize, tileSize, tileSize,true);
        }

        //Score
        g.setFont(new Font("Arial", Font.PLAIN, 16));
        if (gameOver){
            g.setFont(new Font("Demonic", Font.PLAIN, 32));
            g.setColor(Color.RED);
            g.drawString("Game Over " + "\n" +
                    "Score: " + String.valueOf(snakeBody.size()), tileSize+130, tileSize+200);
        }
        else{
            g.drawString("Score: " + String.valueOf(snakeBody.size()), tileSize-16, tileSize);
        }
    }
    public void placeFood(){
        food.x = random.nextInt(boardWidth/tileSize); //600/25 24
        food.y = random.nextInt(boardHeight/tileSize);

    }
    public void placePoison(){
        poison.x = random.nextInt(boardWidth/tileSize); //600/25 24
        poison.y = random.nextInt(boardHeight/tileSize);

    }
    public boolean collision(Tile tile1, Tile tile2){
        return tile1.x == tile2.x && tile1.y == tile2.y;
    }
    public void move(){
        if (collision(snakeHead, food)){
            snakeBody.add(new Tile(food.x, food.y));
            placeFood();
        }

        if (collision(snakeHead, poison)){
            gameOver = true;
        }

        //Snake Body
        for (int i = snakeBody.size()-1; i >= 0; i--){
            Tile snakePart = snakeBody.get(i);
            if (i == 0) {
                snakePart.x = snakeHead.x;
                snakePart.y = snakeHead.y;
            }
            else {
                Tile prevSnakePart = snakeBody.get(i-1);
                snakePart.x = prevSnakePart.x;
                snakePart.y = prevSnakePart.y;
            }
        }

        if (snakeHead.x*tileSize == poison.x && snakeHead.y*tileSize == poison.y){
            gameOver = true;
        }

        //Snake Head
        snakeHead.x += velocityX;
        snakeHead.y += velocityY;

        //game Over conditions
        for (int i = 0; i < snakeBody.size(); i++){
            Tile snakePart = snakeBody.get(i);
            //collide
            if (collision(snakeHead, snakePart)){
                gameOver = true;
            }
        }
        if (snakeHead.x*tileSize < 0 || snakeHead.x*tileSize > boardWidth ||
                snakeHead.y*tileSize < 0 || snakeHead.y*tileSize > boardHeight){
            gameOver = true;
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        move();
        repaint();
        if (gameOver){
            gameLoop.stop();
        }
    }
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP && velocityY != 1) {
            direction = "up";
            velocityX = 0;
            velocityY = -1;
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN && velocityY != -1) {
            direction = "down";
            velocityX = 0;
            velocityY = 1;
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT && velocityX != 1) {
            direction = "left";
            velocityX = -1;
            velocityY = 0;
        }
        else if (e.getKeyCode() == KeyEvent.VK_RIGHT && velocityX != -1) {
            direction = "right";
            velocityX = 1;
            velocityY = 0;
        }
    }


    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }
    public void getSnakeImage() {
        try {
            head_up = ImageIO.read(new File("C:\\Users\\Student\\IdeaProjects\\JAVA\\0\\resourcesimages\\head_up.png"));
            head_left = ImageIO.read(new File("C:\\Users\\Student\\IdeaProjects\\JAVA\\0\\resourcesimages\\head_left.png"));
            head_down = ImageIO.read(new File("C:\\Users\\Student\\IdeaProjects\\JAVA\\0\\resourcesimages\\head_down.png"));
            head_right = ImageIO.read(new File("C:\\Users\\Student\\IdeaProjects\\JAVA\\0\\resourcesimages\\head_right.png"));
//            body_up = ImageIO.read(new File("C:\\Users\\Student\\IdeaProjects\\JAVA\\0\\resourcesimages\\body_up.png"));
//            body_right = ImageIO.read(new File("C:\\Users\\Student\\IdeaProjects\\JAVA\\0\\resourcesimages\\body_right.png"));

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void getFoodImage(){
        try {
            Food = ImageIO.read(new File("C:\\Users\\Student\\IdeaProjects\\JAVA\\0\\resourcesimages\\food.png"));

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void getPoisonImage(){
        try{
            Poison = ImageIO.read(new File("C:\\Users\\Student\\IdeaProjects\\JAVA\\0\\resourcesimages\\poison.png"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

// Fotos
