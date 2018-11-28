import React, { Component } from 'react';
import './App.css';
import Trucks from './components/Trucks';

class App extends Component {
    constructor() {
        super()
        this.state = {
            trucks: {}
        }
    }
    getTrucks() {
        fetch('http://localhost:8080/api/trucks').then(res => res.json())
            .then(data => {
                console.log(data);
                this.setState({trucks:data})
            })
    }
	componentDidMount(){
		this.getTrucks()
	}
    render() {

        return (
            <div className="App">
        <header>
        </header>
        <main>
        	<button className="trucks">Trucks</button>
        	<button className="trips">Trips</button>
        	<Trucks trucks={this.state.trucks} />
        </main>
      </div>
        );
    }
}

export default App;