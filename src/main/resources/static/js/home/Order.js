class Order {
    constructor(i) { this.item = i; }

    /*It allows to displays the shopping cart and to update graphically elements on it */
    static listAchat(it) {
        this.item = it;
        let panier;
        if (sessionStorage.getItem("panier") == null) {
            panier = [];
        } else {
            panier = JSON.parse(sessionStorage.getItem("panier"));
        }
        let rendu = `<ul class="w3-ul">`;
        for (let i = 0; i < panier.length; i++) {
            rendu = rendu + `<li>
                                <div class="itemAchat">
                                    <img src="${panier[i].item.image}">
                                    <div>
                                        <p><b>${panier[i].name}</b> <br>
                                            (x${panier[i].quantity}) <br>
                                            ${panier[i].text}</p>
                                    </div>
                                    <input id="inputidbuy" type="hidden" value="${panier[i].idbuy}">
                                    <button type="button" class="btn btn-danger btn-sm supp">X</button>
                                </div>
                            </li>`;
        }
        rendu = rendu + "</ul>";
        document.querySelector("#achats").innerHTML = rendu;
        if (panier.length != 0) {
            //Allow to delete an item of the shopping cart
            $(".supp").click(function (event) {
                event.preventDefault();
                let idbuy = this.parentElement.querySelector("input").value; //take item's id that we are buying
                let session = JSON.parse(sessionStorage.getItem("panier"));
                console.log(session);
                for (let i = 0; i < session.length; i++) {
                    if (session[i].idbuy == idbuy) {
                        session.splice(i, 1);
                        i = session.length;
                    }
                }
                sessionStorage.setItem("panier", JSON.stringify(session));
                console.log(session);
                Order.listAchat(it);
            });
        }
    }

    /**This function displays the order's summary before validating the order**/
    static renderOrderItems(it) {
        this.item = it;
        event.preventDefault();
        GestionPages.gestionPages("shoppingcart");
        let shoppingcart = JSON.parse(sessionStorage.getItem("panier"));
        let contenu = `<div id="listorders">
        <div id="summary">`;
        for (let i = 0; i < shoppingcart.length; i++) {
            contenu = contenu + `<div class="orderItem">
                                    <h2>${shoppingcart[i].name}</h2>
                                    <div>
                                        <img src="${shoppingcart[i].item.image}">
                                        <div>
                                            <form class="w3-container it">
                                                <p>
                                                    <label> 
                                                        <b> Quantity </b> 
                                                    </label>
                                                    <input type="hidden", value="${shoppingcart[i].idbuy}"/> 
                                                    <input class="w3-input quantity" type="number" value="${shoppingcart[i].quantity}" min="1"/>
                                                </p>
                                                <p>
                                                    <label> 
                                                        <b> Text </b> 
                                                    </label> 
                                                    <input class="w3-input" type="text" readonly="readonly" value="${shoppingcart[i].text}"/>
                                                </p>
                                            </form>
                                        </div>
                                        <div>
                                            <form class="w3-container">
                                                <p>
                                                    <label>
                                                        <b> Color </b> 
                                                    </label> 
                                                    <input class="w3-input" type="text" readonly="readonly" value="${shoppingcart[i].item.color}"/>
                                                </p>
                                            </form>
                                        </div>
                                    </div>
                                </div>`;
        }

        contenu = contenu + `</div>
                                <div>
                                <form id="buybutton">
                                <div class="form-row">
                                  <div class="form-group col-md-6">
                                    <label for="inputEmail4">Email</label>
                                    <input type="email" class="form-control" id="inputEmail4" placeholder="Email" required>
                                  </div>
                                  <div class="form-group col-md-6">
                                    <label for="inputName4">Name</label>
                                    <input type="text" class="form-control" id="inputName4" placeholder="Name" required>
                                  </div>
                                </div>
                                <div class="form-group">
                                  <label for="inputAddress">Address</label>
                                  <input type="text" class="form-control" id="inputAddress" placeholder="1234 Main St" required>
                                </div>
                                <div class="form-group">
                                  <label for="inputAddress2">Address 2</label>
                                  <input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor">
                                </div>
                                <div class="form-row">
                                  <div class="form-group col-md-6">
                                    <label for="inputCity">City</label>
                                    <input type="text" class="form-control" id="inputCity" required>
                                  </div>
                                  <div class="form-group col-md-4">
                                    <label for="inputState">State</label>
                                    <input type="text" class="form-control" id="inputCountry" required>
                                  </div>
                                  <div class="form-group col-md-2">
                                    <label for="inputNumberPhone">Number phone</label>
                                    <input type="text" class="form-control" id="inputNumberPhone">
                                  </div>
                                </div>
                                <button type="submit" class="btn btn-success float-right">Validate</button>
                              </form>
                                </div> `;
        contenu = contenu + `</div>`;

        GestionPages.gestionPages("orderItems");
        document.querySelector("#orders").innerHTML = contenu;

        //When you enter coupon number, this jquery event is called
        $(document).keyup(function (e) {
            $("#coupon").popover("hide");
            if ($("#coupon").is(":focus") && (e.keyCode == 13)) {
                let numberCoupon = document.querySelector("#coupon").value;
                (new Coupon()).verificationCoupon(numberCoupon);
            }
        });

        //When you change the quantity, this jquery event is called
        $(".quantity").change(function () {
            let newQuantity = this.parentNode.querySelector(".quantity").value;
            let idbuy = this.parentElement.querySelector("input").value; //take id of the item which is changed
            let panier = JSON.parse(sessionStorage.getItem("panier"));
            for (let i = 0; i < panier.length; i++) {
                if (panier[i].idbuy == idbuy) {
                    panier[i].quantity = newQuantity;
                }
            }
            sessionStorage.setItem("panier", JSON.stringify(panier));
            Order.listAchat(this.item);

        });

        /**This function allows to put the artikels in the database after validating the order**/
        async function postOrder(name) {
            let shopcart = JSON.parse(sessionStorage.getItem("panier"));
            let data = [];
            console.log(shopcart);
            for (let i = 0; i < shopcart.length; i++) {
                let FETCHlength = await fetch("http://localhost:9091/api/artikel/lastIDorder"); //get the last ID of the table artikel which is located on the file 'mon-fichier.txt' 
                let JSONlength = await FETCHlength.text();
                let artikel = {
                    "artId": parseInt(JSONlength),
                    "artPpIdArtikelart": 11273,
                    "artPpIdArtikelgrp": 15170,
                    "artMdId": 1,
                    "artPeId": 1,
                    "artNr": `${JSONlength}_${shopcart[i].name}`,
                    "artNrRef": `${JSONlength}_${shopcart[i].item.idArtikel}`,
                    "artLfdNr": 1,
                    "artBeschreibung": shopcart[i].text,
                    "artBeschreibung2": shopcart[i].quantity,
                    "artMatchcode": null,
                    "artOptLosgroesse": 0,
                    "artIxFaktor": 2,
                    "artMindestbestand": 0,
                    "artZeichnungsnr": null,
                    "artDoCopy": false,
                    "artAutoFreigabe": false,
                    "artKommentar": null,
                    "artAlternative": null,
                    "artSnStartvalue": null,
                    "artYield": null,
                    "artQuelle": "PPS",
                    "artUsercreated": `${name} *OS/DB:oracle/TFWE`,
                    "artDatecreated": "09:39:50",
                    "artUserchanged": `${name} *OS/DB:oracle/TFWEB`,
                    "artDatechanged": "09:40:05",
                    "artEancode": null,
                    "artOptLosgroesse2": 0,
                    "artInactive": false,
                    "artBeschaffungszeit": 0,
                    "artLangtext": null,
                    "artNrExtern": null,
                    "artRegexp": null,
                    "artHinweistext": null,
                    "artUrsprungsland": null,
                    "artAutoEinst": false,
                    "artBulktracking": false,
                    "artItar": false,
                    "artVollstSntrackingLager": false,
                    "artInventarpflichtig": false
                };
                fetch('http://localhost:9091/api/artikel', {
                    method: 'POST',
                    headers: {
                        "Accept": "application/json, text/plain, */*",
                        "Content-Type": "application/json;charset=utf-8"
                    },
                    body: JSON.stringify(artikel)
                });
            }
            sessionStorage.removeItem("panier");
            sessionStorage.removeItem("coupon");
            document.querySelector("#valueCoupon").innerHTML = "";
            GestionPages.gestionPages("home");
            ListItems.renderItems(it);
        }

        //When customer clikcs on the button "buy", this event is called
        $("#buybutton").submit(event => {
            event.preventDefault();
            if (sessionStorage.getItem("coupon") == null) {
                $.notify("Enter coupon number", "error");
            } else {
                if ((new Coupon()).verificationQuantity(0)) {
                    let emailDest = document.querySelector("#inputEmail4").value;
                    let email = new VerifEmail();
                    email.sendCommand(emailDest);
                    let name = document.querySelector("#inputName4").value;
                    postOrder(name);
                    $.notify("Order made", "success");
                } else {
                    $.notify("quantity", "error");
                }
            }
        });
    }

    /* This function displays different orders in terms of order's number that customer enters */
    static renderListOrders() {
        GestionPages.gestionPages("yourOrders");
        let contenu = `<form id="nbOrder">
                                <div class="form-group">
                                     <label for="nbOrder">Order number</label>
                                     <input type="text" class="form-control" id="nbOrderInput" aria-describedby="number help" placeholder="Enter order number" data-toggle="popover" data-content="Error number order" required>
                                </div>
                                <button type="submit" class="btn btn-primary">Submit</button>
                            </form>`;
        document.querySelector("#orders").innerHTML = contenu;

        //when customer clikcs on the button "submit"
        $("#nbOrder").submit(event => {
            event.preventDefault();
            let valOrder = document.querySelector("#nbOrderInput").value;
            fetch(`http://localhost:9091/api/chargen/${valOrder}`).then((reponse) => {
                if (reponse.ok) {
                    window.location.replace(`http://localhost:9091/command/${valOrder}`);
                } else {
                    $("#nbOrderInput").popover("show");
                    throw new Error("connection problem");
                }
            });
        }
        );
    }
}

//Button to close the shopping cart located on this one
$("#closeShoppingCart").click(event => {
    GestionPages.gestionPages("shoppingcartCLOSEcomputer");
});
