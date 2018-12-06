import React, { Component } from 'react';
import Trucks from './components/Trucks';
import Trips from './components/Trips';
import Employees from './components/Employees';
import FuelPurchases from './components/FuelPurchases';
import FedExAssignments from './components/FedExAssignments';
import Companies from './components/Companies';
import Calculations from './components/Calculations';

class App extends Component {
    constructor() {
        super()
        this.state = {
            trucks: [],
            trips: [],
            employees: [],
            fuelPurchases: [],
            fedExAssignments: [],
            companies: [],
            currentView: ''

        }
    }

    getCompanies() {
        fetch('http://localhost:8080/api/companies').then(res => res.json())
            .then(data => {
                console.log(data);
                this.setState({ companies: data })
            })
    }

    getFedExAssignments() {
        fetch('http://localhost:8080/api/fedexassignments').then(res => res.json())
            .then(data => {
                console.log(data);
                this.setState({ fedExAssignments: data })
            })
    }


    getFuelPurchases() {
        fetch('http://localhost:8080/api/fuelpurchases').then(res => res.json())
            .then(data => {
                console.log(data);
                this.setState({ fuelPurchases: data })
            })
    }

    getEmployees() {
        fetch('http://localhost:8080/api/employees').then(res => res.json())
            .then(data => {
                console.log(data);
                this.setState({ employees: data })
            })
    }

    getTrucks() {
        fetch('http://localhost:8080/api/trucks').then(res => res.json())
            .then(data => {
                console.log(data);
                this.setState({ trucks: data })
            })
    }

    getTrips() {
        fetch('http://localhost:8080/api/trips').then(res => res.json())
            .then(data => {
                console.log(data);
                this.setState({ trips: data })
            })
    }

    fetchAll() {
        this.getTrucks()
        this.getTrips()
        this.getEmployees()
        this.getFuelPurchases()
        this.getFedExAssignments()
        this.getCompanies()
    }

    componentWillMount() {
        this.fetchAll()
    }

    countTotalMiles = () => {
        let miles = 0
        this.state.trips.map(function(trip, index){
            miles += trip.milesQuantity
        })
        return(miles)
    }

    countTotalAMT = () => {
        let AMT = 0
        this.state.trips.map(function(trip, index){
            AMT += trip.aMt
        })
        return(AMT)
    }

    countTotalPackages = () => {
        let packages = 0
        this.state.trips.map(function(trip, index){
            packages += trip.packages
        })
        return(packages)
    }

    countTotalPackageAmt = () => {
        let packageAmt = 0
        this.state.trips.map(function(trip, index){
            packageAmt += trip.packageAmt
        })
        return(packageAmt)
    }

    countTotalDropAndHook = () => {
        let dropAndHook = 0
        this.state.trips.map(function(trip, index){
            dropAndHook += trip.dropAndHook
        })
        return(dropAndHook)
    }

    countTotalTolls = () => {
        let tolls = 0
        this.state.trips.map(function(trip, index){
            tolls += trip.tolls
        })
        return(tolls)
    }

    countTotalFlatRate = () => {
        let flatRate = 0
        this.state.trips.map(function(trip, index){
            flatRate += trip.flatRate
        })
        return(flatRate)
    }

    countTotalDailyGrossAmount = () => {
        let dailyGross = 0
        this.state.trips.map(function(trip, index){
            dailyGross += trip.dailyGrossAmount
        })
        return(dailyGross)
    }

    countUniqueTrucks = () => {
        let truckList = []
        this.state.trips.map(function(trip, index){
            if(!truckList.includes(trip.truck.id)){
                truckList.push(trip.truck.id)
            }
        })
        return(truckList.length)
    }

    setTrucks = () => {
        this.setState({ currentView: 'trucks' })
    }

    setTrips = () => {
        this.setState({ currentView: 'trips' })
    }

    setEmployees = () => {
        this.setState({ currentView: 'employees' })
    }

    setFuelPurchases = () => {
        this.setState({ currentView: 'fuelPurchases' })
    }

    setFedExAssignments = () => {
        this.setState({ currentView: 'fedExAssignments' })
    }

    setCompanies = () => {
        this.setState({ currentView: 'companies' })
    }

    setCalculations = ( ) => {
        this.setState({ currentView: 'calculations' })
    }

    render() {

        return (
            <div className="App">
                <header>
                    <h1>Fleet Tracker</h1>
                    <nav>
                        <button className="trucks" onClick={this.setTrucks}>Trucks</button>
                        <button className="trips" onClick={this.setTrips}>Trips</button>
                        <button className="employees" onClick={this.setEmployees}>Employees</button>
                        <button className="fuelPurchases" onClick={this.setFuelPurchases}>Fuel Purchases</button>
                        <button className="fedExAssignments" onClick={this.setFedExAssignments}>FedEx Assignments</button>
                        <button className="companies" onClick={this.setCompanies}>Companies</button>
                        <button className="calculations" onClick={this.setCalculations}>Calculations</button>
                    </nav>
                </header>
                <main>
                    <div>
                      {this.state.currentView === 'trucks'
                      ? <Trucks trucks={this.state.trucks} />
                      : this.state.currentView === 'trips'
                      ? <Trips trips={this.state.trips} />
                      : this.state.currentView === 'employees'
                      ? <Employees employees={this.state.employees} />
                      : this.state.currentView === 'fuelPurchases'
                      ? <FuelPurchases fuelPurchases={this.state.fuelPurchases} />
                      : this.state.currentView === 'fedExAssignments'
                      ? <FedExAssignments fedExAssignments={this.state.fedExAssignments} />
                      : this.state.currentView === 'companies'
                      ? <Companies companies={this.state.companies} />
                      : this.state.currentView === 'calculations'
                      ? <Calculations countTotalMiles={this.countTotalMiles} 
                        countTotalAMT={this.countTotalAMT} 
                        countTotalPackages={this.countTotalPackages} 
                        countTotalPackageAmt={this.countTotalPackageAmt}
                        countTotalDropAndHook={this.countTotalDropAndHook}
                        countTotalTolls={this.countTotalTolls}
                        countTotalFlatRate={this.countTotalFlatRate}
                        countTotalDailyGrossAmount={this.countTotalDailyGrossAmount}
                        countUniqueTrucks={this.countUniqueTrucks}/>
                      : <h2></h2>}
                    
                    </div>
                </main>
            </div>
        );
    }
}

export default App;