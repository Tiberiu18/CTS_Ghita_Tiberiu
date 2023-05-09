package state.clase;

public class StareLibera implements Stare {

	@Override
	public void schimbareStare(Masa masa) {
		if (!(masa.getStare() instanceof StareLibera)) {
			masa.setStare(this);
			System.out.println("Masa " + masa.getNr() + " este libera");
		} else {
			System.out.println("Masa este deja libera");
		}

	}

}
