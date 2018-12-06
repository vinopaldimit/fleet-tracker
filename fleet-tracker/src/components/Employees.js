import React, { Component } from 'react';

class Employees extends Component {

constructor (props) {
	super(props);
}


    render() {
        return (<div>
                <h3>Employees</h3>
                {this.props.employees.map((employee, index) =>
                    <section key={index}>
                        <h2>First Name: {employee.fName}</h2>
                        <p>Middle Name: {employee.mName}</p>
                        <p>Last Name: {employee.lName}</p>
                        <p>Miles: {employee.miles}</p>
                    </section>
                )}
            </div>);
    }
}

export default Employees;