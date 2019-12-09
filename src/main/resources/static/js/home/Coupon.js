class Coupon {
    /*We don't have table about the coupon so the coupons' number are here : */
    coupon = [{
        "number": "1234",
        "quantity": "5"
    },
    {
        "number": "5678",
        "quantity": "10"
    }];
    constructor() { }

    /**It allows to check the coupon number**/
    verificationCoupon(numberCoupon) {
        let bool = "false";
        for (let i = 0; i < this.coupon.length; i++) {
            if (this.coupon[i].number == numberCoupon) {
                bool = "true";
                let session = sessionStorage.getItem("coupon"); //we must save coupon before validating the order so if the coupon's number exists, it's saved in the sessionStorage
                if (session == null) {
                    sessionStorage.setItem("coupon", this.coupon[i].quantity);
                } else {
                    sessionStorage.setItem("coupon", parseInt(session) + parseInt(this.coupon[i].quantity));
                }
                document.querySelector("#valueCoupon").innerHTML = 
                `<h2 style="color:green;">You can choose ${sessionStorage.getItem("coupon")} items</h2>`;
                document.querySelector("#coupon").value = "";
            }
        }
        if (bool == "false") {
            console.log("erreur");
            $("#coupon").popover("show");
        }
    }

    /**It allows to check if the order's quantity is corresponds to coupon's quantity**/
    verificationQuantity(buy) {
        let quantity = sessionStorage.getItem("coupon");
        let panier = JSON.parse(sessionStorage.getItem("panier"));
        let quan = buy;
        for (let i = 0; panier != null && i < panier.length; i++) {
            if(parseInt(panier[i].quantity) <= 0) {
                return false;
            }
            quan = parseInt(quan) + parseInt(panier[i].quantity);
        }
        if (quantity != null) {
            console.log(quan);
            return quan <= quantity;
        } else {
            return true;
        }
    }
}

let couponSession = sessionStorage.getItem("coupon");
if (couponSession != null) {
	document.querySelector("#valueCoupon").innerHTML = `<h2 style="color:green;">You can choose ${couponSession} items</h2>`;
}