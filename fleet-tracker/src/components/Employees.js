import React, { Component } from 'react';

class Employees extends Component {

constructor (props) {
	super(props);
}


    render() {
        return (<div>
                {this.props.employees.map((employee, index) =>
                    <section key={index}>
                        <h2>{employee.fName}</h2>
                        <p>{employee.mName}</p>
                        <p>{employee.lName}</p>
                        <p>{employee.miles}</p>
                    </section>
                )}
            </div>);
    }
}

export default Employees;