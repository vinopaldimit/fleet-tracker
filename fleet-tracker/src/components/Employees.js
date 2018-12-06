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
                        <h2>{employee.lName}, {employee.fName} {employee.mName}</h2>
                        <p>{employee.ssn}</p>
                        <p>{employee.fedexId}</p>
                        <p>{employee.dateOfBirth}</p>
                        <p>{employee.phoneNumber}</p>
                        <p>{employee.hireDate}</p>
                        <p>{employee.licenseNumber}</p>
                        <p>{employee.licenseState}</p>
                        <p>{employee.Exp}</p>
                        <p>{employee.dotPhysicalExp}</p>
                        <p>{employee.address}</p>
                        <p>{employee.email}</p>
                        <p>{employee.miles}</p>
                    </section>
                )}
            </div>);
    }
}

export default Employees;