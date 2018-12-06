import React, { Component } from 'react';

class Trucks extends Component {

constructor (props) {
	super(props);
}


    render() {
        return (<div>
                <h3>Trucks</h3>
                {this.props.trucks.map((truck, index) =>
                    <section key={index}>
                        <h2>Make: {truck.make}</h2>
                        <p>Model: {truck.model}</p>
                        <p>Year: {truck.year}</p>
                        <p>Vin number: {truck.vIn}</p>
                        <p>Plate Number: {truck.plateNumber}</p>
                        <p>Actual Run: {truck.actualRun}</p>
                        <p>Miles Between Service: {truck.milesBetweenService}</p>
                        <p>Inspection Date: {truck.dotInspectionDate}</p>
                        <p>Miles Till Service: {truck.milesTillService}</p>
                    </section>
                )}
            </div>);
    }
}

export default Trucks;