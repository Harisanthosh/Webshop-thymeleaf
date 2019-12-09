let nbOrder = window.location.href.substring(window.location.href.lastIndexOf("/") + 1);

order();

async function order() {
    const FETCHartikels = await fetch(`http://localhost:9091/api/artikel?chargenIds=${nbOrder}`);
    const artikel = await FETCHartikels.json();
    const FETCHarbeitsschritte = await fetch(`http://localhost:9091/api/arbeitsschritte?chargenIds=${nbOrder}`);
    const arbeitsschritte = await FETCHarbeitsschritte.json();
    const FETCHchargen = await fetch(`http://localhost:9091/api/chargen/${nbOrder}`);
    const chargen = await FETCHchargen.json();

    let text = [];
    let quantity = [];
    let nameItems = [];
    let stateOrder;

    for (let i = 0; i < artikel.length; i++) {
        text.push(`${artikel[i].artBeschreibung}`);
        quantity.push(`${artikel[i].artLfdNr}`);
        nameItems.push(`${artikel[i].artNr}`)
    }

    if (chargen.chPpIdLosstatus == "474") {
        stateOrder = "finished";
    } else if (chargen.chPpIdLosstatus == "422") {
        stateOrder = "Not begun";
    } else {
        stateOrder = "In progress";
    }

    let order = `<div id="headerCommand">
                     <h3>Order's number : ${nbOrder} <span class="badge badge-secondary">${stateOrder}</span></h3>
                     <hr class="hrCommand" style="border:1px solid gray;">
                     <div id="grouporderCommand">`;
    for (let y = 0; y < text.length; y++) {
        order = order + 
                          `<div class="orderCommand">
                                <h6>${nameItems[y]}</h6>
                                <img src="../images/interrogation.jpg">
                                <p>(x${quantity[y]})</p>
                                <p>${text[y]}</p>
                           </div>`;
    }
    order = order + `</div>
                </div>
               <hr class="hrCommand" style="border:1px solid gray;">
               <div class="step">
                    <div class="date">
                          <p style="font-weight:bold;text-align:center;">Date</p>
                    </div>
                    <p style="font-weight:bold;text-align:center;"> Instructions </p>
                    <p style="font-weight:bold;text-align:center;"> State </p>
                </div>
                <hr class="hrCommand">`;
                    
    for (let i = 0; i < arbeitsschritte.length; i++) {
        order = order +
              `<div class="step"> 
                   <div class="date">`;
        if (arbeitsschritte[i].asDatAbmeldung != null || arbeitsschritte.asDatAnmeldung != null) {
            order = order + 
                       `<p>Begin  : ${(arbeitsschritte[i].asDatAnmeldung).split("T")[0]} ${(arbeitsschritte[i].asDatAnmeldung).split("T")[1].split(".")[0]}</p>
                        <p>Finish : ${(arbeitsschritte[i].asDatAbmeldung).split("T")[0]} ${(arbeitsschritte[i].asDatAbmeldung).split("T")[1].split(".")[0]}</p>`;
        } else {
            order = order + 
                       `<p>Begin  : Not specified</p>
                        <p>Finish : Not specified</p>`;
        }
        order = order + 
                   `</div>
   ${arbeitsschritte[i].asAnweisung} `;
        if (arbeitsschritte[i].asGefertigt == true) {
            order = order + 
                   `<img src="../images/true.png" alt="DONE" > `;
        } else {
            order = order + 
                   `<img src="../images/false.png" alt="DO" > `;
        }
        order = order +
                `</div> 
                 <hr>`;
    }
    document.querySelector(".center .container .column").innerHTML = order;
}

$(".home").click(event => {
    window.location.replace("http://localhost:9091");
});