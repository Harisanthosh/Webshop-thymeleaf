class Dashboard {
    constructor() {}

    /**This function permits to display the global view of the production dashboard (3 tabs)**/
    static renderGlobalView() {
        GestionPages.gestionPages("dashboard");
        let contenu = `
        <h5><em>Production Dashboard</em></h5>
        <div id="dash">
                            <div id="stateorders">
                                <p>State of orders</p>
                            </div>

                            <div id="statemachines">
                                <p>State of Machines</p>
                            </div>

                            <div id="statistics">
                                <p>Statistics</p>
                            </div>
                        </div>`;
        document.querySelector("#dashboard").innerHTML = contenu;

        //Display page "state of orders"
        $("#stateorders").click(event => {
            event.preventDefault();
            GestionPages.gestionPages("dashboard");
            Dashboard.renderStateOrders();
        });

        //Display page "state of machines"
        $("#statemachines").click(event => {
            event.preventDefault();
            GestionPages.gestionPages("dashboard");
            Dashboard.renderStateMachines();
        });

        //Display page "statistics"
        $("#statistics").click(event => {
            event.preventDefault();
            GestionPages.gestionPages("dashboard");
            Dashboard.renderStatistics();
        });
    }

    /**function page State of orders */
    static renderStateOrders() {
        let contenu = `
        <div id="return" style="display: flex; flex-direction:row; height: 25px; align-items: center; margin-right: 5px;">
            <button type="text" class="btn btn-outline-secondary" style="border-radius: 100%;">⬅</button>
            <h5><em>State of Orders</em></h5>
        </div>
        <div id="dash">
            </div>
        </div>`;
        document.querySelector("#dashboard").innerHTML = contenu;

        $("#return").click(event => {
            event.preventDefault();
            Dashboard.renderGlobalView();
        });
    }

    /**function page State of machines */
    static renderStateMachines() {
        let contenu = `
        <div id="return" style="display: flex; flex-direction:row; height: 25px; align-items: center; margin-right: 5px;">
            <button type="text" class="btn btn-outline-secondary" style="border-radius: 100%;">⬅</button>
            <h5><em>State of Machines</em></h5>
        </div>
        <div id="dash">
            </div>
        </div>`;
        document.querySelector("#dashboard").innerHTML = contenu;

        $("#return").click(event => {
            event.preventDefault();
            Dashboard.renderGlobalView();
        });
    }

    /**function page statistics */
    static renderStatistics() {
        let contenu = `
        <div id="return" style="display: flex; flex-direction:row; height: 25px; align-items: center; margin-right: 5px;">
            <button type="text" class="btn btn-outline-secondary" style="border-radius: 100%;">⬅</button>
            <h5><em>Statistics</em></h5>
        </div>
        <div id="dash">
        </div>
        </div>`;
        document.querySelector("#dashboard").innerHTML = contenu;

        $("#return").click(event => {
            event.preventDefault();
            Dashboard.renderGlobalView();
        });
    }

}

