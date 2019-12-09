class ListItems {
	constructor(i) { this.item = i; }

	/** This function displays the list of the item on the home page**/
	static renderItems(it) {
		this.item = it;
		let contenu = "";
		let i = 0;
		for (i = 0; i < this.item.length; i++) {
			if (i % 3 == 0) {
				contenu = contenu + `<br style="display:block;">`;
			}
			contenu = contenu + ` <div class="col-md-4">
									<div class="card mb-4 shadow-sm">
									<img src="${this.item[i].image}" class="card-img-top" alt="...">
										<div class="card-body">
										     <input class="inputcard" type="hidden" value="${this.item[i].idcategory}">
										     <h5 class="card-title">${this.item[i].name}</h5>
										     <p class="card-text">${this.item[i].description}</p>
										     <div class="d-flex justify-content-between align-items-center">
											     <div class="btn-group">
											          <button type="button" class="btn btn-sm btn-outline-secondary learnMore">View</button>
												 </div>`;
			for (let g = 0; g < this.item[i].items.length && this.item[i].items[0].color != null; g++) {
				contenu = contenu +
					`<button class="color w3-button w3-${(this.item[i].items[g].color).toLowerCase()} w3-round-xxlarge" type="button">
						<input type="hidden" value="${this.item[i].items[g].iditem}">
					</button>`;
			}
			contenu = contenu + `</div>
										</div>
									</div>
									</div>`;
		}
		document.querySelector("#listitems").innerHTML = contenu;

		/**This jQuery allows to view more about one item**/
		$(".learnMore").click(event => { 
			let name = event.target.parentNode.parentNode.parentNode.parentNode.querySelector(".inputcard").value;
			ViewItem.renderViewItem(this.item, name);
		});

		/**Change the color of the item (picture)**/
		$(".color").click(event => {
			let color = event.target.querySelector("input").value;
			let idcategory = event.target.parentElement.parentElement.querySelector("input").value;
			for (let g = 0; g < this.item[idcategory - 1].items.length; g++) {
				if (color == this.item[idcategory - 1].items[g].iditem) {
					event.target.parentElement.parentElement.parentElement.querySelector("img").setAttribute("src", this.item[idcategory - 1].items[g].images[0]);
				}
			}
		});
	}
	/** This function displays the list of the item on the home page in terms of the text enter on the input (search bar)**/
	static renderItemsSearch(champs, it) {
		this.item = it;
		let i = 0;
		let contenu = "";
		for (i = 0; i < this.item.length; i++) {
			let nom = this.item[i].name;
			if (nom.includes(champs)) {
				contenu = contenu + `<div class="col-md-4">
									<div class="card mb-4 shadow-sm">
									<img src="${this.item[i].image}" class="card-img-top" alt="...">
										<div class="card-body">
										<input class="inputcard" type="hidden" value="${this.item[i].idcategory}">
										<h5 class="card-title">${this.item[i].name}</h5>
										<p class="card-text">${this.item[i].description}</p>
										<div class="d-flex justify-content-between align-items-center">
											<div class="btn-group">
											<button type="button" class="btn btn-sm btn-outline-secondary learnMore">View</button>
											</div>`;
				for (let g = 0; g < this.item[i].items.length && this.item[i].items[0].color != null; g++) {
					contenu = contenu +
						`<button class="color w3-button w3-${(this.item[i].items[g].color).toLowerCase()} w3-round-xxlarge" type="button">
														<input type="hidden" value="${this.item[i].items[g].iditem}">
													</button>`;
				}
				contenu = contenu + `</div >
										</div >
									</div >
									</div > ` ;
			}
		}
		document.querySelector("#listitems").innerHTML = contenu;

		$(".learnMore").click(event => { 
			let name = event.target.parentNode.parentNode.parentNode.parentNode.querySelector(".inputcard").value;
			ViewItem.renderViewItem(this.item, name);
		});

		$(".color").click(event => {
			let color = event.target.querySelector("input").value;
			let idcategory = event.target.parentElement.parentElement.querySelector("input").value;
			for(let g = 0; g<this.item[idcategory-1].items.length; g++) {
				if(color == this.item[idcategory-1].items[g].iditem) {
					event.target.parentElement.parentElement.parentElement.querySelector("img").setAttribute("src", this.item[idcategory-1].items[g].images[0]);
				}
			}
		});
	}

}