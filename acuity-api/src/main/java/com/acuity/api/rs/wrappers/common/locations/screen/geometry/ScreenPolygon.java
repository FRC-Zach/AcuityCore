package com.acuity.api.rs.wrappers.common.locations.screen.geometry;

import com.acuity.api.rs.utils.Random;
import com.acuity.api.rs.wrappers.common.locations.screen.ScreenLocation;

import java.awt.*;
import java.util.Collection;

/**
 * Created by Zachary Herridge on 7/10/2017.
 */
public class ScreenPolygon {

    private ScreenLocation[] locations;
    private Polygon polygon;

    public ScreenPolygon(ScreenLocation... locations) {
        this.locations = locations;
    }

    public ScreenPolygon(Collection<ScreenLocation> locations) {
        this.locations = locations.toArray(new ScreenLocation[locations.size()]);
    }

    public ScreenLocation[] getLocations() {
        return locations;
    }

    public ScreenLocation randomLocation(){
        return Random.nextLocation(this);
    }

    public Polygon toPolygon(){
        if (polygon == null){
            polygon = new Polygon();
            for (ScreenLocation location : locations) {
                polygon.addPoint(location.getX(), location.getY());
            }
        }
        return polygon;
    }

    public ScreenRectangle getBounds(){
        Rectangle bounds = toPolygon().getBounds();
        return new ScreenRectangle(bounds.x, bounds.y, bounds.width, bounds.height);
    }

    public boolean contains(ScreenLocation location){
        return contains(location.getX(), location.getY());
    }

    public boolean contains(int x, int y) {
        return toPolygon().contains(x, y);
    }

    public double size() {
        if (locations.length <= 2) return 0;

        // TODO: 11/25/2017 Make better
        return getBounds().size();
    }
}
