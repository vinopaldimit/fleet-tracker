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
                        <h2>Purchase Date: {fuelPurchase.date}</h2>
                        <p>Ticket Check Number: {fuelPurchase.ticketCheckNumber}</p>
                        <p>Truck Number: {fuelPurchase.truckNumber}</p>
                        <p>Truck Stop: {fuelPurchase.truckStop}</p>
                    </section>
                )}
            </div>);
    }
}

export default FuelPurchases;