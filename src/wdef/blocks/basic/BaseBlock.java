package wdef.blocks.basic;

import mindustry.world.*;
import mindustry.world.meta.*;
import mindustry.gen.*;
/** A block that does nothing. 
 * @author Rokade
 */
public class BaseBlock extends Block {
  public BaseBlock(String name){
    super(name);
    solid = destructible = true;
    canOverdrive = drawDisabled = false;
    envEnabled = Env.any;
  }
  public class BaseBuild extends Building {
    
  }
}
