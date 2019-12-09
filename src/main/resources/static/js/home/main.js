main();

async function main() {
	let items = await recupItems();
	console.log(items);
	/* When customer arrives on the website, these functions are called */
	GestionPages.gestionPages("home");
	ListItems.renderItems(items);

	/* allows to hide shoppin cart icon for smartphone */
	$("#bouton-menu").click(event => {
		if ($("#droite").is(":hidden")) {
			$("#droite").delay(500).show("fast");
		} else {
			$("#droite").hide();
		}
	});

	/* allows to display list of items on the home page if customer enters the text in the search bar */
	$("#searchbarre").on('input', e => {
		let valeurChampsInput = $("#searchbarre").val();
		if (valeurChampsInput.length == 0) {
			ListItems.renderItems(items);
		} else {
			ListItems.renderItemsSearch(valeurChampsInput, items);
		}
	});

	/**Open and close the shopping cart**/
	$("#droite").click(event => {
		if ($("#shoppingcart").is(":hidden")) {
			GestionPages.gestionPages("shoppingcartOPENcomputer");
			Order.listAchat(items);
		} else {
			GestionPages.gestionPages("shoppingcartCLOSEcomputer");
		}
	});

	/**Bouton home in the header**/
	$(".home").click(event => {
		GestionPages.gestionPages("home");
		ListItems.renderItems(items);
	});

	/*Bouton buy which is located in the shopping cart*/
	$("#buy").click(event => {
		if (sessionStorage.getItem("panier") != null && JSON.parse(sessionStorage.getItem("panier")).length > 0) {
			Order.renderOrderItems(items);
		}
	});

	$(".nav-yourorders").click(event => {
		event.preventDefault();
		Order.renderListOrders(items);
	});

	$(".nav-productiondashboard").click(event => {
		event.preventDefault();
		Dashboard.renderGlobalView(items);
	});

	/**LINKS FOOTER**/
	$("#footerHome").click(event => {
		event.preventDefault();
		GestionPages.gestionPages("home");
		ListItems.renderItems(items);
	});

	$("#footerOrders").click(event => {
		event.preventDefault();
		Order.renderListOrders(items);
	});

	$("#footerDashboard").click(event => {
		event.preventDefault();
		GestionPages.gestionPages("dashboard");
		Dashboard.renderGlobalView();
	});

	$("#FooterStateOrders").click(event => {
		event.preventDefault();
		GestionPages.gestionPages("dashboard");
		Dashboard.renderStateOrders();
	});

	$("#FooterStateMachines").click(event => {
		event.preventDefault();
		GestionPages.gestionPages("dashboard");
		Dashboard.renderStateMachines();
	});

	$("#FooterStatistics").click(event => {
		event.preventDefault();
		GestionPages.gestionPages("dashboard");
		Dashboard.renderStatistics();
	});
}