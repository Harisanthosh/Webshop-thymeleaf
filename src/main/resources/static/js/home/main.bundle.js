"use strict";

var _createClass = function () { function defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if ("value" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } } return function (Constructor, protoProps, staticProps) { if (protoProps) defineProperties(Constructor.prototype, protoProps); if (staticProps) defineProperties(Constructor, staticProps); return Constructor; }; }();

function _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError("Cannot call a class as a function"); } }

var items = [{ "name": "card",
	"description": "je suis une belle description",
	"image": "images/carte.png"
}, { "name": "pen",
	"description": "je suis une belle description",
	"image": "images/stylo.png"
}, { "name": "pencard",
	"description": "je suis une belle description",
	"image": "images/stylo.png"
}, { "name": "cardpen",
	"description": "je suis une belle description",
	"image": "images/carte.png"
}, { "name": "car",
	"description": "je suis une belle description",
	"image": "images/stylo.png"
}, { "name": "treeeeee",
	"description": "je suis une belle description",
	"image": "images/carte.png"
}, { "name": "treeee",
	"description": "je suis une belle description",
	"image": "images/carte.png"
}, { "name": "treee",
	"description": "je suis une belle description",
	"image": "images/stylo.png"
}, { "name": "chaise",
	"description": "je suis une belle description",
	"image": "images/carte.png"
}, { "name": "table",
	"description": "je suis une belle description",
	"image": "images/stylo.png"
}];

var ListItems = function () {
	function ListItems(i) {
		_classCallCheck(this, ListItems);

		this.item = i;
	}

	//Affiche la liste des items


	_createClass(ListItems, [{
		key: "renderItems",
		value: function renderItems() {
			var contenu = "";
			var i = 0;
			for (i = 0; i < this.item.length; i++) {
				contenu = contenu + ("<div class=\"card\">\n\t\t\t\t\t\t\t\t  <img src=\"" + this.item[i].image + "\" class=\"card-img-top\" alt=\"...\">\n\t\t\t\t\t\t\t\t  <div class=\"card-body\">\n\t\t\t\t\t\t\t\t\t<h5 class=\"card-title\">" + this.item[i].name + "</h5>\n\t\t\t\t\t\t\t\t\t<p class=\"card-text\">" + this.item[i].description + "</p>\n\t\t\t\t\t\t\t\t\t<button class=\"btn btn-primary learnMore\">learn more</button>\n\t\t\t\t\t\t\t\t  </div>\n\t\t\t\t\t\t\t\t </div>");
			}

			document.querySelector("#listitems").innerHTML = contenu;
			/**Learn more ... **/
			$(".learnMore").click(function (event) {
				var name = event.target.parentNode.querySelector("h5").innerHTML;
				$("#search").hide();
				viewitem.renderViewItem(name);
			});
		}
		//Affiche la liste des items en fonction du champs passé

	}, {
		key: "renderItemsSearch",
		value: function renderItemsSearch(champs) {
			var i = 0;
			var contenu = "";
			for (i = 0; i < this.item.length; i++) {
				var nom = this.item[i].name;
				if (nom.includes(champs)) {
					contenu = contenu + ("<div class=\"card\">\n\t\t\t\t\t\t\t\t\t  <img src=\"" + this.item[i].image + "\" class=\"card-img-top\" alt=\"...\">\n\t\t\t\t\t\t\t\t\t  <div class=\"card-body\">\n\t\t\t\t\t\t\t\t\t\t<h5 class=\"card-title\">" + this.item[i].name + "</h5>\n\t\t\t\t\t\t\t\t\t\t<p class=\"card-text\">" + this.item[i].description + "</p>\n\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-primary learnMore\">learn more</button>\n\t\t\t\t\t\t\t\t\t  </div>\n\t\t\t\t\t\t\t\t\t </div>");
				}
			}
			document.querySelector("#listitems").innerHTML = contenu;
			/**Learn more ... **/
			$(".learnMore").click(function (event) {
				var name = event.target.parentNode.querySelector("h5").innerHTML;
				$("#search").hide();
				viewitem.renderViewItem(name);
			});
		}
	}]);

	return ListItems;
}();

var listitem = new ListItems(items);

var ViewItem = function () {
	function ViewItem(i) {
		_classCallCheck(this, ViewItem);

		this.item = i;
	}

	_createClass(ViewItem, [{
		key: "renderViewItem",
		value: function renderViewItem(name) {
			var itemInfos = "";
			var contenu = "";
			//recherche de l'item en fonction du nom passé en param
			for (var y = 0; y < this.item.length; y++) {
				if (this.item[y].name == name) {
					itemInfos = this.item[y];
				}
			}

			contenu = " <div>\n\t\t\t<h2 class=\"nomItem\">" + itemInfos.name + "</h2>\n\t\t\t<div id=\"viewItemBloc1\">\n\t\t\t\t<img src=\"" + itemInfos.image + "\" alt=\"...\">\n\t\t\t\t<p> " + itemInfos.description + " </p>\n\t\t\t</div>\n\t\t\t<div id=\"purchase\">\n\t\t\t\t<form>\n\t\t\t\t\t<label>Quantity</label>\n\t\t\t\t\t<input id=\"quantity\" type=\"number\">\n\t\t\t\t\t<br>\n\t\t\t\t\t<label>Text</label>\n\t\t\t\t\t<input type=\"text\">\n\t\t\t\t</form>\n\t\t\t</div>\n\t\t\t<button type=\"button\" class=\"btn btn-primary btn-sm\">return</button>\n\t\t\t<button type=\"button\" class=\"btn btn-secondary btn-sm boutonAdd\">add</button></div>";
			$("#viewitem").show();
			$("#listitems").hide();
			console.log(document.querySelector("#viewitem"));
			document.querySelector("#viewitem").innerHTML = contenu;
			/**Quand on appuie sur le bouton "ADD"**/
			$(".boutonAdd").click(function (event) {
				console.log("add");
				var panier = void 0;
				if (sessionStorage.getItem("panier") == "" || sessionStorage.getItem("panier") == null) {
					panier = new Array();
				} else {
					panier = new Array(sessionStorage.getItem("panier"));
				}
				panier.push(document.querySelector(".nomItem").innerHTML);
				sessionStorage.setItem("panier", panier);
				console.log("panier : " + sessionStorage.getItem("panier"));
				listitem.renderItems();
				$.notify("achat");
			});
		}
	}]);

	return ViewItem;
}();

/* AFFICHAGE LISTE PAR DEFAULT */


listitem.renderItems();
var viewitem = new ViewItem(items);
$("#shoppingcart").hide();
$("#viewitem").hide();
console.log("panier : " + sessionStorage.getItem("panier"));

/* PERMETDE CACHER L'ICON SHOPPING CART EN MODE 
SMARTPHONE SI UTILISATEUR APPUIE SUR LE MENU */
$("#bouton-menu").click(function (event) {
	if ($("#droite").is(":hidden")) {
		$("#droite").delay(500).show("fast");
	} else {
		$("#droite").hide();
	}
});

/* PERMET D'AFFICHER LISTE ITEMS EN FONCTION RECHERCHE */
$(".form-control").on('input', function (e) {
	var valeurChampsInput = $(".form-control").val();
	if (valeurChampsInput.length == 0) {
		listitem.renderItems();
	} else {
		listitem.renderItemsSearch(valeurChampsInput);
	}
});

/**Bouton shopping cart**/
$("#droite").click(function (event) {
	/*Taille écran en dessous de 990 : remplacer main par shoppingcart*/
	if ($(window).width() <= 990) {
		if ($("#shoppingcart").is(":hidden")) {
			$("#listitems").hide();
			$("#shoppingcart").show();
		} else {
			$("#listitems").show();
			$("#shoppingcart").hide();
		}
	} else {
		$("#listitems").show();
		if ($("#shoppingcart").is(":hidden")) {
			$("#shoppingcart").show();
			var panier = sessionStorage.getItem("panier");
			var rendu = "";
			panier.forEach(function (element) {
				rendu = rendu + "<h4>" + element + "</h4>";
			});
			document.querySelector("#achats").innerHTML = rendu;
		} else {
			$("#shoppingcart").hide();
		}
	}
});

/**Bouton home, search ré initialiser**/
$(".navbar-brand").click(function (event) {
	$("#listitems").show(); //affiche la liste des items
	$("#viewitem").hide(); //supprime la vue de l'item
	$("#shoppingcart").hide(); //fermeture shopping cart
	$(".form-control").val("");
	$("#search").show();
	listitem.renderItems();
});
