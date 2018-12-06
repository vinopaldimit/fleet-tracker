import React, { Component } from 'react';

class Calculations extends Component {

constructor (props) {
    super(props);
    
}

    render() {
        return (
            <div>
                <h3>Calculations</h3>
                <section>
                    <h2>All Trips</h2>
                    <p>Total miles: {this.props.countTotalMiles()}</p>
                    <p>Total aMt: {this.props.countTotalAMT()}</p>
                    <p>Total packages: {this.props.countTotalPackages()}</p>
                    <p>Total packageAmt: {this.props.countTotalPackageAmt()}</p>
                    <p>Total dropAndHook: {this.props.countTotalDropAndHook()}</p>
                    <p>Total tolls: {this.props.countTotalTolls()}</p>
                    <p>Total flatRate: {this.props.countTotalFlatRate()}</p>
                    <p>Total dailyGrossAmount: {this.props.countTotalDailyGrossAmount()}</p>
                    <p>Trucks: {this.props.countUniqueTrucks()}</p>
                    <p>Average miles per truck: {this.props.countTotalMiles() / this.props.countUniqueTrucks()}</p>
                </section>
            </div>
        );
    }
}

export default Calculations;