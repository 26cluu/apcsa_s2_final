package src.playerStats;

import java.util.concurrent.TimeUnit;
import java.util.ArrayList;

import src.Items.Item;

public class Stats {
    //attributes
    private int awakeLevel = 10;
    private ArrayList<Item> hotbar = new ArrayList<Item>();
    private int x = 0;
    private int y = 0;
    private boolean silent = false;
    private boolean cookie = false;
    private int roomsVisited = 0;
    private int lettersFound = 0;

    //setters
    public void setCookie(boolean cookie) {
        this.cookie = cookie;
    }

    public void setAwakeLevel(int awakeLevel) {
        this.awakeLevel = awakeLevel;
    }

    public void setHotbar(ArrayList<Item> hotbar) {
        this.hotbar = hotbar;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setSilent(boolean silent) {
        this.silent = silent;
    }

    public void setRoomsVisited(int roomsVisited) {
        this.roomsVisited = roomsVisited;
    }

    public void setLettersFound(int lettersFound) {
        this.lettersFound = lettersFound;
    }


    //getters
    public int getAwakeLevel() {
        return awakeLevel;
    }

    public ArrayList<Item> getHotbar() {
        return hotbar;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isSilent() {
        return silent;
    }

    public boolean getCookie() {
        return cookie;
    }

    public int getRoomsVisited() {
        return roomsVisited;
    }

    public int getLettersFound() {
        return lettersFound;
    }

    // //loops through hotbar and displays each item
    // public void displayHotBar() throws InterruptedException {
    //     for (int i = 0; i < hotbar.length; i++) {
    //         if (hotbar[i] == null){

    //             // printing 
    //             String isEmptyPrint = i + ": " + "empty\n";

    //             for (int count=0; count < isEmptyPrint.length(); count++){
    //                 System.out.print(isEmptyPrint.charAt(count));
    //                 TimeUnit.MILLISECONDS.sleep(40);
    //             }

                
    //         } else {

    //             // printing
    //             String isItemPrint = i + ": " + hotbar[i].getName() + "\n";

    //             for (int count=0; count < isItemPrint.length(); count++){
    //                 System.out.print(isItemPrint.charAt(count));
    //                 TimeUnit.MILLISECONDS.sleep(40);
    //             }
    //         }

            
    //     }
    // }


    public void displayHotBar() throws InterruptedException {
        for (int i = 0; i < hotbar.size(); i++) {
            //print
            String isItemPrint = i + ": " + hotbar.get(i).getName() + "\n";

            slowPrint(isItemPrint);
        }

        if (hotbar.size() == 0) {
            String message = "sorry, there's currently no items in your hotbar";
            slowPrint(message);
        }
    }

    //puts item in current slop
    // public void swapHotbar(int x, Item item) {
    //     hotbar[x] = item;
    // }

    public void slowPrint(String string) throws InterruptedException {
        for (int count = 0; count < string.length(); count++) {
            System.out.print(string.charAt(count));
            TimeUnit.MILLISECONDS.sleep(40);
        }
        clearScreen();
    }

    public void addItemHotbar( Item item) {
        hotbar.add(item);
    }

    public void removeItemHotbar(int index) {
        hotbar.remove(index);
    }

    //  METHOD THAT CLEARS CONSOLE
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    } 
    
    
    //gives some stats about the game
    public String endMessage() {
        return "You ended up visiting " + roomsVisited + " rooms " + "and you ended up reading " + lettersFound + " letters written for you from little kids";
    }
}
