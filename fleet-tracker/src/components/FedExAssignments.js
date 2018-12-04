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
                        <h2>{fedExAssignment.company.contractName}</h2>
                        <p>{fedExAssignment.truck.truckNumber}</p>
                        
                        <p>{fedExAssignment.servicePercentage}</p>
                        <p>{fedExAssignment.availabilityPercentage}</p>
                        <p>{fedExAssignment.points}</p>
                    </section>
                )}
            </div>);
    }
}

export default FedExAssignments;