package ie.tudublin;

import java.util.ArrayList;

import processing.data.Table;

import processing.data.TableRow;


public class Star {

    ArrayList<Star> stars = new ArrayList<Star>();

    private boolean hab;
    private String displayName;
    private float distance;
    private float xG;
    private float yG;
    private float zG;
    private float absMsg;

    
    public Star(boolean hab, String displayName, float distance, float xG, float yG, float zG, float absMsg){
        this.hab = hab;
        this.displayName = displayName;
        this.xG = xG;
        this.yG = yG;
        this.zG = zG;
        this.absMsg = absMsg;
    }

    public Star(TableRow tr){
        this(
            tr.getInt("Hab?") == 1, 
 			tr.getString("Display Name"), 
 			tr.getFloat("Distance"),
 			tr.getFloat("Xg"),
 			tr.getFloat("Yg"),
 			tr.getFloat("Zg"),
 			tr.getFloat("AbsMag")

        );
    }

    public void loadStars()
    {
        Table table = loadTable("HabHYG15ly.csv", "header");
        for(TableRow r:table.rows())
        {
            Star s = new Star(r);
            stars.add(s);
        }
    }

    public Table loadTable(String fileName, String
    header){

        Table table;

        table = new Table();
        table.addColumn("Hab?");
        table.addColumn("Display Name");
        table.addColumn("Distance");
        table.addColumn("Xg");
        table.addColumn("Yg");
        table.addColumn("Zg");
        table.addColumn("AbsMag");

        return table;

    }



}
