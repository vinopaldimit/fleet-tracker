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
                        <p>Station Number: {company.stationNumber}</p>
                        <p>Station Name: {company.stationName}</p>
                        <p>Contract ID: {company.contractId}</p>
                        <p>Contract Name: {company.contractName}</p>
                        <p>Officer ID: {company.authOfficerId}</p>
                        <p>Officer Name: {company.authOfficerName}</p>
                        <p>ID: {company.auaId}</p>
                        <p>Address: {company.address}</p>
                    </section>
                )}
            </div>);
    }
}

export default Companies;