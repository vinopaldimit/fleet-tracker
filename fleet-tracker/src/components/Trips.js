import React, { Component } from 'react';

class Trips extends Component {

constructor (props) {
    super(props);
}


    render() {
        return (<div>
                <h3>Trips</h3>
                {this.props.trips.map((trip, index) =>
                    <section key={index}>
                        <h2>Trip Number: {trip.tripNumber}</h2>
                        <p>Trip Date: {trip.date}</p>
                        <p>Trip Origin{trip.origin}</p>
                        <p>Trip  Destination{trip.destination}</p>
                        <p>Zip: {trip.zipCode}</p>
                        <p>Miles Quantity: {trip.milesQuantity}</p>
                        <p>VMR: {trip.vMr}</p>
                        <p>Milage: {trip.mileagePlus}</p>
                        <p>Premiums: {trip.premiums}</p>
                        <p>Fuel: {trip.fuel}</p>
                        <p>Total Rate: {trip.totalRate}</p>
                        <p>AMT: {trip.aMt}</p>
                        <p>Packages: {trip.packages}</p>
                        <p>Package AMT: {trip.packageAmt}</p>
                        <p>Drop and Hook: {trip.dropAndHook}</p>
                        <p>Tolls: {trip.tolls}</p>
                        <p>Flat Rate: {trip.flatRate}</p>
                        <p>Daily Gross Ammount{trip.dailyGrossAmount}</p>
                        <p>Driver One: {trip.driverOne}</p>
                        <p>Driver Two: {trip.driverTwo}</p>

                    </section>
                )}
            </div>);
    }
}

export default Trips;