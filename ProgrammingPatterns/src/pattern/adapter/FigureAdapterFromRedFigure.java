package pattern.adapter;

/*public class FigureAdapterFromRedFigure extends DrawRedFigure implements DrawFigure{

	@Override
	public void drawCircle() {
		redCircle();
	}

	@Override
	public void drawSquare() {
		redSquare();
	}

}*/

public class FigureAdapterFromRedFigure implements DrawFigure{
	private DrawRedFigure redFigure = new DrawRedFigure();
	
	@Override
	public void drawCircle() {
		redFigure.redCircle();
	}

	@Override
	public void drawSquare() {
		redFigure.redSquare();
	}

}
