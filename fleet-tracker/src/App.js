import React, { Component } from 'react';
import './App.css';
import Trucks from './components/Trucks';
import Trips from './components/Trips';

class App extends Component {
    constructor() {
        super()
        this.state = {
            trucks: [],
            trips: [],
            currentView: ''

        }
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
    }
    setTrucks=()=> {
        this.setState({ currentView: 'trucks' })
    }
    setTrips=()=> {
        this.setState({ currentView: 'trips' })
    }
    render() {

        return (
            <div className="App">
        <header>
        </header>
        <main>
        	<button className="trucks" onClick={this.setTrucks}>Trucks</button>
        	<button className="trips" onClick={this.setTrips}>Trips</button>
        	

        
			
        <div>
          {this.state.currentView === 'trucks'
          ? <Trucks trucks={this.state.trucks} />
          : this.state.currentView === 'trips'
		  ? <Trips trips={this.state.trips} />
          : <h2>Choose your destiny</h2>}
        
        </div>





        </main>
      </div>
        );
    }
}

export default App;