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
                        <h2>{trip.tripNumber}</h2>
                        <p>{trip.date}</p>
                        <p>{trip.origin}</p>
                        <p>{trip.destination}</p>
                        <p>{trip.zipCode}</p>
                        <p>{trip.milesQuantity}</p>
                        <p>{trip.vMr}</p>
                        <p>{trip.mileagePlus}</p>
                        <p>{trip.premiums}</p>
                        <p>{trip.fuel}</p>
                        <p>{trip.totalRate}</p>
                        <p>{trip.aMt}</p>
                        <p>{trip.packages}</p>
                        <p>{trip.packageAmt}</p>
                        <p>{trip.dropAndHook}</p>
                        <p>{trip.tolls}</p>
                        <p>{trip.flatRate}</p>
                        <p>{trip.dailyGrossAmount}</p>
                        <p>{trip.driverOne}</p>
                        <p>{trip.driverTwo}</p>

                    </section>
                )}
            </div>);
    }
}

export default Trips;