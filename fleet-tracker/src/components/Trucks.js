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
                        <h2>{truck.make}</h2>
                        <p>{truck.model}</p>
                        <p>{truck.year}</p>
                        <p>{truck.vIn}</p>
                        <p>{truck.plateNumber}</p>
                        <p>{truck.actualRun}</p>
                        <p>{truck.milesBetweenService}</p>
                        <p>{truck.dotInspectionDate}</p>
                        <p>{truck.milesTillService}</p>
                    </section>
                )}
            </div>);
    }
}

export default Trucks;