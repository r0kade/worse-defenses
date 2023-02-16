package wdef.blocks.basic;

import mindustry.world.*;
import mindustry.gen.*;
/** A block that does nothing. */
public class BaseBlock extends Block {
  public BaseBlock(String name){
    super(name);
    solid = destructible = true;
  }
  
  public class BaseBlockBuild extends Building {
    
  }
}