package wdef.blocks.defense;

import mindustry.world.blocks.defense.*;
import mindustry.gen.*;
import mindustry.entities.*;
import mindustry.content.*;
import arc.util.*;
import arc.audio.*;
import arc.math.*;
import wdef.blocks.*;

/** A block that explodes when tapped.
  * @author Rokade
  */
public class Bomb extends BaseBlock {
  public Bomb(String name){
    super(name);
  }
  public Effect explosionEffect = Fx.none;
  public Sound explosionSound = Sounds.wind3;
  public int explosionDamage = 100;
  public int explosionRadius = 7;
  
  public class BombBuild extends BaseBuild {
    // todo build configuration
    public void tapped(){
      kill();
    }
    
    public void onDestroyed(){
      explosionSound.at(x, y, Mathf.random(0.9f, 1.1f));
      Damage.damage(this.team, x, y, explosionRadius*8, explosionDamage);
    }
  }
}
