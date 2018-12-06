import React, { Component } from 'react';

class FedExAssignments extends Component {

constructor (props) {
    super(props);
}


    render() {
        return (<div>
                <h3>FedEx Assignments</h3>
                {this.props.fedExAssignments.map((fedExAssignment, index) =>
                    <section key={index}>
                        <h2>Contract Name: {fedExAssignment.company.contractName}</h2>
                        <p>Truck Number: {fedExAssignment.truck.truckNumber}</p>
                        
                        <p>Service Percentage: {fedExAssignment.servicePercentage}</p>
                        <p>Availablity Percentage: {fedExAssignment.availabilityPercentage}</p>
                        <p>Points: {fedExAssignment.points}</p>
                    </section>
                )}
            </div>);
    }
}

export default FedExAssignments;