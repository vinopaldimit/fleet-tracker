import React, { Component } from 'react';
import Trucks from './components/Trucks';
import Trips from './components/Trips';
import Employees from './components/Employees';
import FuelPurchases from './components/FuelPurchases';
import FedExAssignments from './components/FedExAssignments';
import Companies from './components/Companies';

import Calculations from './components/Calculations';


import BarChartComponent from './components/BarChartComponent';
import HorizontalBarChartComponent from './components/HorizontalBarChartComponent';
import PieChartComponent from './components/PieChartComponent';
import LineChartComponent from './components/LineChartComponent';

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
                <button className="theme">Theme</button>
                    <header>
                  
                    <h1>Fleetrix</h1>
                    
                    </header>
                    

                    <nav>
                        <div className="menu" onclick="myFunction(this)">
                         <div className="bar1"></div>
                         <div className="bar2"></div>
                         <div className="bar3"></div>
                        </div>

                        <button className="trucks" onClick={this.setTrucks}>Trucks</button>
                        <button className="trips" onClick={this.setTrips}>Trips</button>
                        <button className="employees" onClick={this.setEmployees}>Employees</button>
                        <button className="fuelPurchases" onClick={this.setFuelPurchases}>Fuel Purchases</button>
                        <button className="fedExAssignments" onClick={this.setFedExAssignments}>Assignments</button>
                        <button className="companies" onClick={this.setCompanies}>Companies</button>
                        <button className="calculations" onClick={this.setCalculations}>Calculations</button>
                    </nav>
                

                <main>
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
                       <section className="wrapper">
                          <figure className="box a">
                          <h1>BarChart</h1>
                            <BarChartComponent />
                          </figure>
                          <figure className="box b">  
                          <h1>PieChart</h1>
                            <PieChartComponent />
                          </figure>
                           <figure className="box c"> 
                          <h1>LineChart</h1>
                            <LineChartComponent />
                          </figure>  
                          <figure className="box d">  
                           <h1>Horizontal BarChart</h1>
                            <HorizontalBarChartComponent />
                          </figure> 
                      </section> 
                </main>

            </div>

        );
    }
}

export default App;