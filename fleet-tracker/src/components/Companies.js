import React, { Component } from 'react';

class Companies extends Component {

constructor (props) {
    super(props);
}


    render() {
        return (<div>
                <h3>Companies</h3>
                {this.props.companies.map((company, index) =>
                    <section key={index}>
                        <h2>{company.entityId}</h2>
                        <p>{company.stationNumber}</p>
                        <p>{company.stationName}</p>
                        <p>{company.contractId}</p>
                        <p>{company.contractName}</p>
                        <p>{company.authOfficerId}</p>
                        <p>{company.authOfficerName}</p>
                        <p>{company.auaId}</p>
                        <p>{company.address}</p>
                    </section>
                )}
            </div>);
    }
}

export default Companies;