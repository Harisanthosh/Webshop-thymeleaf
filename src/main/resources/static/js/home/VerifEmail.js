class VerifEmail {
    constuctor() { }

    ValidateEmail(email) {
        var re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
        return re.test(email);
    }

    /**It enables to send an email to the customer after validating the order **/
    sendCommand(emailDest, numberCommand) {
        let panier = JSON.parse(sessionStorage.getItem("panier"));
        numberCommand = Math.floor(Math.random() * (999999 - 999)) + 999; //Number of the order. Here, it's an random number because we don't have the link between here and the database
        let imageQRCODE = qrcode(4, 'L');
        imageQRCODE.addData(`localhost:9091/command/${numberCommand}`);
        imageQRCODE.make();
        let baliseIMG = imageQRCODE.createDataURL(10, 10);
        let body = `<h1>Summary of your order n°${numberCommand}</h1>
                    <br />`;
        for(let i = 0; i<panier.length; i++) {
            body = body + 
           `<p>Item : ${panier[i].name}</p>
            <p>Color : ${panier[i].item.color}</p>
            <p>text : ${panier[i].text}</p>
            <p>Quantity : ${panier[i].quantity}</p>
            <br />`;
        }

       //email of the project (email : akzemden@gmail.com password: akzproject)
       //name : create name of the image in the email
       //new token: c681cfc4-2cee-46ca-800b-590caf7f4d8f 
       //old token: 7df6a238-0e33-46df-9041-f9a424028c58
        Email.send({
            SecureToken : "7df6a238-0e33-46df-9041-f9a424028c58",
            To : `${emailDest}`,
            From : "akzemden@gmail.com",
            Subject : `Your order n°${numberCommand}`,
            Body : `${body}`,
            Attachments : [
                {
                    name : "qrcode.gif", 
                    data : `${baliseIMG}`
                }
            ]
        });
    }
}
