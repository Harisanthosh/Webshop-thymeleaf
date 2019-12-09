
/** This variable contains a table and in this table, there are ITEM ID that customers can buy**/
let idArtikel = new Array(
    ['54022', '54042', '54043'],
    ['54002']);

/** This function allows to get items that customers can buy on the website */
async function recupItems() {
    let all = [];
    for (let category = 0; category < idArtikel.length; category++) { //loop for the category of the items
        let infoCat = []; //information for the category
        let infoItems = []; //infrmation for the items
        for (let item = 0; item < idArtikel[category].length; item++) { //loop for the item of each category
            const reponseFetch = await fetch(`http://localhost:9091/api/artikel/${idArtikel[category][item]}`);
            const res = await reponseFetch.json();
            let color2 = (res.artNr).split("_");
            let color = color2[color2.length-1];
            infoItems.push({
                "iditem": `${String.fromCharCode(97 + item)}`,
                "idArtikel": res.artId,
                "color": color,
                "images": [`images/${res.artNr}_0.png`, `images/${res.artNr}_1.png`]
            });
            if (item == idArtikel[category].length - 1) { //we take information of the last item of the category
                infoCat = {
                    "name": `${res.artNr}`,
                    "idcategory": `${category + 1}`,
                    "description": res.artBeschreibung,
                    "image": `${infoItems[0].images[0]}`,
                    "items": infoItems
                };
                all.push(infoCat);
            }
        }
    }
    return all;
}
