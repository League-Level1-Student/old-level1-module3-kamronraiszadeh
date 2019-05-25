
package extra;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String[] args) {
		World a = new World();
		a.show();
		Bug b = new Bug();
		Location c = new Location(8, 8);
		a.add(c, b);
		Bug b2 = new Bug();
		b2.setColor(Color.blue);
		Random r = new Random();
		int x = r.nextInt(10);
		int y = r.nextInt(10);
		Location c2 = new Location(x, y);
		a.add(c2, b2);
		b.turn();
		Location c3 = new Location(8, 7);
		Location c4 = new Location(8, 9);
		Flower f = new Flower();
		a.add(c3, f);
		a.add(c4, f);
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				Location c5 = new Location(i, j);
				a.add(c5, f);
			}

		}

	}
}
