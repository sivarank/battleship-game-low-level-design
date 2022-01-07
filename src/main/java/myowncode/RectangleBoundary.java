package myowncode;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class RectangleBoundary implements IBoundary{
	private LocationCoordinate topLeft;
	private LocationCoordinate rightBottom;
	
	@Override
	public boolean contains(@NonNull LocationCoordinate loc) {
		return topLeft.getX() <= loc.getX() && rightBottom.getX()>= loc.getX() 
				&& topLeft.getY() >= loc.getY() && rightBottom.getY()<=loc.getY();
		
	}

	@Override
	public List<LocationCoordinate> getAllCoordinates() {
		// TODO Auto-generated method stub
		return null;
	}

}
