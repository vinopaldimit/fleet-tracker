import React, { Component } from 'react';

class Calculations extends Component {

constructor (props) {
    super(props);
    this.state = {
        value: this.props.trucks[0].id,
    }
}

    countTotalMiles = () => {
        let miles = 0
        this.props.trips.map(function(trip, index){
            miles += trip.milesQuantity
        })
        return(miles)
    }

    countTotalAMT = () => {
        let AMT = 0
        this.props.trips.map(function(trip, index){
            AMT += trip.aMt
        })
        return(AMT)
    }

    countTotalPackages = () => {
        let packages = 0
        this.props.trips.map(function(trip, index){
            packages += trip.packages
        })
        return(packages)
    }

    countTotalPackageAmt = () => {
        let packageAmt = 0
        this.props.trips.map(function(trip, index){
            packageAmt += trip.packageAmt
        })
        return(packageAmt)
    }

    countTotalDropAndHook = () => {
        let dropAndHook = 0
        this.props.trips.map(function(trip, index){
            dropAndHook += trip.dropAndHook
        })
        return(dropAndHook)
    }

    countTotalTolls = () => {
        let tolls = 0
        this.props.trips.map(function(trip, index){
            tolls += trip.tolls
        })
        return(tolls)
    }

    countTotalFlatRate = () => {
        let flatRate = 0
        this.props.trips.map(function(trip, index){
            flatRate += trip.flatRate
        })
        return(flatRate)
    }

    countTotalDailyGrossAmount = () => {
        let dailyGross = 0
        this.props.trips.map(function(trip, index){
            dailyGross += trip.dailyGrossAmount
        })
        return(dailyGross)
    }

    countUniqueTrucks = () => {
        let truckList = []
        this.props.trips.map(function(trip, index){
            if(!truckList.includes(trip.truck.id)){
                truckList.push(trip.truck.id)
            }
        })
        return(truckList.length)
    }

    countTruckMiles = () => {
        let miles = 0
        const truckId = this.state.value
        this.props.trips.map(function(trip, index){
            if(trip.truck.id==truckId){
                miles += trip.milesQuantity
            }
        })
        return(miles)
    }

    handleTruckChange = (event) => {
        this.setState({ value: event.target.value });
    }

    render() {

        const { value } = this.state;

        return (
            <div>
                <h3>Calculations</h3>
                <section>
                    <h2>All Trips</h2>
                    <p>Total miles: {this.countTotalMiles()}</p>
                    <p>Total aMt: {this.countTotalAMT()}</p>
                    <p>Total packages: {this.countTotalPackages()}</p>
                    <p>Total packageAmt: {this.countTotalPackageAmt()}</p>
                    <p>Total dropAndHook: {this.countTotalDropAndHook()}</p>
                    <p>Total tolls: {this.countTotalTolls()}</p>
                    <p>Total flatRate: {this.countTotalFlatRate()}</p>
                    <p>Total dailyGrossAmount: {this.countTotalDailyGrossAmount()}</p>
                    <p>Trucks: {this.countUniqueTrucks()}</p>
                    <p>Average miles per truck: {this.countTotalMiles() / this.countUniqueTrucks()}</p>
                </section>
                <section>
                    <h2>By Truck</h2>
                    <label>Select Truck: <select onChange={this.handleTruckChange} value={value} >
                        {this.props.trucks.map((truck) => {
                            return <option key={truck.id} value={truck.id}>{truck.truckNumber}</option>
                        })}
                    </select></label>
                    <p>Truck miles: {this.countTruckMiles()}</p>
                </section>
            </div>
        );
    }
}

export default Calculations;