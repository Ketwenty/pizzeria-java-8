package fr.pizzeria.service;

/**
 * @author ETY0006
 *
 */
public class ServicePizzaFactory {
	
	/**
	 * Génère les instances de service
	 * @param choix
	 * @return
	 */
	public static ServicePizzaMenu getService(int choix) {
		switch (choix) {
		case 1: // list
			return new ServicePizzaLister();
		case 2: // add
			return new ServicePizzaAjouter();
		case 3: // modifier
			return new ServicePizzaModifier();
		case 4: // supprimer
			return new ServicePizzaSupprimer();
		case 5: // ajouter la liste de pizza dans la base
			return new InflateDataPizzaService();
		case 6:
			return new DeleteAllPizzasService();
		default:
			return null;
		}
	}
}
