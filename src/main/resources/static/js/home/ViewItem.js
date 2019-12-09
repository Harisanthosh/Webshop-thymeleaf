class ViewItem {
	constructor(i) { this.item = i; }

	/**It allows to display an item in terms of his ID**/
	static renderViewItem(listitem, id) {
		this.item = listitem;
		let itemInfos = "";
		let contenu = "";
		let y = 0;
		
		for (y = 0; y < this.item.length; y++) {		//find an item in terms of his ID
			if (this.item[y].idcategory == id) {
				itemInfos = this.item[y];
			}
		}
		contenu = `	<h5><em>${itemInfos.name}</em></h5>
					<div id="it">
						<input type="hidden" id="iditemcategorychoosen" value="${itemInfos.idcategory}">`; //this input contains the id of the categorie's item. It allows us to know which item is displaying
		contenu = contenu +
			`<input type="hidden" id="iditemchoosen" value="${itemInfos.items[0].iditem}">`+ //this input contains the id of the item. It allows us to know which item is displaying
					`<div id="viewItemBloc1">
							<div class="owl-carousel owl-theme">`;
		for (let h = 0; h < itemInfos.items[0].images.length; h++) {
			contenu = contenu +
				`<div class="item viewimg">
									<img src="${itemInfos.items[0].images[h]}">
								</div>`;
		}
		contenu = contenu +
			`</div>`;
		contenu = contenu +
			`<p> ${itemInfos.description} </p>
					</div>
				<div id="color">`;

		for (let g = 0; g < itemInfos.items.length && itemInfos.items[0].color != null; g++) { //create button to choose the color of the item
			contenu = contenu +
				`<button class="color w3-button w3-${(itemInfos.items[g].color).toLowerCase()}" type="button">${itemInfos.items[g].color}
							<input type="hidden" value="${itemInfos.items[g].iditem}">
						</button>`;
		}
		contenu = contenu + `
						</div>
					</div>
					<div id="purchase">
						<form class="w3-container">
							<p>
								<label> <b>Quantity</b></label>
								<input class="w3-input" id="quantity" type="number">
							</p>
							<p>
								<label><b>Text</b></label>
								<input class="w3-input" id="text" type="text">
							</p>
						</form>
					</div>
					<div id="viewbutton">
						<button type="button" class="btn btn-secondary btn-sm boutonAdd">add</button></div>
					</div>`;

		for (let i = 0; i < itemInfos.items.length; i++) { //this loops enables to load images in the navigation's cache
			for (let z = 0; z < itemInfos.items[i].images.length; z++) {
				let img = new Image();
				img.src = itemInfos.items[i].images[z];
			}
		}

		GestionPages.gestionPages("viewItem");
		document.querySelector("#viewitem").innerHTML = contenu;

		//It's a jquery event to start the slide show
		$(document).ready(function () {
			var owl = $('.owl-carousel');
			owl.owlCarousel({
				items: 1,
				loop: true,
				margin: 10,
				autoplay: true,
				autoplayTimeout: 2000,
				autoplayHoverPause: true,
			});
		});

		/**When we click on the button color, this jquery event changes the slide show**/
		$(".color").click(event => {
			event.preventDefault();
			let idcategoryitem = event.target.parentNode.parentNode.querySelector("#iditemcategorychoosen").value; //we get the value of the item in the first input
			let objet = "";
			let iditem = event.target.querySelector("input").value; // each color button has an item's id and when we click on it, this line gets the item's id.
			let description;
			for (let i = 0; i < this.item.length; i++) {
				if (this.item[i].idcategory == idcategoryitem) {
					for (let o = 0; o < this.item[i].items.length; o++) {
						if (this.item[i].items[o].iditem == iditem) {
							objet = this.item[i].items[o];
							description = this.item[i].description;
						}
					}
				}
			}
			document.querySelector("#iditemchoosen").value = iditem;
			let carousel = `<div class="owl-carousel owl-theme carousel">`; //update the slide show thanks to new color

			for (let h = 0; h < objet.images.length; h++) {
				carousel = carousel + `<div class="item viewimg">
											<img src="${objet.images[h]}">
										</div>`;
			}
			carousel = carousel + `</div> <p>${description}</p>`;
			document.querySelector("#viewItemBloc1").innerHTML = carousel;
			var owl = $('.owl-carousel');
			owl.owlCarousel({
				items: 1,
				loop: true,
				margin: 10,
				autoplay: true,
				autoplayTimeout: 2000,
				autoplayHoverPause: true,
			});
		});


		/**Button to put an item on the shopping cart and the sessionStorage**/
		$(".boutonAdd").click(event => {
			event.preventDefault();
			let panier = JSON.parse(sessionStorage.getItem("panier")); //get the shopping cart
			let lengthid = 0;
			if (panier == "" || panier == null || panier.length == 0) {
				panier = [];
			} else {
				panier = JSON.parse(sessionStorage.getItem("panier"));
				lengthid = panier[panier.length - 1].idbuy + 1;
			}

			//Checks data about the item
			let quanti = document.querySelector("#quantity").value;
			if (quanti != "" && parseInt(quanti) > 0 && document.querySelector("#text").value != "") {
				let iditem = document.querySelector("#iditemchoosen").value + " ";
				let buy = { //create the item's data that we are adding
					"name": itemInfos.name,
					"id": itemInfos.idcategory,
					"text": document.querySelector("#text").value,
					"idbuy": lengthid,
					"item": {
						"iditem": iditem,
						"idArtikel": itemInfos.items[iditem.charCodeAt(0) - 97].idArtikel,
						"image": itemInfos.items[iditem.charCodeAt(0) - 97].images[0],
						"color": itemInfos.items[iditem.charCodeAt(0) - 97].color
					},
					"quantity": document.querySelector("#quantity").value
				};
				panier.push(buy); //add this item in our shopping cart
				sessionStorage.setItem("panier", JSON.stringify(panier));
				GestionPages.gestionPages("home");
				ListItems.renderItems(this.item);
				Order.listAchat(this.item);
				$.notify(`${buy.name} is now in your shopping cart`, "info");
			} else {
				$.notify("Fill quantity and text", "error");
			}
		});


	}


}