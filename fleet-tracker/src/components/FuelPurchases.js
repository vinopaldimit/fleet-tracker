import React, { Component } from 'react';

class FuelPurchases extends Component {

constructor (props) {
	super(props);
}


    render() {
        return (<div>
                <h3>Fuel Purchases</h3>
                {this.props.fuelPurchases.map((fuelPurchase, index) =>
                    <section key={index}>
                        <h2>{fuelPurchase.date}</h2>
                        <p>{fuelPurchase.ticketCheckNumber}</p>
                        <p>{fuelPurchase.truckNumber}</p>
                        <p>{fuelPurchase.truckStop}</p>
                    </section>
                )}
            </div>);
    }
}

export default FuelPurchases;