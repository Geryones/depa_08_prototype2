package patterns.clone.immutable;

import java.awt.*;

public final class ImmutableLine implements Cloneable {		// muss final sein
	private final Point start, end;								//Felder müssen final und private sein

	public ImmutableLine(Point start, Point end) {
		this.start = (Point) start.clone();
		this.end = (Point) end.clone();
	}

	public Point getStartPoint() {
		return (Point) start.clone();
	}

	public ImmutableLine withStartPoint(Point start) {
		return  new ImmutableLine(start, this.end);
	}

	public Point getEndPoint() {
		return (Point) end.clone();
	}

	public ImmutableLine withEndPoint(Point end) {
		return new ImmutableLine(this.start,end);
	}

	//Clone braucht es gar nicht... da es immutable ist..

	@Override
	public String toString() {
		return String.format("Line[start=%s, end=%s]", start, end);
	}
}
