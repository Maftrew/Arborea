/* ----------------------------------------------------------
 Jelmer Alphenaar 10655751 & Joseph Weel 10321624 - Assignment3
---------------------------------------------------------- */

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

class Orc extends Figure {

    Orc(Point pos){
        super(4, pos);
		type = Figure.TYPE_ORC;
		weapon = 8;
		hit = 10;       
        teamIsOrcs = true;
    }

	@Override
	void setUpStandSprites() {
		standSprites = new ArrayList<BufferedImage>(1);
		standSprites.add(ArtManager.orcImage);
	}
}