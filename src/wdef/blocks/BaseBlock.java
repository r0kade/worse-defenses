package wdef.blocks;

import mindustry.world.*;
import mindustry.gen.*;
/** A block that does nothing. */
public class BaseBlock extends Block {
  public BaseBlock(String name){
    super(name);
    solid = destructible = update = sync = true;
  }
  
  public class BaseBuild extends Building {
    
  }
}
