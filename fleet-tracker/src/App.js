import React, { Component } from 'react';
import Trucks from './components/Trucks';
import Trips from './components/Trips';
import Employees from './components/Employees';
import FuelPurchases from './components/FuelPurchases';
import FedExAssignments from './components/FedExAssignments';
import Companies from './components/Companies';
import BarChartComponent from './components/BarChartComponent';
import HorizontalBarChartComponent from './components/HorizontalBarChartComponent';
import PieChartComponent from './components/PieChartComponent';
import LineChartComponent from './components/LineChartComponent';
import './layout.css';
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


    componentDidMount() {
        this.getTrucks()
        this.getTrips()
        this.getEmployees()
        this.getFuelPurchases()
        this.getFedExAssignments()
        this.getCompanies()
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
                    </div>
                </main>
            </div>
        );
    }
}

export default App;