package com.gleejet.sun.utils.loader;

import com.badlogic.gdx.utils.*;
import com.gleejet.sun.roles.*;

public class ArrayEnemy
{
    Array<BaseEnemy> arrBuildEnemy;
    Array<Array<BaseEnemy>> arrMoveEnemy;
    
    public ArrayEnemy() {
        this.arrMoveEnemy = new Array<Array<BaseEnemy>>();
        this.arrBuildEnemy = new Array<BaseEnemy>();
    }
}
