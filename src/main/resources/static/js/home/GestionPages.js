class GestionPages {
    constructor() { }

    /** This function enables to manage different blocks on the HTML code (display, hide block and different effects)**/
    static gestionPages(page) {
        switch (page) {

            case "home":
                document.querySelector("#search").querySelector("input").value = "";
                $(".jumbotron").hide();
                $("#entete").hide();
                $("#orders").hide();
                $("#dashboard").hide();
                $("#viewitem").hide();
                $("#listitems").addClass("bounceInRight animated").show();
                $("#search").addClass("bounceInLeft animated").show();
                break;

            case "yourOrders":
                $(".jumbotron").hide();
                $("#entete").hide();
                $("#dashboard").hide();
                $("#sectionDashboard").hide();
                $("#listitems").hide();
                $("#viewitem").hide();
                $("#search").hide();
                $("#orders").addClass("bounceInLeft animated").show();
                $("#orders").one('webkitAnimationEnd mozAnimationEnd MSAnimationEnd oanimationend animationend', function () {
                    $(this).removeClass();
                });
                break;

            case "dashboard":
                $(".jumbotron").hide();
                $("#entete").hide();
                $("#listitems").hide();
                $("#viewitem").hide();
                $("#search").hide();
                $("#orders").hide(); //fermeture liste des commandes
                console.log("ok");
                $("#dashboard").addClass("bounceInLeft animated").show();
                $("#dashboard").one('webkitAnimationEnd mozAnimationEnd MSAnimationEnd oanimationend animationend', function () {
                    $(this).removeClass();
                });
                break;

            case "viewItem":
                $(".jumbotron").hide();
                $("#entete").hide();
                $("#listitems").hide();
                $("#dashboard").hide();
                $("#orders").hide();
                $("#search").hide();
                $("#viewitem").addClass("bounceInLeft animated").show();
                break;

            case "orderItems":
                $("#orders").addClass("bounceInLeft animated").show();
                $(".jumbotron").show();
                $("#entete").addClass("bounceInRight animated").show();
                $("#listitems").hide();
                $("#viewitem").hide();
                $("#dashboard").hide();
                break;

            case "listOrders":
                $("#orders").addClass("bounceInLeft animated").show();
                $(".jumbotron").hide();
                $("#entete").hide();
                $("#listitems").hide();
                $("#viewitem").hide();
                $("#dashboard").hide();
                break;

            case "shoppingcart":
                $("#shoppingcart").hide();
                $("#listitems").hide();
                $("#viewitem").addClass("bounceInLeft animated").show();
                $("#search").hide();
                $("#sectionOrders").hide();
                $("#sectionDashboard").hide();

                break;

            case "shoppingcartOPENcomputer":
                $("#shoppingcart").addClass("bounceInRight animated").show();;
                break;

            case "shoppingcartCLOSEcomputer":
                $("#shoppingcart").hide();
                break;

            case "shoppingcartOPENmobile":
                $("#listitems").hide();
                $("#shoppingcart").show();
                $("#search").hide();
                document.querySelector("aside").setAttribute("class", "shoppingcartMobile");
                document.querySelector("footer").setAttribute("class", "footMobile");
                break;

            case "shoppingcartCLOSEmobile":
                $("#listitems").show();
                $("#shoppingcart").hide();
                $("#search").show();
                document.querySelector("aside").removeAttribute("class", "shoppingcartMobile");
                document.querySelector("footer").removeAttribute("class", "footMobile");
                break;
        }
    }
}