package pattern.adapter;

public class Main {

	public static void main(String[] args) {
		DrawFigure figure = new FigureAdapterFromRedFigure();
		figure.drawCircle();
		figure.drawSquare();
	}
}
