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
                        <p>{fuelPurchase.city}</p>
                        <p>{fuelPurchase.state}</p>
                        <p>{fuelPurchase.gallonsQty}</p>
                        <p>{fuelPurchase.gallonsCost}</p>
                        <p>{fuelPurchase.authChgbkArrears}</p>
                        <p>{fuelPurchase.authChgbkRefund}</p>
                        <p>{fuelPurchase.authChgbkNetAmt}</p>
                        <p>{fuelPurchase.repairMiscAmount}</p>
                        <p>{fuelPurchase.truckNumber}</p>
                    </section>
                )}
            </div>);
    }
}

export default FuelPurchases;